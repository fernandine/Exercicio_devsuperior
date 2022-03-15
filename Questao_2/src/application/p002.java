package application;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

 */
public class p002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		if(num<0) {
			System.out.println("Negativo");
		}else
			System.out.println("Positivo");
	
		entrada.close();
	}
	
}
