package lista3;

import java.util.Scanner;

/*
  	Solicitar a idade de várias pessoas e imprimir: 
  	
  	*Total de pessoas com menos de 21 anos. 
	*Total de pessoas com mais de 50 anos. 
	*O programa termina quando idade for =-99. (WHILE)
	
 */
public class Exercise3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		
		int age=0;
		int count21=0; 
		int count50=0;
		

		
		while(age >=0) {
			
			System.out.print("Digite a idade de uma pessoa: ");
			age = mySc.nextInt();

			if (age >0 && age <=21) {
				count21++;
		
			}else if(age>50 && age <=99) {
				count50++;
			}else if(age == -99)  {
				System.out.printf("Fim do programa..");
				break;
			}
		
		}
		
		System.out.print("\n");
		System.out.printf("Total de pessoas com < 21 anos "+ count21);
		System.out.printf("\nTotal de pessoas com > 50 anos "+ count50);

	}

}
