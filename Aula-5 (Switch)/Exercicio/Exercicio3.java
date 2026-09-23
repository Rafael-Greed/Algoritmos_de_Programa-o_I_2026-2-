package Exercicios;

// Importa a classe Scanner para permitir a leitura do teclado
import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args) {

        // Instancia o Scanner para capturar a entrada do utilizador
        Scanner entrada = new Scanner(System.in);

        // Solicita ao utilizador a letra referente ao período
        System.out.println("Digite o período em que estuda (M - Matutino / V - Vespertino / N - Noturno):");
        // Lê a primeira letra digitada e converte para maiúscula para aceitar 'm', 'v', 'n'
        char periodo = Character.toUpperCase(entrada.next().charAt(0));

        // Estrutura de decisão para verificar o período e exibir a saudação
        switch (periodo) {
            case 'M':
                System.out.println("bom dia");
                break; // Interrompe a execução do switch após encontrar a opção

            case 'V':
                System.out.println("boa tarde");
                break;

            case 'N':
                System.out.println("boa noite");
                break;

            default:
                // Trata o caso em que o utilizador digita uma opção diferente de M, V ou N
                System.out.println("Opção inválida! Digite M, V ou N.");
                break;
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}