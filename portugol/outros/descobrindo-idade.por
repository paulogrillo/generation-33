programa
{
	
	funcao inicio()
	{
		//UM PROGRAMA QUE PEÇA
		//NOME DA PESSOA
		//O ANO DE NASCIMENTO[APENAS O ANO] :
		//E MOSTRE COMO RESULTADO: BOM DIA XXXX, SUA IDADE APROXIMADA É XXX ANOS.

		cadeia nome
		inteiro idade
		inteiro anoNascimento, ano
		ano = 2021
		
		escreva("nome ")
		leia(nome)

		escreva("Ano nascimento ")
		leia(anoNascimento)
		idade=ano-anoNascimento

		escreva("Bom dia "+nome+", sua idade aproximada é "+idade+" anos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */