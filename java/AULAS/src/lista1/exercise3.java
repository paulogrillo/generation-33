package lista1;

import java.util.Scanner;

/*PROBLEMA:
 *  Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class exercise3 {

	
	public static void main(String[] args) {
		// mySc = Função leia
		Scanner mySc =  new Scanner(System.in);
		
		// Variáveis
		long durationEvent, hours, minutes, seconds;
		
		System.out.println("Insira o tempo de duração do evento em segundos: ");
		durationEvent = mySc.nextLong();
		
		hours = (durationEvent/3600); 
		minutes = (durationEvent/60);

		System.out.println("\nResultado em Horas:  "+hours);
		System.out.println("\nResultado em Minutos "+minutes);
		System.out.println("\nResultado em Segundos: "+durationEvent);
		
		
		
		
		
	}
}
