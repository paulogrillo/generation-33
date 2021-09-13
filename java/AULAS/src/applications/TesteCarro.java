package applications;

import classes.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.Marca = "BMW";
		carro1.Cor = "Vermelho";
		carro1.Ano = 2021;
		
		System.out.println("Primeiro carro:");
		System.out.println(carro1.Marca);
		System.out.println(carro1.Cor);
		System.out.println(carro1.Ano);
		
		
		carro1.ligar();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		carro1.freiar();
		System.out.println(carro1.velocidade);
		
		carro1.desligar();
		
		
		
	}

}
