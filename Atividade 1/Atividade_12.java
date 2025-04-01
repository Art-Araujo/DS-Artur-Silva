
package Atividade_01;
import java.util.Scanner;
public class Atividade_12 {
public static void main(String[] args) {
	
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Qual o valor de produção do carro?");
    
    float custo_prod = entrada.nextFloat();
    
    float distribuidor = (custo_prod * 28) / 100;
    
    float imposto = (custo_prod * 45) / 100;
    
    float valor_final = custo_prod + distribuidor + imposto;
    
    System.out.println("O valor final do carro e "+valor_final);

    }
    
    
}