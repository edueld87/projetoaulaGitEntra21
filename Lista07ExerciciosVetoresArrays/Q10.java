package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o 10-Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas 
		 * em dois vetores �Nota1� e �Nota2� do tipo real. Escreva um programa que calcule a m�dia aritm�tica simples 
		 * das notas informadas armazenando o resultado em um vetor �Result� de mesmo tipo e tamanho.
		 *  Ao mostrar os resultados exibir a situa��o de cada aluno. Se a m�dia calculada for superior ou igual a 7 o
		 *   aluno estar� �aprovado�, caso contr�rio, a situa��o do aluno ser� �reprovado�.
		 */
		
		
				Scanner in = new Scanner(System.in);
				
				float[] Nota1 = new float[4];
				float[] Nota2 = new float[Nota1.length];
				float[] Result = new float[Nota1.length];
	
				
				
				for(int i = 0; i < Nota1.length; i++) {
					System.out.print("\nInforme a Nota 1 ");
					Nota1[i] = in.nextFloat();
					
				}
				
				for(int i = 0; i < Nota2.length; i++) {
					System.out.print("\nInforme a Nota 2 ");	
					Nota2[i] = in.nextFloat();		
							
				}
				
				for(int i = 0; i < Result.length; i++) {	
					Result[i] = (Nota1[i] + Nota2[i]) / 2;
					System.out.print("\n Resultado Aluno ["+i+"]  : " +Result[i]);
					
					if(Result[i] >= 7) {
						System.out.print("\n A m�dia do Aluno  ["+i+"]  :  foi " +Result[i]+ " Portanto est� Aprovado");
						
					} else {
						System.out.print("\n A m�dia do Aluno  ["+i+"]  :  foi " +Result[i]+ " Portanto est� Reprovado");
				}
					in.close();
				}
						
}
}				
	

