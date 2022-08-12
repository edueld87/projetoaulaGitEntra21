package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class ExercicioLista03Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		double Receita, Despesa, Lucro, PercentDesp;
		
		System.out.println("Informe a Receita da empresa:");
		Receita = in.nextInt();
		
		System.out.println("Informe a Despesa da empresa:");
		Despesa = in.nextInt();
		
		Lucro = Receita - Despesa;
		PercentDesp = (Despesa / Receita) *100;
		
		System.out.println("O Lucro da empresa foi de: " +Lucro);
		System.out.println("As despesas represetam: " +PercentDesp+ "% da receita ");
		
		in.close();

	}

}
