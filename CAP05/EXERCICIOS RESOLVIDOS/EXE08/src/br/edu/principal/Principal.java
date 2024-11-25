package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 08, capítulo 5
Scanner sc = new Scanner(System.in);
        
int num_termos = 15;
int num1 = 2, num2 = 7, num3 = 3;
int i = 4;

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);

while (i <= num_termos) {
    num1 *= 2;
    System.out.println(num1);
    i++;

    if (i <= num_termos) {
        num2 *= 3;
        System.out.println(num2);
        i++;
    }

    if (i <= num_termos) {
        num3 *= 4;
        System.out.println(num3);
        i++;
    }
}
}
}