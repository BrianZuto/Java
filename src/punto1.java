import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase Persona que implementa Comparable
class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    // Implementación del método compareTo para ordenar por edad por defecto
    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.getEdad());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }

    public static void main(String[] args) {
        // Crear una lista de objetos Persona
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 30, "Masculino"));
        personas.add(new Persona("Ana", 25, "Femenino"));
        personas.add(new Persona("Miguel", 35, "Masculino"));
        personas.add(new Persona("Sofía", 28, "Femenino"));

        // Ordenar la lista por edad (usando compareTo)
        Collections.sort(personas);
        System.out.println("Lista ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar la lista por nombre (usando un Comparator)
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        System.out.println("\nLista ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
