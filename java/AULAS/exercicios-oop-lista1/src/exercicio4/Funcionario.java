package exercicio4;

public class Funcionario {
	
	//Atributos
	public String name;
	public int age;
	public double wage;
	public int registerDate;
	public boolean pj = false;
	
	
	//Construtor
	public Funcionario(String name) {
		super();
		this.name = name;
	}
	
	//Método
	public boolean pessoaJuridica(){
		return this.pj = true;
	}
	public boolean pessoaFisica(){
		return this.pj = false;
	}
	
	
	//Get e Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(int registerDate) {
		this.registerDate = registerDate;
	}
	
	
	
	
}
