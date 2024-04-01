public class ContadorFor {

        private final int MAX_CONT = 50;
        private int incremento = 1;
    
        public void mostrarContadorFor() {
            for (int contador = 1; contador <= MAX_CONT; contador += incremento) {
                System.out.println(contador);
            }
        }
}
