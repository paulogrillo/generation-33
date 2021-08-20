// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

programa
{
	
	funcao inicio()
	{
	
	inteiro dias
	inteiro meses
	inteiro anos
	
	escreva("Escreva sua idade em dias: ")
	leia(dias)
	
	anos=(dias/365)
	meses=(dias%365)/30
	dias=((dias%365)%30)
	
	escreva("Sua idade em anos é: "+anos+" anos ")
	escreva("Sua idade em meses é: "+meses+" meses ")
	escreva("Sua idade em dias é: "+dias+" dias ")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */