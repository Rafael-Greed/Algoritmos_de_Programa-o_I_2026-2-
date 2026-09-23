package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o plano de trabalho (A, B ou C)
        System.out.println("Digite o plano de trabalho do funcionário (A, B ou C):");
        // Lê o primeiro caractere digitado e converte para maiúsculo
        char plano = Character.toUpperCase(entrada.next().charAt(0));

        // Solicita e lê o salário atual do funcionário
        System.out.println("Digite o salário atual do funcionário (R$):");
        double salarioAtual = entrada.nextDouble();

        double novoSalario = 0.0;
        boolean planoValido = true;

        // Estrutura switch para aplicar a percentagem de aumento conforme o plano
        switch (plano) {
            case 'A':
                // Plano A: 10% de aumento
                novoSalario = salarioAtual * 1.10;
                break;

            case 'B':
                // Plano B: 15% de aumento
                novoSalario = salarioAtual * 1.15;
                break;

            case 'C':
                // Plano C: 20% de aumento
                novoSalario = salarioAtual * 1.20;
                break;

            default:
                // Caso seja digitado um plano que não esteja na tabela
                System.out.println("Plano de trabalho inválido! Escolha entre A, B ou C.");
                planoValido = false;
                break;
        }

        // Exibe o novo salário apenas se o plano introduzido for válido
        if (planoValido) {
            System.out.printf("O novo salário com o aumento é: R$ %.2f%n", novoSalario);
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}