package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 21, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double num, qtde = 0, maior = 0, menor = 0, soma = 0, media_par = 0;
		double soma_par = 0, qtde_par = 0, qtde_impar = 0, media = 0, perc;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		while (num != 30000) {
			if (qtde == 0) {
				maior = num;
				menor = num;
			}
			else {
				if (num > maior) {
					maior = num;
				}
				else if (num < menor) {
					menor = num;
				}
			}
			
			soma = soma + num;
			qtde = qtde + 1;
			
			if (num % 2 == 0) {
				soma_par = soma_par + num;
				qtde_par = qtde_par + 1;
			}
			else {
				qtde_impar = qtde_impar + 1;
			}
			
			System.out.println("Digite outro número: ");
			num = sc.nextDouble();	
		}
		if (qtde == 0) {
			System.out.println("Nenhum número foi digitado");
		}
		else {
			System.out.println("A soma dos números digitados é " + soma);
			System.out.println("A quantidade de números digitados foi " + qtde);
			media = soma / qtde;
			System.out.println("A media dos números foi " + media);
			System.out.println("O maior número digitado é " + maior);
			System.out.println("O menor número digitado é " + menor);
			if (qtde_par == 0) {
				System.out.println("Nenhum número par");
			}
			else {
				media_par = soma_par / qtde_par;
			System.out.println("A média dos números pares foi " + media_par);
			}
			perc = qtde_impar * 100 / qtde;
			System.out.println("A porcentagem dos números ímpares entre todos os números digitados foi " + perc + "%");
		}
	}
}