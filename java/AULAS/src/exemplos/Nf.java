package exemplos;

import java.util.Scanner;

public class Nf {
	Scanner leia = new Scanner(System.in);
	
	static String produtosNome[] = {
			"Luminária de mesa     ",
			"Poltrona              ",
			"Abajur                ",
			"Estante               ",
			"Escrivaninha          ",
			"Cadeira de Escritório ",
			"Cama                  ", 
			"Cadeira Gamer         ",
			"Mesa de centro        ",
			"Sofá                  " };
	
	static int estoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
	static int carrinho[] = {1, 3, 5, 6, 2, 8, 1, 4, 2, 1};
	static double produtosValor[] = {25.99, 40.00, 34.59, 34.44, 234.23, 12.43, 55.23, 90.00, 30.00, 99.99};
	

	public static void main(String[] args) {

		
		teste();

		
	
	}
	
	// Classe função
	
	public static void teste(){
		
		
	System.out.print("\t\t     NOTA FISCAL\n");
	System.out.print("---------------------------------------------------------\n");
	System.out.print("Items \t\t\t\t  QtdeUn \t VlrUnit\n\n");
	
	for (int i = 0; i < 10; i++) {
		if (carrinho[i] != 0) {
			System.out.print(produtosNome[i]);			
			System.out.print("\t\t  "+carrinho[i] + "\t\t " + produtosValor[i] + "\n");
			
		}
	}
	System.out.print("\n---------------------------------------------------------\n");
	System.out.print("Total: \t\t\t\t\t\t " + Math.round(calculaTotal(+2)) + "\n");

	retiraItensEstoque();

	zeraCarrinho();
		
	}
	

	public static double calculaTotal(int i) {
		double total = 0.0;
		for (i = 0; i < 10; i++) {
			total += carrinho[i] + produtosValor[i];
		}
		
		return total;
	}

	public static void retiraItensEstoque() {
		for (int i = 0; i < 10; i++) {
			estoque[i] -= carrinho[i];
		}
		
	}
	
	public static void zeraCarrinho() {
		for (int i = 0; i < 10; i++) {
			carrinho[i] = 0;
		}
		
	}

}
