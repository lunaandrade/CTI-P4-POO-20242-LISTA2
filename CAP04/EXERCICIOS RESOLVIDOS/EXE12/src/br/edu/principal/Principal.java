package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 12, capítulo 4
		Scanner sc = new Scanner(System.in);
		double code, sal, aum, novo_sal;
		System.out.print("Digite seu código: ");
		code = sc.nextDouble();
		System.out.print("Digite o valor de seu salário: ");
		sal = sc.nextDouble();
		System.out.println("---------------------------------------");
		
		if (code == 1) {
			System.out.println("Seu cargo é 'Escriturário'.");
			aum = sal * 50 / 100;
			novo_sal = sal + aum;
			System.out.println("O valor de seu aumento é de " + aum + " reais.");
			System.out.println("Seu novo salário é: " + novo_sal + " reais.");
			
		}
		else if (code == 2) {
			System.out.println("Seu cargo é 'Secretário'.");
			aum = sal * 35 / 100;
			novo_sal = sal + aum;
			System.out.println("O valor de seu aumento é de " + aum + " reais.");
			System.out.println("Seu novo salário é: " + novo_sal + " reais.");
			
		}
		else if (code == 3) {
			System.out.println("Seu cargo é 'Caixa'.");
			aum = sal * 20 / 100;
			novo_sal = sal + aum;
			System.out.println("O valor de seu aumento é de " + aum + " reais.");
			System.out.println("Seu novo salário é: " + novo_sal + " reais.");
		
		}
		else if (code == 4) {
			System.out.println("Seu cargo é 'Gerente'.");
			aum = sal * 10 / 100;
			novo_sal = sal + aum;
			System.out.println("O valor de seu aumento é de " + aum + " reais.");
			System.out.println("Seu novo salário é: " + novo_sal + " reais.");
			
		}
		else if (code == 5) {
			System.out.println("Seu cargo é 'Diretor'.");
			System.out.println("Você não recebe aumento.");
		}
		else {
			System.out.print("Cargo inexistente!");
		}
		
	}

}
