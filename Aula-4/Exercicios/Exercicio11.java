package Exercicios;

// Importa a classe Scanner para leitura da idade
import java.util.Scanner;

public class Exercicio11 {
//exercicio 11 - Classificação de nadadores por idade
    public static void main(String[] args) {

        // Instancia o Scanner para ler a entrada do teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê a idade do nadador
        System.out.println("Digite a idade do nadador:");
        int idade = entrada.nextInt();

        // Estrutura condicional enfileirada para identificar a categoria
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            // Tratamento caso a idade digitada seja menor que 5 anos
            System.out.println("Sem categoria (Idade mínima é de 5 anos).");
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}