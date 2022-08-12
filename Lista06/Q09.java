package Lista06;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n, valor, resultado = 0;
		
		System.out.println("Informe o número:");
		n = in.nextInt();
		
		for (valor = 2; valor <= n/2; valor++) {
			if (n % valor == 0) {
				resultado++;
				break;
			}
			in.close();	
			}
				if (resultado == 0) {
					System.out.println("É um numero primo");
				} else {
					System.out.println("Não é primo");
										
					
				}
	
				
}

}


