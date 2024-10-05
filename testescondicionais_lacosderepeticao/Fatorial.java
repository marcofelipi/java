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
public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o número do fatorial: ");
        int fatorial = leitor.nextInt();
        int resultado = 1;
        for (int i = fatorial; i > 0; i--)
        {
            resultado = resultado * i; 
        }
        System.out.println(fatorial+ "! = "+resultado);
    }
    
}
