import java.util.HashMap;
import java.util.Map;

class Persona3 {
    private String nombre;
    private int edad;

    public Persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

class Estudiante extends Persona3 {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

public class punto3 {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, "A001");
        Estudiante estudiante2 = new Estudiante("Ana Gómez", 22, "A002");
        Estudiante estudiante3 = new Estudiante("Luis Martínez", 19, "A003");

        // Crear un mapa que asocie la matrícula con el objeto Estudiante
        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();

        // Agregar estudiantes al mapa
        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        // Mostrar estudiantes en el mapa
        for (Map.Entry<String, Estudiante> entry : mapaEstudiantes.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + " - " + entry.getValue());
        }

        // Buscar un estudiante por su matrícula
        String matriculaBusqueda = "A002";
        Estudiante estudianteEncontrado = mapaEstudiantes.get(matriculaBusqueda);

        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado);
        } else {
            System.out.println("Estudiante con matrícula " + matriculaBusqueda + " no encontrado.");
        }
    }
}
