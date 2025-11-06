public class Operaciones {

    /*
    En eta clase no pongo main porque no quiero darle al play y que se ejecute eso,
    solo quiero guardar los métodos que cree para hacer dichas operaciones.
    En definitiva, aquí guardaré todas las funcionales que hagan referencia a operaciones
     */

    /*
    El problema de poner static es que no es muy seguro,
    ya que es fácilmente accesible.
    Es más recomendable
     */

    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public int restar(int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultado de la resta es: "+resultado);
        // al final del metodo en la última línea le tengo que decir que retorna
        return resultado;




    }
}
