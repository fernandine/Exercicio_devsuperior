package application;

import java.util.Scanner;

/*
 Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
 */

public class p003 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int A = entrada.nextInt();
		System.out.println("Digite o  valor de B: ");
		int B = entrada.nextInt();
	

	if(A%B == 0 || B%A == 0) {
		System.out.println("S�o M�ltiplos!");
	}else {
		
		System.out.println("N�o s�o M�ltiplos!");
		}
	entrada.close();
}
}