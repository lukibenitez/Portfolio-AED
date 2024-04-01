public class Alumno {
    private String nombre;

    public Alumno() {
        nombre = "Lucas";
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        string[0] = palabra;
        return (string[0].charAt(0));
    }

    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        System.out.println("El tipo del objeto es: " + x1.getClass().getName());
        String res=  x1.toString();
        System.out.println("El tipo del objeto es: " + res.getClass().getName());
        return res;
    }
}