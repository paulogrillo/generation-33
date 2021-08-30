programa{
	//SEGUNDA TENTATIVA
	inclua biblioteca Util
	cadeia nomeProduto[] = {
		"Tênis Nike        ", 
		"Tênis Adidas      ", 
		"Tênis Puma        "
		}
	cadeia codigoProduto[] = {
		"G2-1", 
		"G2-2", 
		"G2-3"
		}
	inteiro valorProduto[] = {
		200, 
		150, 
		100
		}
	inteiro estoqueProduto[] = {
		10, 
		10, 
		10
		}
	cadeia codigoEscolhido="x"
	inteiro qtaAdicionadoCarrinho[]
	//vetor - valor do produto
	//inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
	//inteiro estoqueProduto[10]
	logico desejaComprar=verdadeiro, continuarCompra=falso
	inteiro opcao=0
	caracter continuar =' '
	funcao inicio(){
				//vetor - produto
		/*
		nomeProduto[0] = "Tênis Adidas      "
		nomeProduto[1] = "Tênis Adidas      "
		nomeProduto[2] = "Tênis Puma        "
		nomeProduto[3] = "Camisa Nike       "
		nomeProduto[4] = "Camisa Lacoste    "
		nomeProduto[5] = "Camisa Supreme    "
		nomeProduto[6] = "Meia Nike         "
		nomeProduto[7] = "Meia Adidas       "
		nomeProduto[8] = "Bola de futebol   "  
		nomeProduto[9] = "Blusa moleton Nike"

          //vetor - código do produto
         
		codigoProduto [0] = "G2-1"
		codigoProduto [1] = "G2-2"	
		codigoProduto [2] = "G2-3"
		codigoProduto [3] = "G2-4"
		codigoProduto [4] = "G2-5"
		codigoProduto [5] = "G2-6"
		codigoProduto [6] = "G2-7"
		codigoProduto [7] = "G2-8"
		codigoProduto [8] = "G2-9"
		codigoProduto [9] = "G2-10"

		//vetor - Carrinho
		cadeia carrinho[10]
		carrinho[0] = " "
		carrinho[1] = " "
		carrinho[2] = " "
		carrinho[3] = " "
		carrinho[4] = " "
		carrinho[5] = " "
		carrinho[6] = " "
		carrinho[7] = " "
		carrinho[8] = " "
		carrinho[9] = " "
		
		//vetor - Adicionado ao Carrinho
		
		qtaAdicionadoCarrinho[0] = 0
		qtaAdicionadoCarrinho[1] = 0
		qtaAdicionadoCarrinho[2] = 0
		qtaAdicionadoCarrinho[3] = 0
		qtaAdicionadoCarrinho[4] = 0
		
		
          
          //vetor - estoque do produto
          
          estoqueProduto[0] = 10
		estoqueProduto[1] = 10
		estoqueProduto[2] = 10
		estoqueProduto[3] = 10
		estoqueProduto[4] = 10
		estoqueProduto[5] = 10
		estoqueProduto[6] = 10
		estoqueProduto[7] = 10
		estoqueProduto[8] = 10
		estoqueProduto[9] = 10
		*/
		//VARIAVEIS ********************************************
		inteiro x=0 
		real total = 0.0, totalFinal = 0.0
		
 // opcaoPgto= 'x'



		//@função inicio
			apresentacao()
			Util.aguarde(500)
			apresentacao2()

			escreva("Deseja fazer uma compra? \n")
			escreva("1-SIM / 2-NAO")
			leia(opcao)

			
			se(opcao == 2){
				desejaComprar = falso
			}senao se(opcao ==1){
				desejaComprar = verdadeiro
				//fazer chamada fazer comprar
				enquanto(continuar == ' ' ou continuar == 's' ou continuar == 'S') {
					fazerCompra()
					escreva("\n\n\n")
					escreva("\tCONTINUAR A COMPRANDO? S/N : ")
					leia(continuar)
				}
			}
			se(desejaComprar == falso){
				escreva("Até breve!")
			}senao{

			
/*
			enquanto(continuar == ' ' ou continuar == 's' ou continuar == 'S'){	//cabeçalho LISTA DE PRODUTOS

				
				cabecalho()
				listarProduto()
				escreva("\n")
				
				selecionaProduto()		
				
				escreva("\n\n\n")
				escreva("\tCONTINUAR A COMPRANDO? S/N : ")
				leia(continuar)
				
			}*/				
			
					
		}
	
		
		
	}//@ACABA AQUI  A FUNÇÃO MAIN 


	funcao fazerComprar() {
		cabecalho()
		listarProduto()
		escreva("\n")
		
		selecionaProduto()		
	}

	funcao selecionaProduto(){
			
			escreva("\tExemplo: G2-1 - Tênis Nike")
			escreva("\n")
			escreva("\tSELECIONE O CODIGO DO PRODUTO: ")
			leia(codigoEscolhido)
			
			escreva("ESCOLHA QUANTIDADE: ")
			
			leia()
			qtaAdicionadoCarrinho. = codigoEscolhido

		
	}

						
			funcao cabecalho(){
				
				escreva("Cabeçalho\n")
				
								
			}
			// Função do bloco - Apresentacao 1
			funcao listarProduto(){
				para(inteiro y=0; y < Util.numero_elementos(nomeProduto); y++) {
					escreva(
						codigoProduto[y]+"\t" +
						nomeProduto[y]+"\t"+
						"R$ " +valorProduto[y]+ "\t\t"+
						estoqueProduto[y]+ "\n")
				}
				/*
				para(inteiro y=0; y<10; y++){
	          	escreva(codigoProduto[y]+"\t" +nomeProduto[y]+"\t"+"R$ " +valorProduto[y]+ "\t\t"+estoqueProduto[y]+ "\n")
				
					
					}*/	
			}
			
			
			
			funcao apresentacao(){
				para(inteiro x=0; x<5; ++x){
					cadeia linha1="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
					escreva(linha1)
				}
					escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ LOJA DevShoes ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
					
				para(inteiro x=0; x<5; ++x){
					cadeia linha2="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
					escreva(linha2)
				}
			}
			// Função do bloco - Apresentacao 2
			funcao apresentacao2 (){
				cadeia nomeLoja,slogan
				escreva("\n ")
				escreva("\n ")
				nomeLoja = "\t\t\tLoja DevShoes"
				slogan = "- CodeStyle é vida!"
				escreva(nomeLoja)
				escreva(" ")
				escreva(slogan)
		
				escreva("\n ")
				
				escreva("\t\t\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
			}





	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */