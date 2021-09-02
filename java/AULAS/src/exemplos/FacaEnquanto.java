package exemplos;

import java.util.Scanner;

/*
* 1- Faça um programa que mostre uma contagem na tela
*  de 233 a 456, só que contando de 3 em 3 quando estiver
*   entre 300 e 400 e de 5 em 5 quando não estiver.

*/
public class FacaEnquanto {

	public static void main(String[] args) {
		
		Scanner mySc = new Scanner(System.in);	
		
		int n=233;
		
		do{
			System.out.printf("\n"+n);
			if(n >= 300 && n <=400) {
				n = n+3;

			}else {
				n = n+5;
			}
			
			
		}while(n <= 456);
			
		
		

	}

}
