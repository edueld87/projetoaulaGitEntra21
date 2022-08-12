package Lista06;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x, n;
		int y = 10;
		
		System.out.println("Informe o número para saber a tabuada:");
		x = in.nextInt();
		
		for (int i = 1; i <= y; i++) {
			n = x * i;
			System.out.println(+x+ " * " +i+ " = " +n);
		}
		
			in.close();
	}

}
