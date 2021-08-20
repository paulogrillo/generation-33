//Faça um sistema que leia o tempo de duração de um evento em uma 
//fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

programa{
	
	funcao inicio(){
	//Variaveis 	
	inteiro horas, minutos, segundos, segEvento
	
	//Entrada de dados
	escreva("Tempo de duração de um evento em uma fábrica: ")
	leia(segundos)

	//Processamento
	horas=(segundos/3600)
	minutos=((segundos%3600) /60)
	segEvento=((segundos % 3600)% 60)
	
	//Saída
	escreva("A duração do evento foi: " +horas+" Horas, "+minutos+" Minutos e "+segEvento+ " segundos.")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */