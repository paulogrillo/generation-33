//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.

programa{
	
	funcao inicio(){

		//Variáveis 
		inteiro numero
		//Entrada de dados
		escreva("Digite um numero inteiro: ")
		leia(numero)
		
		//Processamento e saída
		se ((numero % 2)==0 e (numero > 1)){
			escreva("Este número é Par e é numero Positivo")
		}senao se(numero > 1){
			escreva("Este número é Impar e é numero positivo")
		}senao{
			escreva("Este numero é negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */