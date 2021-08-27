programa{
	
	funcao inicio(){
		inteiro valor = 0
		cadeia carretaFuracao[6] 
		inteiro pontos[6]
		cadeia resposta=""
		carretaFuracao[0]="FOFÃO"
		carretaFuracao[1]="MICKEY"
		carretaFuracao[2]="CAPITÃO AMÉRICA"
		carretaFuracao[3]="POPEYE"
		carretaFuracao[4]="HOMEM-ARANHA"
		carretaFuracao[5]="LANTERNA ED"

		para(inteiro i=0; i<3; ++i){
			para(inteiro x=0; x<6; ++x){
				escreva(x+" - "+carretaFuracao[x]+"\n")
				escreva("Avalie de 1 a 4: ")
				leia(pontos[x])
			}
		}
		escreva("Digite a posição entre 0 e 5 : ")
		leia(valor)
		se(pontos[valor]==1){
			resposta="iniciate"
		}senao se(pontos[valor]==2){
		
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */