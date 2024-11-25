package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 21, capítulo 4
		Scanner sc = new Scanner(System.in);
		double estado, peso, code, peso_kg, preço_c, imp, valor;
		System.out.print("Digite o código do estado de origem (de 1 a 5): ");
		estado = sc.nextDouble();
		System.out.print("Digite o peso em toneladas: ");
		peso = sc.nextDouble();
		System.out.print("Digite o código da carga (de 10 a 40): ");
		code = sc.nextDouble();
		peso_kg = peso * 1000;
		System.out.println("O peso em quilos é: " + peso_kg);
		if (code >=10 && code <= 20) {
			preço_c = peso_kg * 100;
		}
		else if (code >= 21 && code <= 30) {
			preço_c = peso_kg * 250;
		}
		else {
			preço_c = peso_kg * 340;
		}
		System.out.println("O preço da carga é: " + preço_c);
		if (estado == 1) {
			imp = preço_c * 35 / 100;
		}
		else if (estado == 2) {
			imp = preço_c * 25 / 100;
		}
		else if (estado == 3) {
			imp = preço_c * 15 / 100;
		}
		else if (estado == 4) {
			imp = preço_c * 5 / 100;
		}
		else {
			imp = 0;
		}
		System.out.println("Seu imposto é: " + imp);
		valor = preço_c + imp;
		System.out.println("O valor total é: " + valor);
		
		
	}

}
