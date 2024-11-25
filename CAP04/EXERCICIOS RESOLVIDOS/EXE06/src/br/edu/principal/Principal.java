package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 06, capítulo 4
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		if (num % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
	}

}
