package classes;

public class Pessoa {
	
	//Atributos - É, TEM, ESTAR
	public boolean vivo;
	public String nome;
	public int anoNascimento;
	public char pronome;
	
	//Método
	public void mostraIdade(){
		System.out.println(2021 - anoNascimento);
	}
	
	//Sobre carga de método
	
	public void mostrarIdade(int anoAtual) {
		System.out.println(anoAtual - anoNascimento);
	}
	
}
