package Atividade_01;
import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
System.out.println("Em que ano voce nasceu?");
        int ano = entrada.nextInt();
        int idade = 2025 - ano;
        int meses = idade * 12;
        int dias = idade * 365;
        
        System.out.println("Voce tem "+idade+" anos, ou "+meses+" meses, ou "+dias+" dias");
		
		

	}

}
