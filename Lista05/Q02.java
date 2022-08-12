package Lista05;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int A;
		
		System.out.println("Informe o número:");
		A = in.nextInt();
		
		if (A > 0) {
		System.out.println("Número é positivo");
		} else if (A < 0) {
		System.out.println("Número é negativo");
		} else {
		System.out.println("Número é neutro");
		}
		
			in.close();
						
		/*Questão_2: Escreva um programa que receba como
		entrada um número e exiba uma mensagem informando se
		ele é positivo, negativo ou neutro.*/
		 
		
	}

}
