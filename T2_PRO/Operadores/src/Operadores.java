public class Operadores {
//operadores son los que se pueden realizar con operandos

    public void operadoresAritmeticos(){
        //Operadores aritméticos son los que realizan operaciones matemáticas básicas
        System.out.println("Explicación de los operadores artiméticos");
        //unarios -> solo necesitan un operando
        int operandoUno = 9;
        operandoUno++; // esto es igual a poner operandoUno = operandoUno + 1
        operandoUno++;
        operandoUno++;
        System.out.println("Después de incrementar "+operandoUno);
        operandoUno--; //esto sería para decrementar, lo mismo que operandoUno= operandoUno-1
        operandoUno--;
        operandoUno--;
        System.out.println("Después de decrementar "+operandoUno);
        operandoUno=-operandoUno; //aquí estoy calculando su inverso

        //Binarios
        int operandoDos = 6;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicación es "+multiplicacion);
        double division = (double) operandoUno/operandoDos;
        System.out.println("El resultado de la división es "+division);
        /*
        En el caso de la división, cuando divido dos números enteros, aunque ponga
        double en vez de int, la calculadora me devuelve un entero. En este caso tengo que
        pasar uno de los operandos de formar temporal a double para que de un resultado real
        para esto, pongo delante de la variable, en el operando que quiera (double)
        double division = (double) operandoUno/operandoDos;
        Si solo quiero dos decimales no uso el println, este lo sustituyo por:
        System.out.printf("El resultado de la división es %.2f",division);
        %.2f sería una bandera y ahí significa que % .2 porque solo quiero dos decimales
        y la f porque es un float
         */
        int modulo = operandoUno%operandoDos; //este es el resto de la división (el módulo)
        System.out.println("El modulo es "+modulo);

    }

   //Operadores de asignación son los que asignan un valor determinado a una variable. El signo = asigna el valor
    public void operadoresAsignacion(){
        int operandoUno = 6;
        operandoUno += 6;//esto sería igual pero más extenso: int operandoUno = operandoUno + 6; // sería 12
        operandoUno -= 3; //sería 9
        operandoUno *= 2; //sería 18
        operandoUno /= 2; //sería 9
        operandoUno %= 3; //sería 0
    }

    /*
    Operadores de comparación o relacionales, comparan dos valores y pueden ser dos variables
    (valor de cada variable)
    El resultado de toda comparación es booleano porque al comparar te dice true o false
    se puede usar para las formulas >, <, >=, == (para igual debo poner dos signos =),
    != (estos significa diferente)...
     */
    public void operadoresComparacion(){
        int numeroUno = 4;
        int numeroDos = 7;
        boolean resultado = numeroUno>numeroDos; // false 4 es menor que 7
        System.out.println("El resultado de > es "+resultado);
    }
    /*
    operadores lógicos  son AND OR NOT, permiten elegir un camino u otro,
    dan como resultado un booleano teniendo en cuenta varias comparaciones
    AND: el resultado de una comparación compuesta por 2 o más condiciones será true si
    todas las comparaciones son true. Con una que sea false el resultado es falta
    Para representarlo se pone && (ampersand)
    OR: el resultado de una comparación compuesta por 2 o más condiciones será true si
    una de ellas es true. Solo será false si todas son false
    Se pone || (pipe o doble tubería se llama)
     */
    public void operadoresLogicos(){
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
        //Resultado: Módulo1=true && Módulo2=true  && Módulo=true && Último módulo=este módulo quiere decir que el numeroTres entre 2 es diferente de 0 y sería true, por lo que al ser todos true sería true
        System.out.println("El resultado lógico del AND es "+resultadoLogicoAND);
        boolean resultadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<numeroDos;
        // el primer modulo sería true por lo que el resultado lógico sería true ya que cumple uno true
        System.out.println("El resultado lógico de OR es "+resultadoLogicoOR);
    }
}
