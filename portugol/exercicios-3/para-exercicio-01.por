//Lista de exercícios (Laço de repetição)

//Problema > PARA

//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.

programa{
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
		
		//variáveis base
		real salario = 0.00
		inteiro numeroFilhos = 0

		//variáveis Somatória
		real somaFilhos = 0.00
		inteiro somaSalario = 0
		
		//Variáveis Médias
		real  mediaSalario = 0.00
		real maiorSalario = 0.00
		real mediaNumeroFilhos = 0.00
		
		//Veriáveis Percentuais
		real percentualAte100 = 0.00
		real  percentualAcima
		real ate100 = 0.00


		//Variáveis inicializadoras
		inteiro habitantes = 20
		inteiro contador = 20


		para(inteiro x=1; x<=habitantes; x++){
			
			//Entrada de dados
			escreva(x,"°"," candidato:\n")
			escreva("Salário : ")
			
			leia(salario)
			escreva("Quantidade de filhos : ")
			leia(numeroFilhos)
			
			//Totalizando Salario e Filhos
			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + numeroFilhos

			// Maior salário
			se(salario > maiorSalario){
			maiorSalario = salario
			}
			
			//Percentual > R$ 100)
			se(salario <= 100){
				ate100 = ate100 + 1
			}

		}

		//Percentual até 10
		percentualAte100 = (ate100/habitantes)*100.00
		
		//Media de filhos
		mediaNumeroFilhos = (somaFilhos/habitantes)
		
		//Media Salarial
		mediaSalario = (somaSalario/habitantes)
		
		escreva("--------------------------------")
		escreva("\nMédia salarial R$ ",mat.arredondar(mediaSalario,4))
		escreva("\n--------------------------------")
		escreva("\nMédia de filhos: ",mediaNumeroFilhos)
		escreva("\n--------------------------------")
		escreva("\nMaior saláro é  R$",maiorSalario)
		escreva("\n--------------------------------")
		escreva("\nPercentual de pessoas com salário até (R$100): ",mat.arredondar(percentualAte100,2),"%")
		escreva("\n--------------------------------")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 853; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */