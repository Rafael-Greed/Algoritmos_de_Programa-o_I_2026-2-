package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = entrada.nextDouble();

        // 1. Elevar ao quadrado (potência 2)
        double quadrado = Math.pow(numero, 2);

        // 2. Elevar ao cubo (potência 3)
        double cubo = Math.pow(numero, 3);

        // 3. Raiz quadrada
        double raizQuadrada = Math.sqrt(numero);

        // 4. Elevar à potência 10
        double potencia10 = Math.pow(numero, 10);

        // Apresentação dos resultados
        System.out.println("Número ao quadrado: " + quadrado);
        System.out.println("Número ao cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Número elevado a 10: " + potencia10);

        entrada.close();
    }
}