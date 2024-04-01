
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Ejercicio 1 -----------------------");

        // Ejercicio 1
        Tablero.imprimirTablero(7, 7);

        System.out.println();
        System.out.println("Ejercicio 2 a -----------------------");

        // Ejercicio 2 a
        String path = "src/entrada.txt";
        LecturaDeArchivo.leerEntradaArchivo(path);

        System.out.println();
        System.out.println("Ejercicio 2 b -----------------------");

        // Ejercicio 2 b
        String path2 = "src/entrada2.txt";
        AreaYPerimetro.leerEntradaStdin(path2);

        // Ejercicio 3
        System.out.println("Ejercicio 3 -----------------------");
        Principal.transformarTextoT9("src/entrada3.txt");

    }
}
