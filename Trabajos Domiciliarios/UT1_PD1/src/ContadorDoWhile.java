public class ContadorDoWhile {

    private final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContadorDoWhile() {
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }
}
