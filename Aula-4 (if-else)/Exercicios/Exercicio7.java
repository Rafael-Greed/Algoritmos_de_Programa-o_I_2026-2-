package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados do console
import java.util.Scanner;

public class Exercicio7 {
//exercicio 7 - Cálculo do Bônus de Funcionário com base no tempo de empresa
    public static void main(String[] args) {

        // Instancia o Scanner para capturar os dados do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o salário do funcionário
        System.out.println("Digite o valor do salário (R$):");
        double salario = entrada.nextDouble();

        // Solicita e lê o tempo de empresa em anos
        System.out.println("Digite a quantidade de anos de trabalho na empresa:");
        int anosEmpresa = entrada.nextInt();

        double valorBonus;

        // Estrutura de decisão:
        // Verifica se o tempo de empresa é igual ou superior a 5 anos
        if (anosEmpresa >= 5) {
            // Bônus de 20% (0.20) para 5 anos ou mais
            valorBonus = salario * 0.20;
        } else {
            // Bônus de 10% (0.10) para menos de 5 anos
            valorBonus = salario * 0.10;
        }

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("O valor do bônus concedido é: R$ %.2f%n", valorBonus);

        // Fecha o recurso Scanner
        entrada.close();
    }
}