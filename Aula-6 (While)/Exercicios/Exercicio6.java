package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio6 {
    //o_Menor_Numero_inteiro

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Variável para armazenar o menor número encontrado
        // Inicializada com o maior valor possível de um inteiro para garantir que a primeira leitura seja menor
        int menor = Integer.MAX_VALUE;

        // Contador para controlar o laço de repetição (1 a 10)
        int i = 1;

        System.out.println("--- LEITURA DE 10 NÚMEROS INTEIROS E POSITIVOS ---");

        // Laço executa enquanto 'i' for menor ou igual a 10
        while (i <= 10) {

            System.out.printf("Digite o %dº número positivo: ", i);
            int numero = entrada.nextInt();

            // Validação para garantir que o número introduzido é positivo
            if (numero <= 0) {
                System.out.println("Por favor, digite apenas números inteiros e positivos (maiores que zero).");
                continue; // Volta ao início do laço sem incrementar o contador 'i'
            }

            // Se o número digitado for menor do que o atual 'menor', atualiza a variável
            if (numero < menor) {
                menor = numero;
            }

            // Incrementa o contador do laço
            i++;
        }

        // Exibe o menor valor encontrado após a leitura dos 10 números
        System.out.println("\nO menor número digitado foi: " + menor);

        // Encerra a leitura do Scanner
        entrada.close();
    }
}