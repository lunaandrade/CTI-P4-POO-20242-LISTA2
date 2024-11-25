package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 03, capítulo 5
		Scanner sc = new Scanner(System.in); 
		int n, num, i, j, fat;
				
		System.out.print("A quatidade de entradas): ");
        n = sc.nextInt();
        
        while (n <= 0) {
            System.out.print("Digite um número positivo: ");
            n = sc.nextInt();
        }
        
        for (i = 1; i <= n; i++) {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
            
            while (num <= 0) {
                System.out.print("Digite um número positivo: ");
                num = sc.nextInt();
            }
            
            fat = 1;
            for (j = 1; j <= num; j++) {
                fat = fat * j;
            }
            
            System.out.println("Número: " + num + " | Fatorial: " + fat);
        }
    }
}