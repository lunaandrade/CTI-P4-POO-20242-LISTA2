package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 19, capítulo 4
		Scanner sc = new Scanner(System.in);
		double alt, peso;
		System.out.print("Digite a sua altura (em metros): ");
		alt = sc.nextDouble();
		System.out.print("Digite o seu peso: ");
		peso = sc.nextDouble();
		if (alt < 1.20) {
			if (peso <= 60) {
				System.out.print("Sua classificação é: A");
			}
			else if (peso > 60 && peso < 90) {
				System.out.print("Sua classificação é: D");
			}
			else {
				System.out.print("Sua classificação é: G");
			}
				
		}
		else if (alt >= 1.20 && alt <= 1.70) {
			if (peso <= 60) {
				System.out.print("Sua classificação é: B");
			}
			else if (peso > 60 && peso < 90) {
				System.out.print("Sua classificação é: E");
			}
			else {
				System.out.print("Sua classificação é: H");
			}
				
		}
		else {
			if (peso <= 60) {
				System.out.print("Sua classificação é: C");
			}
			else if (peso > 60 && peso < 90) {
				System.out.print("Sua classificação é: F");
			}
			else {
				System.out.print("Sua classificação é: I");
			}
				
		}
		
	}

}
