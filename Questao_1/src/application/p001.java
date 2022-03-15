package application;

import java.util.Scanner;

/*
  Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
ímpares entre A e B.
 */

public class p001 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor de A: ");
			int A = sc.nextInt();
			System.out.println("Digite o valor de B: ");
			int B = sc.nextInt();
			System.out.println("Os números ímpares entre " + A + " e " + B + " são: ");

			if(A % 2 == 0) { //Se A for número par.
				A+=1;
			} else {
				A+=2;
			}
			
				while(B>A) {
					System.out.println(A+" ");
					A+=2;
				} 
		}
	}
}


