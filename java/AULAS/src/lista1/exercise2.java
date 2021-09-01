package lista1;
import java.util.Scanner;
public class exercise2 {
/* PROBLEMA: 
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
	public static void main(String[] args) {
		// mySc = Função leia
		Scanner mySc = new Scanner(System.in);		
		
		//variaveis
		int age, month, day, birthday;

		//entrada
		System.out.print("Insira sua idade em dias: ");
		birthday = mySc.nextInt();
		
		//processamento
		age = birthday/365;
		month = (birthday%365)/30;
		day = (birthday%365)%30;
		
		//saida
		System.out.println("Sua idade é aproximadamente "+age+" anos, "+month+" mes(es) e"+day+" dia(s)");
		
	}
}
