
/* PROBLEMA:
 * Um sistema de equações lineares do tipo: , pode ser resolvido segundo mostrado abaixo :
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */

package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercise7 {
		

		public static void main(String[] args) {
			
			//Padronização de numeros 
			Locale.setDefault(Locale.US);
			
			int a,b,c,d,e,f,x,y;
			
			Scanner mySc = new Scanner(System.in);
			
			//entrada
			System.out.print("Digite o valor de A : ");
			a = mySc.nextInt();
			System.out.print("Digite o valor de B : ");
			b = mySc.nextInt();
			System.out.print("Digite o valor de C : ");
			c = mySc.nextInt();
			System.out.print("Digite o valor de D : ");
			d = mySc.nextInt();
			System.out.print("Digite o valor de E : ");
			e = mySc.nextInt();
			System.out.print("Digite o valor de F : ");
			f = mySc.nextInt();
			
			//processamento
			x = ((c*e) - (b*f)) / ((a*e)-(b*d));
			y = ((a*f)-(c*d)) / ((a*e)-(b*d));
			
			c = ((a*x)+(b*y));
			f = ((d*x)+(e*y));
			
			//saída
			System.out.println("O valor de x: "+x);
			System.out.println("O valor de y: "+y);


	}

}
