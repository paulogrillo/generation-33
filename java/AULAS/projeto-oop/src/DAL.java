import java.util.ArrayList;
import java.util.List;

public class DAL {
	
	private List<Product> produtosDisponiveis;
	private List<ItemCarrinho> addCarrinho;
	private Carrinho carrinho;
	
	public DAL() {
		this.produtosDisponiveis = new ArrayList<Product>();
		this.carrinho = new Carrinho();

		Product TenisNike = new Product("G2-1", "Tênis Nike", 200, 10);
		Product TenisAdidas = new Product("G2-2", "Tênis Adidas", 150, 10);
		Product TenisPuma = new Product("G2-3", "Tênis Puma", 100, 10);
		Product CamisaNike = new Product("G2-4", "Camisa Nike", 50, 10);
		Product CamisaLacoste = new Product("G2-5", "Camisa Lacoste", 500, 10);
		Product CamisaSupreme = new Product("G2-6", "Camisa Supreme", 1000, 10);
		Product MeiaNike = new Product("G2-7", "Meia Nike", 30, 10);
		Product MeiaAdidas = new Product("G2-8", "Meia Adidas", 25, 10);
		Product BolaFutebol = new Product("G2-9", "Bola Futebol", 40, 10);
		Product BlusaMoletonNike = new Product("G2-10", "Blusa Moleton Nike", 120, 10);
		
		
		
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

	public List<Product> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}
	
	public void totalFinal(){
		
	}
	
	public void addProductCarrinho(String id, int quantidade){
		Product product = this.findProductById(id);
		if(quantidade <10){
			this.carrinho.addItem(product, quantidade);	
		}else {
			System.out.println("Quantidade insuficiente!");
		}	
	}
	
	private Product findProductById(String id) {
		for (Product product : this.getProdutosDisponiveis()) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}
	
	public void exibeProdutosDisponiveis() {
		System.out.println("=== Produtos Disponíveis ===");
		Helpers.mostraProdutos(this.produtosDisponiveis);
	}
	
	public void exibeProdutosCarrinho() {
		this.carrinho.listaProdutos();
	}
	
	public void previewProduto(String id) {
		
		Product produto = this.findProductById(id);
		Helpers.mostraUmProduto(produto);
	}
	
	

}
