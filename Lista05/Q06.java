package Lista05;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.println("Informe o seu Peso em KG:");
		peso = in.nextFloat();
		
		System.out.println("informe a sua altura em metros:");
		altura = in.nextFloat();
		
		imc = peso/(altura * altura);
		System.out.println(imc);
		
		if (imc < 18.5) {
		System.out.println("Abaixo do peso");
		} else if (imc < 25.1 && imc > 18.6) {
		System.out.println("Peso normal");
		} else if (imc < 30 && imc > 25) {
		System.out.println("Acima do peso");
		} else {
		System.out.println("Obeso");
		
		in.close();
		}

	}

}
