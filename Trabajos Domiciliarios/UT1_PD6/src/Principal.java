import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    // Este método ahora deberá interpretar los dígitos T9 para convertirlos a texto
    public static void transformarTextoT9(String rutaArchivoEntrada) {
        // Mapeo de dígitos T9 a letras. El índice 0 y 1 no se usan para simplificar el mapeo.
        String[] t9Mapping = {" ", " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        StringBuilder resultado = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoEntrada));
             FileWriter fw = new FileWriter(rutaArchivoEntrada.replace("entrada3.txt", "salida.txt"))) {
            int c;
            int prevDigit = -1; // Almacenará el dígito anterior para detectar secuencias
            int count = 0; // Contará cuántas veces se repite el dígito actual

            while ((c = br.read()) != -1) {
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    // Si el dígito actual es diferente al anterior, procesamos el anterior
                    if (digit != prevDigit && prevDigit != -1) {
                        int charIndex = (count - 1) % t9Mapping[prevDigit].length();
                        resultado.append(t9Mapping[prevDigit].charAt(charIndex));
                        count = 1; // Restablecer el contador para el nuevo dígito
                    } else {
                        count++; // Incrementar el contador si el dígito se repite
                    }
                    prevDigit = digit;
                }
            }
            // Procesar el último dígito después de salir del bucle
            if (prevDigit != -1) {
                int charIndex = (count - 1) % t9Mapping[prevDigit].length();
                resultado.append(t9Mapping[prevDigit].charAt(charIndex));
            }

            // Escribir el resultado en el archivo de salida
            fw.write(resultado.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
