package exemplos;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// Scanner
		Scanner mySc = new Scanner(System.in);

		// Variáveis
		int numero;

		// Entrada de dados
		System.out.println("Digite um numero inteiro:");
		numero = mySc.nextInt();

		// Processamento e saída
		if ((numero % 2) == 0 && (numero > 1)) {
			System.out.println("Este número é Par e é numero Positivo");
		} else if (numero > 1) {
			System.out.println("Este número é Impar e é numero positivo");
		} else {
			System.out.println("Este numero é negativo");
		}
	}

}
