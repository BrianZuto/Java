import java.util.Stack;

public class punto9 {
    public static void main(String[] args) {
        // Crear una pila con algunos valores
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(3);
        pilaOriginal.push(8);
        pilaOriginal.push(1);
        pilaOriginal.push(6);
        pilaOriginal.push(7);

        // Llamar a la función recursiva para filtrar los elementos mayores que 5
        Stack<Integer> pilaFiltrada = filtrarMayoresQueCinco(pilaOriginal);

        // Imprimir la nueva pila filtrada
        System.out.println("Pila con elementos mayores que 5:");
        while (!pilaFiltrada.isEmpty()) {
            System.out.println(pilaFiltrada.pop());
        }
    }

    public static Stack<Integer> filtrarMayoresQueCinco(Stack<Integer> pila) {
        // Caso base: si la pila está vacía, devolver una nueva pila vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        // Obtener el elemento superior de la pila
        int elemento = pila.pop();

        // Llamada recursiva para procesar el resto de la pila
        Stack<Integer> pilaFiltrada = filtrarMayoresQueCinco(pila);

        // Si el elemento cumple la condición, agregarlo a la nueva pila
        if (elemento > 5) {
            pilaFiltrada.push(elemento);
        }

        // Devolver la pila acumulada
        return pilaFiltrada;
    }
}
