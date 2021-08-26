//Para

//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

programa{
	
	funcao inicio(){
		
		//Variáveis base
		inteiro contador = 0
		
		para(inteiro i=1; i<=500; ++i){
			se(i%3==0 e i<=500){
			escreva(i,"\n")
			contador = contador++
			}
		}
	escreva("Resultado da soma de todos números ímpares \nque são MOD 3 entre 1 e 500: ",contador)
  }
}

/*
 EM JAVA
 
package ExerciciosBasic;
public class Lacos01 {
    
    //Variáveis base
    static int contador = 0;

    public static void main(String[] args) {
        for (int i=1; i<=500; ++i) {
            if(i%3==0 & i<=500){
                System.out.println(i);
                contador = contador + 1;
            }
        }
        System.out.println("soma de todos os números ímpares: "+contador);
    }
} 
 */

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */