package Lista05;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float jan, fev, mar, abr, maio, jun, jul, ago, set, out, nov, dez, saldomed;
		
		System.out.println("Informe o saldo de Janeiro");
		jan = in.nextFloat();
		
		System.out.println("Informe o saldo de Fevereiro");
		fev = in.nextFloat();
		
		System.out.println("Informe o saldo de Mar�o");
		mar = in.nextFloat();
		
		System.out.println("Informe o saldo de Abril");
		abr = in.nextFloat();
		
		System.out.println("Informe o saldo de Maio");
		maio = in.nextFloat();
		
		System.out.println("Informe o saldo de Junho");
		jun = in.nextFloat();
		
		System.out.println("Informe o saldo de Julho");
		jul = in.nextFloat();
		
		System.out.println("Informe o saldo de Agosto");
		ago = in.nextFloat();
		
		System.out.println("Informe o saldo de Setembro");
		set = in.nextFloat();
		
		System.out.println("Informe o saldo de Outubro");
		out = in.nextFloat();
		
		System.out.println("Informe o saldo de Novembro");
		nov = in.nextFloat();
		
		System.out.println("Informe o saldo de Novembro");
		dez = in.nextFloat();
		
		saldomed = (jan + fev + mar + abr + maio + jun + jul + ago + set + out + nov + dez)/12;
		System.out.println("O saldo m�dio do cliente " +saldomed);
		
		if (saldomed >= 0 && saldomed < 200) {
			System.out.println("Nenhum cr�dito");
		} else if (saldomed >= 201 && saldomed < 400) {
			System.out.println("Cr�dito de 20% do saldo m�dio");
		} else if (saldomed >= 401 && saldomed < 600) {
			System.out.println("Cr�dito de 30% do saldo m�dio");
		} else {
			System.out.println("Cr�dito de 40% do saldo m�dio");
			in.close();
		}
		
		
		
	}

}








/*Um banco conceder� um cr�dito especial aos seus clientes, vari�vel com o saldo m�dio no �ltimo ano.
  Fa�a um programaque leia o saldo m�dio de um cliente e calcule o valor do cr�dito de acordo com a 
  tabela abaixo. Mostre uma mensagem informando o saldo m�dio e o valor do cr�dito. */
 