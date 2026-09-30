package Exercicios;

public class Exercicio4 {
    //Meta_de_Cada_Numeros

    public static void main(String[] args) {

        // Inicializa o contador com o valor inicial (10)
        int numero = 10;

        // Laço executa enquanto 'numero' for menor ou igual a 20
        while (numero <= 20) {

            // Calcula a metade do número dividindo por 2.0 para obter um resultado com casa decimal (double)
            double metade = numero / 2.0;

            // Exibe a mensagem formatada conforme o exemplo
            System.out.printf("a metade de %d é %.1f%n", numero, metade);

            // Incrementa o número em 1 a cada iteração
            numero++;
        }
    }
}