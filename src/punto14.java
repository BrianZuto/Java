import java.util.ArrayList;
import java.util.List;

public class punto14 {
    public static void main(String[] args) {
        // Crear una lista de cadenas de caracteres
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Hola");
        listaOriginal.add("mundo");
        listaOriginal.add("Java");
        listaOriginal.add("programación");
        listaOriginal.add("Ejemplo");
        listaOriginal.add("texto");

        // Llamar a la función recursiva para obtener las cadenas que comienzan con una letra mayúscula
        List<String> listaFiltrada = obtenerCadenasConMayusculas(listaOriginal);

        // Imprimir la nueva lista filtrada
        System.out.println("Cadenas que comienzan con una letra mayúscula:");
        for (String cadena : listaFiltrada) {
            System.out.println(cadena);
        }
    }

    // Función recursiva para obtener cadenas que comienzan con una letra mayúscula
    public static List<String> obtenerCadenasConMayusculas(List<String> lista) {
        // Crear una nueva lista para almacenar las cadenas filtradas
        List<String> listaFiltrada = new ArrayList<>();
        // Llamar a la función recursiva para procesar la lista original
        filtrarCadenasRecursivo(lista, 0, listaFiltrada);
        return listaFiltrada;
    }

    // Función recursiva para filtrar cadenas
    private static void filtrarCadenasRecursivo(List<String> listaOriginal, int indice, List<String> listaFiltrada) {
        // Caso base: si hemos procesado todas las cadenas, terminar
        if (indice >= listaOriginal.size()) {
            return;
        }

        // Obtener la cadena en el índice actual
        String cadena = listaOriginal.get(indice);

        // Verificar si la cadena comienza con una letra mayúscula
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            listaFiltrada.add(cadena);
        }

        // Llamada recursiva para procesar el siguiente elemento
        filtrarCadenasRecursivo(listaOriginal, indice + 1, listaFiltrada);
    }
}
