package classes;

public class Terceiro extends Funcionario {

	//Construtor
	public Terceiro(String matricula, String nome) {
		super(matricula,nome);
	}
	
	public Terceiro(int horasTrabalhadas, double valorHora, String nome) {
		super(horasTrabalhadas, valorHora, nome);
		// TODO Auto-generated constructor stub
	}

	//Método
	@Override
	public double salario(){
		return (horasTrabalhadas * valorHora + adicional);
	}

}
