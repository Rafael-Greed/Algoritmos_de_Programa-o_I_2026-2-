package Exercicios;

// Importa a classe Scanner para permitir a leitura do número digitado no teclado
import java.util.Scanner;

public class Exercicio1{

    public static void main(String[] args) {

        // Instancia o objeto Scanner para capturar as entradas do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário um número inteiro entre 1 e 7
        System.out.println("Digite um número de 1 a 7 para saber o dia da semana:");
        int dia = entrada.nextInt();

        // A estrutura switch avalia o valor da variável 'dia'
        switch (dia) {
            case 1:
                // Caso o valor digitado seja 1, o dia correspondente é Domingo
                System.out.println("Domingo");
                break; // O 'break' interrompe a execução do switch após encontrar a opção

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                // O 'default' é executado se o usuário digitar um número fora do intervalo de 1 a 7
                System.out.println("Número inválido! Digite um valor de 1 a 7.");
                break;
        }

        // Encerra a leitura do Scanner para liberar os recursos do sistema
        entrada.close();
    }
}