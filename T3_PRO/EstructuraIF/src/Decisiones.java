public class Decisiones {
    public void estructuraIF(int nota){
        System.out.println("Vamos a explicar la estructura IF");
        if (nota>=5){
            System.out.println("El examen está aprobado, ¡máquina!");
        } else{
            System.out.println("El examen está suspenso, ¡pos haber estudiao!");
        }
        System.out.println("Se acabó la evaluación");
    }
    public void estructuraIFELSEIF(double nota) {
        //0  -> desastroso
        //1-3 -> mal
        //4-4.99 -> suspenso raspado
        //5-7.99 -> bien
        //8-8.99 -> notable
        //9-9.99 -> sobresaliente
        //10 -> MH
        System.out.println("Iniciando la evaluación del examen");
        if (nota>=0 && nota<=10){
            if (nota < 1) {
                System.out.println("Examen desastroso, ¡mis ojos!");
            } else if (nota < 3.99) {
                System.out.println("Examen mal, fatal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado, casi pero no chocho");
            } else if (nota < 8) {
                System.out.println("Examen bien, pero tampoco te has quebrado");
            } else if (nota < 9) {
                System.out.println("Examen notable, parece que alguien usa el 1% del cerebro");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente, hay esperanza en la humanidad");
            } else {
                System.out.println("Examen de MH, !bendígame dios!");
            }
        } else{
            System.out.println("Rango incorrecto");
        }
        System.out.println("Fin de la evaluación");
      }
    }

