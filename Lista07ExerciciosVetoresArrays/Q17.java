package Lista07ExerciciosVetoresArrays;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Quest�o17-Escreva um programaque receba o nome de cinco clientes e armazene-os em um vetor. Em um segundo vetor,
		 *  armazene a quantidade de DVDs locados em 2022por cada um dos cinco clientes. 
		 *  Sabe-se que, para cada dez loca��es, o cliente tem direito a uma loca��o gr�tis. 
		 *  O programa dever� mostrar todos os nomes dos clientes com a quantidade de loca��o gr�tis que ele tem direito.
		 */
		
		Scanner in = new Scanner(System.in);
		
			int[] dvds = new int[5];
		
			String[] NomeCliente = new String[5];
		//	NomeCliente[0] = " ";
		
		
		for(int i = 0; i < NomeCliente.length; i++) {
			System.out.print("Informe o nome do cliente: ");
			NomeCliente[i] = in.nextLine();
						
			}
	
		
		for(int i = 0; i < dvds.length; i++) {
			System.out.print("\n Informe a quantidade de Dvd�s locados pelo cliente: " +NomeCliente[i] );
			dvds[i] = in.nextInt();
			System.out.print("Cliente " +NomeCliente[i]+ " alugou em 2022 " +dvds[i]+ " Dvd�s ");
			
			if(dvds[i] >= 10 && dvds[i] <= 19) {
				System.out.println(" Cliente " +NomeCliente[i]+ " tem direito a 1 local��o gr�tis");
			}
			if(dvds[i] >= 20 && dvds[i] <= 29) {
				System.out.println(" Cliente " +NomeCliente[i]+ " tem direito a 2 loca��es gr�tis");
			}
			if(dvds[i] >= 30 && dvds[i] <= 39) {
				System.out.println("Cliente " +NomeCliente[i]+ " tem direito a 3 loca��es gr�tis");
			}
				}
		in.close();	
		}
}
