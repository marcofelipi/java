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
public class Media {
    public static void main(String[] args){ //psvm + tab
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe as notas do aluno: ");
        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();        
        double nota3 = leitor.nextDouble();
        double nota4 = leitor.nextDouble();
        double resultadoMedia = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Media: %.2f\n" , resultadoMedia);//sout + tab
        if (resultadoMedia >= 6.0)
            System.out.println("Aluno aprovado.");
        else if(resultadoMedia >= 2.0)
            System.out.println("Aluno em reavaliacao.");
        else
            System.out.println("Aluno reprovado.");
        
    }
  
  }
   
