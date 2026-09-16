package Exercicios;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class Exercicio12 {
//exercicio 12 - Cálculo do desconto do INSS com base no salário
    public static void main(String[] args) {

        // Instancia o Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o salário da pessoa
        System.out.println("Digite o valor do salário (R$):");
        double salario = entrada.nextDouble();

        double descontoINSS = 0.0;

        // Estrutura de decisão encadeada conforme as faixas do enunciado
        if (salario <= 600.00) {

            // Até R$ 600,00 -> Isento de desconto
            descontoINSS = 0.0;
            System.out.println("Isento de desconto do INSS.");

        } else if (salario > 600.00 && salario <= 1200.00) {

            // Acima de R$ 600,00 até R$ 1200,00 -> 20%
            descontoINSS = salario * 0.20;
            System.out.printf("Desconto do INSS (20%%): R$ %.2f%n", descontoINSS);

        } else if (salario > 1200.00 && salario <= 2000.00) {

            // Acima de R$ 1200,00 até R$ 2000,00 -> 25%
            descontoINSS = salario * 0.25;
            System.out.printf("Desconto do INSS (25%%): R$ %.2f%n", descontoINSS);

        } else {

            // Acima de R$ 2000,00 -> 30%
            descontoINSS = salario * 0.30;
            System.out.printf("Desconto do INSS (30%%): R$ %.2f%n", descontoINSS);

        }

        // Exibe o salário líquido após a dedução do INSS
        double salarioLiquido = salario - descontoINSS;
        System.out.printf("Salário líquido a receber: R$ %.2f%n", salarioLiquido);

        // Fecha o recurso Scanner
        entrada.close();
    }
}