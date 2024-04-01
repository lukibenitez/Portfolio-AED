
// Ejercicio 1

// Dado el siguiente código fuente:
// public class IdentifyMyParts {
// public static int x = 7;
// public int y = 3;
// }

// a) ¿Cuáles son las variables de clase?
// respuesta: public static int x = 7;
// b) ¿Cuáles son las variables de instancia?
// respuesta: public int y = 3;

// ------------------------------------------------------------------

// ¿Cuál es la salida que produce el siguiente código?
// IdentifyMyParts a = new IdentifyMyParts();
// IdentifyMyParts b = new IdentifyMyParts();
// a.y = 5;
// b.y = 6;
// a.x = 1;
// b.x = 2;
// System.out.println("a.y = " + a.y);
// System.out.println("b.y = " + b.y);
// System.out.println("a.x = " + a.x);
// System.out.println("b.x = " + b.x);
// System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

//respuesta: 
// a.y = 5
// b.y = 6
// a.x = 2
// b.x = 2
// IdentifyMyParts.x = 2

// Ejercicio 3

// 1) El siguiente código crea un array y una string. ¿Cuántas referencias a estos objetos
// existen luego de que el código se ha ejecutado? ¿Es alguno de los objetos candidato a
// ser eliminado por el garbage collector?
// String[] students = new String[10];
// String studentName = "Peter Parker";
// students[0] = studentName;
// studentName = null;
// ...

// Después de que se ha ejecutado el código proporcionado, se crean dos objetos: un array de String con espacio para 10 elementos (students) y un String con el contenido "Peter Parker" (studentName). Cuando students[0] = studentName; se ejecuta, la primera posición del array de String apunta al objeto String "Peter Parker". Al hacer studentName = null;, eliminas la referencia directa al String "Peter Parker", pero el objeto String todavía es accesible a través de students[0]. Por lo tanto, después de que el código se ha ejecutado, hay 1 referencia al objeto String "Peter Parker" (a través del array students) y 1 referencia al array de String (students).

// ¿Es alguno de los objetos candidato a ser eliminado por el garbage collector?

// El objeto String "Peter Parker" no es candidato para la recolección de basura porque todavía es accesible a través del array students.
// El array de String (students) tampoco es candidato para la recolección de basura, ya que tiene una referencia activa desde la variable students.


// 2) Cómo hace un programa para destruir un objeto que ha creado?
// respuesta:
// Asignar null a la variable que mantiene la referencia al objeto (si es la única referencia).
// Reasignar la variable a otro objeto.
// Permitir que el alcance de la variable que referencia al objeto termine.

import java.util.logging.ConsoleHandler;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejercicio 2
        SomethingIsWrong.Rectangle myRect = new SomethingIsWrong.Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());

        // Ejerciccio 3
        ContenedorDeNumeros.NumberHolder holder = new ContenedorDeNumeros.NumberHolder();

        holder.anInt = 10; 
        holder.aFloat = 5.5f;

        System.out.println("Valor de anInt: " + holder.anInt);
        System.out.println("Valor de aFloat: " + holder.aFloat);
    }
}
