package Lista06;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
				int i = 1001, n = 0;
		
					for (i = 1001; i < 5000; i++) {
						if (i % 11 == 5) {
							n++;
				
							if (n == 6) {
								break;
							}
					
							System.out.println(+i);
							in.close();
						}
					}
					
	}

}
