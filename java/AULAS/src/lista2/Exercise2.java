package lista2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner mySc = new Scanner(System.in);
		
		System.out.println("Valor de A");
		a = mySc.nextInt();
		System.out.println("Valor de B");
		b = mySc.nextInt();
		System.out.println("Valor de C");
		c = mySc.nextInt();
		
		
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}else if(a<=b && b<=c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}else if(a<=c && c<=b) {
			System.out.printf("%d, %d, %d",a,c,b);
		}else if(b<=a && b<=c && a<=c) {
			System.out.printf("%d, %d, %d",b,a,c);
		}else if(c<=a && c<=b && b<=a){
			System.out.printf("%d, %d, %d",c,b,a);
		}else {
			System.out.printf("%d, %d, %d",c,a,b);
		}
	}

}
