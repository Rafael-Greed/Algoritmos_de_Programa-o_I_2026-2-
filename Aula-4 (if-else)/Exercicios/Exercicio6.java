package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio6 {
//Exercicio 7 - Cálculo do Peso Ideal e Classificação do IMC
    public static void main(String[] args) {

        // Instancia o Scanner para capturar os dados do usuário
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados: altura, peso atual e sexo
        System.out.println("Digite a sua altura em metros (ex: 1.75):");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu peso atual em kg (ex: 70.5):");
        double pesoAtual = entrada.nextDouble();

        System.out.println("Digite o sexo (M para Masculino / F para Feminino):");
        String sexo = entrada.next();

        double pesoIdeal = 0;

        // 1. Cálculo do Peso Ideal segundo o sexo
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Opção de sexo inválida!");
            entrada.close();
            return; // Encerra a execução caso o sexo seja inválido
        }

        // 2. Cálculo do IMC para classificação da situação de peso
        double imc = pesoAtual / (altura * altura);
        String situacao;

        if (imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            situacao = "Na média (Peso ideal)";
        } else {
            situacao = "Sobrepeso";
        }

        // 3. Exibição dos resultados
        System.out.printf("%n--- RELATÓRIO DE PESO ---%n");
        System.out.printf("Peso atual: %.2f kg%n", pesoAtual);
        System.out.printf("Peso ideal estimado: %.2f kg%n", pesoIdeal);

        // Verifica quanto falta ou quanto sobra em relação ao peso ideal
        double diferenca = pesoAtual - pesoIdeal;

        if (diferenca > 0) {
            System.out.printf("Falta perder: %.2f kg para atingir o peso ideal.%n", diferenca);
        } else if (diferenca < 0) {
            System.out.printf("Falta ganhar: %.2f kg para atingir o peso ideal.%n", Math.abs(diferenca));
        } else {
            System.out.println("Você já está exatamente no seu peso ideal!");
        }

        System.out.println("Situação atual (IMC): " + situacao);

        // Fecha o recurso Scanner
        entrada.close();
    }
}