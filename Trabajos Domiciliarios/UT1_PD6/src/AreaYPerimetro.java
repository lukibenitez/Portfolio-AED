import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class AreaYPerimetro {

    public static void leerEntradaStdin(String rutaArchivo) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo));
            
            if (!lineas.isEmpty()) {
                double radio = Double.parseDouble(lineas.get(0).trim());
                calcularAreaYPerimetro(radio);
            } else {
                System.out.println("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("El formato del número no es válido.");
        }
    }

    private static void calcularAreaYPerimetro(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        
        System.out.printf(Locale.ROOT, "Con un radio de %.2f, el área de la circunferencia es: %.2f\n", radio, area);
        System.out.printf(Locale.ROOT, "y el perímetro es: %.2f\n", perimetro);
    }
}
