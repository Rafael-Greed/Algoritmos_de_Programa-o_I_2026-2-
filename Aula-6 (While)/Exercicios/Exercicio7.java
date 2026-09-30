package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio7 {
    //Calculo_do_IMC(índice de Massa Corporal)

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Contador para armazenar a quantidade de pessoas com IMC saudável (sem obesidade)
        int pessoasSemObesidade = 0;

        // Variável de controlo do laço de repetição (1 a 10)
        int i = 1;

        System.out.println("--- CÁLCULO DE IMC DE 10 PESSOAS ---");

        // Laço executa enquanto 'i' for menor ou igual a 10
        while (i <= 10) {

            System.out.println("\n--- Pessoa " + i + " ---");

            // Solicita e lê a altura em metros (ex: 1.75)
            System.out.print("Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            // Solicita e lê o peso em quilogramas (ex: 70.5)
            System.out.print("Digite o peso (em kg): ");
            double peso = entrada.nextDouble();

            // Calcula o IMC utilizando a fórmula: peso / (altura * altura)
            double imc = peso / (altura * altura);

            // Exibe o IMC calculado para a pessoa atual
            System.out.printf("IMC calculado: %.2f%n", imc);

            // Verifica se o IMC está no intervalo entre 18.5 e 24.9 (inclusive)
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Classificação: Sem obesidade");
                pessoasSemObesidade++; // Incrementa o contador
            } else {
                System.out.println("Classificação: Fora da faixa ideal (sem obesidade)");
            }

            // Incrementa o contador do laço
            i++;
        }

        // Exibe o total de pessoas identificadas dentro da faixa ideal
        System.out.println("\n==============================================");
        System.out.println("Total de pessoas com IMC entre 18,5 e 24,9: " + pessoasSemObesidade);
        System.out.println("==============================================");

        // Encerra a leitura do Scanner
        entrada.close();
    }
}