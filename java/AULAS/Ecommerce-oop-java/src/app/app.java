package app;

import java.util.Scanner;

import models.ERP;
import models.ItemCarrinho;
import models.Produto;

public class app {

	static ERP util = new ERP();
	static ItemCarrinho items = new ItemCarrinho(0);
	
	static Scanner sc = new Scanner(System.in);
	static String op;

	public static void main(String[] args) {
		getApresentacao();
		erp();
	}

	// Fun��o apresenta��o
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle � vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
	}

	// Fun��o erp
	public static void erp() {
		System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
		String flag = sc.nextLine();
		System.out.println("\n\n\n");
		
		if (("n").equalsIgnoreCase(flag)) {
			System.out.println("At� breve!");
			
		}else if(("s").equalsIgnoreCase(flag)){
			
		
		while (("s").equalsIgnoreCase(flag)) {
				//Exibe produtos dispon�veis
				util.exibeProdutosDisponiveis();
				System.out.print("Digite o c�digo do produto: ");
				String id = sc.nextLine();
				System.out.println("\n\n\n\n\n");
				
				//Exibe o produto selecionado
				//O produto est� sendo retornado a partir da classe Produto e getEstoque
				Produto produtoSelecionado = util.findProductById(id);
				util.previewProduto(id);
				
				int quantidade=0;
				while(quantidade <= 0 || quantidade > produtoSelecionado.getEstoque()){
				
					System.out.print("\nDigite a quantidade necess�ria: ");

					quantidade = Integer.parseInt(sc.nextLine());
					if(quantidade <= 0){
						System.out.println("Insira um n�mero positivo!");
						
					}
					if(quantidade > produtoSelecionado.getEstoque()){
						System.out.println("Quantidade indispon�vel");
					}
				}
				
				System.out.println("\n\n\n\n\n");
				
				
				//Carrinho
				
				util.addProductCarrinho(produtoSelecionado, quantidade);
				
				util.exibeProdutosCarrinho();
				System.out.println("\n\n");
				util.totalizador(id, quantidade);
				
				//Finalizar compra S/N
				System.out.println();
				System.out.println("\nDeseja continuar a compra? S/N");
				flag = sc.nextLine();

				if (flag.equalsIgnoreCase("n")){
					//Forma de pagamento!
					System.out.println("Forma de pagamento");
					util.formaPagamento();
					
					//Deseja emitir nota fiscal?
					System.out.print("Deseja emitir sua Nota Fiscal? S/N");
					op = sc.next();
						
						if(flag.equalsIgnoreCase("n")){
							System.out.println("Ok.. Fechando carrinho.");
							
						}else{
							System.out.println("Nota fiscal!");
						}
					
					if ("n".equalsIgnoreCase(op)) {
						
						System.out.println("\nDeseja fazer uma nova comprar S/N?");
						
						
					} else if ("s".equalsIgnoreCase(op)) {
						util.emitirNota();
						System.out.println();

						util.totalizador(id, quantidade);
						System.out.println("\n\nDeseja fazer outra compra? S/N");
						op = sc.next();

						if ("s".equalsIgnoreCase(op)) {

							erp();
						} else {
							System.out.println("At� breve..");
						}

					} else {
						System.out.println("Digito inv�lido!");
					}
				}

			
		}
		
	}//Finaliza o primeir if
		else {
			System.out.println("Digito inv�lido!");
		}
	}

}
