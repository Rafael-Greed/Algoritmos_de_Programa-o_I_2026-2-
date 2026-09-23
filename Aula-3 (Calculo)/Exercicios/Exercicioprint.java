package Exercicios;

public class Exercicioprint { 

    public static void main(String[] args) { 
        
        // Define o número base para o qual a tabuada será gerada
        int numero = 5; 

        // Laço de repetição 'for':
        // - int i = 1: Inicializa a variável de controle 'i' em 1
        // - i <= 10: O laço continua executando enquanto 'i' for menor ou igual a 10
        // - i++: Incrementa o valor de 'i' em +1 a cada iteração
        for (int i = 1; i <= 10; i++) { 
            
            // System.out.printf permite imprimir texto formatado usando marcadores:
            // %d -> Substituído por um número inteiro (numero, i, numero * i)
            // %n -> Insere uma quebra de linha de forma portátil (compatível com qualquer SO)
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}