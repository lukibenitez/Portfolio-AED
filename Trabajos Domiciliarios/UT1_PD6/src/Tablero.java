
public class Tablero {

    public static void imprimirTablero(int largo, int ancho){

        for (int i = 1; i <= ancho; i++) {
            for (int j = 1; j <= largo; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
