package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 20, capítulo 4
		Scanner sc = new Scanner(System.in);
		double code, peso_q, pais, peso_g, val_g, pre_t, imp, preco;
		System.out.print("Digite o código do produto (de 1 a 10): ");
		code = sc.nextDouble();
		System.out.print("Digite o peso do produto (em quilos): ");
		peso_q = sc.nextDouble();
		System.out.print("Digite o código do país de origem (de 1 a 3): ");
		pais = sc.nextDouble();
		peso_g = peso_q * 1000;
		System.out.println("O peso em gramas é: " + peso_g);
		if (code >= 1 && code <= 4) {
			val_g = 10;
		}
		else if (code >= 5 && code <= 7) {
			val_g = 25;
		}
		else {
			val_g = 35;
		}
		pre_t = val_g * peso_g;
		System.out.println("O preço total do produto é: " + pre_t);
		if (pais == 1) {
			imp = 0;
		}
		else if (pais == 2) {
			imp = pre_t * 15 / 100;
		}
		else {
			imp = pre_t * 25 / 100;
		}
		System.out.println("O valor do imposto é: " + imp);
		preco = imp + pre_t;
		System.out.println("O preço total do produto é: " + preco);
	}

}
