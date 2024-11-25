package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 01, capítulo 4
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, med;
		System.out.print("Digite sua primeira nota (trabalho de laboratório): ");
		n1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota (avaliação semestral): ");
		n2 = sc.nextDouble();
		System.out.print("Digite sua terceira nota (exame final): ");
		n3 = sc.nextDouble();
		med = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		if (med >= 8 && med <= 10) {
			System.out.println("Você obteve o conceito A");
		}
		else if (med >= 7 && med < 8) {
			System.out.println("Você obteve o conceito B");
		}
		else if (med >= 6 && med < 7) {
			System.out.println("Você obteve o conceito C");
		}
		else if (med >= 5 && med < 6) {
			System.out.println("Você obteve o conceito D");
		}
		else if (med >= 0 && med < 5) {
			System.out.println("Você obteve o conceito E");
		}
		else {
			System.out.println("Nota inválida");
		}
	}

}
