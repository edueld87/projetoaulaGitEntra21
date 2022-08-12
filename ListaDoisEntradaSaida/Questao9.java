package ListaDoisEntradaSaida;

public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Npessoas = 18;
		double carne;
		double cervejal;
		double peso;
		double Nlatas;
		  
		carne = ((500 * Npessoas / 1000) * 18);
		peso = (500 * Npessoas / 1000);
		cervejal = (6 * 1.70 * Npessoas);
		Nlatas = (Npessoas * 6);
		  
		System.out.println("A estimativa do custo do churras para " +Npessoas+ " Será de: "  +carne+ " Reais em carne."  +cervejal+ " Reais em cerveja. Sendo " +peso+ " Kg de carne e "  +Nlatas+ " latas de cerveja.");
		         

	}

}
