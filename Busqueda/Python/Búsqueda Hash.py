# Búsqueda Hash

def busqueda_hash(diccionario, clave):
    return diccionario.get(clave, "No encontrado")  

datos = {1: "Lau", 2: "Nata", 3: "Juan", 4: "David"}  # Diccionario con claves y valores
print(busqueda_hash(datos, 3))  
print(busqueda_hash(datos, 1))  
print(busqueda_hash(datos, 4)) 
print(busqueda_hash(datos, 6))  
