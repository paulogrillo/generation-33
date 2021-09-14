package app;

import java.util.Scanner;

import models.ERP;
import models.ItemCarrinho;
import models.Produto;

public class app {

	static ERP util = new ERP();
	static ItemCarrinho items = new ItemCarrinho(0);
	
	static Scanner sc = new Scanner(System.in);
	static String op="";

	public static void main(String[] args) {
		getApresentacao();

		//Resolvido o bug do scanner
		while((op == null || op == "") || (!"s".equalsIgnoreCase(op) && !"n".equalsIgnoreCase(op))){	
			
			if(!op.equals("")){
				System.out.println("\n\nDeseja fazer outra compra? S/N");
				sc = new Scanner(System.in);
				op = sc.nextLine();
			}
			
			
			if ("s".equalsIgnoreCase(op) || op == "") {
				
				erp();
				if(op.equals("")){
					op = " ";
				}
				
				
			}else if("n".equalsIgnoreCase(op)) {
				System.out.println("At� breve..");
			}else {
				System.out.println("Erro de digita��o..");
			}
		}

		
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
		String flag="";
		
		while(flag == "" || (!"s".equalsIgnoreCase(flag) && !"n".equalsIgnoreCase(flag))){
			
			sc = new Scanner(System.in);
			System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
			flag = sc.nextLine();
			
			System.out.println("\n\n\n");
			
			if (("n").equalsIgnoreCase(flag)) {
				op = flag;
				System.out.println("At� breve!");
				
			}
				
		}
		
		

		String id="";
		while (("s").equalsIgnoreCase(flag)) {
				//Exibe produtos dispon�veis
				util.exibeProdutosDisponiveis();


				
				//Exibe o produto selecionado
				//O produto est� sendo retornado a partir da classe Produto e getEstoque
				Produto produtoSelecionado = null;
				
				
				while (produtoSelecionado == null){
				
					System.out.print("Digite o c�digo do produto: ");
					id = sc.nextLine();
					produtoSelecionado = util.findProductById(id);
					System.out.println("\n\n\n\n\n");
					
					if(produtoSelecionado == null){
						
						System.out.println("Produto n�o encontrado!");
						
					}
				}
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
					
					while(op == null || (!"s".equalsIgnoreCase(op) && !"n".equalsIgnoreCase(op))){
						//Deseja emitir nota fiscal?
						System.out.print("Deseja emitir sua Nota Fiscal? S/N");
						op = sc.next();

						if (op.equalsIgnoreCase("n")) {
							System.out.println("Ok.. Fechando carrinho.");
						}else if ("s".equalsIgnoreCase(op)) {
							util.emitirNota();
							System.out.println();
							util.totalizador(id, quantidade);
							
							
						} else {
							System.out.println("Digito inv�lido");
						}
					}
					
				}
				

			
		}//Aqui acaba o While
		
		op = "continuar";
	}
	

}
