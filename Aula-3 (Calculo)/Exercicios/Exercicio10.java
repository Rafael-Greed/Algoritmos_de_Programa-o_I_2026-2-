package Exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        // Raio do círculo em centímetros
        double raio = 5.0;

        // Uso do Math.PI para representar o valor de π e Math.pow para r²
        double area = Math.PI * Math.pow(raio, 2);

        // Apresentação do resultado formatado com duas casas decimais
        System.out.printf("A área do círculo é: %.2f cm²%n", area);
    }
}