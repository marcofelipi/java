import java.io.IOException;
 
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int menor;
        int posicao;
        int X[] = new int [N];
        for (int i=0; i<N; i++)
        {
            X[i] = sc.nextInt();
        }
        menor = X[0];
        posicao = 0;
        for (int i=0; i<N; i++)
        {
            if (X[i] < menor)
            {
                menor = X[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+posicao);
    }
}

