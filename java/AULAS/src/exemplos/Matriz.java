package exemplos;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		
		Scanner mySc = new Scanner(System.in);
		Random renerator = new Random();

        int somaTotal=0; 
        int somaDiagonal=0;

        
        for (int x=0; x<3; x++){
            
        	for (int y=0; y<3; y++){
    
        		matriz[x][y] = renerator.nextInt(); 
        		
                somaTotal += (matriz[x][y]);
                
                if(x == y) {
                	somaDiagonal = somaDiagonal + matriz[x][y];
                }
            }
        }

        somaDiagonal = ((matriz[0][0])+(matriz[1][1])+(matriz[2][2]));
        System.out.printf("\nA soma total é de: ", somaTotal);
        System.out.printf("\nA soma da diagonal principal é de: ", somaDiagonal, "\n");
       
    }

	

}
