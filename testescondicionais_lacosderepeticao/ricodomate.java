package introducao;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20231PF.CC0023
 */
public class ricodomate {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int N = leitor.nextInt();
        float L = leitor.nextFloat();
        float Q = leitor.nextFloat();
        if (0<N && N<=10)
        {
            if(L>0.0 && L<20.0)
            {
                if(Q>0.0 && Q<1.0)
                {
                    
                    String nome1 = leitor.nextLine();
                    String nome2 = leitor.nextLine();
                    String nome3 = leitor.nextLine();
                    System.out.println("Nome 2: "+nome2);
                }
            }
        }
        
        
        
    }
}
