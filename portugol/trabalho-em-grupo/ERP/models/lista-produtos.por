programa{
	
	funcao inicio(){
		//Declaração do vetor produto
		cadeia vetorProduto[10]
		vetorProduto[0] = "Tênis Nike"
		vetorProduto[1] = "Tênis Adiddas"
		vetorProduto[2] = "Tênis Puma"
		vetorProduto[3] = "Camisa Nike"
		vetorProduto[4] = "Camisa Lacoste"
		vetorProduto[5] = "Camisa Supreme"
		vetorProduto[6] = "Meia Nike"
		vetorProduto[7] = "Meia Adiddas"
		vetorProduto[8] = "Bola de futebol"
		vetorProduto[9] = "Blusa moleton Nike"

		//Cabeçalho PRODUTO
		escreva("\tPRODUTO\n")
		//Laço dos produtos
		para(inteiro x=1; x<10; ++x){
			escreva("\t"+vetorProduto[x]+"\n")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */