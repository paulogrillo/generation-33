//SPFC
//SANTOS
//PALMEIRAS
//CORINTHIANS
//pontos[] - inteiros
//rode os times e pergunte:
//G-ganhou, P-Perdeu ou E-empatou:
//g=3, p=0, e=1
//3 rodadas com todos os times
//ao final mostra o nome de cada time E total de pontos

programa{
	
	funcao inicio(){
		//Variáveis
		cadeia time[4]
		inteiro pontos[4]={0,0,0,0}
		caracter result = 'x'
		
		time[0]="SÃO PAULO"
		time[1]="SANTOS"
		time[2]="PALMEIRAS"
		time[3]="CORINTHIANS"

		para(inteiro x=1; x<=3; ++x){
			escreva("\nRodada N° "+x+" \n")
			escreva("Digite (G) ganhou (P) perdeu (E) empatou\n")
			escreva("\n")
			
		para(inteiro i=0; i<4; ++i){
			
			escreva("O time ",time[i]," ganhou a rodada? ")
			leia(result)
		
				se(result == 'G' ou result == 'g'){
					pontos[i]=pontos[i]+3
				}
				senao se(result== 'P' ou result == 'p'){
					pontos[i]=pontos[i]+0
				}
				senao se(result== 'E' ou result == 'e'){
					pontos[i]=pontos[i]+1
				}senao{
					pare
				}
			}

		}
				escreva("TABELA DE PONTOS\n")
				escreva("TIME\t\t\tPONTOSn")
				para(inteiro y=0; y<4; y++){
					escreva("\n")
					escreva(time[y]+"\t\t",pontos[0])
				}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */