package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 5-Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma
		 *  dos elementos armazenados neste vetor que são múltiplos de 5.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int soma =0;
		int numlocalizados = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
				numlocalizados++;
			}
			
	}
		System.out.println("Soma dos números multiplos de 5: " +soma);
		System.out.println("Foram identificados " +numlocalizados+ " números que são multiplos de 5");
		
		in.close();
}
}



