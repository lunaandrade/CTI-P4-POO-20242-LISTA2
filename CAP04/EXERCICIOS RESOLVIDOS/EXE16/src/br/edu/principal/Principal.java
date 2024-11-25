package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 16, capítulo 4
		Scanner sc = new Scanner(System.in);
		double p_atual, venda_mm, novo_p;
		System.out.print("Digite o preço atual do produto: ");
		p_atual = sc.nextDouble();
		System.out.print("Digite a venda média mensal desse produto: ");
		venda_mm = sc.nextDouble();
		
		if (venda_mm < 500 || p_atual < 30) {
			novo_p = p_atual + p_atual * 10 / 100;
		}
		else if((venda_mm >= 500 && venda_mm < 1200)||(p_atual >= 30 && p_atual < 80)) {
			novo_p = p_atual + p_atual * 15 / 100;
		}
		else {
			novo_p = p_atual - p_atual * 20 / 100;
		}
		System.out.println("O novo preço é: " + novo_p);
	}

}
