package classes;

public class Carro {
		//Atributos:
		public String Marca;
		public String Cor;
		public int Ano;
		public boolean ligado;
		public int velocidade;

		public void ligar(){
			System.out.println("CARRO LIGADO!");
			ligado = true;
		}
		
		
		public void desligar(){
			System.out.println("CARRO DESLIGADO!");
			ligado = false;
		}
		public void acelerar(){
			System.out.println("CARRO ACELERANDO!");
			if(ligado) {
				velocidade = velocidade + 1;
			}
			
		}
		public void freiar(){
			System.out.println("CARRO FREIANDO!");
			if(ligado) {
				velocidade = velocidade - 1;
			}
			
		}
		

}
