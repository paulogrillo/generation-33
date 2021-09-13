package entities;

public class ContaEmpresa extends Conta{
		
	//Atributos
	private double emprestimoEmpresa;
	private double contadorTalao;
	
	//Construtor
	public ContaEmpresa(String cpf, int numero) {
		super(cpf, numero);
		// TODO Auto-generated constructor stub
	}
	
	
	//Encapsulamento
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//metodo
    public void cheque() {
        if(contadorTalao<3) {
            if(super.getSaldo()>=30.00) {
                super.debito(30);
                contadorTalao++;
            } else {
            	System.out.println("Saldo insuficiente.");
            }
        } else {
        	System.out.println("Limite máximo (3) excedido.");
        }
    }
}
