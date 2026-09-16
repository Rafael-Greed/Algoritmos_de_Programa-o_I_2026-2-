package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados inseridos pelo usuário no console
import java.util.Scanner;

public class Exercicio1 {
//exercicio 1: Faça um programa que leia um número inteiro e verifique se ele é maior que 20. Caso seja, exiba a metade do número.
    public static void main(String[] args) {
        
        // Instancia o objeto Scanner para capturar o que o usuário digitar
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem solicitando que o usuário informe um número inteiro
        System.out.println("Digite o numero inteiro ");

        // Lê o valor inteiro digitado pelo usuário e armazena na variável N1
        int N1 = entrada.nextInt();

        // Calcula a metade do número digitado e armazena na variável D2
        // Nota: Como N1 é 'int', a divisão por '2' é inteira. Para resultado com casas decimais, usa-se '2.0'
        double D2 = N1 / 2;

        // Estrutura condicional (if): verifica se o número digitado é estritamente maior que 20
        if (N1 > 20) {

            // Se a condição for verdadeira (N1 > 20), imprime a metade do número
            System.out.println("Seu Número é: " + D2);

        } else {

            // Se a condição for falsa (N1 for menor ou igual a 20), exibe esta mensagem
            System.out.println("O número digitado não é maior que 20.");

        }

        // Fecha o recurso Scanner para liberar a memória utilizada
        entrada.close(); 

    }
}