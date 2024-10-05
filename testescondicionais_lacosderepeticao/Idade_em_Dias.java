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
public class Idade_em_Dias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dias = leitor.nextInt();
        int d=0;
        int m=0;
        int a=0;
        while (dias>0)
        {
            if (dias>=365)
            {
                dias = dias - 365;
                a++;
            }
            else if (dias<365)
            {
                if (dias>=30)
                {
                    dias = dias-30;
                    m++;
                }
                else if (dias<30)
                {
                    dias--;
                    d++;
                }
            }
        }
            
        System.out.println(a+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
    }
}
