// ENQUANTO - COM ERRO !

//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
//três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
//digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.

programa{
	
	funcao inicio(){
		//Variáveis base
		inteiro numero = 0
		inteiro operacao = 0

		escreva("Entre com um numero itneiro: ")
		leia(numero)
		
		enquanto(numero<=100){
		numero = numero++
		operacao = numero * 3
		
		escreva("\n3 x",numero," = ",operacao)
			se(numero >100){
				pare	
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 24; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */