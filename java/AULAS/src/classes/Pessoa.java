package classes;

public class Pessoa {
	
	//Atributos - �, TEM, ESTAR
	public boolean vivo;
	public String nome;
	public int anoNascimento;
	public char pronome;
	
	//M�todo
	public void mostraIdade(){
		System.out.println(2021 - anoNascimento);
	}
	
	//Sobre carga de m�todo
	
	public void mostrarIdade(int anoAtual) {
		System.out.println(anoAtual - anoNascimento);
	}
	
}
