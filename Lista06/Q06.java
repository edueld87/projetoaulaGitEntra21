package Lista06;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		double c = 150, j = 110;
		double cinc = 2, jinc = 3;
		int n = 0;
		
		while (c >= j) {
		c = c + cinc;
		j = j + jinc;
		n++;
		System.out.println("Chico " +c+ " Juca " +j+ " Anos " +n);
		}
	
		
		System.out.println("Levará " +n+ " Anos para Juca ultrapassar o Chico");
		in.close();
}
}