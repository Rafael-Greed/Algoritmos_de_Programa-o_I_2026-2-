package Exercicios;

public class Exercicio5 {
    //Tabuada_Do_Cinco

    public static void main(String[] args) {

        // Define o número base para a tabuada
        int numero = 5;

        // Inicializa o multiplicador de 1 a 10
        int i = 1;

        System.out.println("--- TABUADA DO 5 ---");

        // Laço executa enquanto 'i' for menor ou igual a 10
        while (i <= 10) {

            // Calcula o resultado da multiplicação
            int resultado = numero * i;

            // Exibe a operação formatada (ex: 5 x 1 = 5)
            System.out.printf("%d x %2d = %d%n", numero, i, resultado);

            // Incrementa o multiplicador
            i++;
        }
    }
}