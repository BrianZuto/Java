import java.util.Stack;

class PilaTipada {
    private Stack<Object> pila;

    public PilaTipada() {
        pila = new Stack<>();
    }

    public boolean push(Object elemento) {
        if (pila.isEmpty() || pila.peek().getClass().equals(elemento.getClass())) {
            pila.push(elemento);
            return true;
        } else {
            System.out.println("Error: El tipo del elemento no coincide con el tipo en la cima de la pila.");
            return false;
        }
    }

    public Object pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
    }

    public Object peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        } else {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public void mostrarPila() {
        System.out.println("Contenido de la pila: " + pila);
    }
}

public class punto4 {
    public static void main(String[] args) {
        PilaTipada pila = new PilaTipada();

        // Insertar diferentes tipos de elementos
        pila.push(10);          // int
        pila.push(20);          // int (mismo tipo, se permite)
        pila.push("Hola");      // String (diferente tipo, no se permite)
        pila.push(30);          // int (mismo tipo, se permite)

        // Mostrar el contenido de la pila
        pila.mostrarPila();

        // Intentar insertar un elemento de un tipo diferente al de la cima
        boolean insertado = pila.push("Mundo");  // String (diferente tipo, no se permite)
        System.out.println("Elemento insertado: " + insertado);

        // Sacar elementos de la pila
        pila.pop();
        pila.mostrarPila();

        // Insertar un elemento de un tipo correcto después de hacer pop
        pila.push("Adiós");    // String (mismo tipo que la nueva cima, se permite)
        pila.mostrarPila();
    }
}
