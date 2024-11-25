package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 07, capítulo 4
		Scanner sc = new Scanner(System.in);
		double a, b, c, i;
		System.out.print("Digite um valor para 'i' (1, 2 ou 3): ");
		i = sc.nextDouble();
		System.out.print("Digite um valor para 'a': ");
		a = sc.nextDouble();
		System.out.print("Digite um valor para 'b': ");
		b = sc.nextDouble();
		System.out.print("Digite um valor para 'c': ");
		c = sc.nextDouble();
		if (i == 1) {
			if (a < b && a < c) {
				if (b < c) {
					System.out.println("A ordem crescente é: " + a + ", " + b + ", " + c);
				}
				else {
					System.out.println("A ordem crescente é: " + a + ", " + c + ", " + b);
				}
			}
			else if (b < c && b < a) {
				if (a < c) {
					System.out.println("A ordem crescente é: " + b + ", " + a + ", " + c);
				}
				else {
					System.out.println("A ordem crescente é: " + b + ", " + c + ", " + a);
				}
			}
			else {
				if (a < b) {
					System.out.println("A ordem crescente é: " + c + ", " + a + ", " + b);
				}
				else {
					System.out.println("A ordem crescente é: " + c + ", " + b + ", " + a);
				}
			}
		}
		else if (i == 2) {
			if (a < b && a < c) {
				if (b < c) {
					System.out.println("A ordem decrescente é: " + c + ", " + b + ", " + a);
				}
				else {
					System.out.println("A ordem decrescente é: " + b + ", " + c + ", " + a);
				}
			}
			else if (b < c && b < a) {
				if (a < c) {
					System.out.println("A ordem decrescente é: " + c + ", " + a + ", " + b);
				}
				else {
					System.out.println("A ordem decrescente é: " + a + ", " + c + ", " + b);
				}
			}
			else {
				if (a < b) {
					System.out.println("A ordem decrescente é: " + b + ", " + a + ", " + c);
				}
				else {
					System.out.println("A ordem decrescente é: " + a + ", " + b + ", " + c);
				}
			}
		}
		else {
			if (a > b && a > c) {
				System.out.println("A ordem desejada é: " + b + ", " + a + ", " + c);
			}
			else if (b > a && b > c) {
				System.out.println("A ordem desejada é: " + a + ", " + b + ", " + c);
			}
			else {
				System.out.println("A ordem desejada é: " + a + ", " + c + ", " + b);
			}
		}
	}

}
