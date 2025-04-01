package Atividade_01;
import java.util.Scanner;
public class Atividade_11 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu salario Hoje? ");
        float salario = entrada.nextFloat();
        System.out.println("Qual a porcentagem de aumento? ");
        float aumento = entrada.nextFloat();
        
        float salarioN = (salario*aumento) / 100 + salario;
        System.out.println("Seu novo salario e "+salarioN);
		
	}

}
