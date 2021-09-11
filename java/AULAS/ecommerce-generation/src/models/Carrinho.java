package models;

import java.util.List;

public class Carrinho {
	
	private List<Product> produtos;
	private int total;
	private String modoPagamento;
	private String desconto;
	private String valorCompra;
	
	public List<Product> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Product> produtos) {
		this.produtos = produtos;
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
	
	//Método exibir carrinho
	
	//Método fechar carrinho

}
