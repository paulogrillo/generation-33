//VALOR EMERGENCIAL = 600 REAIS
//A CHEFA DA FAMILIA: VALOR DOBRAR
//NOME DA PESSOA
//PERGUNTE SE ELA É A CHEFA DA FAMILIA
//QUAL O VALOR QUE ELA VAI RECEBER
//OLÁ, [NOME], VC É O/A DA FAMILIA E VAI RECEBER [XXX] REAIS


programa{
	
	funcao inicio(){
	caracter medida = 'm'
	real beneficioEmergencial = 600.00
	real beneficioParaChefa = beneficioEmergencial*2
	real beneficioParaChefe = beneficioEmergencial
	cadeia nome

	escreva ("Olá qual o seu nome? ")
	leia (nome)
	escreva (""+nome+" você é homem (h) ou mulher (m)")
	leia (medida)
	
	se (medida=='h' ou medida=='H')
	{
	escreva (""+nome+" seu beneficio emergencial é de R$: "+beneficioParaChefe+"")
	} senao se (medida=='m' ou medida=='M')
	
	escreva (""+nome+" seu beneficio emergencial é de R$: "+beneficioParaChefa+" ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */