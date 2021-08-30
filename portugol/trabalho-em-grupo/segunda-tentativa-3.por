programa{
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
	cadeia entradaProdutoCodigo=""
	inteiro entradaProdutoQuantidade = 0
	inteiro carrinhoQuantidade = 0
	inteiro carrinhoProduto[2] 
	inteiro carrinhoProdutoQtd[2]
	
	//vetor - valor do produto
	//inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
	//inteiro estoqueProduto[10]
	logico desejaComprar=verdadeiro, continuarCompra=falso
	inteiro opcao=0
	caracter continuar =' '
	funcao inicio(){
				//vetor - produto
		
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
				//fazer chamada fazer comprar]
				logico temEspacoCarrinho = verdadeiro
				enquanto(temEspacoCarrinho e (continuar == ' ' ou continuar == 's' ou continuar == 'S')) {
					fazerCompra()
					escreva("\n\n\n")
					temEspacoCarrinho = Util.numero_elementos(codigoProduto) >= carrinhoQuantidade
					se (temEspacoCarrinho == falso){
						escreva("\tOpa!")
						pare
					} senao {
						escreva("\tCONTINUAR A COMPRANDO? S/N : ")
						leia(continuar)
					}

				}
				
				desejaComprar = falso
			}
			
			se(desejaComprar == falso){
				escreva("Até breve!")
			}
		
		
	}//@ACABA AQUI  A FUNÇÃO MAIN 


	funcao fazerCompra() {
		cabecalho()
		listarProduto()
		escreva("\n")
		
		selecionaProduto()		
	}

	funcao selecionaProduto(){
			
			escreva("\tExemplo: G2-1 - Tênis Nike")
			escreva("\n")
			escreva("\tSELECIONE O CODIGO DO PRODUTO: ")
			leia(entradaProdutoCodigo)
			
			escreva("ESCOLHA QUANTIDADE: ")
			leia(entradaProdutoQuantidade)
			
			carrinhoProduto[carrinhoQuantidade] = recuperarPosicaoDoProduto(entradaProdutoCodigo)
			carrinhoProdutoQtd[carrinhoQuantidade] = entradaProdutoQuantidade
			carrinhoQuantidade = carrinhoQuantidade + 1
	}

	funcao inteiro recuperarPosicaoDoProduto(cadeia valor) {

		para(inteiro i =0; i < Util.numero_elementos(codigoProduto); i++) {
			se (valor == codigoProduto[i] ) {
				retorne i
			}
		}
		retorne -1
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
 * @POSICAO-CURSOR = 1532; 
 * @PONTOS-DE-PARADA = 68, 71;
 * @SIMBOLOS-INSPECIONADOS = {codigoProduto, 9, 8, 13}-{estoqueProduto, 19, 9, 14}-{carrinhoQuantidade, 26, 9, 18}-{carrinhoProduto, 27, 9, 15}-{carrinhoProdutoQtd, 28, 9, 18};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */