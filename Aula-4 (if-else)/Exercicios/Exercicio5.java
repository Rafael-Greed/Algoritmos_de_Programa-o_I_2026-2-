package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados do console
import java.util.Scanner;

public class Exercicio5 {
//Exercicio 5: Faça um programa que leia um número inteiro e verifique se ele pertence ao intervalo entre 50 e 100 (inclusive).
    public static void main(String[] args) {

        // Instancia o Scanner para ler a entrada do teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        // Estrutura condicional (if):
        // Testa se o número é MAIOR OU IGUAL a 50 E TAMBÉM MENOR OU IGUAL a 100
        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}