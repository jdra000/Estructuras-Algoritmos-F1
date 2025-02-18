public class BusquedaLineal {

    public static String busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {  
                return "Encontrado en el índice: " + i;
            }
        }
        return "No está";  
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(busquedaLineal(arr, 25));  
    }
}
