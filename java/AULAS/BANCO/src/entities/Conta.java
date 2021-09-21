package entities;

public class Conta {
	//Atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	private double valor;
	
	//Construtor
	public Conta(String cpf, int numero) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	//Métodos
	public boolean pessoaAtiva(){
		return this.ativo = true;
	}
	
	public boolean pessoaDesativada(){
		return this.ativo = false;
	}
	
	public void debito(double valor){
		if(valor == 0){
			System.out.println("Debito vazio, impossivel realizar");
		}else if (valor <0){
			System.out.println("Valor informado negativo, impossivel realizar");
		}else if (valor > saldo){
			System.out.println("Saldo insuficiente!");
		}else {
			//saldo = saldo - valor
			saldo -= valor;
		}
	}
	
	public void credito(double valor){
		//saldo = saldo + valor
		saldo += valor;
		
	}
	
	//Get e Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	@Override
	public String toString() {
		return "Conta numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo ;
	}

	
	
}
