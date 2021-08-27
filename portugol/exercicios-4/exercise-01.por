//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

programa{
	
	funcao inicio(){
		inteiro valorPontuacao[5]
		inteiro maiorValor = 0

		para(inteiro i=0; i<5; ++i){
			escreva(i+1+"° Rodada Digite a pontuação")
			leia(valorPontuacao[i])

			se(valorPontuacao[i] > maiorValor){
				maiorValor = valorPontuacao[i]	
			}
		}
		escreva("Maior pontuação foi ",maiorValor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */