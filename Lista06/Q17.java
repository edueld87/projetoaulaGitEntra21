package Lista06;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float a = 80000;
		float b = 200000;
		float cresA = 0.03f;
		float cresB = 0.015f;
		int anos = 0;
		
			do {
			a = a + (a * cresA);
			b = b + (b * cresB);
			anos++;
		
			} while (b > a);
			
		System.out.println("Demora " +anos+ " anos para igualar a população");

		
		in.close();

	}

}
