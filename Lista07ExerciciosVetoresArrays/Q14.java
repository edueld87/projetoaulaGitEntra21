package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o 14�Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
		 * sendo este a jun��o dos dois outros vetores. Os primeiros 10 elementos de C dever�o 
		 * receber os elementos de A e os �ltimos elementos C dever�o receber os elementos de B. 
		 * Desta forma, C dever� ter o dobro de elementos de A e B, ou seja, 20 elementos.
		 */

		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posi��o vetor A ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			vetorC[i] = vetorA[i];
	}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("Entre com o valor da posi��o vetor B ["+i+"] | --> ");
			vetorB[i] = in.nextInt();
			vetorC[10+i] = vetorB[i];

}
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(" Vetor C " +i+ " | " +vetorC[i]);
		
		
		}		
		in.close();
}
}


