package cliente;

import java.util.Scanner;

public class ExemploCliente {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("225.662.692-22");
		
		Scanner leia = new Scanner(System.in);
		
		cli1.setAnoNascimento(1994);
		cli1.setAtivo(true);
		cli1.setCpf("145588452");
		
		System.out.println(cli1.getCpf());
	}

}
