public class ContadorWhile {

    // Declaración de atributos
    private final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    // Método para mostrar el contador
    public void mostrarContadorWhile() {
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }
}
