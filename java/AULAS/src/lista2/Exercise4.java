package lista2;

import java.util.Scanner;

public class Exercise4 {
/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se
 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
 * se for ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) {
		
		Scanner mySc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite uma número: ");
		x = mySc.nextInt();
		
		if((x%2)==0){
			System.out.printf("Você digitou "+x);
			System.out.printf("\nRaiz quadrade é "+Math.sqrt(x));
			
		}else {
			System.out.printf("Você digitou "+x);
			System.out.printf("\n","Seu número elevado ao quadrado "+Math.pow(x,2));
		}

	}

}
