
public class ItemCarrinho {
	
	private Product produto;
	private int quantidade;

	
	public ItemCarrinho(Product produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public ItemCarrinho(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void getTotal(){
		System.out.println("Total :");
		
	}
	
	public Product getProduto() {
		return produto;
	}
	public void setProduto(Product produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
