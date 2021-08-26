//Para

//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

programa{
	
	funcao inicio(){
		//Variáveis base
		const inteiro IMPARES = 500
		inteiro contador = 0
		
		para(inteiro x=1; x<=IMPARES; x=x+2){
			escreva(x,"\n")
			contador = contador++	
		}
		escreva("Resultado da soma de todos números ímpares \nque são MOD 3 entre 1 e 500: ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */