package exemplos;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {

		Scanner mySc = new Scanner(System.in);

		// Variáveis base
		double valoresN = 0.0;
		double soma = 0.0;
		double media = 0.00;
		double total = 0.0;

		while (valoresN >= 0) {

			System.out.printf("Digite um valor posito: ");
			valoresN = mySc.nextDouble();

			if (valoresN >= 0) {
				// Somatória
				soma = soma + valoresN;
				// Contador
				total++;
			}

		}
		media = soma / total;
		System.out.printf("Numero negativo! Fim do programa..\n total é %.2f \n A média é %.2f\n e o número de entradas foi %.2f ",
				soma, media, total);


	}

}
