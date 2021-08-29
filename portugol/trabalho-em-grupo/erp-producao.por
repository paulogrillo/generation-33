// Loja DevShoes 
// Integrantes: Matheus, Paulo, Larissa, Fernando, Beatriz e Leonardo.
// ###### GENERATION BRASIL 2021 TURMA 33 #######
// SISTEMA QUE SIMULA UM E-COMMERCE



programa{
	inclua biblioteca Util
	// Função MAIN
	funcao inicio(){
		apresentacao()
		Util.aguarde(500)
		apresentacao2()
		perguntar()
	}
	
	// Função do bloco - Apresentacao
	funcao apresentacao(){
		para(inteiro x=0; x<5; ++x){
			cadeia linha1="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
			escreva(linha1)
		}
			escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ LOJA DevShoes ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
			
		para(inteiro x=0; x<5; ++x){
			cadeia linha2="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
			escreva(linha2)
		}
	}

	funcao apresentacao2 (){
		cadeia nomeLoja,slogan
		escreva("\n ")
		escreva("\n ")
		nomeLoja = "\t\t\tLoja DevShoes"
		slogan = "- CodeStyle é vida!"
		escreva(nomeLoja)
		escreva(" ")
		escreva(slogan)

		escreva("\n ")
		
		escreva("\t\t\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
	}
	

	funcao perguntar(){
	caracter valor, s = 's', n = 'n'
	escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
	escreva("\t\t\t\t     S/N: ")
	leia(valor)
	escreva("\n")

	
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
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */