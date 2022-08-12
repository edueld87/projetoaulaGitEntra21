package Lista05;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int operador1, operador2, resultado;
		char operacao;
		
		System.out.println("Informe o valor do operador 1");
		operador1 = in.nextInt();
		
		System.out.println("Informe a operaчуo ser realizada, +, -, * ou /");
		operacao = in.next().charAt(0);
		
		System.out.println("Informe o valor do operador 2");
		operador2 = in.nextInt();
		
		
		
		switch (operacao) {
		case '+':
			resultado = operador1 + operador2;
			System.out.println("O resultado: " +resultado);
		  if (resultado > 0) {
			  System.out.println("Valor щ positivo");
		  } else if (resultado < 0) {
				  System.out.println("Valor щ negativo");
		  }
			
			if (resultado % 2 == 0) {
				System.out.println("Valor щ PAR");
			} else if (resultado % 2 == 1) {
				System.out.println("Valor щ IMPAR");
				break;
			}
		
	
		 case  '-':
			 resultado = operador1 - operador2;
			 System.out.println("O resultado: " +resultado);
		  if (resultado > 0) {
			  System.out.println("Valor щ positivo");
			  } else if (resultado < 0) {
			  System.out.println("Valor щ negativo");
			  }
			 if (resultado % 2 == 0) {
				 System.out.println("Valor щ PAR");
			 } else if (resultado % 2 == 1){
				 System.out.println("Valor щ IMPAR");
				break;
				}

		 case '*':
			 resultado = operador1 * operador2;
			 System.out.println("O resultado: " +resultado);
			 if (resultado > 0) {
				  System.out.println("Valor щ positivo");
			  } else if (resultado < 0){
					  System.out.println("Valor щ negativo");
			  }
			 if (resultado % 2 == 0) {
					System.out.println("Valor щ PAR");
				} else if (resultado % 2 == 1){
					System.out.println("Valor щ IMPAR");
					break;
				}
			 
		 case '/':
			 resultado = operador1 / operador2;
			 System.out.println("O resultado: " +resultado);
			 if (resultado > 0) {
				  System.out.println("Valor щ positivo");
			  } else if (resultado < 0){
					  System.out.println("Valor щ negativo");
			  }
			 if (resultado % 2 == 0) {
					System.out.println("Valor щ PAR");
				} else if (resultado % 2 == 1) {
					System.out.println("Valor щ IMPAR");
					break;
			}
				in.close();	 
		}
	
}
}	
	

