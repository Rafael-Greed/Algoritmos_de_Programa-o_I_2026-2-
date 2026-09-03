package Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {

        // Expressão 1: ((120 - 30) == (3 * 30))
        boolean exp1 = ((120 - 30) == (3 * 30));
        System.out.println("Resultado 1: " + exp1);

        // Expressão 2: (!((20 % 4) == 1) || (9 != 9))
        boolean exp2 = (!((20 % 4) == 1) || (9 != 9));
        System.out.println("Resultado 2: " + exp2);

        // Expressão 3: ((5 % 2) > 3)
        boolean exp3 = ((5 % 2) > 3);
        System.out.println("Resultado 3: " + exp3);

        // Expressão 4: ('a' == 'A')
        boolean exp4 = ('a' == 'A');
        System.out.println("Resultado 4: " + exp4);
    }
}