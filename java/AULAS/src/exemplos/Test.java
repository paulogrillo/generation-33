package exemplos;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		int contador =0, numero=0, soma =0;
		
		 while (true)
	        {
	            numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero", "Numero", JOptionPane.QUESTION_MESSAGE));
	            if (numero >= 0)
	            {
	                System.out.println(numero);
	                soma = soma + numero;
	                contador++;
	            }
	            else
	            {
	                break;
	            }
	        }
	        System.out.println("A soma é " + soma);
	        System.out.println("A quantidade de numeros digitados é " + contador);
	        System.out.println("A media é " + soma / contador);
		
	}
}
