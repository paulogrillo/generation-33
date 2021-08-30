// Loja DevShoes 
// Integrantes: Matheus, Paulo, Larissa, Fernando, Beatriz e Leonardo.
// ###### GENERATION BRASIL 2021 TURMA 33 #######
// SISTEMA QUE SIMULA UM E-COMMERCE



programa{
	inclua biblioteca Util

	funcao inicio(){
		//VETORES ***************************
		//vetor - produto
		cadeia nomeProduto[10]
		nomeProduto[0] = "Tênis Nike        "
		nomeProduto[1] = "Tênis Adidas      "
		nomeProduto[2] = "Tênis Puma        "
		nomeProduto[3] = "Camisa Nike       "
		nomeProduto[4] = "Camisa Lacoste    "
		nomeProduto[5] = "Camisa Supreme    "
		nomeProduto[6] = "Meia Nike         "
		nomeProduto[7] = "Meia Adidas       "
		nomeProduto[8] = "Bola de futebol   "  
		nomeProduto[9] = "Blusa moleton Nike"
		//vetor - valor do produto
		inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
          //vetor - estoque do produto
          inteiro estoqueProduto[10]={10,10,10,10,10,10,10,10,10,10}
          //vetor - código do produto
          inteiro codigoProduto[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
          //vetor - carrinho
          inteiro carrinho [10]={0,0,0,0,0,0,0,0,0,0}

		//VARIAVEIS **************
		inteiro lerCodigo
		inteiro qtaAdicionadoCarrinho
		caracter valor, s = 's', n = 'n'

         
         //Declaração do vetor e limite do laço
		const inteiro TAMANHO_VETOR=10 
			 inteiro vetor01[TAMANHO_VETOR]

			//Funções úteis
			apresentacao()
			Util.aguarde(500)
			apresentacao2()

			
				escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
				escreva("\t\t\t\t     S/N: ")
				leia(valor)
				escreva("\n")


			     
				se(valor == s ou valor == 'S'){
						escreva("LISTA DE PRODUTO\n")
				          escreva("\n")
				          escreva("COD"+"\tPRODUTO"+"\t\t\tVALOR" +"\t\tESTOQUE\n")
					 para(inteiro y=0; y<10; ++y){
				    		//cabeçalho LISTA DE PRODUTOS
				       	vetor01[y] = y
	          			escreva("G2-" +(y+1)+ " "+"\t" +nomeProduto[y]+"\t"+"R$ " +valorProduto[y]+ "\t\t"+estoqueProduto[y]+ "\n")
				       }


						
						escreva("\n")
						//Selecionar o produto
						escreva("\n")
						escreva("SELECIONE O CODIGO DO PRODUTO: ")
						leia(lerCodigo)

					para(inteiro x=0; x<10; ++x){
						se(lerCodigo==codigoProduto[x]){

				
							escreva ("COD "+codigoProduto[x]+"\t"+"PRODUTO "+nomeProduto[x]+" "+"VALOR "+valorProduto[x]+"\t"+"ESTOQUE "+estoqueProduto[x]+"\n")
							escreva ("\n")
							
							escreva("DIGITE A QUANTIDADE NECESSÁRIA: ")
							leia(qtaAdicionadoCarrinho)
							se(qtaAdicionadoCarrinho > estoqueProduto[x]){
								escreva("Não temos essa quantidade em estoque!")
							}senao se(qtaAdicionadoCarrinho < estoqueProduto[x] ou qtaAdicionadoCarrinho == estoqueProduto[x]){
								carrinho[x] = qtaAdicionadoCarrinho


							}
						}
					}
						escreva("CONTINUA A COMPRA S/N : ")
						leia(valor)
					/*	para(inteiro y=0; y<10; ++y){
						enquanto(valor == 's' ou valor == 'S'){
						
						escreva("LISTA DE PRODUTO\n")
				          escreva("\n")
				          escreva("COD"+"\tPRODUTO"+"\t\t\tVALOR" +"\t\tESTOQUE\n")
						 
					    		//cabeçalho LISTA DE PRODUTOS
					       	vetor01[y] = y
		          			escreva("G2-" +(y+1)+ " "+"\t" +nomeProduto[y]+"\t"+"R$ " +valorProduto[y]+ "\t\t"+estoqueProduto[y]+ "\n")
					       
						
						}
						}
				*/





























				       
				}senao se (valor == n ou valor == 'N'){
					escreva("Ok.. Até logo!")
					}senao{
						escreva("Valor digitado é inválido")
					}
				
			  
		
  
	
	//AQUI ACABA A FUNÇÃO MAIN
	
	
	}


			
			//AQUI SÃO AS FUNÇÕES ÚTEIS

			// Função do bloco - Apresentacao 1
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
 * @POSICAO-CURSOR = 3299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */