import java.util.Stack;
import java.util.function.Predicate;

public class punto16 {
    public static void main(String[] args) {
        // Crear una pila de objetos (por ejemplo, enteros)
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(2);
        pilaOriginal.push(3);
        pilaOriginal.push(4);
        pilaOriginal.push(5);
        pilaOriginal.push(6);

        // Definir una condición para filtrar los elementos (por ejemplo, números mayores a 3)
        Predicate<Integer> condicion = x -> x > 3;

        // Llamar a la función recursiva para obtener la nueva pila
        Stack<Integer> pilaFiltrada = obtenerPilaFiltrada(pilaOriginal, condicion);

        // Imprimir la nueva pila filtrada
        System.out.println("Elementos que cumplen con la condición:");
        while (!pilaFiltrada.isEmpty()) {
            System.out.println(pilaFiltrada.pop());
        }
    }

    // Función recursiva para obtener una nueva pila con elementos que cumplen con la condición
    public static <T> Stack<T> obtenerPilaFiltrada(Stack<T> pilaOriginal, Predicate<T> condicion) {
        Stack<T> pilaFiltrada = new Stack<>();
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada, condicion);
        return pilaFiltrada;
    }

    // Función recursiva para filtrar la pila
    private static <T> void filtrarPilaRecursivo(Stack<T> pilaOriginal, Stack<T> pilaFiltrada, Predicate<T> condicion) {
        // Caso base: si la pila original está vacía, terminar
        if (pilaOriginal.isEmpty()) {
            return;
        }

        // Sacar el elemento de la cima de la pila original
        T elemento = pilaOriginal.pop();

        // Verificar si el elemento cumple con la condición
        if (condicion.test(elemento)) {
            pilaFiltrada.push(elemento);
        }

        // Llamada recursiva para procesar el siguiente elemento
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada, condicion);

        // Volver a poner el elemento en la pila original (reconstruir la pila)
        pilaOriginal.push(elemento);
    }
}
