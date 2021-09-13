package classes;

public abstract class Funcionario {
	//Atributos
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	private String nome;
	protected double adicional;

	
	//M�todo
	
	public double salario(){
		return (horasTrabalhadas * valorHora);
	}
	
	//Primeiro construtor
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	//Segundo construtor
	public Funcionario(int horasTrabalhadas, double valorHora, String nome) {
		super();
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}
	
	//Get e Set
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
