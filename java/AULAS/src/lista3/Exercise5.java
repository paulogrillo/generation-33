package lista3;

import java.util.Scanner;

public class Exercise5 {
/*
  Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)
 */
	public static void main(String[] args) {
		int n=0;
		int soma = 0;
		Scanner mySc = new Scanner(System.in);
			
		do {
			System.out.print("Digite o valor de N: ");
			n = mySc.nextInt();
			if(n > 0) {
				soma = soma + n;
			}
			
		}while(n !=0);
		
		System.out.printf("A soma dos números digitados é "+soma);

	}

}
