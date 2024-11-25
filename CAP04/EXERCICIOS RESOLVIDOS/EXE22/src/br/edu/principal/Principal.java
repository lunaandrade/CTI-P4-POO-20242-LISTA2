package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 22, capítulo 4
		Scanner sc = new Scanner(System.in);
		double sal, tempo, imp, grat, sal_l, cat;
		System.out.print("Digite seu salário: ");
		sal = sc.nextDouble();
		System.out.print("Digite o seu tempo de serviço: ");
		tempo = sc.nextDouble();
		if (sal < 200) {
			imp = 0;
		}
		else if (sal >= 200 && sal <= 450) {
			imp = sal * 3 / 100;
		}
		else if (sal > 450 && sal < 700) {
			imp = sal * 8 / 100;
		}
		else {
			imp = sal * 12 / 100;
		}
		System.out.println("Seu imposto é: " + imp);
		if (sal > 500) {
			if (tempo <= 3) {
				grat = 20;
			}
			else {
				grat = 30;
			}
		}
		else {
			if (tempo <= 3) {
				grat = 23;
			}
			else if (tempo > 3 && tempo <= 6){
				grat = 35;
			}
			else {
				grat = 33;
			}
		}
		System.out.println("Sua gratificação é: " + grat);
		sal_l = grat + sal - imp;
		System.out.println("Seu salário líquido é: " + sal_l);
		if (sal_l <= 350) {
			System.out.println("Sua classiificação é: A!");
		}
		else if (sal_l >= 350 && sal_l <600) {
			System.out.println("Sua classiificação é: B!");
		}
		else {
			System.out.println("Sua classiificação é: C!");
		}
		
	}

}
