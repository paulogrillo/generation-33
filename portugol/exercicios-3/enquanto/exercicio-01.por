// ENQUANTO

//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

programa{
	
	funcao inicio(){
		//Variáveis base
		inteiro valoresN = 1
		inteiro total = 0
		real media = 0.00
		inteiro contador = 0


		enquanto(valoresN > 0){
			escreva("Digite um valor posito: ")
			leia(valoresN)
			
			se(valoresN < 0){
				pare
			}
			//Somatória
			total=total+valoresN
			
			//Contador
			contador = contador++

			//Média
			media = total/contador
			
		
		}
		escreva("O sistema finalizou, porque você digitou um número negativo!")
		escreva("\nSomatória: ",total)
		escreva("\nA Média: ",media)
		escreva("\nTotal de valores lidos: ",contador)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */