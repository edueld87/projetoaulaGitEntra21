package ListaExtra;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		float valorhora, hrtrab; 
		float descir = 0f;
		float salariobruto, salarioliq, inss, fgts, totaldesc;
		
		System.out.println("Informe o valor da hora trabalhada:");
		valorhora = in.nextFloat();
		
		System.out.println("Informe a quantidade de horas trabalhadas:");
		hrtrab = in.nextFloat();
		
		salariobruto = valorhora * hrtrab;
		System.out.println("Salario Bruto: " +salariobruto);
		
		// imposto de renda 
		
		if (salariobruto <= 1499.99 && salariobruto >= 900.01) {
			descir = 0.05f;
			System.out.println("Terá desconto de 5% de IR");
		} else if ( salariobruto >= 1500 && salariobruto <= 2499.99){
			descir = 0.10f;
			System.out.println("Terá desconto de 10% de IR");
		} else if (salariobruto >= 2500) {
			descir = 0.20f;
			System.out.println("Terá desconto de 20% de IR");
		} else if (salariobruto < 900) {
			descir = 0;
			System.out.println("Não terá desconto de IR");
		
		}	
		salarioliq = salariobruto - (salariobruto * descir);	
		System.out.println(+salarioliq);	
		
		inss = salariobruto * 0.1f;
		fgts = salariobruto * 0.11f;
		
		totaldesc = salarioliq - inss;
		
		
		System.out.println("Salario Bruto: " +salariobruto);
		System.out.println("Desconto IR "  +descir);
		System.out.println("Desconto INSS "  +inss);
		System.out.println(" FGTS "  +fgts);
		System.out.println("total descontos "  +totaldesc);
		System.out.println("Salario liquido "  +salarioliq);
		
		in.close();
	}
		
		}
		
	








