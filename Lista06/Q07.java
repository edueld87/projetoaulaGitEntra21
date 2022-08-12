package Lista06;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x = 0, y = 8, n, ncont = 0;
		
		
		
		for (int i = x; i < y; i++) {
			System.out.println("Informe um número:");
			n = in.nextInt();
			if (n >= 100 && n <= 200) {
				ncont = ncont + 1;
			}
		
			if (n == 0) {
				System.out.println("Programa Encerrado:");
				break;
			}
			}
				System.out.println("Quantidade de números entre 100 e 200: " +ncont);
				in.close();
	}
}
