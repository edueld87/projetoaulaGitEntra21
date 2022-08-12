package Lista06;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n;
		int i = 1;
		
		System.out.println("digite um número: ");
		n = in.nextInt();
		
		while (i*(i+1)*(i+2) < n) {
			i = i + 1;
		}

		if (i*(i+1)*(i+2) == n) {
			System.out.println("Numero triangular " +i+ "*" +(i+1)+ "*" +(i+2));
		} else {
			System.out.println("Não triangular");
			
			in.close();
			}
		}
	}


