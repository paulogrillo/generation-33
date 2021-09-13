package app;

import java.util.Scanner;

import models.ERP;
import models.ItemCarrinho;

public class app {
	static ERP util = new ERP();
	static ItemCarrinho items = new ItemCarrinho(0);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 getApresentacao();
			erp();
	}
	
	//Função apresentação
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
	}
	
	//Função erp
	public static void erp(){
		System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
		String flag = sc.nextLine();
		System.out.println("\n\n\n\n\n");
		while (flag.toLowerCase().equals("s")) {

			if (flag.toLowerCase().equals("s")) {
				util.exibeProdutosDisponiveis();
				System.out.print("Digite o código do produto: ");
				String id = sc.nextLine();
				System.out.println("\n\n\n\n\n");
				
				util.previewProduto(id);
				System.out.print("\nDigite a quantidade necessária: ");
				int quantidade = Integer.parseInt(sc.nextLine());
				System.out.println("\n\n\n\n\n");
				
				util.addProductCarrinho(id, quantidade);
				util.exibeProdutosCarrinho();
				System.out.println("\n\n");
				util.totalizador(id, quantidade);
				System.out.println();
				System.out.println("\nDeseja continuar a compra? S/N");
				flag = sc.nextLine();
				
				if(flag.equalsIgnoreCase("n")){
					System.out.println("Aqui entra forma de pagamento..");
				}
			}
		}
		if(flag.toLowerCase().equals("n")){
			System.out.println("Ok.. Até breve..");
		}else{
			System.out.println("Você digigou um valor inválido!");
			erp();
		}
	}
	
	
	

}
