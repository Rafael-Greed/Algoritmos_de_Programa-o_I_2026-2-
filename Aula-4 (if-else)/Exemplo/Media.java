package Exemplo;
 
import  java.util.Scanner;

public class Media{
    
    public static void main(String[]args){
       int contador;
       double nota, Media, Acumulador_Nota;
       Scanner entrada_S = new Scanner(System.in);

       contador=0;
       Acumulador_Nota=0; 

       while (contador < 5){

        contador++;
        System.out.print("Digite uma nota "+ contador + ": ");
        nota = entrada_S.nextInt();
        Acumulador_Nota = Acumulador_Nota + nota;

        }
        Media = Acumulador_Nota / contador;
        System.out.print("A media final é: " + Media);
        entrada_S.close();
       } 
    }