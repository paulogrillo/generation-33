package exercicio3;

public class Application {
/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.
 */
	public static void main(String[] args) {
		
		//Interface //Produto 1
		ProdutoEletronico produto1 = new ProdutoEletronico();
		produto1.name = "Fog�o brastemp";
		produto1.category = "FOG�O";
		produto1.inventory = 5;
		produto1.price = 2.589;
		
		//Interface //Produto 2
		ProdutoEletronico produto2 = new ProdutoEletronico();
		produto2.name = "Fog�o consul";
		produto2.category = "FOG�O";
		produto2.inventory = 3;
		produto2.price = 2.589;
		
		//Interface //Produto 3
		ProdutoEletronico produto3 = new ProdutoEletronico();
		produto3.name = "Fog�o LG";
		produto3.category = "FOG�O";
		produto3.inventory = 7;
		produto3.price = 2.589;
		
		System.out.print("\t\t\tLista de produtos:\n\n");
		
		System.out.println("1� "+produto1.getName()+" R$"+produto1.price+" "+ produto1.inventory+" unidades");
		System.out.println("2� "+produto2.getName()+" R$"+produto2.price+" "+ produto2.inventory+" unidades");
		System.out.println("3� "+produto3.getName()+" R$"+produto3.price+" "+ produto3.inventory+" unidades");
		
	}

}
