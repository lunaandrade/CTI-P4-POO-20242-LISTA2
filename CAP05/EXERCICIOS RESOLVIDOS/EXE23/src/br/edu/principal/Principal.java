package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 23, capítulo 5
		Scanner sc = new Scanner (System.in);
		double sal, qtde, gasto = 0, valor_kw, acresc = 0, total, total_ge = 0, qtde_cons = 0;
		int tipo;
		
		System.out.println("Digite o salário minímo: ");
		sal = sc.nextDouble();
		System.out.println("Digite a quantidade de quilowatts gasta: ");
		qtde = sc.nextDouble();
		
		valor_kw = sal / 8;
		
		while (qtde != 0) {
			gasto = qtde * valor_kw;
			
			System.out.println("Digite o tipo de consumidor. (1) - Residencial, (2) - Comercial ou (3) - Industrial ");
			tipo = sc.nextInt();
			
			if (tipo == 1) {
				acresc = gasto * 5 / 100;
			}
			else if (tipo == 2) {
				acresc = gasto * 10 / 100;
			}
			else if (tipo == 3) {
				acresc = gasto * 15 / 100;
			}
			total = gasto + acresc;
			total_ge = total_ge + total;
			
			if (total >= 500 && total <= 1000) {
				qtde_cons = qtde_cons + 1;
			}
		}

	}

}