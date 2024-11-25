package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 03, capítulo 4
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		if (num1 > num2) {
			System.out.println("O primeiro número (" + num1 + ") é maior que o segundo número (" + num2 + ").");
		}
		else if (num2 > num1) {
			System.out.println("O segundo número (" + num2 + ") é maior que o primeiro número (" + num1 + ").");
		}
		else {
			System.out.println("Os números são iguais");
		}
	}

}
