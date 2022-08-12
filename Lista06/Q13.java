package Lista06;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n, soma = 0;
		int maior = 0; //aux = 0
		
		do {
			
		System.out.println("Informe um número positivo inteiro");
		n = in.nextInt();
		
		for (int i = 0; i > 0; i++) {
			soma = soma + n;
			//aux = aux + n;
		}
			if (n > maior) {
				maior = n;
			}
		
		} while (n > 0);
		System.out.println("A soma dos números informados " +soma);
		System.out.println("Maior número digitado " +maior);
		in.close();
		}
	
		}
	

