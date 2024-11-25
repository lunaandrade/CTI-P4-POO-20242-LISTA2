package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 08, capítulo 4
		Scanner sc = new Scanner(System.in);
		double op, n1, n2, result;
		System.out.println("------------------------------");
		System.out.println("------------ MENU ------------");
		System.out.println("------------------------------");
		System.out.println("1 - Somar dois números");
		System.out.println("2 - Raiz quadrada de um número");
		System.out.println("------------------------------");
		System.out.print("Escolha uma opção do menu: ");
		op = sc.nextDouble();
		if (op == 1) {
			System.out.print("Digite o primeiro número: ");
			n1 = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			n2 = sc.nextDouble();
			result = n1 + n2;
			System.out.println("O resultado da soma é: " + result);
		}
		else if (op == 2) {
			System.out.print("Digite o número desejado: ");
			n1 = sc.nextDouble();
			result = Math.sqrt(n1);
			System.out.println("O resultado da raiz é: " + result);
		}
	}

}
