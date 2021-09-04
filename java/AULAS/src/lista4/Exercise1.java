package lista4;

import java.util.Scanner;

/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.

 */
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		
		int valorPontuacao[] = new int[5];
		int maiorValor = 0;

				for(int i=0; i<5; ++i){
					System.out.print(i+1+"° Rodada Digite a pontuação ");
					
					valorPontuacao[i] = mySc.nextInt();
					
					if(valorPontuacao[i] > maiorValor){
						maiorValor = valorPontuacao[i];	
					}
				}
				
				System.out.printf("Maior pontuação foi "+maiorValor);
				
	}

}
