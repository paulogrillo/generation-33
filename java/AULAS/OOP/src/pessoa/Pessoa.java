package pessoa;

public class Pessoa {
	
	//Interface
	private String name;
	private int age;
	
	//Construtor
	public Pessoa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//######## GET E SET ############
	
	//Setando o nome (Definindo valor)
	public void setNome(String name){
		this.name = name;
	}
	//Get Pegando nome
	public String getNome() {
		return this.name;
	}
	
	//Setando a idade
	public void setIdade(int age) {
		this.age = age;
	}
	//Get pegando a idade
	public int getIdade() {
		return this.age;
	}
	
	
	
	

}
