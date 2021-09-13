package pessoa;

public class Application {

	public static void main(String[] args) {
		
		//Instâncias de pessoa
		Pessoa pessoa1 = new Pessoa("João", 27);
		Pessoa pessoa2 = new Pessoa("Maria", 26);
		Pessoa pessoa3 = new Pessoa("Jose", 20);
		Pessoa pessoa4 = new Pessoa("Jonas", 18);
		
		System.out.println("Nome "+pessoa1.getNome()+" Idade "+pessoa1.getIdade()+" anos.");
		System.out.println("Nome "+pessoa2.getNome()+" Idade "+pessoa2.getIdade()+" anos.");
		System.out.println("Nome "+pessoa3.getNome()+" Idade "+pessoa3.getIdade()+" anos.");
		System.out.println("Nome "+pessoa4.getNome()+" Idade "+pessoa4.getIdade()+" anos.");


	}

}
