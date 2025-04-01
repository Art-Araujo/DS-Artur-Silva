package Atividade_01;
import java.util.Scanner;
public class Atividade_15 {
	public static void main(String[] args) {
		double total = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o número de litros que foram vendidos?");
		double venda = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Tipo de combustivel: \n- Álcool\n- Gasolina");
		String tipo = entrada.nextLine();
		
		if(tipo.equals("alcool")) {
			total = 4.40 * venda;
		}
		if(tipo.equals("gasolina")) {
			total = 6.20 * venda;
		}
		System.out.println("O valor a ser pago é "+total);
}
}