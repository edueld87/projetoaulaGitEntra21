package Lista06;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float a;
		float b;
		float cresA;
		float cresB;
		int anos = 0;
		
		System.out.println("Informe a população do Pais A:");
		a = in.nextFloat();
		
		System.out.println("Informe a população do Pais B:");
		b = in.nextFloat();
		
		System.out.println("Informe a taxa de crescimento da população do Pais A:");
		cresA = in.nextFloat();
		
		System.out.println("Informe a taxa de crescimento da população do Pais B:");
		cresB = in.nextFloat();
		
		
		
			do {
			a = a + (a * cresA);
			b = b + (b * cresB);
			anos++;
		
			} while (b > a);
			
		System.out.println("Demora " +anos+ " anos para igualar a população");
		in.close();

	}

}
