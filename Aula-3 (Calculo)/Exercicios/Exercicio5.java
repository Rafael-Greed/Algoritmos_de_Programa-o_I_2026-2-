package Exercicios;

import java.util.Scanner;

public class Exercicio5 { // Método principal onde o programa começa a ser executado
    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do usuário via console
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê a primeira nota (usa double pois notas podem ter casas decimais)
        System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        // Solicita e lê a segunda nota
        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        // Solicita e lê a terceira nota
        System.out.println("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        // Calcule a média aritmética somando as 3 notas e dividindo o total por 3
        // Os parênteses são obrigatórios para garantir que a soma seja feita antes da divisão
        double media = (nota1 + nota2 + nota3) / 3.0; 

        // Imprime o resultado da média na tela
        System.out.println("Média das notas: " + media);

        // Fecha o Scanner para liberar recursos do sistema
        entrada.close();
    }
}
    
