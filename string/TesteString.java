/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeString;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author vanessalagomachado
 */
public class TesteString {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        String teste = "   Olá     Mundo";

        System.out.println("String: " + teste);

        System.out.println("String em maiúscula: " + teste.toUpperCase());
        //teste = teste.toUpperCase();

        System.out.println("String: " + teste);

        // minúscula
        System.out.println("String em minúscula: " + teste.toLowerCase());

        // remover espaços em branco antes e depois da string válida
        System.out.println("String removendo espaços extras: " + teste.trim());
        teste = teste.trim();

        // Substituir caracter
        System.out.println("Vetor cumprimento atualizado: " + teste.replace("Olá", "Bem-Vindo"));

        // Substituir espaços extras interno
        while (teste.contains("  ")) {
            teste = teste.replace("  ", " ");
        }

        // Mostrar a 1a palavra -- utilizando vetor
        String[] vetorPalavras = teste.split(" ");
        System.out.println("Primeira Palavra: " + vetorPalavras[0]);

        System.out.println("Array: " + Arrays.toString(vetorPalavras));
        
        // Mostrar a 1a palavra -- utilizando substring
        int indicePrimEsp = teste.indexOf(" ");
        System.out.println("Primeira Palavra: " + teste.substring(0, indicePrimEsp));

        if(teste == "Olá Mundo"){
            System.out.println("Teste comparação usando ==");
        }
        
        if(teste.equals("olá MUNDO")){
            System.out.println("Teste comparação usando equals");
        }
        
        if(teste.equalsIgnoreCase("olá MUNDO")){
            System.out.println("Teste comparação usando equals ignore Case");
        }
    
    }
}
