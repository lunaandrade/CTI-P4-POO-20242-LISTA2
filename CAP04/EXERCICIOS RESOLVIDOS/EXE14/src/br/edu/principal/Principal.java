package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 14, capítulo 4
		Scanner sc = new Scanner(System.in);
		double sal, bon, aux, novo_sal;
		System.out.print("Digite seu salário: ");
		sal = sc.nextDouble();
		if (sal <= 500) {
			bon = sal * 5 / 100;
		}
		else {
			if (sal <= 1200) {
				bon = sal * 12 / 100;
			}
			else {
				bon = 0;
			}
		}
		if (sal <= 600) {
			aux = 150;
		}
		else {
			aux = 100;
		}
		novo_sal = sal + bon + aux;
		System.out.print("Seu novo salário é: " + novo_sal);
		
		
		
	}

}
