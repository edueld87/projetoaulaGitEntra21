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
		
		System.out.println("Informe o saldo de Março");
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
		System.out.println("O saldo médio do cliente " +saldomed);
		
		if (saldomed >= 0 && saldomed < 200) {
			System.out.println("Nenhum crédito");
		} else if (saldomed >= 201 && saldomed < 400) {
			System.out.println("Crédito de 20% do saldo médio");
		} else if (saldomed >= 401 && saldomed < 600) {
			System.out.println("Crédito de 30% do saldo médio");
		} else {
			System.out.println("Crédito de 40% do saldo médio");
			in.close();
		}
		
		
		
	}

}








/*Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano.
  Faça um programaque leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a 
  tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito. */
 