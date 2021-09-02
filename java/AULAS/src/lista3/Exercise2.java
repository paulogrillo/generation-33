package lista3;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		
		int n,x,countPar=0,countImpar = 0;
		
		for (x=0; x<10; x++) {
			
			System.out.printf("Entre com algum valor númerico: ");
			n = mySc.nextInt();
			
			if((n%2)==0) {
				countPar = countPar + 1;
			}else if((n%2)==1) {
				countImpar = countPar + 1;
			}else {
				System.out.println("Você deve digitar um número!\n");
			}
			

			
		}
		System.out.println("\n");
		System.out.print("Quantidade de números Pares é "+countPar);
		System.out.print("\nQuantidade de números Impares é "+countImpar);
	}

}
