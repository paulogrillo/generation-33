/**
 * @author Paulo, Matehus, Beatriz, Fernando e Leonardo.
 * 
 * ECOMMERCE - DEV SHOES
 */

package ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationFilipao {

	static Scanner mySc = new Scanner(System.in);
	// variaveis - LISTA DE PRODUTO

	static char desejaAdicionar = 'x', s = 's', n = 'n';
	// Vari�veis
	static char valor;
	static double total = 0.0, totalFinal = 0.0;
	static String desejaComprar = "";
	static char desejaComprar2 = 'x', continuarCompra = 'x';// opcaoPgto= 'x'
	static double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
	static int formaPagamento;
	static int fim = 1;
	static String codigoEscolhido = "";

	// Vetores - LISTA DE PRODUTO
	static String nomeProduto[] = { "T�nis Nike          ", "T�nis Adidas        ", "T�nis Puma          ",
			"Camisa Nike         ", "Camisa Lacoste      ", "Camisa Supreme      ", "Meia Nike           ",
			"Meia Adidas         ", "Bola de futebol     ", "Blusa moleton Nike  " };

	static String codigoProduto[] = { "G2-1", "G2-2", "G2-3", "G2-4", "G2-5", "G2-6", "G2-7", "G2-8", "G2-9", "G2-10" };
	static int qtaAdicionadoCarrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static int valorProduto[] = { 200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 };
	static String carrinho[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
	static int estoqueProduto[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

	public static void main(String[] args) {
		// Aprenta��o
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

		carrinho[x] = codigoProduto[x] + "\t" + nomeProduto[x] + "R$ " + (valorProduto[x] * qtaAdicionadoCarrinho[x])
				+ "\t   " + qtaAdicionadoCarrinho[x] + "\n";

		for (int c = 0; c < 10; c++) {
			if (carrinho[c] != " ") {
				System.out.print(carrinho[c] + "\n");
				total = valorProduto[x] * qtaAdicionadoCarrinho[x];
			}
		}

		System.out.print("\n\n");
		System.out.print("Subtotal: R$ " + totalFinal + "\n" + "\t\t Valor da nota: R$ " + valorTotal + " \n");
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

		double valorTotal = 0, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 0.00;
		int formaPagamento, emitirNota = 0, fim = 0;

		System.out.println("Selecione a forma de pagamento?");
		System.out.println("\n1 - D�BITO \n2 - CR�DITO \n3 - PARCELADO (2X)");
		System.out.print("\nPagamento: ");
		formaPagamento = leitor.nextInt();

		if (formaPagamento == 1) {
			valorCompra = total * (10.00 / 100.00);
			valorTotal = total - valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra � de: R$%.2f", valorTotal);
			System.out.println(" (Desconto de 10%)");

		} else if (formaPagamento == 2) {
			valorCompra = total * (10.00 / 100.00);
			valorTotal = total + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra � de: R$%.2f", valorTotal);
			System.out.println(" Acr�scimo de 10%");

		} else if (formaPagamento == 3) {
			valorCompra = total * (15.00 / 100.00);
			valorTotal = total + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.println("\n\n");
			System.out.printf("O valor total da compra � de: R$%.2f", valorTotal);

			valorParcela = valorTotal / 2;
			System.out.print("\nA conta totalizou 2 parcelas de: R$ " + valorParcela);
		}

		System.out.printf("\nO imposto � de R$%.2f: ", valorNota);
		System.out.println("\n\n");
		System.out.printf("E o valor da nota � de R$%.2f: %s", valorTotal + valorNota, "9% de imposto");

		System.out.println("\n\n");

		System.out.print("Deseja imitir nota? 1-SIM 2-N�O \n");
		emitirNota = leitor.nextInt();

		if (emitirNota == 1) {

			System.out.print("||||||||||||||||||||| NOTA FISCAL |||||||||||||||||||||||||\n");
			System.out.println("\n\n");
			System.out.printf("\nO imposto � de R$%.2f: ", valorNota);
			System.out.println("\n\n");
			System.out.printf("E o valor da nota � de R$%.2f: %s", valorTotal + valorNota, "9% de imposto");

			System.out.print("\n\n(1) SIM SAIR DO PROGRAMA AGORA OU (2) FAZER OUTRA COMPRA: \n");
			fim = leitor.nextInt();

			if (fim == 1) {
				estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x];
				getApresentacao();
				executarOperacao();
			} else if (fim == 2) {
				executarOperacao();
			}
			if (fim != 1 || fim != 2) {
				System.out.print("Ops.. Voc� digitou alguma coisa errada.. \n");
				System.out.print("FINALIZAR COMPRA AGORA? (1) SIM ou (2) N�O: \n");
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

	// FUN��O NOTA FISCAL
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

	public static boolean validarProduto(int quantidade, int estoque) {
		return validarProdutoEstoque(quantidade, estoque) && validarProdutoQuantidade(quantidade);
	}

	public static boolean validarProdutoQuantidade(int quantidade) {
		return quantidade > 0;
	}

	public static boolean validarProdutoEstoque(int quantidade, int estoque) {
		return quantidade <= estoque;
	}

	/*
	 * 
	
	public static void teste() {
		for (int c = 0; c < 10; c++) {
			if (carrinho[c] != " ") {
				System.out.println(carrinho[c]);
				total = valorProduto[x] * qtaAdicionadoCarrinho[x];
			}
		}
	}
 */
	public static void listarCarrinho(String codigo, String nome, int valor, int estoque, int quantidade) {

		System.out.println("\n\n\n\n");
		System.out.print("||||||||||||||||||||| Carrinho |||||||||||||||||||||||||\n");
		produtoPrint(codigo, nome, valor, estoque, quantidade, 2);
		System.out.println("\n");
	}

	public static void produtoPrint(String codigo, String nome, int valor, int estoque, int quantidade, int opcao) {
		System.out.print("\n\n\n\n||||||||||||||||||||||||| Produto Selecionado ||||||||||||||||||||||||||||\n\n");
		if (opcao == 1) {
			System.out.printf("COD %s \tPRODUTO: %s VALOR R$ %s\tESTOQUE: %s\n", codigo, nome, valor, estoque);
		} else if (opcao == 2) {
			System.out.printf("COD %s \tPRODUTO: %s VALOR R$ %s\tQUANTIDADE: %s\n", codigo, nome, valor, quantidade);
		}

	}

	public static void quantidadeEntrada(int x) {
		qtaAdicionadoCarrinho[x] = receberDadosNumero("ESCOLHA A QUANTIDADE");
	}

	// FUN��O - OPERA��O
	public static void executarOperacao() {
		// FUN��O listar produtos
		listarProdutos();
		// Produto escolhido

		String produtoEscolhido = (String) receberDados();

		boolean achouCodigoProduto = false;

		for (int x = 0; x < 10; x++) {

			if (produtoEscolhido.equals(codigoProduto[x])) {
				String codigo = codigoProduto[x];
				achouCodigoProduto = true;
				produtoPrint(codigoProduto[x], nomeProduto[x], valorProduto[x], estoqueProduto[x], 0, 1);
				quantidadeEntrada(x);
				if (validarProduto(qtaAdicionadoCarrinho[x], estoqueProduto[x])) {
					listarCarrinho(codigoProduto[x], nomeProduto[x], valorProduto[x], estoqueProduto[x],
							qtaAdicionadoCarrinho[x]);

					if (decisaoEntrada("Continuar comprando?")) {
						executarOperacao();
					} else {
						finalizarCompra(x);
					}
				}

			} // PRIMEIRO IF ACABA AQUI

		} // AQUI ACABA O FOR
		if (achouCodigoProduto == false) {
			System.out.println("Ops.. esse c�digo n�o existe..");
			desejaContinuar();
		}

	}// A CLASSE OPERA��O ACABA AQUI

	public static void listarProdutos() {
		// FUN��O LISTAR PRODUTOS
		System.out.println("COD\t  Produto \t\t Valor  Qnt\n");
		for (int y = 0; y < 10; y++) {
			for (y = 0; y < 10; y++)
				System.out.println(codigoProduto[y] + "\t" + nomeProduto[y] + "\t" + "R$ " + valorProduto[y] + "\t"
						+ estoqueProduto[y]);
		} // Aqui acaba o for
	}

	// Criando uma fun��o parar tratar excess�o
	public static void desejaContinuar() {
		System.out.println("\n\n");
		System.out.print("Se deseja tentar novamente digite S/N");
		String continuarComprando = mySc.next();

		// M�todo equalsIgnoreCase vai referenciar a variavel ignorando se � maiuscula
		// ou minuscula
		if ("s".equalsIgnoreCase(continuarComprando)) {
			executarOperacao();
		} else if ("n".equalsIgnoreCase(continuarComprando)) {
			System.out.println("At� breve..");
		} else {
			desejaContinuar();
		}
	}
	/*
	 * FUN��O RESET - FUN��O PRECISOU! public static void getReset() { Scanner mySc
	 * = new Scanner(System.in);
	 * 
	 * System.out.println("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n");
	 * System.out.println("\t\t\t\t     S/N: "); desejaComprar2 =
	 * mySc.next().charAt(0);
	 * 
	 * if (desejaComprar2 == 'S' || desejaComprar2 == 's') {
	 * 
	 * executarOperacao(); } }
	 */
	/*
	 * N�O PRECISOU public static void getErp() {
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

	// Sobrecarga da fun��o receberDados
	public static Object receberDados() {
		mySc = new Scanner(System.in);
		return mySc.next().toUpperCase();
	}
	
	public static Integer receberDadosNumero(String mensagem) {
		try {
			System.out.println("\n\n ");
			System.out.printf("\t\t\t      %s \n ", mensagem);
			return (Integer) receberDados();
		} catch(Exception e) {
			
		}
		return 0;
	}

	// Fun��o - Receber dados S/N
	public static boolean decisaoEntrada(String mensagem) {

		System.out.println("\n\n ");
		System.out.printf("\t\t\t      %s \n ", mensagem);
		System.out.printf("\t\t\t\t   S/N ");
		desejaComprar = (String) receberDados();

		if ("s".equalsIgnoreCase(desejaComprar)) {
			return true;
		} else if ("n".equalsIgnoreCase(desejaComprar)) {
			return false;
		} else {
			System.out.println("C�digo inv�lido.. Digite S/N");
			return decisaoEntrada(mensagem);
		}
	}

	// FUN��O - Aprenta��o
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle � vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}

		if (decisaoEntrada("Deseja comprar?")) {
			executarOperacao();
		} else {
			System.out.println("At� breve...");
		}

	}

}
