package Vetor;

import java.util.Scanner;

public class Exemplovetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vetor D = Vetor C * 2;
		
		Scanner in = new Scanner(System.in);
		
		int[] vetorC = new int [8];
		int[] vetorD = new int [vetorC.length];
		
		for(int i =0; i < vetorC.length; i++) {
			System.out.println("Entre com o valor da posição " +i);
			vetorC[i] = in.nextInt();
			vetorD[i] = vetorC[i] * 2;
		}

		System.out.println("VetorC");
		for(int i = 0; i < vetorC.length; i++) {
		System.out.println(vetorC[i] + " ");
		}

		System.out.println("VetorD");
		for(int i = 0; i < vetorD.length; i++) {
		System.out.print(vetorD[i] + " ");
		}

		in.close();
	}
}



