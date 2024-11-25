package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 18, capítulo 4
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		System.out.println("Informe os comprimentos dos lados de um triângulo");
		System.out.print("Digite o valor de x: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = sc.nextDouble();
		System.out.print("Digite o valor de z: ");
		z = sc.nextDouble();
		if (x < z + y && y < x + z && z < x + y) {
			if (x == z && z == y) {
				System.out.println("Este é um Triângulo Equilátero");
			}
			else if (x == y || y == z || z == x) {
				System.out.println("Este é um Triângulo Isósceles");
			}
			else {
				System.out.println("Este é um Triângulo Escaleno");
			}
		}
		else {
			System.out.println("Estes valores não formam um triângulo");
		}
	}

}
