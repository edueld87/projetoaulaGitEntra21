package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class ExercicioSalarioIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		int salario;
		
		System.out.println("Digite o valor do Sal�rio:");
		salario = in.nextInt();
		
		if (salario > 1000) {
		System.out.println("B�nus de 10%");
		} else {
		System.out.println("B�nus de 15%");
		in.close();
		}
		
	}

}
