//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

programa
{
	
	funcao inicio(){
		inteiro primeiraNota, segundaNota, terceiraNota, media, mediaPond

		escreva("Digite a primeira nota ")
		leia(primeiraNota)

		escreva("Digite a segunda nota ")
		leia(segundaNota)

		escreva("Digite a terceira nota ")
		leia(terceiraNota)

		media = (primeiraNota*2)+(segundaNota*3)+(terceiraNota*5)
		mediaPond = media/10

		escreva("A média ponderada é "+mediaPond)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */