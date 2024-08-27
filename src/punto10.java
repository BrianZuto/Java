import java.util.LinkedList;
import java.util.Queue;

class Producto10 {
    private String nombre;
    private double precio;

    public Producto10(String nombre, double precio) {
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

public class punto10 {
    public static void main(String[] args) {
        // Crear una cola de productos
        Queue<Producto10> colaOriginal = new LinkedList<>();
        colaOriginal.add(new Producto10("Producto A", 5.50));
        colaOriginal.add(new Producto10("Producto B", 12.00));
        colaOriginal.add(new Producto10("Producto C", 8.75));
        colaOriginal.add(new Producto10("Producto D", 15.30));

        // Llamar a la función recursiva para filtrar los productos con precio menor que 10
        Queue<Producto10> colaFiltrada = filtrarProductosMenoresQueDiez(colaOriginal);

        // Imprimir la nueva cola filtrada
        System.out.println("Productos con precio menor que 10:");
        while (!colaFiltrada.isEmpty()) {
            System.out.println(colaFiltrada.poll());
        }
    }

    public static Queue<Producto10> filtrarProductosMenoresQueDiez(Queue<Producto10> cola) {
        // Caso base: si la cola está vacía, devolver una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        // Obtener el primer producto de la cola
        Producto10 producto = cola.poll();

        // Llamada recursiva para procesar el resto de la cola
        Queue<Producto10> colaFiltrada = filtrarProductosMenoresQueDiez(cola);

        // Si el producto cumple la condición, agregarlo a la nueva cola
        if (producto.getPrecio() < 10) {
            colaFiltrada.add(producto);
        }

        // Devolver la cola acumulada
        return colaFiltrada;
    }
}
