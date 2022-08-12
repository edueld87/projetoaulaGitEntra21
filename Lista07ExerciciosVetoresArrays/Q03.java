package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 3-Criar dois vetores A e B cada um com 10 elementos inteiros. Construirum vetor C, 
		 * onde cada elemento de C é:
		 * •a soma dos respectivoselementos em A e B C[i] = A[i] + B[i].
		 * •a * subtração dos respectivoselementos em A e B C[i] = A[i] –B[i].
		 * •a multiplicação dosrespectivos elementos em A e BC[i] = A[i] * B[i].
		 * •a divisão dos respectivoselementos em A e BC[i] = A[i] / float(B[i]).
		 */
		
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorA[i] = in.nextInt();
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i] + vetorB[i];
			
		}
			
			System.out.println("Vetor A " );
			for(int i =0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			
		}
			
			System.out.println("\nVetor B " );
			for(int i =0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
				
		}		

			System.out.println("\nVetor C " );
			for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		
	}

			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("\nEntre com o valor da posição " +i);
				vetorA[i] = in.nextInt();
				vetorB[i] = vetorA[i];
				vetorC[i] = vetorA[i] - vetorB[i];
				
			}
			
			System.out.println("Vetor A " );
			for(int i =0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			
		}
			
			System.out.println("\nVetor B " );
			for(int i =0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
				
		}		

			System.out.println("\nVetor C " );
			for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			
			}
			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("\nEntre com o valor da posição " +i);
				vetorA[i] = in.nextInt();
				vetorB[i] = vetorA[i];
				vetorC[i] = vetorA[i] * vetorB[i];
				
			}
			
			System.out.println("Vetor A " );
			for(int i =0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			
		}
			
			System.out.println("\nVetor B " );
			for(int i =0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
				
		}		

			System.out.println("\nVetor C " );
			for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			
			}
			
			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("\nEntre com o valor da posição " +i);
				vetorA[i] = in.nextInt();
				vetorB[i] = vetorA[i];
				vetorC[i] = vetorA[i] / vetorB[i];
				
			}
			
			System.out.println("Vetor A " );
			for(int i =0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			
		}
			
			System.out.println("\nVetor B " );
			for(int i =0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + " ");
				
		}		

			System.out.println("\nVetor C " );
			for(int i =0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			
			in.close();
}
}
}	
	
	
	