package lista2;

import java.util.Scanner;

/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class exercise1 {

	public static void main(String[] args) {
		//Variáveis
		Scanner mySc = new Scanner(System.in);
		int n1,n2,n3, maior;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = mySc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = mySc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = mySc.nextInt();
		
		if(n1>n2 && n1>n3) {
			maior = n1; 
			System.out.println("O número maior é "+maior);
		}else if (n2>n1 && n2>n3) {
			maior = n2; 
			System.out.println("O número maior é "+maior);
		}else {
			maior = n3;
			System.out.println("O número maior é "+maior);
		}
		

	}

}
