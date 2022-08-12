package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float valor, peso, total;
		valor = 0.02f;
		  
		System.out.println("digite o peso informado na balança em gramas");

		peso = in.nextInt();

		total = (peso - 230) * valor;

		System.out.println("O valor a cobrar será de: " +total+ " Reais");
		
		in.close();

	}

}
