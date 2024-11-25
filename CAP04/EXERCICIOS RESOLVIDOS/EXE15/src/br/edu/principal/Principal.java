package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 15, capítulo 4
		Scanner sc = new Scanner(System.in);
		double sal_min, horas_i, dep, val_dep, horas_f, sal_b, sal_l, sal_f, val_h, h_extra, val_h_extra, irrf, grat;
		System.out.println("Preencha as informações abaixo:");
		System.out.print("Valor do salário mínimo: ");
		sal_min = sc.nextDouble();
		System.out.print("Número de horas que você deve trabalhar: ");
		horas_i = sc.nextDouble();
		System.out.print("Número de horas que você trabalhou: ");
		horas_f = sc.nextDouble();
		System.out.print("Seu número de dependentes: ");
		dep = sc.nextDouble();
		val_h = sal_min / 5;
		val_dep = dep * 32;
		if (horas_f > horas_i) {
			h_extra = horas_f - horas_i;
			val_h_extra = val_h + val_h * 50 / 100;
			h_extra = h_extra * val_h_extra;
		}
		else {
			h_extra = 0;
		}
		sal_b = horas_i * val_h + val_dep + h_extra;
		if (sal_b < 200) {
			irrf = 0;
		}
		else {
			if (sal_b <= 500) {
				irrf = sal_b * 10 / 100;
			}
			else {
				irrf = sal_b * 20 / 100;
			}
		}
		sal_l = sal_b - irrf;
		if (sal_l <= 350) {
			grat = 100;
		}
		else {
			grat = 50;
		}
		sal_f = sal_l + grat;
		System.out.print("Seu salário final é: " + sal_f);
	}

}
