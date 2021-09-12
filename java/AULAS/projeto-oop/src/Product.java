
public class Product {
	
	private String id;
	private String nome;
	private int preco;
	private int estoque;
	
	public Product(String id, String nome, int preco, int estoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public int getEstoque(){
		return this.estoque;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return String.format("R$%d", this.preco);
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
