package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 23, capítulo 4
		Scanner sc = new Scanner(System.in);
		double sal, turno, cat, horas, coef, sal_b, imp, grat, aux, sal_l;		
		System.out.print("Digite o valor do salário mínimo: ");
		sal = sc.nextDouble();
		System.out.print("Digite seu turno (1 - matutino, 2 - vespertino, 3 - noturno): ");
		turno = sc.nextDouble();
		System.out.print("Digite sua categoria (1 - operário, 2 - gerente): ");
		cat = sc.nextDouble();
		System.out.print("Digite seu número de horas trabalhadas por mês: ");
		horas = sc.nextDouble();
		System.out.println("---------------------------------------");
		if (turno == 1) {
			coef = sal * 10 / 100;
		}
		else if (turno == 2) {
			coef = sal * 15 / 100;
		}
		else {
			coef = sal * 12 / 100;
		}
		System.out.println("Seu coeficiente é: " + coef);
		sal_b = horas * coef;
		System.out.println("Seu salário bruto é: " + sal_b);
		if (cat == 1) {
			if (sal_b >= 300) {
				imp = sal_b * 5 / 100;
			}
			else {
				imp = sal_b * 3 / 100;
			}
		}
		else {
			if (sal_b >= 400) {
				imp = sal_b * 6 / 100;
			}
			else {
				imp = sal_b * 4 / 100;
			}
		}
		System.out.println("Seu imposto é: " + imp);
		if (turno == 3 && horas > 80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		System.out.println("Sua gatificação é: " + grat);
		if (cat == 1 || coef <= 25) {
			aux = sal_b / 3;
		}
		else {
			aux = sal_b / 2;
		}
		System.out.println("Seu auxílio alimentação é: " + aux);
		sal_l = sal_b - imp + grat + aux;
		System.out.println("Seu salário líquido é: " + sal_l);
		System.out.println("---------------------------------------");
		if (sal_l < 350) {
			System.out.println("Você é mal remunerado");
		}
		else if (sal_l >= 350 && sal_l <= 600) {
			System.out.println("Você é remunerado normalmente");
		}
		else {
			System.out.println("Você é bem remunerado");
		}
	}

}
