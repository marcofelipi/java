/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao;

import java.util.Scanner;

/**
 *
 * @author 20231PF.CC0023
 */
public class multiplos {
    public static void main(String[] args) {
        System.out.println("");
        Scanner leitor = new Scanner (System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        
        if (b%a==0 || a%b==0)
        {
            System.out.println("Sao Multiplos");
        }
        else 
            System.out.println("Nao sao Multiplos");
    }
}
