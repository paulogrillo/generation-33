//Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

programa{
	
	funcao inicio(){
		inteiro n1,n2,n3,n4, q1,q2,q3,q4

		escreva("Digite o primeiro numero: ")
		leia(n1)
		escreva("Digite o primeiro numero: ")
		leia(n2)
		escreva("Digite o primeiro numero: ")
		leia(n3)
		escreva("Digite o primeiro numero: ")
		leia(n4)
		escreva("Digite o primeiro numero: ")

		q1=n1*n1
		q2=n2*n2
		q3=n3*n3
		q4=n4*n4

		se(q3>1000){
			escreva("O valor do quadrado do terceiro numero é: ",q3)
		}senao{
			escreva("\n")
			escreva("O valor do quadrado do primeiro numero é ",q1)
			escreva("\nO valor do quadrado do segundo numero é ",q2)
			escreva("\nO valor do quadrado do terceiro numero é ",q3)
			escreva("\nO valor do quadrado do quarto numero é ",q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */