import java.util.PriorityQueue;
import java.util.Queue;

class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        // Invertir el orden para que la mayor prioridad (menor valor numérico) esté al frente
        return Integer.compare(this.prioridad, otraTarea.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

public class punto6 {
    public static void main(String[] args) {
        // Crear una cola de prioridad para almacenar las tareas
        Queue<Tarea> colaDeTareas = new PriorityQueue<>();

        // Agregar tareas a la cola
        colaDeTareas.add(new Tarea("Tarea 1: Alta prioridad", 1));
        colaDeTareas.add(new Tarea("Tarea 2: Media prioridad", 3));
        colaDeTareas.add(new Tarea("Tarea 3: Baja prioridad", 5));
        colaDeTareas.add(new Tarea("Tarea 4: Muy alta prioridad", 0));

        // Procesar las tareas según su prioridad
        while (!colaDeTareas.isEmpty()) {
            System.out.println("Procesando " + colaDeTareas.poll());
        }
    }
}
