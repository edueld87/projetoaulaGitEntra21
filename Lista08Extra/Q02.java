package Lista08Extra;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
	/*	2 Faça um programa que leia um array[5] que corresponde ao gabarito de uma prova com 5 questões. 
		A seguir,  leia  uma matriz  que  contém  para  cada  linha  o  número  de  matrícula  de cada  aluno  e  cinco  respostas
		(referentes  às  cinco  questões). Para cada aluno, o programa deverá mostrar o seu número de matrícula  e  a
		sua  respectiva  nota.  Considere  que  todas  as questões têm o mesmo peso e as respostas possíveis são a, b, c, d ou e. */
		
		Scanner in = new Scanner(System.in);

		int[] gabarito = new int[5];
		int[][] respAlunos = new int[3][5];
		int aluno1 =0;
		int aluno2 =0;
		int aluno3 =0;

		for (int i = 0; i < gabarito.length; i++) {
			System.out.print(" Informe a resposta do gabarito para a questão " +i+ ": ");
			gabarito[i] = in.nextInt();
			//System.out.print(gabarito[i]);

		}
		for (int i = 0; i < gabarito.length; i++) {
			System.out.print(gabarito[i]+ "  ");

		}

		for (int i = 0; i < respAlunos.length; i++) {
			for (int j = 0; j < respAlunos[i].length; j++) {
				System.out.println("\nInforme a nota do aluno matricula " +i+ " Resposta " +j);
				respAlunos[i][j] = in.nextInt();
			}

		}
		for (int i = 0; i < respAlunos.length; i++) {
			for (int j = 0; j < respAlunos[i].length; j++) {
				//System.out.print(" " +i+ " " +j);
				System.out.print(" Respostas Aluno "+i+ ":" +respAlunos[i][j]+ " | " );
				//System.out.print("\n " +respAlunos[i][j]);
			}
			System.out.println();
		}

		if (gabarito[0] == respAlunos[0][0]) { 
			aluno1++;
		}
		if (gabarito[1] == respAlunos[0][1]) {
			aluno1++;
		}
		if (gabarito[2] == respAlunos[0][2]) {
			aluno1++;
		}
		if (gabarito[3] == respAlunos[0][3]) {
			aluno1++;
		}
		if (gabarito[4] == respAlunos[0][4]) {
			aluno1++;
		}

		if (gabarito[0] == respAlunos[1][0]) { 
			aluno2++;
		}
		if (gabarito[1] == respAlunos[1][1]) {
			aluno2++;
		}
		if (gabarito[2] == respAlunos[1][2]) {
			aluno2++;
		}
		if (gabarito[3] == respAlunos[1][3]) {
			aluno2++;
		}
		if (gabarito[4] == respAlunos[1][4]) {
			aluno2++;
		}						
		if (gabarito[0] == respAlunos[2][0]) { 
			aluno3++;
		}
		if (gabarito[1] == respAlunos[2][1]) {
			aluno3++;
		}
		if (gabarito[2] == respAlunos[2][2]) {
			aluno3++;
		}
		if (gabarito[3] == respAlunos[2][3]) {
			aluno3++;
		}
		if (gabarito[4] == respAlunos[2][4]) {
			aluno3++;
		}						

		System.out.print("Nota Aluno 1:  " +aluno1 );
		System.out.print("\nNota Aluno 2:  " +aluno2 );
		System.out.print("\nNota Aluno 3:  " +aluno3 );

		in.close();
	}

}