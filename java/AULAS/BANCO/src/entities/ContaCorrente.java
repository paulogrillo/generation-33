package entities;

public class ContaCorrente extends Conta {
	private int contador;
	
	//Construtor classe Conta
	public ContaCorrente(String cpf, int numero) {
		super(cpf, numero);
		
	}
	
	//Getters and setters
	public int getContadorTalao() {
		return contador;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contador = contadorTalao;
	}
	
	//Método
    public void cheque() {
        if(contador<3) {
            if(super.getSaldo()>=30.00) {
                super.debito(30);
                contador++;
            } else {
            	System.out.println("Saldo insuficiente.");
            }
        } else {
        	System.out.println("Limite máximo (3) excedido.");
        }
    }

}
