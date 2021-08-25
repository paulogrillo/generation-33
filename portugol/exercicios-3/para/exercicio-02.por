//Para > COM ERRO!

//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

programa{
	
	funcao inicio(){
		//Variáveis base
		inteiro numeroImpares = 500
		
		para(inteiro x=1; x<=numeroImpares; x=x+2){
			escreva(x,"\n")

			//Somatória
			se(numeroImpares % 3){
				escreva("é modulo")
				
			}
		}escreva("Soma números Impares",somaNumeroImpares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */