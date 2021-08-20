// Exercicio: 1 
// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
// expressa em anos, meses e dias.

programa {
	funcao inicio(){
	// variaveis 
	inteiro dias, meses, anos

	// pedir pro usuário informar a idade em dias
	escreva("Escreva sua idade em dias: ")
	leia(dias)

	// calcular anos
	anos=(dias/365)
	// calcular meses
	meses=(dias%365)/30
	// calcular dias
	dias=((dias%365)%30)

	//resultado
	escreva("Sua idade em anos é: "+anos+" anos \n")
	escreva("Sua idade em meses é: "+meses+" meses \n")
	escreva("Sua idade em dias é: "+dias+" dias \n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */