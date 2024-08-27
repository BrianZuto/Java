import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class punto5 {
    public static void main(String[] args) {
        // Crear una lista que no permite duplicados
        Set<String> listaSinDuplicados = new LinkedHashSet<>();

        // Agregar elementos a la lista
        listaSinDuplicados.add("Elemento1");
        listaSinDuplicados.add("Elemento2");
        listaSinDuplicados.add("Elemento3");
        listaSinDuplicados.add("Elemento1"); // Este duplicado no se agregará

        // Usar un iterador para imprimir el contenido de la lista
        Iterator<String> iterador = listaSinDuplicados.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
