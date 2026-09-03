package Exercicios;

// Importa a classe Scanner, necessária para ler entradas digitadas no teclado
import java.util.Scanner;

public class Exercicio4 {

    // O método main é o ponto de entrada de execução do programa Java
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para capturar dados digitados pelo usuário no console
        try (Scanner entrada = new Scanner(System.in)) {
            // Leitura dos 4 números inteiros conforme solicitado pelo enunciado
            System.out.println("Digite o primeiro número inteiros:");
            int numero1 = entrada.nextInt(); // Lê o primeiro número inteiro

            System.out.println("Digite o segundo número inteiro:");
            int numero2 = entrada.nextInt(); // Lê o segundo número inteiro

            System.out.println("Digite o terceiro número inteiro:");
            int numero3 = entrada.nextInt(); // Lê o terceiro número inteiro

            System.out.println("Digite o quarto número inteiro:");
            int numero4 = entrada.nextInt(); // Lê o quarto número inteiro

            // Calcula a soma dos quatro números armazenados nas variáveis
            int soma = numero1 + numero2 + numero3 + numero4;

            // Imprime o resultado final da soma na tela
            System.out.println("A soma dos quatro números é: " + soma);
        }
    }
}