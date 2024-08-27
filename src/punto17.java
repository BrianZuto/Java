import java.util.*;

public class punto17 {
    public static void main(String[] args) {
        // Crear listas para almacenar los mapas
        List<Map<String, String>> listaHashMap = new ArrayList<>();
        List<Map<String, String>> listaLinkedHashMap = new ArrayList<>();
        List<Map<String, String>> listaTreeMap = new ArrayList<>();

        // Agregar mapas a las listas
        listaHashMap.add(crearHashMapProductos());
        listaLinkedHashMap.add(crearLinkedHashMapProductos());
        listaTreeMap.add(crearTreeMapProductos());

        // Imprimir los mapas para cada tipo de lista
        System.out.println("HashMap:");
        imprimirMapa(listaHashMap.get(0));

        System.out.println("\nLinkedHashMap:");
        imprimirMapa(listaLinkedHashMap.get(0));

        System.out.println("\nTreeMap:");
        imprimirMapa(listaTreeMap.get(0));
    }

    // Crear un HashMap con productos
    private static Map<String, String> crearHashMapProductos() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("001", "Producto A");
        hashMap.put("003", "Producto C");
        hashMap.put("002", "Producto B");
        return hashMap;
    }

    // Crear un LinkedHashMap con productos
    private static Map<String, String> crearLinkedHashMapProductos() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("001", "Producto A");
        linkedHashMap.put("003", "Producto C");
        linkedHashMap.put("002", "Producto B");
        return linkedHashMap;
    }

    // Crear un TreeMap con productos
    private static Map<String, String> crearTreeMapProductos() {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("001", "Producto A");
        treeMap.put("003", "Producto C");
        treeMap.put("002", "Producto B");
        return treeMap;
    }

    // Imprimir el contenido del mapa
    private static void imprimirMapa(Map<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }
    }
}
