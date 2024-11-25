package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 11, capítulo 5
		  Scanner sc = new Scanner(System.in);
	        int num, qtde;

	        System.out.print("Digite um número: ");
	        num = sc.nextInt();

	        while (num <= 1) {
	            System.out.print("Digite um número maior que 1: ");
	            num = sc.nextInt();
	        }

	        qtde = 0;

	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                qtde++;
	            }
	        }

	        if (qtde == 2) {
	            System.out.println("O número é primo");
	        } else {
	            System.out.println("O número não é primo");
	        }

	        sc.close();
	    }
	}