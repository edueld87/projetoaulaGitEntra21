package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Quest�o 13-Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho
		 *  e com os mesmos elementos de A, sendo que estes dever�o estar invertidos, ou seja,
		 *   o primeiro elemento de A passa a ser o �ltimo de B, 
		 *   o segundo elemento de A passa a ser o pen�ltimode B e assim por diante:
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posi��o vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			vetorB[i] = vetorA[i];
		}	
			
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("  " +vetorB[9-i]);
			}
		in.close();
	}
	
}
