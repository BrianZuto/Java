import java.util.ArrayList;
import java.util.List;

// Clase para los nodos del árbol binario de búsqueda
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class punto12 {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);
        raiz.derecho.izquierdo = new Nodo(12);
        raiz.derecho.derecho = new Nodo(18);

        // Obtener los elementos del árbol en orden ascendente
        List<Integer> elementosOrdenados = obtenerElementosEnOrden(raiz);

        // Imprimir los elementos en orden
        System.out.println("Elementos del árbol en orden ascendente:");
        for (int valor : elementosOrdenados) {
            System.out.println(valor);
        }
    }

    // Función recursiva para obtener los elementos del árbol en orden ascendente
    public static List<Integer> obtenerElementosEnOrden(Nodo raiz) {
        List<Integer> lista = new ArrayList<>();
        recorrerEnOrden(raiz, lista);
        return lista;
    }

    // Función recursiva para realizar el recorrido en orden
    private static void recorrerEnOrden(Nodo nodo, List<Integer> lista) {
        if (nodo != null) {
            // Recorrer el subárbol izquierdo
            recorrerEnOrden(nodo.izquierdo, lista);
            // Agregar el valor del nodo actual
            lista.add(nodo.valor);
            // Recorrer el subárbol derecho
            recorrerEnOrden(nodo.derecho, lista);
        }
    }
}
