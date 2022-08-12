package Lista05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int A;
		System.out.println("Informe um número:");
		A = in.nextInt();
		
				
		if (A % 2 == 0) {
			System.out.println("O número é PAR");
			} else {
			System.out.println("O número é IMPAR");
			in.close();
			}
		
		// resolvendo com ternário:
		/*String teste;
		 * teste = (A % 2 == 0) ? "O numero é par" : "O numero é impar;
		 * System.out.println(teste);*/
		 
		
				
		/*Elabore um PROGRAMA, que dado um número
		inteiro, positivo, verifique e exiba se ele é par ou ímpar (Obs.:
		um número par é divisível por 2, ou seja, o resto da divisão por	
		2 é igual a zero). */
	}

}
