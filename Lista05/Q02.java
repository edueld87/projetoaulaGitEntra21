package Lista05;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int A;
		
		System.out.println("Informe o n�mero:");
		A = in.nextInt();
		
		if (A > 0) {
		System.out.println("N�mero � positivo");
		} else if (A < 0) {
		System.out.println("N�mero � negativo");
		} else {
		System.out.println("N�mero � neutro");
		}
		
			in.close();
						
		/*Quest�o_2: Escreva um programa que receba como
		entrada um n�mero e exiba uma mensagem informando se
		ele � positivo, negativo ou neutro.*/
		 
		
	}

}
