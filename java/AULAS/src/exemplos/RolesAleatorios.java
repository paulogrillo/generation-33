package exemplos;

import java.util.Random;

public class RolesAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		String lugar[] = {"Vaticano", "Quadra da mangueira", "Templo de salomão", "Ilhas da maldivas", "Praia Grande"};
		
		int numero;
		// Versão classe random
		//numero = aleatorio.nextInt((lugar.length)-1);
		//System.out.println("Você está agora: "+lugar[numero]);
		
		//Versão Math
		numero = (int) Math.random()*(lugar.length);
		System.out.println("Você está agora: "+lugar[numero]);
	}

}
