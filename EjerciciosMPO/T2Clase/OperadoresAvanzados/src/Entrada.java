//Si necesito importar cosas de otro paquete o clase concreta de ese paquete:
//import nombrePaquete.NombreClase

/*En esta clase sería:
import controller.GestorDocumentos
import controller.GestorUsuarios
o si quiero el paquete entero: import controller.*
 */

import controller.GestorDocumentos;
import controller.GestorUsuarios;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Cristi", 36, "cristi@gmail.com");
        GestorDocumentos  gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.imprimirFactura(12);
        

    }
}
