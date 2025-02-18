# Búsqueda Binaria

def busqueda_binaria(arr, objetivo):
    izquierda, derecha = 0, len(arr) - 1  # Define los límites de búsqueda

    while izquierda <= derecha:  # Mientras haya elementos en el rango
        medio = (izquierda + derecha) // 2  # Encuentra el punto medio

        if arr[medio] == objetivo:  # Si el número en el medio es el que buscamos
            return medio  
        elif arr[medio] < objetivo:  # Si el número está en la mitad derecha
            izquierda = medio + 1  # Mueve el límite izquierdo
        else:  # Si el número está en la mitad izquierda
            derecha = medio - 1  # Mueve el límite derecho

    return "No esta en la lista"  # Si no se encuentra el número

arr = [10, 15, 20, 25, 30]  
print(busqueda_binaria(arr, 16))  
