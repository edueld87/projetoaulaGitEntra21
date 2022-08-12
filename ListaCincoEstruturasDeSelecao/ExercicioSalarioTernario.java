package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class ExercicioSalarioTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double salario;
		double Bonus; 
		
		System.out.println("Digite o valor do Salário:");
		salario = in.nextInt();
		
		/*Bonus = (salario > 1000)? "Bônus de 10%" : (salario < 1000)? "Bônus de 15%" : "Erro";
		System.out.println("Resultado " +Bonus);*/
		
		Bonus = (salario > 1000) ? salario * 0.10 : salario * 0.15;
		System.out.println("Resultado " +Bonus);
		
		in.close();


	}

}
