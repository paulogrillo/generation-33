/**
 * @author Paulo, Matehus, Beatriz, Fernando e Leonardo.
 * 
 * ECOMMERCE - DEV SHOES
 */

package ecommerce;
import java.util.Scanner;
public class Application {
	// variaveis - LISTA DE PRODUTO
	static char desejaAdicionar = 'x', s = 's', n = 'n';
	// Variáveis
	static char valor;
	static double total = 0.0, totalFinal = 0.0;
	static char desejaComprar = 'x', desejaComprar2 = 'x', continuarCompra = 'x';// opcaoPgto= 'x'
	static double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
	static int formaPagamento;
	static int fim = 1;
	static String codigoEscolhido = "";

	// Vetores - LISTA DE PRODUTO
	static String nomeProduto[] = { 
			"Tênis Nike          ", 
			"Tênis Adidas        ", 
			"Tênis Puma          ",
			"Camisa Nike         ", 
			"Camisa Lacoste      ", 
			"Camisa Supreme      ", 
			"Meia Nike           ",
			"Meia Adidas         ", 
			"Bola de futebol     ", 
			"Blusa moleton Nike  " };

	static String codigoProduto[] = { "G2-1", "G2-2", "G2-3", "G2-4", "G2-5", "G2-6", "G2-7", "G2-8", "G2-9", "G2-10" };
	static int qtaAdicionadoCarrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static int valorProduto[] = { 200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 };
	static String carrinho[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
	static int estoqueProduto[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

	public static void main(String[] args) {
		// Aprentação
		getApresentacao();
		executarOperacao();
	}

	// Finalizar compra
	public static void finalizarCompra(int x) {

		formaPagamento(x);

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n\n");
		System.out.println("CARRINHO\n\n");
		System.out.println("COD\t  Produto \t   Valor\t    Qnt\n");

		carrinho[x] = codigoProduto[x] + "\t" + nomeProduto[x] + "R$ " + (valorProduto[x] * qtaAdicionadoCarrinho[x])+ "\t   " + qtaAdicionadoCarrinho[x] + "\n";

		for (int c = 0; c < 10; c++) {
			if (carrinho[c] != " ") {
				System.out.print(carrinho[c] + "\n");
				total = valorProduto[x] * qtaAdicionadoCarrinho[x];
			}
		}

		System.out.print("\n\n");
		System.out.print("Subtotal: R$ " + totalFinal + "\t\t Valor da nota: R$ " + valorTotal+" \n");
		System.out.print("\nFINALIZAR COMPRA AGORA? (1) SIM ou (2) NAO: \n");
		System.out.print("\n\n");

		fim = leitor.nextInt();

		if (fim == 1) {
			estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x];
			getApresentacao();
			executarOperacao();
		} else {
			System.out.println("FINALIZAR COMPRA AGORA?\n");
			fim = leitor.nextInt();
		}
	}

	public static void formaPagamento(int x) {
		Scanner leitor = new Scanner(System.in);

		double valorTotal, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 150.00;
		int formaPagamento, emitirNota = 0, fim = 0;

		System.out.println("Selecione a forma de pagamento?");
		System.out.println("\n1 - DÉBITO \n2 - CRÉDITO \n3 - PARCELADO (2X)");
		System.out.print("\nPagamento: ");
		formaPagamento = leitor.nextInt();

		if (formaPagamento == 1) {
			valorCompra = totalFinal * (10.00 / 100.00);
			valorTotal = totalFinal - valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
			System.out.println(" (Desconto de 10%)");

		} else if (formaPagamento == 2) {
			valorCompra = totalFinal * (10.00 / 100.00);
			valorTotal = totalFinal + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
			System.out.println(" Acréscimo de 10%");

		} else if (formaPagamento == 3) {
			valorCompra = totalFinal * (15.00 / 100.00);
			valorTotal = totalFinal + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);

			valorParcela = valorTotal / 2;
			System.out.print("\nA conta totalizou 2 parcelas de: R$ " + valorParcela);

		}
		System.out.printf("\nO imposto é de R$%.2f:", valorNota);
		System.out.println(" (9%)");

		System.out.print("Deseja imitir nota? 1-SIM 2-NÃO");
		emitirNota = leitor.nextInt();

		if (emitirNota == 1) {

			// getNotaFiscal(x);

			System.out.print("Subtotal: R$ " + totalFinal + "\t\t Valor da nota: R$ " + valorNota);

			System.out.print("FINALIZAR COMPRA AGORA? (1) SIM ou (2) NÃO: \n");
			fim = leitor.nextInt();

			if (fim == 1) {
				estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x];
				getApresentacao();
				executarOperacao();
			} else if (fim == 2) {
				executarOperacao();
			}
			if (fim != 1 || fim != 2) {
				System.out.print("Ops.. Você digitou alguma coisa errada.. \n");
				System.out.print("FINALIZAR COMPRA AGORA? (1) SIM ou (2) NÃO: \n");
				fim = leitor.nextInt();

				if (fim == 1) {
					estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x];
					System.out.println("\n\n\n\n\n");
					getApresentacao();
					executarOperacao();
				}
			}
		}
	}

	// FUNÇÃO NOTA FISCAL
	/*
	 * 
	 * 
	 * public static void getNotaFiscal(int x) {
	 * 
	 * 
	 * Scanner leitor = new Scanner(System.in);
	 * 
	 * 
	 * System.out.println("\n\n"); System.out.println("CARRINHO\n\n");
	 * System.out.println("COD\t  Produto \t   Valor\t    Qnt\n");
	 * 
	 * carrinho[x]=codigoProduto[x]+"\t"+nomeProduto[x]+"R$ "+(valorProduto[x]*
	 * qtaAdicionadoCarrinho[x])+"\t   "+qtaAdicionadoCarrinho[x]+"\n";
	 * 
	 * 
	 * for(int c=0; c<10; c++){ if(carrinho[c] != " "){
	 * System.out.print(carrinho[c]+"\n"); total =
	 * valorProduto[x]*qtaAdicionadoCarrinho[x]; }
	 * 
	 * }
	 * 
	 * System.out.println("\n");
	 * System.out.println("Subtotal: R$ "+totalFinal+"\t\t Valor da nota: R$ "
	 * +valorTotal);
	 * System.out.println("FINALIZAR COMPRA AGORA? (1) SIM ou (2) NAO: \n");
	 * System.out.println("\n\n");
	 * 
	 * fim = leitor.nextInt();
	 * 
	 * 
	 * if(fim==1){ estoqueProduto[x]= estoqueProduto[x] - qtaAdicionadoCarrinho[x];
	 * getApresentacao(); executarOperacao(); }else{
	 * System.out.println("FINALIZAR COMPRA AGORA?\n"); fim = leitor.nextInt(); }
	 * 
	 * 
	 * 
	 * }
	 */

	// FUNÇÃO - OPERAÇÃO
	public static void executarOperacao() {

		// Scanner da função
		Scanner leia = new Scanner(System.in);
		System.out.println("COD\t  Produto \t\t Valor  Qnt\n");

		for (int y = 0; y < 10; y++) {
			if (desejaComprar == 's' || desejaComprar == 'S') {

				for (y = 0; y < 10; y++)
					System.out.println(codigoProduto[y] + "\t" + nomeProduto[y] + "\t" + "R$ " + valorProduto[y] + "\t"
							+ estoqueProduto[y]);
				System.out.println("\nExemplo: G2-1 - Tênis Nike \n");
				System.out.println("SELECIONE O CODIGO DO PRODUTO: ");
			}
		} // Aqui acaba o for
		
		codigoEscolhido = leia.next().toUpperCase();
		

		

		for (int x = 0; x < 10; x++) {

			System.out.println("Deseja tentar novamente?");

			if (codigoEscolhido.equals(codigoProduto[x])) {

				System.out.println(codigoEscolhido);
				System.out.println(codigoProduto[x]);

				System.out.println("COD " + codigoProduto[x] + "\t" + "PRODUTO: " + nomeProduto[x] + "VALOR R$"
						+ valorProduto[x] + "\t" + "ESTOQUE:" + estoqueProduto[x] + "\n");
				System.out.println("\n");
				System.out.println("ESCOLHA A QUANTIDADE : ");

				qtaAdicionadoCarrinho[x] = leia.nextInt();

				if (qtaAdicionadoCarrinho[x] <= estoqueProduto[x] && qtaAdicionadoCarrinho[x] > 0) {
					
				System.out.println("\n\n\n\n");
				System.out.print("||||||||||||||||||||| Produtos Selecionado |||||||||||||||||||||||||\n");
				System.out.println("\n");
				System.out.print("COD       Produto           Valor      Quantidade\n");
				carrinho[x] = codigoProduto[x] + "\t" + nomeProduto[x] + "R$ "+ valorProduto[x]+ "\t   " + qtaAdicionadoCarrinho[x];

					for (int c = 0; c < 10; c++) {
						if (carrinho[c] != " ") {
							System.out.println(carrinho[c]);
							total = valorProduto[x] * qtaAdicionadoCarrinho[x];
						}
					}
				} // SEGUNDO IF ACABA AQUI

				totalFinal = total + totalFinal;
				System.out.println("\t\t\t\t\t\t Subtotal: R$" + total+" ");
				System.out.println("\n");
				System.out.println("\t\t  CONTINUAR COMPRANDO? S/N : ");

				continuarCompra = leia.next().charAt(0);
				
			
				if (continuarCompra == 's' || continuarCompra == 'S') {
					executarOperacao();
				} else if (continuarCompra != 'S' && continuarCompra != 's' && continuarCompra != 'N'
						&& continuarCompra != 'n') {

					System.out.println("Opção Inválida, escreve S ou N\n");
					System.out.println("Continuar a compra ? S/N ");

					continuarCompra = leia.next().charAt(0);

					if (continuarCompra == 's' || continuarCompra == 'S') {
						executarOperacao();

					}
				} else {
					finalizarCompra(x);

				}

			}// PRIMEIRO IF ACABA AQUI

			
		}// AQUI ACABA O FOR
		
	}// A CLASSE OPERAÇÃO ACABA AQUI
	
	
	
	
	
	
	//Criando uma função parar tratar excessão
	public static void chechaCodigoProduto(int x) {

		
	}
	
	
	
	
	
	/*
	FUNÇÃO RESET - NÃO SEI SE VAI PRECISAR... VERIFICAR!
	public static void getReset() {
		Scanner mySc = new Scanner(System.in);

		System.out.println("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n");
		System.out.println("\t\t\t\t     S/N: ");
		desejaComprar2 = mySc.next().charAt(0);

		if (desejaComprar2 == 'S' || desejaComprar2 == 's') {

			executarOperacao();
		}
	}
*/
	/*
	 * public static void getErp() {
	 * 
	 * 
	 * while (desejaComprar != 'S' e desejaComprar != 's' e desejaComprar != 'N' e
	 * desejaComprar != 'n'){ System.out.println(desejaComprar);
	 * 
	 * executarOperacao();
	 * 
	 * }
	 * 
	 * 
	 * }//@AQUI TERMINA A FUNCAO ERP
	 * 
	 */
	// FUNÇÃO - Aprentação
	public static void getApresentacao() {

		Scanner mySc = new Scanner(System.in);

		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle é vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}

		System.out.println("\n\n ");
		System.out.printf("\t\t\t     Deseja comprar? \n ");
		System.out.printf("\t\t\t\t   S/N ");
		desejaComprar = mySc.nextLine().charAt(0);
		System.out.println("\n\n\n");
		
		if (desejaComprar == 's' || desejaComprar == 'S' && desejaComprar != 'N' && desejaComprar != 'n') {
			
		}else if(desejaComprar == 'N' || desejaComprar == 'n') {
			System.out.printf("\t\t\t     Até breve.. \n ");
		}else {
			System.out.println("\n\n Ops.. Tente digitar S/N");

			System.out.printf("\t\t\t     Deseja comprar? \n ");
			desejaComprar = mySc.nextLine().charAt(0);
			System.out.println("\n\n\n");
			if(desejaComprar == 's' || desejaComprar == 'S' && desejaComprar != 'N' && desejaComprar != 'n'){
				executarOperacao();
			}else if(desejaComprar == 'N' || desejaComprar == 'n'){
				System.out.printf("\t\t\t     Até breve.. \n ");
			}
		}
		
	}

}
