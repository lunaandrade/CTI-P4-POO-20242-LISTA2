package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 18, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double num, num_pec, quad = 0, cubo = 0, raiz = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		
		while (num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
			
			System.out.println("Seu quadrado é " + quad + ", seu cubo é " + cubo + "e sua raíz é " + raiz);
			System.out.println("Digite um número: ");
			num = sc.nextDouble();
		}
	}

}