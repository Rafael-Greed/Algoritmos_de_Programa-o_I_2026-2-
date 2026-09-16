package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio3 {
//exercicio 3: Faça um programa que leia dois números inteiros e verifique se eles são iguais. Caso não sejam, exiba a diferença do maior pelo menor.
    public static void main(String[] args) {

        // Instancia o Scanner para capturar os dados do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o primeiro número inteiro
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = entrada.nextInt();

        // Solicita e lê o segundo número inteiro
        System.out.println("Digite o segundo número inteiro:");
        int num2 = entrada.nextInt();

        // Estrutura de decisão principal: verifica se os números são iguais
        if (num1 == num2) {
            System.out.println("Números iguais");
        } else {
            // Caso sejam diferentes, verifica qual deles é o maior
            if (num1 > num2) {
                int diferenca = num1 - num2;
                System.out.println("A diferença do maior pelo menor é: " + diferenca);
            } else {
                int diferenca = num2 - num1;
                System.out.println("A diferença do maior pelo menor é: " + diferenca);
            }
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}