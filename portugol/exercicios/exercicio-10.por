//Digite um numero inteiro positivo, mostre o numero e informe se o numero é positivo ou negativo.
// se for negativo informe: Impossível realizar com numero negativo
// se for digitado do zero informe: Zero é neutro!
// se for um numero positivo informe: Se é par ou impar

//numero % 2 

programa
{
	
	funcao inicio(){

		//Variáveis 
		inteiro numero

		escreva("Digite um numero positivo: ")
		leia(numero)

		se (numero < 0){
			escreva("Impossível realizar com numero negativo")
		} senao se (numero == 0){
			escreva("Zero é neutro!")
		}senao se((numero % 2) == 0){
			escreva("O numero digitado é par")
		}senao {
			escreva("É impar")
		}
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */