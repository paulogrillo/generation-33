package exemplos;

public class Lacos {

	public static void main(String[] args) {

	////Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	////múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

	    //Variáveis base
	     int cont = 0;
	     int i;

	 
	        for (i=0; i<=500; ++i){
	            if((i%2)==1 && (i%3)==0){
	                cont = cont + 1;
	                System.out.println(i);
	            }
	        }
	        System.out.printf("A soma de todos os numeros impares: ",cont);
	    }
	

}


