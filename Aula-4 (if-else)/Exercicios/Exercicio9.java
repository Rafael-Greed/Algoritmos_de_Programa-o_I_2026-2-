package Exercicios;

// Importa a classe Scanner para permitir a leitura de dados do console
import java.util.Scanner;

public class Exercicio9 {
//exercicio 9 - Verificação de concessão de empréstimo com base no salário bruto e valor da prestação
    public static void main(String[] args) {

        // Instancia o Scanner para ler as entradas do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o valor do salário bruto
        System.out.println("Digite o salário bruto (R$):");
        double salarioBruto = entrada.nextDouble();

        // Solicita e lê o valor da prestação pretendida
        System.out.println("Digite o valor da prestação (R$):");
        double valorPrestacao = entrada.nextDouble();

        // Calcula o limite máximo permitido para a prestação (30% do salário bruto)
        double limiteMaximo = salarioBruto * 0.30;

        // Estrutura condicional:
        // Verifica se o valor da prestação é menor ou igual ao limite permitido
        if (valorPrestacao <= limiteMaximo) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}