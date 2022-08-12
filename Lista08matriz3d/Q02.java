package Lista08matriz3d;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int [][] matrizAleato = new int[3][3];
		int pares =0;
		int impares =0;

		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {

				System.out.println("Favor inserir o valor ");
				matrizAleato[i][j] = in.nextInt();

				if(matrizAleato[i][j] % 2 == 0) {
					pares++;

				}
				else {
					impares++;
				}
			}


		}
		for(int i = 0; i < matrizAleato.length; i++) {
			for(int j = 0; j < matrizAleato[i].length; j++) {
				System.out.print("\n" +matrizAleato[i][j]+ "\t");
			}				
		}
		System.out.println("Quantidade de pares " +pares);
		System.out.println("Quantidade de impares " +impares);
		in.close();
	}
}
