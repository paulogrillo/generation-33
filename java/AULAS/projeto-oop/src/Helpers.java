import java.util.List;

public class Helpers {
	
	static String formatter = "%-4s %-20s %-10s %-10s";
	
	static public void mostraProdutos(List<Product> produtos) {
		System.out.format(formatter, "ID", "NOME", "PRECO", "Qnt");
		System.out.println("\n");
		for (Product product : produtos) {
			mostraUmProduto(product);
			System.out.println("\n");
		}
	}
	
	static public void mostraUmProduto(Product produto) {
		String id = produto.getId();
		String nome = produto.getNome();
		String preco = produto.getPreco();
		int estoque = produto.getEstoque();
		System.out.format(formatter, id, nome, preco, estoque);
	}

}
