
import java.util.HashMap;

public class BusquedaHash {

    public static String busquedaHash(HashMap<Integer, String> diccionario, int clave) {
        return diccionario.getOrDefault(clave, "No encontrado");  // Buscar la clave o devolver "No encontrado"
    }

    public static void main(String[] args) {
        HashMap<Integer, String> datos = new HashMap<>();
        datos.put(1, "Lau");
        datos.put(2, "Nata");
        datos.put(3, "Juan");
        datos.put(4, "David");

        System.out.println(busquedaHash(datos, 3)); 
        System.out.println(busquedaHash(datos, 1)); 
        System.out.println(busquedaHash(datos, 4));  
        System.out.println(busquedaHash(datos, 6));  
    }
}
