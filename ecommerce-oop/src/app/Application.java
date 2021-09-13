package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Produto;

public class Application {

	static Scanner sc = new Scanner(System.in);
	static Scanner leia = new Scanner(System.in);
	static String auxCod="";
	static int auxIndice=0;
	static int auxQtde=0;
	
	static List <Produto> cadastro = new ArrayList<>();
	static List <Produto> carrinho = new ArrayList<>();

	public static void main(String[] args) {
		
		intro();
		erp();
	}
	
	//Função ERP
	public static void erp(){
		System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
		String flag = sc.nextLine();
		System.out.println("\n\n\n\n\n");
		while (flag.toLowerCase().equals("s")) {

			if (flag.toLowerCase().equals("s")) {
			
				System.out.print("Digite o código do produto: ");
				String id = sc.nextLine();
				System.out.println("\n\n\n\n\n");
				
				
				System.out.print("\nDigite a quantidade necessária: ");
				int quantidade = Integer.parseInt(sc.nextLine());
				System.out.println("\n\n\n\n\n");
				
				dal.addProductCarrinho(id, quantidade);
				dal.exibeProdutosCarrinho();
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
	
	//Função apresentação
	public static void intro() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
	}
	
	
	
	
	
	
	
}
