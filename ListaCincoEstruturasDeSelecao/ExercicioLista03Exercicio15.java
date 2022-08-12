package ListaCincoEstruturasDeSelecao;
import java.util.Scanner;

public class ExercicioLista03Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		int Lado;
		
		System.out.println("Informe o valor do Lado, para calculo da área do quadrado: em cm");
		Lado = in.nextInt();
		
		Lado = Lado * Lado;
		
		System.out.println("A área será de " +Lado+ " cm²");
		
		in.close();
	}

}
