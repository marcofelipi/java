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
public class TesteConversoes {
    public static void main(String[] a){
        Scanner leitor = new Scanner(System.in); //DIGITAR SCANNER E DAR CTRL+ESPAÇO
        float valor0 = (float)leitor.nextFloat();
        float valor1 = 10.6f;
        float valor2 = (float) 10.6;
        System.out.println("Valor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);
        System.out.printf("Valor 0: %.2f\n", valor0);
        
    }
}
