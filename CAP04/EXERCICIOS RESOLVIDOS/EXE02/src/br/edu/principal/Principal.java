package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 02, capítulo 4
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, med, exame;
		System.out.print("Digite sua primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("Digite sua terceira nota: ");
		n3 = sc.nextDouble();
		med = (n1 + n2 + n3) / 3;
		if (med >= 0 && med < 3) {
			System.out.println("Você for reprovado!");
		}
		else if (med >= 3 && med < 7) {
			exame = 12 - med;
			System.out.println("Você deve fazer o exame e tirar " + exame + " ou mais para passar!");
		}
		else {
			System.out.println("Você for aprovado!");
		}
	}

}
