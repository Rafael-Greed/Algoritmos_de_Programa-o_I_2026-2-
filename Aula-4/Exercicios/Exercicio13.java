package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
//exercicio 13 - Calculadora simples com operações básicas
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char continuar;

        // O laço do-while garante que a calculadora execute pelo menos 1 vez
        do {
            System.out.println("\n--- CALCULADORA ---");
            
            // 1. Leitura dos números
            System.out.println("Digite o primeiro número:");
            double num1 = entrada.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = entrada.nextDouble();

            // 2. Leitura da operação
            System.out.println("Digite a operação desejada (+, -, * ou /):");
            char operacao = entrada.next().charAt(0);

            double resultado;

            // 3. Processamento do cálculo
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                    break;

                case '/':
                    if (num2 <= 0) {
                        System.out.println("Impossível dividir‼");
                    } else {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                    }
                    break;

                default:
                    System.out.println("Sinal Inválido");
                    break;
            }

            // 4. Pergunta ao usuário se ele deseja continuar
            System.out.println("\nDeseja realizar outro cálculo? (S para Sim / N para Não):");
            continuar = entrada.next().charAt(0);

        // O laço continua se a resposta for 'S' ou 's'
        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nPrograma encerrado. Até logo!");

        entrada.close();
    }
}