package models;

import java.util.ArrayList;
import java.util.List;

public class ERP {
	/*An ERP class is responsible for storing all the elaborated classes of the program.*/
	
	//Attributes 
	private List<Product> produtosDisponiveis;
	private Cart cart;
	
	//private List<ItemCart> items;
	static String formatter = "%-4s %-40s %-8s %-4s";
	
	//form of payment
	static double valorTotal=0.00, valorNota=0.00, valorParcela, valorCompra=0.00;
	static int formPayment;
	
	
	//Erp
	public ERP(){
		this.produtosDisponiveis = new ArrayList<Product>();
		this.cart = new Cart();
		
		//Cadastro de produtos
		Product p1 = new Product("GEN-556P","Porta retrato 18x26cm", 10.50, 8);
		Product p2 = new Product("GEN-252P","Jarra de plástico 1LT", 8.50, 10);
		Product p3 = new Product("GEN-336P","Conj. de Copos 32 UND", 55.60, 4);
		Product p4 = new Product("GEN-857P","Tesoura para Desossar", 10.00, 10);
		Product p5 = new Product("GEN-569P","Faqueiro Inox 24 pçs", 40.00, 10);
		Product p6 = new Product("GEN-126P","Jogo de panelas 4 pçs", 200, 10);
		
		produtosDisponiveis.add(p1); 
		produtosDisponiveis.add(p2); 
		produtosDisponiveis.add(p3); 
		produtosDisponiveis.add(p4); 
		produtosDisponiveis.add(p5); 
		produtosDisponiveis.add(p6); 
	
	
	}
	
	
	
}
