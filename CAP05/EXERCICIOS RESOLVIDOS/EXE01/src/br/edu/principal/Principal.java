package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 01, capítulo 5
		Scanner sc = new Scanner(System.in); 
		double i, ano_atual, salario, novo_salario, percentual;
		
		 System.out.print("Digite o ano atual: ");
	        ano_atual = sc.nextDouble();
	        
	        salario = 1000;
	        percentual = 1.5 / 100;  
	        novo_salario = salario; 
	        
	        for(i = 2007; i <= ano_atual; i++) {
	            novo_salario += novo_salario * percentual;
	            percentual *= 2;
	        }
	        
	        System.out.println("O novo salário é: " + novo_salario);
	    }
	}