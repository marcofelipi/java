import java.io.IOException;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //lê o número de jogadores
        int N = scanner.nextInt();
        scanner.nextLine();  //consumir a nova linha

        //variáveis para acumular as tentativas e sucessos
        int totalS = 0, totalB = 0, totalA = 0;
        int totalS1 = 0, totalB1 = 0, totalA1 = 0;

        //loop para cada jogador
        for (int i = 0; i < N; i++) {
            String nome = scanner.nextLine();  // Lê o nome do jogador

            // Lê as tentativas
            int S = scanner.nextInt();
            int B = scanner.nextInt();
            int A = scanner.nextInt();

            // Lê os sucessos
            int S1 = scanner.nextInt();
            int B1 = scanner.nextInt();
            int A1 = scanner.nextInt();
            scanner.nextLine();

            // Acumula as tentativas e sucessos
            totalS += S;
            totalB += B;
            totalA += A;
            totalS1 += S1;
            totalB1 += B1;
            totalA1 += A1;
        }

        // Cálculo e impressão dos percentuais
        double percentualSaques = (double) totalS1 / totalS * 100;
        double percentualBloqueios =  (double) totalB1 / totalB * 100;
        double percentualAtaques = (double) totalA1 / totalA * 100;

        System.out.printf("Pontos de Saque: %.2f %%.\n", percentualSaques);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", percentualBloqueios);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", percentualAtaques);
    }
}
