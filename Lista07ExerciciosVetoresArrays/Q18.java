package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Questão 18-Faça um programaque gere os 10 primeiros números primos acima de 100 e armazene-os em um vetor X[10]. 
		 * Ao final do programa, mostre então o vetor X
		 */
		
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorX = new int[15];
		int n = 100, primo =0;
		
		for(int i = 0; i < vetorX.length; i++) {
			for(int a = 1; a <= n; a++) {
				
			//	if((a % 2 != 0) && (a % 3 != 0)) {
				primo = n % a == 0 ? primo += 1 : primo;
			}
			if(primo == 2) {
				vetorX[i] = n;
			} else {
				i--;
			}
			primo = 0; 
			n +=1;
		}
		for(int i = 0; i < vetorX.length; i++) {
			System.out.print(+vetorX[i]+ "  ");
		}
		in.close();
	}	
}		
	
				
	/*	for(int i = 0; i < vetorX.length; i++) {
				for(int a = 1; a < n; a++) {
			
			if((a % 2 != 0) && (a % 3 != 0) && (a >= 100)) {
				
				//vetorX[i] = n;
				n++;
				//	} else { 
				//		i--;				 
				} 
			System.out.println(a);
				//System.out.println(vetorX[i]);
			}
		}
	}
*/
				

	

