
package Atividade_01;
import java.util.Scanner;

public class Atividade_10 {
    

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos eleitores tem o munícipio? ");
        float elei = entrada.nextFloat();
        
        System.out.println("Quantos votos brancos tem? ");
        float branco = entrada.nextFloat();
        
        System.out.println("Quantos votos nulos tem? ");
        float nulo = entrada.nextFloat();
        
        System.out.println("Quantos votos validos tem? ");
        float valido = entrada.nextFloat();
        
             if (elei != branco + nulo + valido)
            {
                System.out.println("Eleição irregular.");
            }
        
        float PorcentagemBranco = (branco/elei)* 100;
        
        float PorcentagemNulo = (nulo/elei)*100;
        
        float PorcentagemValido = (valido/elei)*100;

        System.out.println("A porcentagem de votos brancos é de "+PorcentagemBranco+"%");
        
        System.out.println("A porcentagem de votos brancos é de "+PorcentagemNulo+"%");
        
        System.out.println("A porcentagem de votos brancos é de "+PorcentagemValido+"%");


        
        
    }
    
}