package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//Questão 05, capítulo 5
		Scanner sc = new Scanner(System.in);
	       double fim = 0, i, j, x, s = 0, expoente, num_termos, den = 0, denominador = 1, fat;
	        
	        System.out.print("Digite a quantidade de números: ");
	        num_termos = sc.nextDouble();
	        System.out.print("Digite um número positivo: ");
	        x = sc.nextDouble();
	        
	        while(x < 0) {
	            System.out.print("Digite um número positivo: ");
	            x = sc.nextDouble();
	        }
	        
	        for(i = 1; i <= num_termos; i++) {
	            fim = denominador;
	            fat = 1;
	            
	            for(j = 1; j <= fim; j++) {
	                fat = fat * j;
	            }
	            
	            expoente = i + 1;
	            
	            if (expoente % 2 == 0) {
	                s -= (Math.pow(x, expoente)) / fat;
	            } 
	            else {
	                s += (Math.pow(x, expoente)) / fat;
	            }
	            
	            if (denominador == 4) {
	                den = -1;
	            }
	            if (denominador == 1) {
	                den = 1;
	            }
	            
	            if (den == 1) {
	                denominador = denominador + 1;
	            } 
	            else {
	                denominador = denominador - 1;
	            }
	        }
	        
	        System.out.println("Resultado: " + s);
	        
	    }
	}
