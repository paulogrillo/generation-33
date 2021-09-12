import java.util.ArrayList;
import java.util.List;

public class DAL {
	
	private List<Product> produtosDisponiveis;
	private Carrinho carrinho;

	public DAL() {
		this.produtosDisponiveis = new ArrayList<Product>();
		this.carrinho = new Carrinho();

		Product p1 = new Product("G2-1", "Tênis Nike", 5000, 3);
		Product p2 = new Product("G2-2", "Tênis Addidas", 300, 5);
		Product p3 = new Product("G2-3", "Meia Addida", 40, 6);
		Product p4 = new Product("G2-4", "Meia Nike", 30, 10);

		this.produtosDisponiveis.add(p1);
		this.produtosDisponiveis.add(p2);
		this.produtosDisponiveis.add(p3);
		this.produtosDisponiveis.add(p4);
	}

	public List<Product> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}

	public void addProductCarrinho(String id, int quantidade) {
		Product product = this.findProductById(id);
		this.carrinho.addItem(product, quantidade);
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
