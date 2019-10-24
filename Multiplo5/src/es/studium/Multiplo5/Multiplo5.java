package es.studium.Multiplo5;

import java.util.Scanner;

public class Multiplo5 {

	public static void main(String[] args) {
	
		int a,b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el valor del número 1:");
		a=teclado.nextInt();
		System.out.println("Introduzca el valor del número 2:");
		b=teclado.nextInt();
		
		if(a<b) {
			for(int i=a; i<=b; i++) 
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
				
			}
		}
		else 
		{
			System.out.println("ERROR");
		}
		
		teclado.close();
	}

}
