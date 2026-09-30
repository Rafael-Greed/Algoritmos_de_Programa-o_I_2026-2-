package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio3 {
    //Sequencia_De_Potencias_Númericas

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o número limite fornecido pelo utilizador
        System.out.println("Digite um número inteiro limite:");
        int limite = entrada.nextInt();

        // O primeiro termo da sequência é 1 (2^0)
        int valorSequencia = 1;

        System.out.println("\nSequência de valores:");

        // Laço executa enquanto o termo atual for menor ou igual ao limite lido
        while (valorSequencia <= limite) {

            // Imprime o valor atual da sequência
            System.out.println(valorSequencia);

            // Multiplica o valor atual por 2 para gerar o próximo elemento da sequência
            valorSequencia *= 2; // Equivalente a: valorSequencia = valorSequencia * 2;
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}