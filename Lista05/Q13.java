package Lista05;

import java.util.Scanner;


public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Informe o valor do lado 1");
		lado1 = in.nextInt();
		System.out.println("Informe o valor do lado 2");
		lado2 = in.nextInt();
		System.out.println("Informe o valor do lado 3");
		lado3 = in.nextInt();
		
		if ((lado1 + lado2) < lado3 || (lado1 + lado3) < lado2 || (lado2 + lado3) < lado1) {
			System.out.println("Não pode ser um triangulo");
	    } else if (lado1 == lado2 && lado1 == lado3) {	
			System.out.println("É um triangulo Equilatero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("É um triangulo Isosceles");
		} else 
			System.out.println("É um triangulo Escaleno");
		in.close();
		}

}







/*Faça um programaque leia três inteiros que representem os lados de um triângulo. 
 Primeiramente, verifique se os lados podem formar um triângulo 
  (a soma de dois lados não pode ser menor que o terceiro lado). 
  Caso possa formar um triângulo, indique se este é equilátero, isósceles ou escaleno. */
 