//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//ou seja, diagonal principal
programa
{

    funcao inicio(){
        inteiro matriz[3][3], linha, coluna, somaTotal=0, somaDiagonal=0

        para (linha=0; linha<3; linha++)
        {
            para (coluna=0; coluna<3; coluna++)
            {
                escreva("Valor: ")
                leia(matriz[linha][coluna])
                somaTotal += (matriz[linha][coluna])
            }
        }

        limpa()

        para (linha=0; linha<3; linha++)
        {
            para (coluna=0; coluna<3; coluna++)
            {
                escreva("[ ", matriz[linha][coluna], " ]")
            }
            escreva("\n")
        }
        somaDiagonal = ((matriz[0][0])+(matriz[1][1])+(matriz[2][2]))
        escreva("\nA soma total é de: ", somaTotal)
        escreva("\nA soma da diagonal principal é de: ", somaDiagonal, "\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */