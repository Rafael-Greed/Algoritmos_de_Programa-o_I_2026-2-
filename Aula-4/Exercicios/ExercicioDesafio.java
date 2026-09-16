package Exercicios;

import java.util.Scanner;

public class ExercicioDesafio {
//exercicio desafio - Verificação de elegibilidade para votar
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Você possui nacionalidade brasileira? (S para Sim / N para Não):");
        char nacionalidade = entrada.next().charAt(0);

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();

        // 2. Validação da nacionalidade
        if (nacionalidade != 'S' && nacionalidade != 's') {
            System.out.println("Inapto a votar: Somente cidadãos brasileiros podem votar no Brasil.");
        } else {
            // 3. Estrutura condicional baseada na idade
            if (idade < 16) {
                System.out.println("Inapto a votar (Menor de 16 anos não pode votar).");
            } else if ((idade >= 16 && idade <= 17) || idade >= 70) {
                System.out.println("Apto a votar: O seu voto é FACULTATIVO (opcional).");
            } else {
                // Idade entre 18 e 69 anos
                System.out.println("Apto a votar: O seu voto é OBRIGATÓRIO.");
            }
        }

        entrada.close();
    }
}