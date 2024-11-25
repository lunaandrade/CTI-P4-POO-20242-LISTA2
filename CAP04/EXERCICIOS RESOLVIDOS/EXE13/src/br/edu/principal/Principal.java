package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 13, capítulo 4
		Scanner sc = new Scanner(System.in);
		double op, sal, calc;
		System.out.println("------------------------------------");
		System.out.println("--------------- MENU ---------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo salário");
		System.out.println("3 - Classificação");
		System.out.println("------------------------------------");
		System.out.print("Escolha a opção desejada: ");
		op = sc.nextDouble();
		System.out.println("------------------------------------");
		
		if (op == 1) {
			System.out.print("Digite seu salário: ");
			sal = sc.nextDouble();
			if (sal < 500) {
				calc = sal * 5 / 100;
				System.out.print("O valor de seu imposto é: " + calc + " reais");
			}
			else if (sal >= 500){
				if (sal <= 850) {
					calc = sal * 10 / 100;
					System.out.print("O valor de seu imposto é: " + calc + " reais");
				}
				else if (sal > 850) {
					calc = sal * 15 / 100;
					System.out.print("O valor de seu imposto é: " + calc + " reais");
				}
			}
			
		}
		else if (op == 2) {
			System.out.print("Digite seu salário: ");
			sal = sc.nextDouble();
			if (sal > 1500) {
				calc = sal + 25;
				System.out.print("O valor de seu imposto é: " + calc + " reais");
			}
			else if (sal <= 1500){
				if (sal >= 750) {
					calc = sal + 50;
					System.out.print("O valor de seu imposto é: " + calc + " reais");
				}
				else if (sal < 750) {
					if (sal >= 450) {
						calc = sal + 75;
						System.out.print("O valor de seu imposto é: " + calc + " reais");
					}
					else if (sal < 450) {
						calc = sal + 100;
						System.out.print("O valor de seu imposto é: " + calc + " reais");
					}
					
				}
			}
			
		}
		else if (op == 3) {
			System.out.print("Digite seu salário: ");
			sal = sc.nextDouble();
			if (sal <= 700) {
				System.out.print("Você é mal remunerado!");
			}
			else if (sal > 700) {
				System.out.print("Você é bem remunerado!");
			}
				
		}
		
		else {
			System.out.print("Opção inexistente!");
		}
	}

}
