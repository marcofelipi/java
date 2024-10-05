import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) 
    {
        // Cria o scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int C = scanner.nextInt();

        // Para cada caso de teste
        for (int i = 0; i < C; i++) 
        {
            // Lê os valores de início (B) e fim (E)
            int B = scanner.nextInt();
            int E = scanner.nextInt();

            // String para construir a sequência
            String resultado = "";

            // Constrói a parte crescente da sequência
            for (int j = B; j <= E; j++) 
            {
                resultado += j; // Concatena o valor de 'j' na sequência crescente
            }

            // Constrói a parte decrescente da sequência (invertendo os números)
            for (int j = E; j >= B; j--) 
            {
                resultado += new StringBuilder(String.valueOf(j)).reverse().toString(); // Inverte o número e adiciona
            }

            // Imprime a sequência completa
            System.out.println(resultado);
        }

        // Fecha o scanner
        scanner.close();
    }
