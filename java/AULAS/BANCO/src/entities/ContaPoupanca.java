package entities;

public class ContaPoupanca extends Conta {
	
	//atributos
	private int diaAniversario;
	
	//construtor
	public ContaPoupanca(String cpf, int numero, int diaAniversario) {
		super(cpf, numero);
		this.diaAniversario = diaAniversario;
	}
	
	//encapsulamento 
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
	//Métodos
	public void correcao(int diaInformado){
		double valorCorrecao;
		if(diaInformado == this.diaAniversario){
			valorCorrecao = (super.getSaldo() * 0.005);
			super.credito(valorCorrecao);
		}else {
			System.out.println("Você não possue beneficios para resgatar. Obrigado!");
		}
	}
	
	
	
}
