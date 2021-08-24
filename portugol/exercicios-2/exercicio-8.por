
// Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
//for maior que 100, caso contrário imprimi-la com o valor zero.

programa{
	
	funcao inicio(){
		//Variáveis
		inteiro n

		//Entrada de dados
		escreva("Digite um numero: ")
		leia(n)

		//Processamento e saída
		se(n>100){
			escreva("variável numérica N",n)
		}senao{
			n = 0
			escreva("variável numérica N: ",n)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */