package Exemplo;

import java.util.Scanner;

public class Controle {
    public static void main(String[]argo){
        Scanner entrada = new Scanner(System.in);
    
        int resp, idade;//Declara a variavel de controle
        String nome;
        resp = 1;//Inicializa a variavel de controle 
        while(resp==1){

         System.out.println("Digite o seu Nome: ");
         nome = entrada.next();

         System.out.println("Digite sua Idade:");
         idade = entrada.nextInt();//next= proxima Int= Numero inteiro

         if(idade >= 18){//Se idade for maior ou igual a (>=)18
            System.out.print("Seu Nome é: ");
         }

         System.out.println("Deseja Continuar? Digite 1(Sim) Digite 0(Não):");
         resp = entrada.nextInt();
        //Entrada para proxima linha por estar dentro do while(Loop) ele Vai para o inicio do While
         }      
         entrada.close();
            }
          
    }
