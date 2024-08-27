import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class punto15 {
    public static void main(String[] args) {
        // Crear un mapa de cadenas de caracteres a números enteros
        Map<String, Integer> mapaOriginal = new HashMap<>();
        mapaOriginal.put("apple", 1);
        mapaOriginal.put("Banana", 2);
        mapaOriginal.put("carrot", 3);
        mapaOriginal.put("Date", 4);
        mapaOriginal.put("eggplant", 5);

        // Llamar a la función recursiva para obtener el nuevo mapa
        Map<String, Integer> mapaFiltrado = obtenerMapaConClavesMinusculas(mapaOriginal);

        // Imprimir el nuevo mapa filtrado
        System.out.println("Entradas del mapa con claves que comienzan con una letra minúscula:");
        for (Map.Entry<String, Integer> entrada : mapaFiltrado.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }

    // Función recursiva para obtener un mapa con claves que comienzan con una letra minúscula
    public static Map<String, Integer> obtenerMapaConClavesMinusculas(Map<String, Integer> mapa) {
        // Crear un nuevo mapa para almacenar las entradas filtradas
        Map<String, Integer> mapaFiltrado = new HashMap<>();
        // Convertir el conjunto de claves en un array para procesar recursivamente
        Set<String> claves = mapa.keySet();
        String[] arrayClaves = claves.toArray(new String[0]);
        // Llamar a la función recursiva para procesar las claves
        filtrarClavesRecursivo(arrayClaves, 0, mapa, mapaFiltrado);
        return mapaFiltrado;
    }

    // Función recursiva para filtrar las claves del mapa
    private static void filtrarClavesRecursivo(String[] claves, int indice, Map<String, Integer> mapaOriginal, Map<String, Integer> mapaFiltrado) {
        // Caso base: si hemos procesado todas las claves, terminar
        if (indice >= claves.length) {
            return;
        }

        // Obtener la clave en el índice actual
        String clave = claves[indice];

        // Verificar si la clave comienza con una letra minúscula
        if (!clave.isEmpty() && Character.isLowerCase(clave.charAt(0))) {
            // Agregar la entrada al nuevo mapa
            mapaFiltrado.put(clave, mapaOriginal.get(clave));
        }

        // Llamada recursiva para procesar el siguiente índice
        filtrarClavesRecursivo(claves, indice + 1, mapaOriginal, mapaFiltrado);
    }
}
