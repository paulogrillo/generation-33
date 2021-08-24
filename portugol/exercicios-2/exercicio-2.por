//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
//excedente.

programa{
	
	funcao inicio(){

		inteiro cod
		real salarioHora, valorHoraExtra, numeroHoras, numeroHorasExcedentes, salarioTotal

		salarioHora = 10.0
    		valorHoraExtra = 20.0
		
		escreva("Qual o código do funcionário: ")
		leia(cod)	
		escreva("Digite as horas trabalhas: ")
		leia(numeroHoras)

		se(numeroHoras>50){
		numeroHorasExcedentes = numeroHoras - 50
		salarioTotal = salarioHora * numeroHoras
		valorHoraExtra = valorHoraExtra * numeroHorasExcedentes

		escreva ("Salário total do funcionário do Cod: ", cod, " é R$: ", salarioTotal, " \n E o Salário excedente é R$: "+valorHoraExtra)
			
		}senao {
        	valorHoraExtra = 0
        	salarioTotal = salarioHora * numeroHoras
        
        	escreva ("O salário total do funcionário ", cod, " é de R$: "+salarioTotal+" \n E o Salário excedente é R$: ", valorHoraExtra)
    		}
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1054; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */