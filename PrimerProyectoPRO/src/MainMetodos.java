import org.w3c.dom.CDATASection;

import javax.xml.namespace.QName;

public class MainMetodos {
    public static void main (String [] args) { //para generarlo tecleo psvm o main y Tab
        System.out.println("Main para probar metodos y variables");

        saludar("Cris");
        saludar("Mariana");
        despedir();

    }

    public static void saludar(String data) {
        System.out.println("Enhorabuena "+data+", has llamado a tu primer metodo");
    }

    public static void despedir() {
        System.out.println("Hasta luego, hemos terminado");
    }

}




