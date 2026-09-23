package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;

public class Exercicio10 {
//exercicio 10 - Verificação de igualdade entre três números inteiros e identificação do maior
    public static void main(String[] args) {

        // Instancia o Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê os três números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int num3 = entrada.nextInt();

        // 1. Verifica se os três números são exatamente iguais
        if (num1 == num2 && num2 == num3) {
            System.out.println("os números são iguais");
        } else {
            // 2. Se não forem iguais, descobre qual é o maior utilizando o Math.max
            int maior = Math.max(num1, Math.max(num2, num3));
            System.out.println("O maior número é: " + maior);
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}