public class Main {

    public static void main (String[] args) {
        /*
        En la versión 24 de jdk siempre te pide al poner main:
        public static void main (String[] args)
        */
        System.out.println("Este es mi primer programa en Java\n");
        /*
        Para dar salto de línea o pongo en el println o entre las comillas siempre pongo
        \n
         */
        System.out.println("Este es la segunda línea del programa\n");
        System.out.println("Hola bebota, te cuento un poco sobre mi: \n");
        //TODO
        //este tipo de comentario sale resaltado y en color para que lo puedas localizar siempre
        String miNombre = "Cristina";
        /*
        Esta es una variable de palabra y su valor va definido entre ""
        (no puedo definir dos varibles con el mismo nombre)
        y su valor es nulo "null"
         */
        char letraDNI = 'N';
        /*
        es una variable de letra y su valor va definido por ''
         */
        int edad = 36; //es un dato (variable) de número entero sin decimales
        double altura = 1.70; // número con decimales con precisión (doble de decimales que el float)
        float peso = 63f; //número con decimales sin precisión (para diferenciar se pone f al final)

        boolean experiencia = false;//true/false sirve para tomar decisiones
        /*
        Estas son varialbes mutables, puedo cambiar su valor cuando quiera
         */
        final String DNI = "14372024M"; // esta variable sería no mutable, no la puedo cambiar, como el nº PI, final lo define como que nadie puede cambiar su valor

        System.out.println("Mi nombre es: "+miNombre);
        System.out.println("La letra de mi DNI es: "+letraDNI);
        System.out.println("Mi edad es de: "+edad+" años"); //si vuelvo a poner otro + y " concateno con años
        System.out.println("Mi altura es de: "+altura+" cm" );
        System.out.println("Mi peso es de: "+peso+" kg");
        System.out.println("Mi experiencia es: "+experiencia);
        System.out.println("Mi DNI es el: "+DNI);
        System.out.println("El valor del número PI es: "+Math.PI); //ejemplo de no mutable (siempre se escriben en mayúscula)
        System.out.println("El valor máximo de un int es: "+Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es: "+Integer.MIN_VALUE); //ambas ejemplos de no mutables



    }

    public void nombreMetodo () {
        int edadMetodo = 42;
        System.out.println(edadMetodo);

    }


}
