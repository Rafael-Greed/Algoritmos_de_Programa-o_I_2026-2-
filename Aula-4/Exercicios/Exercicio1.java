package Exercicios;
import java.util.Scanner;

public class At1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero inteiro ");

        int N1 = entrada.nextInt();

        double D2 = N1/2;

        if (N1 > 20) {

            System.out.println( "Seu Número é: " + D2);

        }else{
            System.out.println("O número digitado não é maior que 20.");
        }

        entrada.close(); 

    }
}
