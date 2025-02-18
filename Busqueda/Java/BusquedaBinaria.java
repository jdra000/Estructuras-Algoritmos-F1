
public class BusquedaBinaria {

    public static String busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0, derecha = arr.length - 1;  

        while (izquierda <= derecha) { 
            int medio = (izquierda + derecha) / 2;  

            if (arr[medio] == objetivo) {  
                return "Encontrado en el índice: " + medio;
            } else if (arr[medio] < objetivo) {  // Si el número está en la mitad derecha
                izquierda = medio + 1;  // Mueve el límite izquierdo
            } else {  // Si el número está en la mitad izquierda
                derecha = medio - 1;  // Mueve el límite derecho
            }
        }

        return "No está en la lista";  // Si no se encuentra el número
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        System.out.println(busquedaBinaria(arr, 16));  // Probar con un número que no está en la lista
    }
}
