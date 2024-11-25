package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 17, capítulo 4
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Estes valores não formam uma equação de segundo grau.");
		}
		else {
			delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Não existe uma raiz real.");
			}
			else if (delta == 0) {
				System.out.println("Existe uma raiz real.");
				x1 = (-b) / (2 * a);
				System.out.println("A raiz real é: " + x1);
			}
			else if (delta > 0) {
				System.out.println("Existem duas raízes reais.");
				x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("As raizes reais são: " + x1 + " e " + x2);
			}
			
			
			
			
			
		}
	}

}
