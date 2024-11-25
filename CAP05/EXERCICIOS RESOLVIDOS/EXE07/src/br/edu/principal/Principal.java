package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 07, capítulo 5
		Scanner sc = new Scanner(System.in); 
        double cont = 0, num1 = 0, num2 = 1, res;
        
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);
        
        while (cont < 9) {
            res = num1 + num2;
            System.out.println("Número da sequência: " + res );
            num1 = num2;
            num2 = res;
            cont++;
        }   
    }
}