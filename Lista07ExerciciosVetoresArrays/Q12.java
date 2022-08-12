package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 12-Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique
		 *  se "todos" os elementos do vetor A são pares. 
		 *  Se pelo menos um elemento do vetor não for par o processo de repetição para depercorrer 
		 *  os elementos do vetor e deve ser encerrado, como 
		 *  sugestão:utilize uma variável do tipo flag para atingir este propósito.
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o valor da posição vetor ["+i+"] | --> ");
			vetorA[i] = in.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				
			} else {
				System.out.print("Você digitou um número Impar, por este motivo o sistema foi encerrado");
				break;
			
		} 
	
		}
		in.close();
	}
}

	

