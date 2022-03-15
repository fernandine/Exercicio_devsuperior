package application;

import java.util.Scanner;

/*
 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

public class p006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero qualquer de 0 a 100");
		int num = sc.nextInt();
		
		if (num < 0.0 || num > 100.0) {
			System.out.println("Fora de intervalo.");
		} else  if (num >=75.0){
			System.out.println("(75,100]");
		} else if (num >=50.0) {
			System.out.println("(50,75]");
		}	else if (num >=25.0) {
				System.out.println("(25,50]");
		} else {
			System.out.println("(0,25]");
			sc.close();
		}

	}

}
