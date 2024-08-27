import java.util.ArrayList;
import java.util.List;

class Producto11 {
    private String nombre;
    private double precio;

    public Producto11(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

public class punto11 {
    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto11> productos = new ArrayList<>();
        productos.add(new Producto11("Producto A", 5.50));
        productos.add(new Producto11("Producto B", 12.00));
        productos.add(new Producto11("Producto C", 8.75));
        productos.add(new Producto11("Producto D", 15.30));

        // Imprimir la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        for (Producto11 producto : productos) {
            System.out.println(producto);
        }

        // Llamar a la función recursiva para ordenar la lista
        quickSort(productos, 0, productos.size() - 1);

        // Imprimir la lista después de ordenar
        System.out.println("\nLista después de ordenar:");
        for (Producto11 producto : productos) {
            System.out.println(producto);
        }
    }

    public static void quickSort(List<Producto11> lista, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = particionar(lista, izquierda, derecha);
            quickSort(lista, izquierda, pivote - 1);
            quickSort(lista, pivote + 1, derecha);
        }
    }

    private static int particionar(List<Producto11> lista, int izquierda, int derecha) {
        Producto11 pivote = lista.get(derecha); // Tomamos el último elemento como pivote
        int i = izquierda - 1; // Índice del elemento más pequeño

        for (int j = izquierda; j < derecha; j++) {
            if (lista.get(j).getPrecio() <= pivote.getPrecio()) {
                i++;
                intercambiar(lista, i, j);
            }
        }

        intercambiar(lista, i + 1, derecha);
        return i + 1;
    }

    private static void intercambiar(List<Producto11> lista, int i, int j) {
        Producto11 temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}
