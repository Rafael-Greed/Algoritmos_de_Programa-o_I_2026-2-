package Exemplo;

import java.util.Scanner;//chamou o scanner

public class validação{

    

    public static void main(String[]argo){

        Scanner entrada = new Scanner(System.in);//definiu a entrada do scanner
        double nota;

        do { // do é intrução para  o while 
            System.out.println("==== Digite uma Nota entre O a 10. ====");
            nota = entrada.nextDouble();
            if (nota < 0 || nota > 10){
                System.out.println("Nota incoreta. Por Favor digite Uma nota de 0 a 10");
            }
 
        } while (nota < 0 || nota >10 );
        System.out.println("\nNota válida registrada ");
        entrada.close();
}
}