package Lista06;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int x, y;
		x = 1000;
		y = 2000;
		
		for (int i = x; i < y; i++) {
			if (i % 11 == 5) {
				System.out.println("Os números entre 1000 e 2000, divisiveis por 11 " +i);
			}
	in.close();
		}
	}
	

}



/*Escreva um programa para mostrar os númerosentre 1000 e 2000 que quando divididos por 11 dão resto igual a 5.*/