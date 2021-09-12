import java.util.List;

public class Helpers {
	
	static String formatter = "%-4s %-40s %-6s";
	
	static public void mostraProdutos(List<Product> produtos) {
		System.out.format(formatter, "ID", "NOME", "PRECO");
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
		System.out.format(formatter, id, nome, preco);
	}

}
