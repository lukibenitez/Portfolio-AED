import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LecturaDeArchivo {

    public static void leerEntradaArchivo(String rutaArchivo){

        List<Float> floats = new ArrayList<>();
        List<Integer> enteros = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo));

            for (String linea : lineas) {
                String lineaTrimmed = linea.trim();
                if (esFloat(lineaTrimmed)) {
                    floats.add(Float.parseFloat(lineaTrimmed));
                    System.out.println("El número de punto flotante es: " + lineaTrimmed);
                } else if (esNumero(lineaTrimmed)) {
                    enteros.add(Integer.parseInt(lineaTrimmed));
                    System.out.println("El entero leído es: " + lineaTrimmed);
                } else if (esBooleano(lineaTrimmed)) {
                    System.out.println("Booleano: " + lineaTrimmed);
                } else {
                    strings.add(lineaTrimmed);
                    System.out.println("La cadena leída es: " + lineaTrimmed);
                }
            }

            float res = enteros.get(0) + floats.get(0);

            // División entera simulada
            int div = (int) Math.floor(floats.get(0) / enteros.get(0));

            // Resto de la división
            float resto = floats.get(0) % enteros.get(0);
            String restoFormateado = String.format(Locale.ROOT, "%.2f", resto);
            float restoComoFloat = Float.parseFloat(restoFormateado);

            System.out.println("¡ Hola " + strings.get(0) + " ! La suma de " + enteros.get(0) + " y " + floats.get(0) + " es " + res);
            
            System.out.printf("La división entera de %s y %s es %d y su resto es %s.\n", floats.get(0), enteros.get(0), div, restoComoFloat);

        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }

    public static boolean esNumero(String cadena) {
        return cadena.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean esFloat(String cadena) {
        // Verifica que la cadena represente un número con un punto decimal.
        // Esta expresión regular coincide con números que incluyen parte decimal obligatoria.
        return cadena.matches("-?\\d+\\.\\d+");
    }

    public static boolean esBooleano(String cadena) {
        // Esta función verifica si la cadena es "true" o "false" ignorando mayúsculas o minúsculas
        return "true".equalsIgnoreCase(cadena) || "false".equalsIgnoreCase(cadena);
    }
}
