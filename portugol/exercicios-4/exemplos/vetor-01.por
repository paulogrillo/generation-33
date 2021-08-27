programa{
	
	funcao inicio(){
		//variaveis	
		real valores[5]
		real soma = 0.00

		para(inteiro i=0; i<=4; i++){
			escreva("Digite o valor: ",i+1,": ")
			leia(valores[i])
			limpa()	
		}

		para(inteiro i=0; i<=4; i++){
			
			escreva("\n--------------------------")
			escreva("\nVetor "+i+" Valores: "+valores[i])
			
			soma = soma + valores[i]
		}
		escreva("\nSoma = ",soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */