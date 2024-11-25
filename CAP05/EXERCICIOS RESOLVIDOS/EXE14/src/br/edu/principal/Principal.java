package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 14, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double valor_ini, juros = 0, num_parc = 1, total = 0, valor_parc, valor_jur = 0;
		double cont = 1;
		
		System.out.println("Digite o valor inicial da dívida: ");
		valor_ini = sc.nextInt();
		
		total = valor_ini;
		valor_parc = valor_ini;
		
		System.out.println("-------------------------------------------");
		System.out.println("Dívida | Juros | Qtd de parcelas | Parcela");
		System.out.println("-------------------------------------------");
		System.out.println(total + " | " + juros + "  | " + num_parc + " | " + valor_parc );
		
		juros = juros + 10;
		num_parc = num_parc + 2;
		
		for (cont = 1; cont <= 4; cont++) {
			valor_jur = valor_ini * juros / 100;
			total = valor_ini + valor_jur;
			valor_parc = total / num_parc;
			System.out.println(total + " | " + juros + " | " + num_parc + " | " + valor_parc );
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
	}

}