package Lista06;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int n, valorcd;
		int soma = 0, media;
		
		System.out.println("Informe a quantidade de CD´s: ");
		n = in.nextInt();
		
			for (int i = 1; i < n + 1; i++) {
				
					System.out.println("Informe o valor do CD: " +i);
					valorcd = in.nextInt();
					soma = soma + valorcd;
			}
			
			System.out.println("Valor gasto em CD " +soma);
			media = soma / n;
			System.out.println("Valor gasto em média por CD: " +media+ " Pelos " +n+ " CD´s da coleção");
			in.close();
	}

}
