package exemplos;
import java.util.Scanner;

public class Exercicio {
	 static Scanner mySc = new Scanner(System.in); 
	    
	    public static void main(String[] args){
	    	
	    	 
	    	double maiorArea = 0;
	        double basePrimeiraRodada = 0;
	        double alturaPrimeiraRodada = 0;
	        double areaPrimeiraRodada = (basePrimeiraRodada * alturaPrimeiraRodada) / 2;

	        double baseSegundaRodada = 0;
	        double alturaSegundaRodada = 0;
	        double areaSegundaRodada = (baseSegundaRodada * alturaSegundaRodada) / 2;
	        
	        System.out.println("Digite o valor da base do primeiro triângulo: ");
	        basePrimeiraRodada = mySc.nextDouble();
	        System.out.println("");
	        System.out.println("Digite o valor da altura do primeiro triângulo: ");
	        alturaPrimeiraRodada = mySc.nextDouble();
	        System.out.println("");
	        
	        System.out.println("Digite o valor da base do segundo triângulo: ");
	        baseSegundaRodada = mySc.nextDouble();
	        System.out.println("");
	        System.out.println("Digite o valor da altura do segundo triângulo: ");
	        alturaSegundaRodada = mySc.nextDouble();
	        System.out.println("");
	        
	        
	       
	        if(areaPrimeiraRodada > areaSegundaRodada) {
	        	maiorArea = areaPrimeiraRodada;
	        }else {
	        	maiorArea = areaSegundaRodada;
	        }
	        
	        System.out.println("A maior area é "+maiorArea);
	         
	         
	    
	}
}

/*
 * rograma
{
	
	funcao inicio()
	{
		real base, altura, area

		escreva ("Digite a base: ")
		leia (base)
		escreva ("Digite a altura: ")
		leia (altura)

		se (base > 0 e altura > 0)
		{
			area = ((base * altura) / 2)
			escreva("A área do triangulo é: ", area)
		}
		
		senao 
		{
			escreva("Não realizado, o valores são invalidos!")
		}
	}
}
*/
