import os
import re

# Rename org.ac -> org.cg in all Java files
src_root = r'c:\proyecto\src'

for root, dirs, files in os.walk(src_root):
    for f in files:
        if f.endswith('.java') or f.endswith('.fxml'):
            filepath = os.path.join(root, f)
            with open(filepath, 'r', encoding='utf-8') as fh:
                content = fh.read()
            new_content = content.replace('org.ac', 'org.cg')
            if new_content != content:
                with open(filepath, 'w', encoding='utf-8') as fh:
                    fh.write(new_content)
                print(f"Updated: {filepath}")

# Rename the directory structure: org/ac -> org/cg
import shutil
old_base = os.path.join(src_root, 'org', 'ac')
new_base = os.path.join(src_root, 'org', 'cg')

if os.path.exists(old_base):
    shutil.copytree(old_base, new_base)
    shutil.rmtree(old_base)
    print(f"Renamed {old_base} -> {new_base}")

print("Package rename complete.")
