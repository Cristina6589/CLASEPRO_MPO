import java.util.Scanner;

public class Entrada {

    //Clase sobre métodos (refactorización)

    public static void main(String[] args) {
        System.out.println("\nBienvenidos y bienvenidas a mi bar\n");
        saludar("Imperio");
        saludar("Mariana");
        saludar("Petra");
        saludar("Adolfo");
        despedir();

        //Calculadora
        /*
        int numero1 = 4;
        int numero2 = 7;
        int suma = numero1+numero2;
        System.out.println(suma);

        numero1 = 35;
        numero2 = 18;
        suma = numero1+numero2;
        En este caso ya no pongo int porque la variable ya está definida,
        no quiero redefinirla, simplemente le cambio el valor a los numeros
        para hacer una nueva suma.

        System.out.println(suma);

        Para no tener que hacer todas estas líneas de código, llamo a la clase
        de operaciones, ya que en esta clase no tengo sumas ni restas
         */
        /* Esto sería en caso de en la clase operaciones poner static
        Operaciones.sumar(73,12);
        Operaciones. restar(66,52);
        */

        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(16,83);
        operacionesMatematicas.restar(51,33);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número que quieres validar");
        int numeroUsuario = scanner.nextInt();
        System.out.println("El numero es valido "+operacionesMatematicas.validarNumero(numeroUsuario));
        /*
        En este caso es más seguro porque me estoy creando yo una
        variable compleja donde yo le doy el nombre, en este caso "Operaciones"
        que coincide con el nombre la clase y siempre pongo "new"
        Este sería el elemento intermediario para no acceder directamente y de
        forma menos segura con public static void
         */
    }

    /*
    Para evitar tener que escribir tantas líneas de código con mismo contenido
    creo una public void y arriba pongo a lo que voy a llamar
     */

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Buen día");
        System.out.println("¿Qué tal estás?");
        System.out.println("¿Te apetece un café?\n");

        /*
        Como todas las cuestiones las he metido en un metodo,
        estas se van a repetir para cada uno de los usuarios que salude
        Si quiero despedida conjunta para todos solo pongo despedir
         */

    }

    public static void despedir() {
        System.out.println("Adios mi gente");
        System.out.println("Ya está bien por hoy");
        System.out.println("Cerramos el chiringuito\n");

    }
}
