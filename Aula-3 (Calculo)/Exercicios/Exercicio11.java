package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura do ano de nascimento e ano atual
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = entrada.nextInt();

        System.out.println("Digite o ano atual:");
        int anoAtual = entrada.nextInt();

        // Cálculos da idade atual e da idade em 2030
        int idadeAtual = anoAtual - anoNascimento;
        int idadeEm2030 = 2030 - anoNascimento;

        // Apresentação dos resultados
        System.out.println("Idade atual: " + idadeAtual + " anos");
        System.out.println("Idade em 2030: " + idadeEm2030 + " anos");

        entrada.close();
    }
}