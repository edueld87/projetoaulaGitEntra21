package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Quest�o 4- Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva 
		 * a quantidade de elementos armazenados neste vetor que s�o pares.
		 */
		
				
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma =0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " +i);
			vetorA[i] = in.nextInt();

	}
		System.out.println("Vetor A " );
		for(int i =0; i < vetorA.length; i++) {
				
				if (vetorA[i] % 2 == 0) {
					soma += 1;
					System.out.println(vetorA[i] + "   posi��o " +i);
					
				}
								
				}
		System.out.println("Foram encontrados " +soma+ " n�meros pares ");
		in.close();
}
}