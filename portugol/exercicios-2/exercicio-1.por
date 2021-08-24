//João, homem de bem, comprou um microcomputador para controlar o rendimento diário
//de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
//regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
//excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
//verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
//da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
//ZERO.

programa{
	
	funcao inicio(){

		//Variáveis
		real pesoTomate, pesoEstabelecido, excesso, multa
		multa=0
		excesso=0
		pesoEstabelecido = 50.00
		
		//Entrada de dados
		escreva("Digite a quantidade de kilos: ")
		leia(pesoTomate)
		//Processamento
		se(pesoTomate > 50.00 ){
			excesso = pesoTomate - pesoEstabelecido
			multa = excesso * 4
			escreva("O excesso é ",excesso,"Kg e a multa é R$ ",multa)
		}senao {
			escreva("O peso excesso é ",excesso,"Kg então a multa é R$ ",multa)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */