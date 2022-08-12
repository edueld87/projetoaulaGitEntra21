package Lista06;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
			int a,b, soma =0;
		
		System.out.println("Informe o primeiro número:");
		a = in.nextInt();
		
		System.out.println("Informe o segundo número:");
		b = in.nextInt();
		
		for (int i = a + 1; i < b; i++) {
			soma += i;
			System.out.println(+i);

	}
		System.out.println("Soma " +soma);
		in.close();
}

	}


