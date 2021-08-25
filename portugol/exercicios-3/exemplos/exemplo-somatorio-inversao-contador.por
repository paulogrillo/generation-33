programa{
	
	funcao inicio(){
	cadeia nomeAlune
	caracter pronomeAlune
	
	real nota, media, soma = 0.00
	real maiorNota = 0.00
	real quantosAcima05 = 0.00
	real percentualAcima05 =  0.00
	
		escreva("Olá, tudo bem? Digite seu nome: ")
		leia(nomeAlune)
		escreva("Digite seu pronome: (a)(o)(u): ")
		leia(pronomeAlune)	
		
		para(inteiro x=1; x<=5; x++){
			escreva("Digite a nota 01: ")
			leia(nota)

			//Somatório
			soma = soma + nota
			//Inversão
			se (nota > maiorNota){
				maiorNota = nota
			}
			//Contador
			se(nota >= 5){
				quantosAcima05 = quantosAcima05 + 1
			}
		percentualAcima05 = percentualAcima05 / 5 * 100
		}media = (soma / 5)		
		se(media <5.00){
			escreva("Oi ",nomeAlune," a sua média: ", media, " você será recuperad", pronomeAlune," em notas!!")
			
		}senao se(media >= 5){
			escreva("Oi ",nomeAlune," a sua média: ",media, " você será aproved", pronomeAlune," em notas!!")
			}
		escreva("\nmaior nota é ",maiorNota)
		escreva("\nquantidade de notas acima de 5: ",quantosAcima05)
		escreva("\npercentual acima de 5 ",percentualAcima05)
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 920; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */