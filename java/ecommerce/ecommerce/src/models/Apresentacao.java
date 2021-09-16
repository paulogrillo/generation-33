package models;

import java.util.Scanner;

public class Apresentacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char desejaComprar;
		Scanner mySc = new Scanner(System.in);
		

		for(int x=0; x<4; ++x){
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");	
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for(int x=0; x<4; ++x){
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");	
		}
		
		
		System.out.println("\n\n ");

		
		System.out.printf("\t\t\t     Deseja comprar? \n ");
		System.out.printf("\t\t\t\t   S/N ");
		
		desejaComprar = mySc.next().charAt(0);
		
		
		


	}

	

}
