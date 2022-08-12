package Lista05;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int valorcompra, valorpagamento, troco, notas;
		
		System.out.println("Informe o valor da compra:");
		valorcompra = in.nextInt();
		
		System.out.println("Informe o valor do pagamento:");
		valorpagamento = in.nextInt();
		
		if (valorpagamento < valorcompra) {
		System.out.println("Pagamento Negado");
	   } else if (valorpagamento >= valorcompra) {
		   troco = valorpagamento - valorcompra;
		   System.out.println("Valor do troco será:" +troco);
		   notas = troco / 100;
		   System.out.println(+notas+ " Notas de 100");
		   troco = troco - (100 * notas);
		   notas = troco / 10;
		   System.out.println(+notas+ " Notas de 10");
		   troco = troco - (10 * notas);
		   notas = troco / 1;
		   System.out.println(+notas+ " Notas de 1");
	   }

		in.close();
}
	
}
