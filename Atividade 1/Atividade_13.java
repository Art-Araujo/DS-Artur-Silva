package Atividade_01;
import java.util.Scanner;
public class Atividade_13 {
public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        float salario_f = 3000;
        
        float carro = 10000;
        
        System.out.println("Quantos carros voce vendeu?");
        float quantidade_carros = entrada.nextFloat();
        float valor_carros = carro * quantidade_carros;
        float comissao = 100 * quantidade_carros;
        float porcentagem = (5 * valor_carros) / 100;
        float salario_final = salario_f + comissao + porcentagem;
        System.out.println("Você vendeu "+quantidade_carros+" carros e o seu salario final e "+salario_final);
        

	}

}
