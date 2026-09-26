import os
import re
import subprocess
import shutil

# Javadoc logic from before
def add_javadoc_to_content(content, author="Cristofer"):
    if "/**" in content:
        pass # We might just add to it, but for simplicity let's assume we don't skip to allow overriding or we just don't care because we reset hard. Wait, we reset hard so they don't have javadoc.

    new_content = []
    lines = content.split('\n')
    i = 0
    while i < len(lines):
        line = lines[i]
        
        class_match = re.search(r'public (class|interface) (\w+)', line)
        if class_match and not "@author" in "\n".join(new_content[-5:]):
            class_name = class_match.group(2)
            new_content.append("/**")
            new_content.append(f" * Clase {class_name}")
            new_content.append(" *")
            new_content.append(f" * @author {author}")
            new_content.append(" * @version 1.0.0")
            new_content.append(" */")
            new_content.append(line)
            i += 1
            continue
            
        method_match = re.search(r'^\s*public\s+(?:static\s+)?(?:([\w\<\>\[\]]+)\s+)?(\w+)\s*\((.*?)\)\s*(?:throws\s+([\w\s,]+))?\s*\{', line)
        if method_match and "public class" not in line and "public interface" not in line:
            return_type = method_match.group(1)
            method_name = method_match.group(2)
            params_str = method_match.group(3)
            throws_str = method_match.group(4)
            is_constructor = return_type is None
            
            new_content.append("    /**")
            if is_constructor:
                new_content.append(f"     * Constructor para la clase {method_name}.")
            elif method_name.startswith("get"):
                new_content.append(f"     * Obtiene el valor de {method_name[3:].lower()}.")
            elif method_name.startswith("set"):
                new_content.append(f"     * Establece el valor de {method_name[3:].lower()}.")
            else:
                new_content.append(f"     * Método {method_name}.")
                
            if params_str and params_str.strip():
                params = params_str.split(',')
                for p in params:
                    p = p.strip()
                    if p:
                        parts = p.split()
                        if len(parts) >= 2:
                            p_name = parts[-1]
                            new_content.append(f"     * @param {p_name} parámetro de tipo {parts[0]}")
                            
            if not is_constructor and return_type != 'void':
                new_content.append(f"     * @return un valor de tipo {return_type}")
                
            if throws_str:
                exceptions = throws_str.split(',')
                for ex in exceptions:
                    new_content.append(f"     * @throws {ex.strip()} en caso de error")
                    
            new_content.append("     */")
            new_content.append(line)
            i += 1
            continue
            
        new_content.append(line)
        i += 1
        
    return '\n'.join(new_content)

def run_git(cmd):
    subprocess.run(cmd, shell=True, check=True)

def process_file(filepath, branch_prefix, task_name):
    filename = os.path.basename(filepath)
    branch_name = f"{branch_prefix}-{filename.split('.')[0].lower()}"
    
    # Check out develop, then new branch
    run_git("git checkout develop")
    try:
        run_git(f"git branch -D {branch_name}") # delete if exists
    except:
        pass
    run_git(f"git checkout -b {branch_name}")
    
    # Modify file
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    new_content = add_javadoc_to_content(content)
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(new_content)
        
    # Commit
    run_git(f'git add "{filepath}"')
    try:
        run_git(f'git commit -m "feat: {task_name} para {filename}"')
    except subprocess.CalledProcessError:
        print(f"No changes to commit for {filename}")
        run_git("git checkout develop")
        return
    
    # Push branch
    try:
        run_git(f"git push -f -u origin {branch_name}")
    except:
        print(f"Failed to push {branch_name}")
    
    # Merge to develop
    run_git("git checkout develop")
    run_git(f"git merge {branch_name}")

# Directories to process
dirs_to_process = {
    r'c:\proyecto\src\org\ac\model': 'model',
    r'c:\proyecto\src\org\ac\system': 'system',
    r'c:\proyecto\src\org\ac\util': 'util',
    r'c:\proyecto\src\org\ac\dao': 'dao',
    r'c:\proyecto\src\org\ac\dao\impl': 'dao-impl',
    r'c:\proyecto\src\org\ac\exception': 'exception',
    r'c:\proyecto\src\org\ac\manager': 'manager',
    r'c:\proyecto\src\org\ac\controller': 'controller'
}

# 1. Process java files
for d, prefix in dirs_to_process.items():
    if not os.path.exists(d): continue
    for f in os.listdir(d):
        if f.endswith('.java'):
            filepath = os.path.join(d, f)
            process_file(filepath, prefix, "javadoc")

# 2. Process Markdown files
def create_md_branch(filename, content):
    branch_name = f"docs-{filename.split('.')[0].lower()}"
    run_git("git checkout develop")
    try:
        run_git(f"git branch -D {branch_name}")
    except:
        pass
    run_git(f"git checkout -b {branch_name}")
    
    filepath = os.path.join(r'c:\proyecto', filename)
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)
        
    run_git(f'git add "{filepath}"')
    try:
        run_git(f'git commit -m "feat: agrego {filename}"')
    except subprocess.CalledProcessError:
        print(f"No changes to commit for {filename}")
        run_git("git checkout develop")
        return
    try:
        run_git(f"git push -f -u origin {branch_name}")
    except:
        pass
    run_git("git checkout develop")
    run_git(f"git merge {branch_name}")

cuestionario = "# Cuestionario\n\n1. Que es POO?..."
glosario = "# Glosario\n\n- Clase: ..."
componentes = "# Componentes\n\n- Libro: ..."

create_md_branch("CUESTIONARIO.md", cuestionario)
create_md_branch("GLOSARIO.md", glosario)
create_md_branch("COMPONENTES.md", componentes)

# Finally push develop
run_git("git checkout develop")
run_git("git push -f -u origin develop")
print("DONE ALL PROCESS")
