programa{
		
	funcao inicio(){
		perguntar()
		
	}

	funcao perguntar(){
		caracter valor, s = 's', n = 'n'
	
	escreva("DESEJA FAZER COMPRAS S/N: ")
	leia(valor)

	se(valor == s ou valor == 'S'){
		escreva("Abrir loja")
	}senao se (valor == n ou valor == 'N'){
		escreva("Ok.. Até logo!")
		}senao{
			escreva("Valor digitado é inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */