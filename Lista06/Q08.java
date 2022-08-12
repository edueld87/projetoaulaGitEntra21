package Lista06;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int limiteinf, limitesup, soma = 0;
		
		System.out.println("Informe o valor do limite inferior: ");
		limiteinf = in.nextInt();
		System.out.println("Informe o valor do limite superior: ");
		limitesup = in.nextInt();
		
		for (int i = limiteinf + 1; i < limitesup; i++) {
							
			if  (i % 2 == 0) { 
				System.out.println(+i);
				soma = soma + i;
			}
		}					
		System.out.println("Soma " +soma);
		in.close();
		}
	}

