// Ejercicio 1

// Dado el siguiente programa:
// public static void zoop () {
// baffle ();
// System.out.print ("Vos zacata ");
// baffle ();
// }
// public static void main (String[] args) {
// System.out.print ("No, yo ");
// zoop ();
// System.out.print ("Yo ");
// baffle ();
// }
// public static void baffle () {
// System.out.print ("pac");
// ping ();
// }
// public static void ping () {
// System.out.println (".");
// }

// ¿Cuál es la salida? Sé preciso acerca de dónde hay espacios y dónde hay nuevas líneas.
// Indicar cuál es la respuesta más correcta: (\n denota nueva línea)

// No, yo pac.
// Vos zacata pac.
// Yo pac.

//-----------------------------------------------------------------------------------------------------------

// Ejercicio 2

// public class Zumbido {
//     public static void desconcertar (String dirigible) {
//     System.out.println (dirigible);
//     sipo ("ping", -5);
//     }
//     public static void sipo (String membrillo, int flag) {
//     if (flag < 0) {
//     System.out.println (membrillo + " sup");
//     } else {
//     System.out.println ("ik");
//     desconcertar (membrillo);
//     System.out.println ("muaa-ja-ja-ja");
//     }
//     }
//     public static void main (String[] args) {
//     sipo ("traqueteo", 13);
//     }
//     }

// a) ¿Cuál es la primera sentencia que se ejecuta?

// ik
// traqueteo
// ping sup
// muaa-ja-ja-ja

// b) Escribir número 2 al lado de la segunda sentencia, un 3 al lado de la que se ejecuta en
// tercer lugar, y así siguiendo hasta el final del programa. Si una sentencia se ejecuta más
// de una vez, puede que termine con más de un número al lado.

// ninguna sentencia se ejecuta mas de una vez.

//-----------------------------------------------------------------------------------------------------------

// Errores del ejercicio 4.
// a) Indicar el error al ejecutar la clase Alumno y corregirlo. ¿cómo lo detectaste?
// respuesta: Habian metodos fuera de la clase. Debe ir todo dentro de la clase o hacer otra clase.
// b) Indicar el error al ejecutar el método “recorrer” y corregirlo. ¿cómo lo detectaste?
// respuesta: el motodo tenia <= en el for y lo cambie por <. Ademas cambie el comienzo de la iteracion, 
//            en vez de que empiece por 1 ahora empieza por 0.
// c) Indicar el error al ejecutar el método “getValor” y corregirlo. ¿cómo lo detectaste?
// respuesta: el error estaba en que se queria acceder a un valor en una posicion que no existia, ya que los arreglos 
//            en java empiezan desde la posicion 0. Por lo tanto, mientras de ponga un numero entre el 0 y el 7 bien. 
//            8 o mas no existe en ese arreglo.
// d) Indicar el error al ejecutar el método “getPrimerCaracter” y corregirlo. ¿cómo lo detectaste?
// respuesta: para corregir este metodo simplemente hay que asignarle la palabra pasada por parametros al string creado.
// e) Indicar el error al ejecutar el método “paraAString” y corregirlo. ¿cómo lo detectaste?
// repuesta: Hay que cambiar la ultima linea por return x1.toString();

//-----------------------------------------------------------------------------------------------------------


public class App {
    public static void main(String[] args) throws Exception {

        // Ejercicio 3
        double cuenta1 = multSuma.getMultSuma(1.0, 2.0, 3.0);
        System.out.println(cuenta1);

        // Ejercicio 4
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(Alumno.recorrer("Lucas"));
        System.out.println(Alumno.getValor());
        System.out.println(Alumno.getPrimerCaracter("Lucas"));
        System.out.println(Alumno.paraAString(5));

        // Ejecicio 5
        ContadorWhile miContadorWhile = new ContadorWhile();
        miContadorWhile.mostrarContadorWhile();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ContadorDoWhile miContadorDoWhile = new ContadorDoWhile();
        miContadorDoWhile.mostrarContadorDoWhile();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ContadorFor miContadorFor = new ContadorFor();
        miContadorFor.mostrarContadorFor();
    }
}


