package lista4;

import java.util.Random;

/*
 * 
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
 * e apresente também quantas foram as ocorrências da maior pontuação.
 */
public class Exercise2 {

	public static void main(String[] args) {
		
		//Método random. Joga o dado de fomra aleatória.
		Random aleatorio = new Random();
		
		//Variaveis e vetores
		int [] lancamento = new int [10];
		int numeroDado, contador, numeroMaior=0, xNumeroMaior=0,y;
		double media=0.00, x=0.0;
		
		//Loop
		for(y=0; y<lancamento.length; y++) {
			numeroDado = aleatorio.nextInt(6)+1;
			lancamento[y] = numeroDado;
			System.out.println("\n"+ (y+1)+"° Lançamento deu: "+ lancamento[y]);
			
			x = x + lancamento[y];
			
			if(numeroDado >= numeroMaior) {
				numeroMaior = numeroDado;
			}if(numeroMaior == lancamento[y]) {
				xNumeroMaior++;
			}else {
				xNumeroMaior = 1;
			}
			numeroMaior = lancamento[y];
		}
		
		media = x/10.0;
		System.out.println("\n\nA média aritmética dos lançamentos foi de: "+media);
		System.out.println("\nA quantidade que o número 6 saiu foi de: "+xNumeroMaior+" vezes. ");
		
		

	}

}
