//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
// e apresente também quantas foram as ocorrências da maior pontuação.



programa{
	inclua biblioteca Util
	funcao inicio(){
		inteiro lances[10]
		inteiro numeroDado=0
		inteiro maiorPonto=0
		inteiro contador=0
		
		real media=0.0, total=0.0

		//lançar 10 vezes o dado
		para(inteiro x=0; x<10; ++x){
			//Carga de vetor
			numeroDado = Util.sorteia(1,6)
			
			//saídas
			lances[x]= numeroDado
			escreva("Lançamento n°"+(x+1)+" Pontuação = "+lances[x]+"\n")
			
			//Somando os lances para calcular a média
			total = total + lances[x]
			
			se(lances[x] >= maiorPonto){
				se(maiorPonto == lances[x]){
					contador++
				}senao{
					contador=1
				}
				maiorPonto =lances[x]
			}
		}
		
		//determine e imprima a média aritmética dos lançamentos
		media = total/10.0
		escreva("\nA média de lançamentos é "+media+"%\n")
		escreva("\nO maior número saiu: "+contador, " vezes. \n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1089; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */