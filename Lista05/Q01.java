package Lista05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int A;
		System.out.println("Informe um n�mero:");
		A = in.nextInt();
		
				
		if (A % 2 == 0) {
			System.out.println("O n�mero � PAR");
			} else {
			System.out.println("O n�mero � IMPAR");
			in.close();
			}
		
		// resolvendo com tern�rio:
		/*String teste;
		 * teste = (A % 2 == 0) ? "O numero � par" : "O numero � impar;
		 * System.out.println(teste);*/
		 
		
				
		/*Elabore um PROGRAMA, que dado um n�mero
		inteiro, positivo, verifique e exiba se ele � par ou �mpar (Obs.:
		um n�mero par � divis�vel por 2, ou seja, o resto da divis�o por	
		2 � igual a zero). */
	}

}
