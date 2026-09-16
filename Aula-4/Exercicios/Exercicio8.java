package Exercicios;

// Importa a classe Scanner para leitura da senha no console
import java.util.Scanner;

public class Exercicio8{
//exercicio 8 - Validação de senha com acesso concedido ou negado
    public static void main(String[] args) {

        // Instancia o Scanner para ler a entrada do teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite a senha
        System.out.println("Digite a senha:");
        String senhaDigitada = entrada.next();

        // Estrutura condicional para validar a senha
        // O método equals() compara se o texto digitado é exatamente igual a "R10p5"
        if (senhaDigitada.equals("R10p5")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }

        // Fecha o recurso Scanner
        entrada.close();
    }
}