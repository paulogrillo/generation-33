//Escreva um sistema que leia três números inteiros 
// e positivos (A, B, C) e calcule a seguinte expressão:

programa
{
	
	funcao inicio()
	{
		//Variáveis
		inteiro a,b,c,r,s,d

		//Entradas de dados
		escreva("Escreva um numero inteiro positivo ")
		leia(a)
		escreva("Escreva um numero inteiro positivo ")
		leia(b)
		escreva("Escreva um numero inteiro positivo ")
		leia(c)

		//Processamento
		r =(a+b)*(a+b)
		s =(b+c)*(b+c)
		d =((r+s)/2)

		//Saída de dados
		escreva("D=" +d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */