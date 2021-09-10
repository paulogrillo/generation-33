package exercicio2;

public class Cachorro extends Animal  {

	public Cachorro(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void correr() {
		System.out.println("Cavalo correndo....");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Auu..Auuuu... ");
	}

}
