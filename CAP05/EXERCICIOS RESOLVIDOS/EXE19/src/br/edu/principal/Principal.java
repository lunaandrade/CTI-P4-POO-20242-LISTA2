package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args){
		//Questão 19, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double m, n, soma = 0, cont;
		
		System.out.println("Digite um número inteiro e positivo: ");
		m = sc.nextDouble();
		System.out.println("Digite outro número inteiro e positivo: ");
		n = sc.nextDouble();
		
		while (m < n) {
			soma = 0;
			for (cont = m; cont <= n;cont++) {
				soma = (soma + cont);
			}
		System.out.println("A soma foi " + soma);
		System.out.println("Digite um número inteiro e positivo: ");
		m = sc.nextDouble();
		System.out.println("Digite outro número inteiro e positivo: ");
		n = sc.nextDouble();
		}
	}

}
