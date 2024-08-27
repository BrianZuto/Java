import java.util.HashSet;
import java.util.Set;

public class punto13 {
    public static void main(String[] args) {
        // Crear un conjunto de números enteros
        Set<Integer> conjuntoOriginal = new HashSet<>();
        conjuntoOriginal.add(1);
        conjuntoOriginal.add(2);
        conjuntoOriginal.add(3);
        conjuntoOriginal.add(4);
        conjuntoOriginal.add(5);
        conjuntoOriginal.add(6);

        // Llamar a la función recursiva para obtener los números pares
        Set<Integer> conjuntoPares = obtenerNumerosPares(conjuntoOriginal);

        // Imprimir el nuevo conjunto con números pares
        System.out.println("Números pares en el conjunto:");
        for (int numero : conjuntoPares) {
            System.out.println(numero);
        }
    }

    // Función recursiva para obtener números pares de un conjunto
    public static Set<Integer> obtenerNumerosPares(Set<Integer> conjunto) {
        // Convertir el conjunto a un array para facilitar el procesamiento
        Integer[] array = conjunto.toArray(new Integer[0]);
        return filtrarParesRecursivo(array, 0, new HashSet<>());
    }

    // Función recursiva para filtrar números pares
    private static Set<Integer> filtrarParesRecursivo(Integer[] array, int index, Set<Integer> resultado) {
        // Caso base: si hemos procesado todos los elementos, devolver el resultado
        if (index >= array.length) {
            return resultado;
        }

        // Obtener el elemento actual
        int numero = array[index];

        // Si el número es par, agregarlo al conjunto resultado
        if (numero % 2 == 0) {
            resultado.add(numero);
        }

        // Llamada recursiva para procesar el siguiente elemento
        return filtrarParesRecursivo(array, index + 1, resultado);
    }
}
