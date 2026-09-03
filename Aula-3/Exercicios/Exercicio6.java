package Exercicios;

public class Exercicio6 {

    public static void main(String[] args) {
        // Uso de tipos decimais (double) para manter a precisão das divisões e potências
        // Expressão 1: (20 - 15) / 2
        double exp1 = (20.0 - 15.0) / 2.0;
        // Expressão 2: 2^(5/20) + 30 / (15^2)
        // 5/20 = 1/4 -> Raiz quarta de 2 é o mesmo que Math.sqrt(Math.sqrt(2.0))
        // 15^2 = (15.0 * 15.0)
        double exp2 = Math.pow(2.0, (5.0 / 20.0)) + (30.0 / Math.pow(15.0, 2.0));
        // Expressão 3: 35 / (6 + 2)
        double exp3 = 35.0 / (6.0 + 2.0);
        // Expressão 4: 23 módulo 4
        int exp4 = 23 % 4; // Operador de módulo para o resto da divisão
        // Resultados
        System.out.println("Resultado 1: " + exp1);
        System.out.printf("Resultado 2: %.4f\n", exp2);
        System.out.println("Resultado 3: " + exp3);
        System.out.println("Resultado 4: " + exp4);
    }
}

