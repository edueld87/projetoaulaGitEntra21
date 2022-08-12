package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		float consumo = 1/60f;
		  double min;
		  double valorLan = 2.30;
		  double total;
		  
		  System.out.println("Informe quantos minutos o usuário utilizou o pc:");
		  min = in.nextInt();
		  
		  total = consumo * min * valorLan;
		  
		  System.out.println("O total a ser pago será de:" +total);
		  
		  /* float consumo, total;
		     float calc = 1/60*2.30f;
		     
		     System.out.println("Informe quantos minutos o usuário utilizou o pc:");
		     consumo = in.nextInt();*/
		     
		  in.close();  	  	 

	}

}
