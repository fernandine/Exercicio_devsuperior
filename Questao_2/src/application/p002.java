package application;

import java.util.Scanner;

/*
 Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

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
