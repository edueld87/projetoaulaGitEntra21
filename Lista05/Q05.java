package Lista05;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int idade;
		System.out.println("Informe a idade do nadador:");
		idade = in.nextInt();
		
		if (idade >= 5 && idade < 8) {
		System.out.println("Cassifica��o Infantil A");
		} else if (idade >= 8 && idade < 11) {
		System.out.println("Cassifica��o Infantil B");
		} else if (idade >= 11 && idade < 14) {
		System.out.println("Cassifica��o Juvenil A");
		} else if (idade >= 14 && idade < 18) {
		System.out.println("Cassifica��o Juvenil B");
		} else {
		System.out.println("Cassifica��o Adulto");
		
		in.close();
		}
	}
	
}


