package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 24, capítulo 5
		Scanner sc = new Scanner(System.in);
	
		double op = 0, sal, imp = 0, aum = 0, novo_sal;
		
		while (op != 4) {
		
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1 - Imposto");
			System.out.println("2 - Novo Salário");
			System.out.println("3 - Classificação");
			System.out.println("4 - Finalizar o programa");
			System.out.print("Digite a opção desejada: ");
			
			op = sc.nextDouble();
		
			while ((op > 4) || (op < 1)) {
				System.out.println("Opção Inválida ! Digite outra opção: ");
				op = sc.nextDouble();
			}
			
			if (op == 1) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				
				if (sal < 500) {
					imp = sal * 5 / 100;
				}
				else if ((sal >= 500) && (sal <= 850)) {
					imp = sal * 10 / 100;
				}
				else if (sal > 850) {
					imp = sal * 15 / 100;
				}
				System.out.println("O valor do imposto é R$" + imp);
			}
		
			else if (op == 2) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				
				if (sal > 1500) {
					aum = 25;
				}
				if ((sal >= 750) && (sal <= 1500)) {
					aum = 50;
				}
				
				if ((sal >= 450) && (sal < 750)) {
					aum = 75;
				}
				if (sal < 450) {
					aum = 100;
				}
				novo_sal = sal + aum;
				System.out.println("O novo salário é de R$" + novo_sal);
			}
				
	
			if (op == 3) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				
				if (sal <= 700) {
					System.out.println("Mal Remunerado"); 
				}
				else {
					System.out.println("Bem Remunerado"); 
				}
			}
	}
	System.out.print("Programa Finalizado");
	}
}