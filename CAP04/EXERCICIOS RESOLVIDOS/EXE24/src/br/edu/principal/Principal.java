package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 24, capítulo 4
		  Scanner sc = new Scanner(System.in); 
	        double preço, valor_adicional = 0, imposto, pre_custo, desconto, novo_preço;
	        String tipo, refri;

	        System.out.print("Digite o preço: ");
	        preço = sc.nextDouble(); 
	        
	        System.out.print("O produto vai precisar ser refrigerado? 'S' para sim e 'N' para não: ");
	        refri = sc.next(); 
	        
	        System.out.print("Digite o tipo 'A' para alimentos, 'V' para vestuário e 'L' para limpeza: ");
	        tipo = sc.next(); 

	        if (refri.equals("N")) {
	            if (tipo.equals("A")) {
	                if (preço < 15) {
	                    valor_adicional = 2.00;
	                } 
	                else {
	                    valor_adicional = 5.00; 
	                }
	            } 
	            else if (tipo.equals("L")) {
	                if (preço < 10) {
	                    valor_adicional = 1.50;
	                }
	                else {
	                    valor_adicional = 2.50;
	                }
	            } 
	            else if (tipo.equals("V")) {
	                if (preço < 30) {
	                    valor_adicional = 3.00;
	                } 
	                else {
	                    valor_adicional = 2.50;
	                }
	            }
	        } 
	        else if (refri.equals("S")) {
	            if (tipo.equals("A")) {
	                valor_adicional = 8.00;  
	            } 
	            else if (tipo.equals("L") || tipo.equals("V")) {
	                valor_adicional = 0.00;  
	            }
	        }

	        System.out.println("Valor adicional: " + valor_adicional);

	        if (preço < 25) {
	            imposto = 5.0 / 100 * preço;  
	        } else {
	            imposto = 8.0 / 100 * preço; 
	        }
	        System.out.println("Valor do imposto: " + imposto);

	        pre_custo = preço + imposto;
	        System.out.println("Valor do preço de custo: " + pre_custo);

	        if (!(tipo.equals("A") || refri.equals("S"))) {
	            desconto = 3.0 / 100 * pre_custo;  
	        } 
	        else {
	            desconto = 0.0;
	        }
	        System.out.println("Valor do desconto: " + desconto);

	        novo_preço = pre_custo + valor_adicional - desconto;
	        System.out.println("Valor do novo preço: " + novo_preço);

	        if (novo_preço <= 50) {
	            System.out.println("Barato");
	        } 
	        else if (novo_preço < 100) {
	            System.out.println("Normal");
	        } 
	        else {
	            System.out.println("Caro");
	        }

	    }
}