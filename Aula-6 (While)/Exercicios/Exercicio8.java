package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio8 {
    //Media_De_Notas_dos_Alunos_utilizando_DoWhile

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Variável de controlo do laço principal para contar os 5 alunos
        int aluno = 1;

        System.out.println("--- CÁLCULO DE MÉDIA DE 5 ALUNOS ---");

        // Laço principal para processar os 5 alunos
        while (aluno <= 5) {

            System.out.println("\n--- Aluno " + aluno + " ---");

            double nota1;
            // Validação da primeira nota com do...while (entre 0 e 10)
            do {
                System.out.print("Digite a 1ª nota (entre 0 e 10): ");
                nota1 = entrada.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

            double nota2;
            // Validação da segunda nota com do...while (entre 0 e 10)
            do {
                System.out.print("Digite a 2ª nota (entre 0 e 10): ");
                nota2 = entrada.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } while (nota2 < 0 || nota2 > 10);

            // Calcula a média aritmética das duas notas válidas
            double media = (nota1 + nota2) / 2.0;

            // Exibe a média do aluno atual
            System.out.printf("Média do Aluno %d: %.2f%n", aluno, media);

            // Incrementa para o próximo aluno
            aluno++;
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}