package models;

public class Product {
	
	//Atributos
	private String id;
	private String name;
	private double price;
	private int inventory;
	
	//Constructor 
	public Product(String id, String name, double price, int inventory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.inventory = inventory;
	}
	
	//Métodos
	public void includeInventory(int quantidade){
		if(quantidade >= 0){
			this.inventory += quantidade;
		}
	}
	
	public void excludeInventory(int quantidade){
		if (quantidade <0){
			System.out.println("Impossivel realizar");
		
		}else if(quantidade <= inventory){
			this.inventory -= quantidade;
		}else{
			System.out.println("Quantidade acima do estoque, impossivel realizar.");
		}
	}
	
	
	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	
	
	
	

}
