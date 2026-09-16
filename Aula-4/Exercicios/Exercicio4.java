package Exercicios;

// Importa a classe Scanner para leitura dos dados de entrada
import java.util.Scanner;

public class Exercicio4 {
//exercicio 4: Faça um programa que leia dois números do tipo ponto flutuante (double) e exiba-os em ordem decrescente. Suponha que os números não sejam iguais.
    public static void main(String[] args) {

        // Instancia o Scanner para capturar os dados informados pelo usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o primeiro número do tipo ponto flutuante (double)
        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();

        // Solicita e lê o segundo número do tipo ponto flutuante (double)
        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Números em ordem decrescente:");

        // Estrutura condicional para determinar qual número é maior
        // Como o enunciado supõe que não são iguais, basta testar se num1 é maior que num2
        if (num1 > num2) {
            System.out.println(num1 + " -> " + num2);
        } else {
            System.out.println(num2 + " -> " + num1);
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}