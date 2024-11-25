package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 05, capítulo 4
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4;
		System.out.println("Digite três números em ordem crescente.");
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		n3 = sc.nextDouble();
		System.out.print("Digite um número (fora de ordem): ");
		n4 = sc.nextDouble();
		if (n4 > n3) {
			System.out.println("A ordem decrescente é: " + n4 + ", " + n3 + ", " + n2 + ", " + n1);
		}
		else if (n4 < n3 && n4 > n2) {
			System.out.println("A ordem decrescente é: " + n3 + ", " + n4 + ", " + n2 + ", " + n1);
		}
		else if (n4 < n2 && n4 > n1) {
			System.out.println("A ordem decrescente é: " + n3 + ", " + n2 + ", " + n4 + ", " + n1);
		}
		else {
			System.out.println("A ordem decrescente é: " + n3 + ", " + n2 + ", " + n1 + ", " + n4);
		}
	}

}
