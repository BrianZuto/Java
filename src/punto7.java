import java.util.ArrayList;
import java.util.List;

class Persona7 {
    private String nombre;
    private int edad;

    public Persona7(String nombre, int edad) {
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

public class punto7 {
    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona7> personas = new ArrayList<>();
        personas.add(new Persona7("Juan", 16));
        personas.add(new Persona7("Ana", 20));
        personas.add(new Persona7("Luis", 17));
        personas.add(new Persona7("María", 22));

        // Llamar a la función recursiva para obtener solo las personas mayores de edad
        List<Persona7> mayoresDeEdad = filtrarMayoresDeEdad(personas);

        // Imprimir la lista de personas mayores de edad
        System.out.println("Personas mayores de edad:");
        for (Persona7 persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }

    public static List<Persona7> filtrarMayoresDeEdad(List<Persona7> personas) {
        // Caso base: si la lista está vacía, devolver una lista vacía
        if (personas.isEmpty()) {
            return new ArrayList<>();
        }

        // Tomar la primera persona de la lista
        Persona7 primeraPersona = personas.get(0);

        // Llamada recursiva: procesar el resto de la lista
        List<Persona7> resto = filtrarMayoresDeEdad(personas.subList(1, personas.size()));

        // Si la primera persona es mayor de edad, agregarla al resultado
        if (primeraPersona.getEdad() >= 18) {
            resto.add(0, primeraPersona);
        }

        // Devolver la lista acumulada
        return resto;
    }
}
