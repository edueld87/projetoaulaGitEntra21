package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o 12-Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique
		 *  se "todos" os elementos do vetor A s�o pares. 
		 *  Se pelo menos um elemento do vetor n�o for par o processo de repeti��o para depercorrer 
		 *  os elementos do vetor e deve ser encerrado, como 
		 *  sugest�o:utilize uma vari�vel do tipo flag para atingir este prop�sito.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posi��o vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				
			} else {
				System.out.print("Voc� digitou um n�mero Impar, por este motivo o sistema foi encerrado");
				break;
			
		} 
	
		}
		in.close();
	}
}

	

