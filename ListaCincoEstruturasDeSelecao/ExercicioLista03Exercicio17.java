package ListaCincoEstruturasDeSelecao;
import java.util.Scanner;

public class ExercicioLista03Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		String Nomep = "";
		int Idade, Diasvida;
		
		System.out.println("Informe o seu nome:");
		Nomep = in.nextLine();
		
		System.out.println("Informe a sua idade:");
		Idade = in.nextInt();
		
		Diasvida = Idade * 365;
		
		System.out.println("Parabéns " +Nomep+ " Você já viveu pelo menos " +Diasvida+ " dias.");
		
		in.close();

	}

}
