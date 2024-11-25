package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 10, capítulo 4
		Scanner sc = new Scanner(System.in);
		int a1, a2, m1, m2, d1, d2;
		System.out.println("---------------------------");
		System.out.print("Digite o primeiro ano: ");
		a1 = sc.nextInt();
		System.out.print("Digite o primeiro mês: ");
		m1 = sc.nextInt();
		System.out.print("Digite o primeiro dia: ");
		d1 = sc.nextInt();
		System.out.println("---------------------------");
		System.out.print("Digite o segundo ano: ");
		a2 = sc.nextInt();
		System.out.print("Digite o segundo mês: ");
		m2 = sc.nextInt();
		System.out.print("Digite o segundo dia: ");
		d2 = sc.nextInt();
		System.out.println("---------------------------");
		if (a1 > a2) {
			System.out.println("A primeira data (" + d1 + "/" + m1 + "/" + a1 + ") é maior que a segunda data ("  + d2 + "/" + m2 + "/" + a2 + ")");
		}
		else if (a2 > a1) {
			System.out.println("A segunda data (" + d2 + "/" + m2 + "/" + a2 + ") é maior que a primeira data ("  + d1 + "/" + m1 + "/" + a1 + ")");
		}
		else {
			if (m1 > m2) {
				System.out.println("A primeira data (" + d1 + "/" + m1 + "/" + a1 + ") é maior que a segunda data ("  + d2 + "/" + m2 + "/" + a2 + ")");
			}
			else if (m2 > m1) {
				System.out.println("A segunda data (" + d2 + "/" + m2 + "/" + a2 + ") é maior que a primeira data ("  + d1 + "/" + m1 + "/" + a1 + ")");
			}
			else {
				if (d1 > d2) {
					System.out.println("A primeira data (" + d1 + "/" + m1 + "/" + a1 + ") é maior que a segunda data ("  + d2 + "/" + m2 + "/" + a2 + ")");
				}
				else if(d2 > d1) {
					System.out.println("A segunda data (" + d2 + "/" + m2 + "/" + a2 + ") é maior que a primeira data ("  + d1 + "/" + m1 + "/" + a1 + ")");
				}
				else {
					System.out.println("As datas são iguais.");
				}
			}
		}
	}

}
