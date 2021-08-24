//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
//excedente.

programa{
	
	funcao inicio(){

		inteiro cod
		real horas, extra, salario ,ex
		
		escreva("Qual o código do funcionário: ")
		leia(cod)	
		escreva("Digite as horas que ele trabalhou: ")
		leia(horas)

		se(horas>50){
			extra = horas - 50
			salario = 500 + extra * 20
		}senao {
			salario = horas * 10
			extra = 0
		}
		escreva("O funcionário Cod:", cod, " terá o salário de R$ ", salario," \n Salário excedente: ",extra) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 762; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */