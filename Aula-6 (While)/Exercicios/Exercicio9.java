package Exercicios;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

public class Exercicio9 {
    //Lanchonete_Com_Repeticao
    //Lembrar que parte do codigo utilizar no Projeto de P.I.(Tabela de produtos[Clientes])

    public static void main(String[] args) {

        // Instancia o Scanner para capturar as entradas do utilizador
        Scanner entrada = new Scanner(System.in);

        // Variável acumuladora para guardar o valor total de toda a compra
        double totalGeral = 0.0;
        char continuar;

        System.out.println("--- BEM-VINDO À LANCHONETE ---");

        // Estrutura de repetição para permitir comprar múltiplos produtos
        do {
            // Solicita e lê o código do produto
            System.out.print("\nDigite o código do produto (100 a 105): ");
            int codigo = entrada.nextInt();

            // Solicita e lê a quantidade do item escolhido
            System.out.print("Digite a quantidade desejada: ");
            int quantidade = entrada.nextInt();

            double precoUnitario = 0.0;
            String nomeProduto = "";
            boolean codigoValido = true;

            // Estrutura switch para identificar o produto e o respetivo preço
            switch (codigo) {
                case 100:
                    nomeProduto = "Cachorro quente";
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
                    // Trata códigos inválidos fora do cardápio
                    System.out.println("Código inválido! Item não adicionado.");
                    codigoValido = false;
                    break;
            }

            // Se o código for válido, calcula o subtotal do item e soma ao total geral
            if (codigoValido) {
                double totalItem = precoUnitario * quantidade;
                totalGeral += totalItem; // Acumula o valor no total da compra

                System.out.printf("Item adicionado: %d x %s (R$ %.2f cada) = R$ %.2f%n", 
                                  quantidade, nomeProduto, precoUnitario, totalItem);
            }

            // Pergunta ao utilizador se deseja continuar a comprar
            System.out.print("\nDeseja continuar comprando? (S/N): ");
            continuar = Character.toUpperCase(entrada.next().charAt(0));

        } while (continuar == 'S');

        // Exibe o valor total acumulado ao finalizar a compra
        System.out.println("\n==============================================");
        System.out.printf("VALOR TOTAL DA COMPRA: R$ %.2f%n", totalGeral);
        System.out.println("==============================================");

        // Encerra a leitura do Scanner
        entrada.close();
    }
}