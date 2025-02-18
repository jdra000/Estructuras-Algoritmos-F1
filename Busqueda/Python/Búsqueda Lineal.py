# Búsqueda Lineal

def busqueda_lineal(arr, objetivo):
    for i in range(len(arr)):  
        if arr[i] == objetivo:  
            return i  
    return "no esta"  

arr = [10, 20, 30, 40, 50]
print(busqueda_lineal(arr, 25))  