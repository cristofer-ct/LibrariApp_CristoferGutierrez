import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    if "/**" in content:
        # Ya tiene javadoc, omitir o limpiar
        pass

    # Regex patterns
    class_pattern = re.compile(r'public (class|interface) (\w+)(.*) \{')
    method_pattern = re.compile(r'^\s*public\s+(?:static\s+)?([\w\<\>\[\]]+)\s+(\w+)\s*\((.*?)\)\s*(?:throws\s+([\w\s,]+))?\{', re.MULTILINE)
    
    new_content = []
    lines = content.split('\n')
    
    i = 0
    while i < len(lines):
        line = lines[i]
        
        # Check for class
        class_match = re.search(r'public (class|interface) (\w+)', line)
        if class_match and not "@author" in "\n".join(new_content[-5:]):
            class_name = class_match.group(2)
            new_content.append("/**")
            new_content.append(f" * Clase {class_name}")
            new_content.append(" *")
            new_content.append(" * @author Cristofer")
            new_content.append(" * @version 1.0.0")
            new_content.append(" */")
            new_content.append(line)
            i += 1
            continue
            
        # Check for methods or constructors
        # A simple heuristic: public followed by Type and Name (or just Name for constructor)
        method_match = re.search(r'^\s*public\s+(?:static\s+)?(?:([\w\<\>\[\]]+)\s+)?(\w+)\s*\((.*?)\)\s*(?:throws\s+([\w\s,]+))?\s*\{', line)
        
        if method_match and "public class" not in line and "public interface" not in line:
            return_type = method_match.group(1)
            method_name = method_match.group(2)
            params_str = method_match.group(3)
            throws_str = method_match.group(4)
            
            # Constructor has no return type
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
        
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write('\n'.join(new_content))

directories = [
    r'c:\proyecto\src\org\ac\controller'
]

for d in directories:
    for root, dirs, files in os.walk(d):
        for file in files:
            if file.endswith('.java'):
                process_file(os.path.join(root, file))
print("Javadocs added for week 1")
