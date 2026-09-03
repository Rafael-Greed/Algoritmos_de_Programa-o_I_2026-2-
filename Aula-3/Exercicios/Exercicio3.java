package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;

public class Exercicio3 {

    // O método main é a porta de entrada para a execução do programa em Java
    public static void main(String[] args) {
        
        // Instancia o objeto Scanner para capturar as entradas do console
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o primeiro número inteiro
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = entrada.nextInt(); // Alterado de double para int conforme o enunciado

        // Solicita e lê o segundo número inteiro
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = entrada.nextInt(); // Alterado de double para int conforme o enunciado

        // Calcula o produto (multiplicação) dos dois números inteiros
        int produto = numero1 * numero2;

        // Imprime o resultado do produto na tela
        System.out.println("Produto dos Números: " + produto);

        // Fecha o recurso Scanner para evitar vazamento de memória
        entrada.close();
    }
}