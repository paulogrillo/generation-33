package exercicio1;
/*
	Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 
 */

public class Application {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.name = "Paulo";
		cliente1.idade = 27;
		cliente1.cpf = "384656953";
		cliente1.negativado = true;
		
		Cliente cliente2 = new Cliente();
		
		cliente2.name = "Gabriel";
		cliente2.idade = 29;
		cliente2.cpf = "58915225";
		cliente2.negativado = false;
		
		if(cliente1.negativado == true){
			System.err.println(cliente1.name);
			System.out.println("Esse cliente está negativado!");
		}else if(cliente1.negativado == false) {
			System.err.println(cliente2.name);
			System.out.println("Esse cliente está positivo");
		}
		

	}

}
