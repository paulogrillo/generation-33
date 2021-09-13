package exercicio4;

import java.util.Locale;

public class Application {
		/*
		 * 	Crie uma classe funcionário e apresente os atributos e métodos
			referentes esta classe, em seguida crie um objeto funcionário, defina as
			instancias deste objeto e apresente as informações deste objeto no
			console.
		*/	
	public static void main(String[] args) {
		
		double bonificacao = 2000;
		
		
		Funcionario f1Funcionario = new Funcionario("João");
		Funcionario f2Funcionario = new Funcionario("Jose");
		Funcionario f3Funcionario = new Funcionario("Francisco");
		
		
		//FUNCIONARIO 1
		f1Funcionario.name="João";
		f1Funcionario.age=27;
		f1Funcionario.pj=true;
		f1Funcionario.registerDate = 2001;
		f1Funcionario.wage = 5860;
		double salarioFinal1 = f1Funcionario.wage + bonificacao;
		
		
		
		//FUNCIONARIO 2
		f2Funcionario.name="Jose";
		f2Funcionario.age=35;
		f2Funcionario.pj=false;
		f2Funcionario.registerDate = 1999;
		f2Funcionario.wage = 3560;
		double salarioFinal2 = f2Funcionario.wage + bonificacao;
		
		//FUNCIONARIO 3
		f3Funcionario.name="Francisco";
		f3Funcionario.age=20;
		f3Funcionario.pj=true;
		f3Funcionario.registerDate = 2007;
		f3Funcionario.wage = 3730;
		double salarioFinal3 = f3Funcionario.wage + bonificacao;
		
		
		
		System.out.printf("Nome: "+f1Funcionario.name+"\n");
		System.out.printf("Idade:  "+f1Funcionario.age+"\n");
		System.out.printf("Data de registro: "+f1Funcionario.registerDate+"\n");
		System.out.printf("Salário: %.2f",f1Funcionario.wage,"\n");
		if(f1Funcionario.pj == true){
			System.out.println("\n");
			System.out.print("Funcionário PJ\n");
			System.out.printf("A bonificação é %.2f ",bonificacao);;
			System.out.printf("\nTotal a receber: %.2f",salarioFinal1);
			
		}else {
			System.out.print("\nFuncionário PF\n");
			System.out.print("Sem bonificação.");
		}
		System.out.println("\n---------------------\n");
		
		
		System.out.printf("Nome: "+f2Funcionario.name+"\n");
		System.out.printf("Idade:  "+f2Funcionario.age+"\n");
		System.out.printf("Data de registro: "+f2Funcionario.registerDate+"\n");
		System.out.printf("Salário: %.2f",f2Funcionario.wage,"\n");
		if(f2Funcionario.pj == true){
			System.out.print ("\n");
			System.out.print("Funcionário PJ\n");
			System.out.printf("A bonificação é %.2f ",bonificacao);
			System.out.println("\n");
			System.out.printf("\nTotal a receber: %.2f",salarioFinal2);
			
		}else {
			System.out.print("\nFuncionário PF\n");
			System.out.print("Sem bonificação.");
		}
		
		System.out.println("\n---------------------\n");
		
		System.out.printf("Nome: "+f3Funcionario.name+"\n");
		System.out.printf("Idade:  "+f3Funcionario.age+"\n");
		System.out.printf("Data de registro: "+f3Funcionario.registerDate+"\n");
		System.out.printf("Salário: %.2f",f3Funcionario.wage,"\n");
		if(f3Funcionario.pj == true){
			System.out.println("\n");
			System.out.print("Funcionário PJ\n");
			System.out.printf("A bonificação é %.2f ",bonificacao);
			System.out.printf("\nTotal a receber: %.2f",salarioFinal3);
			
		}else {
			System.out.print("\nFuncionário PF\n");
			System.out.print("Sem bonificação.");
		}
		
		
		
		
		
	}

}
