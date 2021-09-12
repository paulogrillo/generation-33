import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<ItemCarrinho> itens;
	private int total;
	private String modoPagamento;
	private String desconto;
	private String valorCompra;
	static String formatter = "%-4s %-40s %-8s %-4s"; 
	
	public Carrinho() {
		this.itens = new ArrayList<ItemCarrinho>();
	}
	
	public void addItem(Product product, int quantidade) {
		ItemCarrinho item = new ItemCarrinho(product, quantidade);
		itens.add(item);
	}
	
	public void listaProdutos() {
		System.out.println("Produtos no carrinho:");
		System.out.format(formatter, "ID", "NOME", "PRECO", "QUANTIDADE");
		System.out.println();
		for (ItemCarrinho item : this.itens) {
			this.mostraItem(item);
		}
	}
	
	private void mostraItem(ItemCarrinho item) {
		Product produto = item.getProduto();
		String id = produto.getId();
		String nome = produto.getNome();
		String preco = produto.getPreco();
		String quantidade = String.valueOf(item.getQuantidade());
		
		System.out.format(formatter, id, nome, preco, quantidade);
		System.out.println();
	}
	
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String getModoPagamento() {
		return modoPagamento;
	}
	
	public void setModoPagamento(String modoPagamento) {
		this.modoPagamento = modoPagamento;
	}
	
	public String getDesconto() {
		return desconto;
	}
	
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	
	public String getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
