programa{
	inclua biblioteca Util
	
	funcao inicio(){
		//Declaração do vetor e limite do laço
		const inteiro TAMANHO_VETOR=10 
			 inteiro vetor01[TAMANHO_VETOR]
		escreva("COD\t\n")
		para(inteiro x=0; x<TAMANHO_VETOR; ++x){
			//Carga no vetor
			vetor01[x] = x
			escreva("G2-"+(x+1)+"\n")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor01, 7, 12, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */