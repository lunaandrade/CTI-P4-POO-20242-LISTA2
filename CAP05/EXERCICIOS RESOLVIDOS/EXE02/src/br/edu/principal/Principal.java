package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 02, capítulo 5
		Scanner sc = new Scanner(System.in); 
		int num, i, j;
		double e, fat;
		
		System.out.print("Digite um numero: ");
        num = sc.nextInt();
        
        e = 1;  
        for(i = 1; i <= num; i++) {  
            fat = 1;
            for(j = 1; j <= i; j++) {  
                fat = fat * j;  
            }
            e = e + 1.0/ fat;  
        }
        
        System.out.println("O valor aproximado de e é: " + e);  
    }
}