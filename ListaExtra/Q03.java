package ListaExtra;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int ano;
				
		System.out.println("Informe o ano, para saber se � bissexto ou n�o");
		ano = in.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("Este ano � bissexto");
		} else if((ano % 4 == 0) && (ano % 100 != 0)){
	            System.out.println(ano + " � bissexto.");
		} else {
			System.out.println("Este ano n�o � bissexto");
			
		}
in.close();
	}

}
