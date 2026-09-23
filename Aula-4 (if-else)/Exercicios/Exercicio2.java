package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    //exercicio 2: Faça um programa que leia a idade de uma pessoa e verifique se ela é maior ou menor de idade. Considere a maioridade civil como 18 anos. 
    public static void main(String[] args) {
        
        // Instancia o Scanner para leitura da idade
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê a idade do usuário
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();

        // Estrutura de decisão (condicional)
        // Em Java, a maioridade civil padrão é alcançada aos 18 anos
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}