package classes;

public class Times {
	
	//Atributos
	private String nome;
	private int pontos;
	
	//Construtor
	public Times(String nome) {
		super();
		this.nome = nome;
	}


	//Encapsulamento
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}


	//Métodos
	public void ganharPontos(char resultado){
		//g - ganhou 3 pontos, e-ganhou 1, p-zero pontos.
		if(resultado == 'g'){
			//this.pontos = this.pontos+3;
			this.pontos += 3;
		}else if (resultado == 'e') {
			this.pontos +=1;
		}else{
			this.pontos += 0;
		}
	}

}
