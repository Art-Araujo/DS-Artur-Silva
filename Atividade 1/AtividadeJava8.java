package atividade.java;

import java.util.Scanner;



public class AtividadeJava {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Entre com seu Sobrenome: ");
        String sobrenome = entrada.nextLine();
        
        System.out.println("Seu Nome é: "+nome+" "+sobrenome);
        
        
        
        System.out.println("Digite numero: ");
        int numero1 = entrada.nextInt();
        
        int Antecessor = numero1 - 1;
        System.out.println("O antecessor é "+Antecessor);

       
         
        
    }
    
}
