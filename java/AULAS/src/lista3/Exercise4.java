package lista3;

import java.util.Scanner;

/*
	Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: 
	idade =  Exemp: 23 aos
	sexo  = Exemp: (1-feminino / 2-masculino / 3-Outros), 

	Opções:
	1 se a pessoa era calma; 
	2 se a pessoa era nervosa e 
	3 se a pessoa eraagressiva. 
	
	Pede-se para elaborar um sistema que permita 
	>[ler os dados de 150 pessoas]
    calcule e mostre: (WHILE)
    
	
	o número de pessoas calmas;
	o número de mulheres nervosas;
	o número de homens agressivos;
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos;
	o número de pessoas calmas com menos de 18 anos.*/

public class Exercise4 {

		public static void main(String[] args) {
			
			
			Scanner mySc = new Scanner(System.in);
			
			int age;
			int sex;

			int pessoasCalmas=0;
			int mas=0;
			int out=0;
			
			//Pesquisa
			int numeroPessoasCalmas=0;
			int numeroMulheresNervosas=0;
			int numeroHomensAgressivos=0;
			int numeroOutrosCalmas=0;
			int numeroPessoasNervosas40=0;
			int numeroPessoasCalmas18=0;
			int pesquisa=0;	
			int contador=0;
			final int PESSOAS=3;
			
			
			while(contador <PESSOAS) {
				contador++;
				System.out.printf("Digite a idade: "+contador+" ");
				age = mySc.nextInt();
				
				System.out.printf("Digite o sexo: \n(1-feminino / 2-masculino / 3-Outros)");
				sex = mySc.nextInt();
				
				System.out.printf("\n");
				
				System.out.printf("Responda a pesquisa de comportamento: \n");
				System.out.printf("1 - calma\n");
				System.out.printf("2- nervosa\n");
				System.out.printf("3 - agressiva\n");
				
				pesquisa = mySc.nextInt();
				
				// Pesquisa
				if(pesquisa == 1) {
					pessoasCalmas++;
				}
				if(pesquisa == 2 && sex ==1){
					numeroMulheresNervosas++;
				}
				
				
				if(pesquisa == 2 & age >40){
					numeroPessoasNervosas40++;
				}
				if(pesquisa == 1 & age <18){
					numeroPessoasCalmas18++;
				}
				if(pesquisa == 1 && sex == 2){
					numeroHomensAgressivos++;
				}
		
			}
			
			//o número de pessoas calmas;pessoasCalmas
			System.out.printf("\nNúmero de pessoa calmas: "+pessoasCalmas);
			
			//o número de mulheres nervosas;
			System.out.printf("\nNúmero de mulheres nervosas "+numeroMulheresNervosas);
			
			//o número de homens agressivos;numeroHomensAgressivos
			System.out.printf("\nNúmero de homens agressivos "+numeroHomensAgressivos);
			
			//o número de outros calmos;
			System.out.printf("\nNúmero de outros calmos",out);
			
			//o número de pessoas nervosas com mais de 40 anos;
			System.out.printf("\nNúmero de pessoas com mais de 40 anos "+numeroPessoasNervosas40);
			
			//o número de pessoas calmas com menos de 18 anos.*/
			System.out.printf("\nNúmero pessoas calmas com menos de 18 anos "+numeroPessoasCalmas18);
			
			
		}
	

}
