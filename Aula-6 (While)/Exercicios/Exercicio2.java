package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio2 {
//Pares_E_Impares

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Variáveis contadoras para acumular a quantidade de números pares e ímpares
        int pares = 0;
        int impares = 0;

        // Variável de controlo do laço de repetição
        int i = 1;

        // Laço enquanto i for menor ou igual a 10 para ler os 10 números
        while (i <= 10) {
            // Exibe a mensagem indicando a posição do número atual
            System.out.printf("Digite o %dº número:%n", i);
            int numero = entrada.nextInt();

            // Verifica se o número é par utilizando o operador do resto da divisão (%)
            if (numero % 2 == 0) {
                pares++; // Incrementa o contador de pares
            } else {
                impares++; // Incrementa o contador de ímpares
            }

            // Incrementa o contador do laço
            i++;
        }

        // Exibe os totais contados ao final das 10 leituras
        System.out.println("\nO total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        // Encerra a leitura do Scanner
        entrada.close();
    }
}
