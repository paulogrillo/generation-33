package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ERP {
	private Produto produto;
	private List<Produto> produtosDisponiveis;
	private Carrinho carrinho;
	private String op="";
	private Scanner sc = new Scanner(System.in);
	
	//Forma de pagamento
	static double valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0;
	static int formaPagamento;
	
	public ERP() {
		this.produtosDisponiveis = new ArrayList<Produto>();
		this.carrinho = new Carrinho();

		Produto TenisNike = new Produto("G2-1", "T�nis Nike", 200, 10);
		Produto TenisAdidas = new Produto("G2-2", "T�nis Adidas", 150, 10);
		Produto TenisPuma = new Produto("G2-3", "T�nis Puma", 100, 10);
		Produto CamisaNike = new Produto("G2-4", "Camisa Nike", 50, 10);
		Produto CamisaLacoste = new Produto("G2-5", "Camisa Lacoste", 500, 10);
		Produto CamisaSupreme = new Produto("G2-6", "Camisa Supreme", 1000, 10);
		Produto MeiaNike = new Produto("G2-7", "Meia Nike", 30, 10);
		Produto MeiaAdidas = new Produto("G2-8", "Meia Adidas", 25, 10);
		Produto BolaFutebol = new Produto("G2-9", "Bola Futebol", 40, 10);
		Produto BlusaMoletonNike = new Produto("G2-10", "Blusa Moleton Nike", 120, 10);
		
		
		
		this.produtosDisponiveis.add(TenisNike);
		this.produtosDisponiveis.add(TenisAdidas);
		this.produtosDisponiveis.add(TenisPuma);
		this.produtosDisponiveis.add(CamisaNike);
		this.produtosDisponiveis.add(CamisaLacoste);
		this.produtosDisponiveis.add(CamisaSupreme);
		this.produtosDisponiveis.add(MeiaNike);
		this.produtosDisponiveis.add(MeiaAdidas);
		this.produtosDisponiveis.add(BolaFutebol);
		this.produtosDisponiveis.add(BlusaMoletonNike);
	}
	
	
	//M�todo lista produtos disponiveis.
	public List<Produto> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}
	
	//M�todo forma de pagamento
	
	public void formaPagamento(Produto product, int quantidade, String id){
		System.out.println("Selecione a forma de pagamento: ");
		System.out.println("1 D�bito ");
		System.out.println("2 Cr�dito ");
		System.out.println("3 3x parcelado ");
		
		op = sc.next();
		
		if("1".equals(sc)) {
			System.out.println("D�bito!");
			valorTotal = product.getPreco()*quantidade;
	
			valorNota = valorTotal * (9.00 / 100.00);
			//valorCompra = valorTotal * (10.00 / 100.00);
			//valorTotal = valorTotal - valorCompra;
			
			System.out.printf("O valor total da compra � de: R$%.2f", valorNota);
			System.out.println(" (Desconto de 10%)");
			
		}else if("2".equals(sc)){
			System.out.println("Cr�dito!");
		
		
		}else if("3".equals(sc)){
			System.out.println("3 parcelas");
		
		
		}
		
		
	}

	
	
	//M�todo buscar produto pelo id e adiciona quantidade
	public void addProductCarrinho(String id, int quantidade){
		Produto product = this.findProductById(id);
		if(quantidade <10){
			this.carrinho.addItem(product, quantidade);				
		}else {
			System.out.println("Quantidade indisponivel!");
		}	
	}
	
	//M�todo totalizador
	public void totalizador(String id, int quantidade){
		Produto product = this.findProductById(id);
			this.carrinho.addItem(product, quantidade);	
			System.out.printf("Sub-total: R$%s",product.getPreco()*quantidade," \n");	
	}
	
	//M�todo buscar produto pelo id
	private Produto findProductById(String id) {
		for (Produto product : this.getProdutosDisponiveis()) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}
	
	//M�todo exibe produtos dispon�veis
	public void exibeProdutosDisponiveis() {
		System.out.println("=== Produtos Dispon�veis ===");
		Util.mostraProdutos(this.produtosDisponiveis);
	}
	//M�todo exibe produtos no carrinho
	public void exibeProdutosCarrinho() {
		this.carrinho.listaProdutos();
	}
	
	//M�todo exibe produtos no carrinho
	public void emitirNota(){
		carrinho.nota();
	}
	
	//M�todo exibe preview produto escolhido
	public void previewProduto(String id) {
		Produto produto = this.findProductById(id);
		Util.mostraUmProduto(produto);
	}

}
