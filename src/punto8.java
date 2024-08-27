import java.util.HashMap;
import java.util.Map;

public class punto8 {
    public static void main(String[] args) {
        // Crear un mapa con números enteros y cadenas de caracteres
        Map<Integer, String> mapaOriginal = new HashMap<>();
        mapaOriginal.put(1, "Uno");
        mapaOriginal.put(2, "Dos");
        mapaOriginal.put(3, "Tres");
        mapaOriginal.put(4, "Cuatro");
        mapaOriginal.put(5, "Cinco");

        // Llamar a la función recursiva para filtrar solo las claves pares
        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapaOriginal);

        // Imprimir el nuevo mapa filtrado
        System.out.println("Mapa con claves pares:");
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }

    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {
        // Caso base: si el mapa está vacío, devolver un nuevo mapa vacío
        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        // Obtener la primera entrada del mapa
        Map.Entry<Integer, String> primeraEntrada = mapa.entrySet().iterator().next();

        // Crear un nuevo mapa con el resto de las entradas
        Map<Integer, String> restoMapa = new HashMap<>(mapa);
        restoMapa.remove(primeraEntrada.getKey());

        // Llamada recursiva para procesar el resto del mapa
        Map<Integer, String> resultado = filtrarClavesPares(restoMapa);

        // Verificar si la clave de la primera entrada es par y, si lo es, agregarla al resultado
        if (primeraEntrada.getKey() % 2 == 0) {
            resultado.put(primeraEntrada.getKey(), primeraEntrada.getValue());
        }

        // Devolver el mapa acumulado
        return resultado;
    }
}
