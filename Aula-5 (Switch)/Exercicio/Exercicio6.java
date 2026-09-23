package Exercicios;

// Importa a classe Scanner para leitura de dados no console
import java.util.Scanner;

public class Exercicio6{

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o código do produto
        System.out.println("Digite o código do produto:");
        int codigo = entrada.nextInt();

        // Solicita e lê a quantidade desejada
        System.out.println("Digite a quantidade:");
        int quantidade = entrada.nextInt();

        double precoUnitario = 0.0;
        String nomeProduto = "";
        boolean codigoValido = true;

        // Estrutura switch para identificar o produto e o seu respetivo preço
        switch (codigo) {
            case 100:
                nomeProduto = "Cachorro Quente";
                precoUnitario = 1.20;
                break;

            case 101:
                nomeProduto = "Bauru Simples";
                precoUnitario = 1.30;
                break;

            case 102:
                nomeProduto = "Bauru com ovo";
                precoUnitario = 1.50;
                break;

            case 103:
                nomeProduto = "Hambúrguer";
                precoUnitario = 1.20;
                break;

            case 104:
                nomeProduto = "Cheeseburguer";
                precoUnitario = 1.30;
                break;

            case 105:
                nomeProduto = "Refrigerante";
                precoUnitario = 1.00;
                break;

            default:
                // Trata códigos de produto que não existem no cardápio
                System.out.println("Código de produto inválido!");
                codigoValido = false;
                break;
        }

        // Se o código for válido, calcula o total e apresenta os resultados
        if (codigoValido) {
            double valorTotal = precoUnitario * quantidade;
            
            System.out.println("\n--- RESUMO DO PEDIDO ---");
            System.out.println("Produto: " + nomeProduto);
            System.out.printf("Quantidade: %d%n", quantidade);
            System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);
        }

        // Encerra a leitura do Scanner
        entrada.close();
    }
}