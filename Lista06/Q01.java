package Lista06;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n1, npar, nimp;
		
		System.out.println("Informe um valor inteiro e positivo, para encerrar digite (0) zero ou número negativo");
		n1 = in.nextInt();
		
		while (n1 > 0) {
			System.out.println("Sistema encerrado");
		 if (n1 % 2 == 0) {
	    	npar = n1 + n1;
	    System.out.println("A soma dos números pares: " +npar);
		} else {
			nimp = n1 * n1;
		System.out.println("O produto dos números impares: " +nimp);	
	    	
	}
in.close();
}
}
}