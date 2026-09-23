package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio5{

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o primeiro número
        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();

        // Solicita e lê o segundo número
        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();

        // Apresenta as opções do menu
        System.out.println("\nEscolha a operação desejada:");
        System.out.println("M - Média entre os números digitados");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números digitados");
        System.out.println("D - Divisão do primeiro pelo segundo");

        // Lê o caractere da opção e converte para maiúsculo
        char opcao = Character.toUpperCase(entrada.next().charAt(0));

        double resultado;

        // Estrutura switch para processar a opção escolhida
        switch (opcao) {
            case 'M':
                // Média aritmética simples entre os dois números
                resultado = (num1 + num2) / 2.0;
                System.out.printf("A média entre %.2f e %.2f é: %.2f%n", num1, num2, resultado);
                break;

            case 'S':
                // Subtrai o menor valor do maior valor usando Math.abs ou comparação direta
                if (num1 >= num2) {
                    resultado = num1 - num2;
                } else {
                    resultado = num2 - num1;
                }
                System.out.printf("A diferença do maior pelo menor é: %.2f%n", resultado);
                break;

            case 'P':
                // Produto (multiplicação) dos números
                resultado = num1 * num2;
                System.out.printf("O produto entre %.2f e %.2f é: %.2f%n", num1, num2, resultado);
                break;

            case 'D':
                // Divisão do primeiro número pelo segundo com validação do divisor
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível efetuar divisão por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("A divisão de %.2f por %.2f é: %.2f%n", num1, num2, resultado);
                }
                break;

            default:
                // Mensagem para o caso de digitar uma opção fora da tabela
                System.out.println("Opção inválida! Escolha entre M, S, P ou D.");
                break;
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}