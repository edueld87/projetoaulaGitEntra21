package Lista05;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		char combustivel;
		int litros;
		float valor;
		
		System.out.println("Informe o combust�vel a ser abastecido (G) gasolina, (D) diesel e (E) etanol");
		combustivel = in.next().charAt(0);
		
		System.out.println("Informe quantos litros foram abastecidos");
		litros = in.nextInt();
		
		if (combustivel == 'G' || combustivel == 'g') {
		   valor = litros * 2.53f;
		   System.out.println("O valor a pagar de gasolina ser�: " +valor);
		} else if (combustivel == 'D' || combustivel == 'd') {
		   valor = litros * 1.92f;
		   System.out.println("O valor a pagar de diesel ser�: " +valor);
		} else if (combustivel == 'E' || combustivel == 'e' && litros > 30) {
			valor = litros * 2.09f;
		   System.out.println("GANHOU TROCA DE OLEO!! o valor a pagar de etano ser�: " +valor+ " Reais");
		} else if (combustivel == 'E' || combustivel == 'e' && litros < 30) {   
			valor = litros * 2.09f;
			System.out.println("N�O GANHOU TROCA DE OLEO, o valor a pagar de etanol ser�: " +valor+ " Reais");
			
		in.close();
		}

	}

}
