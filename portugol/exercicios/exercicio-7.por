//Um sistema de equações lineares do tipo: ax + bx = c / dx + ey = f 
// pode ser resolvido segundo mostrado abaixo : ver Imagem
//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.

programa{
	
	funcao inicio(){

		//Variáveis 
		real x,y,a,b,c,d,ee,f
		
		//Entrada de dados
		escreva("a: ")
		leia(a)
		
		escreva("b: ")
		leia(b)
		
		escreva("c: ")
		leia(c)
		
		escreva("d: ")
		leia(d)
		
		escreva("e: ")
		leia(ee)
		
		escreva("f: ")
		leia(f)
		
		//Processamento
		x = ((c*ee)-(b*f))/((a*ee)-(b*d))
		y = ((a*f)-(c*d))/((a*ee)-(b*d))

		//Saída de dados
		escreva ("x: " + x)
		escreva ("\ny: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */