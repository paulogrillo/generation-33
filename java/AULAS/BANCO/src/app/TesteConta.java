package app;

import java.util.Scanner;

import entities.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		//
		Scanner leia = new Scanner(System.in);
		//Entidade ContaEstudantil
		ContaPoupanca cp1 = new ContaPoupanca("222.333.444-74", 18, 5);
		
		
		cp1.credito(100);
		
		System.out.println(cp1.getSaldo());
		
		System.out.print("Executando correção..");
		cp1.correcao(5);
		System.out.println("\n"+cp1.getSaldo());
		
		
		char tipo;
		double valor=0.00;
		for(int x=1; x<10; x++){
			System.out.println("Movimento "+x);
			System.out.println("Saldo atual : "+cp1.getSaldo());
			System.out.println("Movimento D-dévito ou C-crédito ?");
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			
			if(tipo =='d'){
				cp1.debito(valor);
				
			}else if (tipo =='c') {
				cp1.credito(valor);
				
			}else {
				System.out.println("Digito inválido..");
			}
		
		}

	}

}
