package Lista06;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
			int a,b;
		
		System.out.println("Informe o primeiro n�mero:");
		a = in.nextInt();
		
		System.out.println("Informe o segundo n�mero:");
		b = in.nextInt();
		
		for (int i = a + 1; i < b; i++) {
			System.out.println(+i);
			
			in.close();

	}

}
}