package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args){
		//Questão 16, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
		
		while (base <= 0) {
			System.out.println("Erro! A base do triângulo não pode ser menor ou igual a zero.");
			System.out.println("Digite a base do triângulo: ");
			base = sc.nextDouble();
		}
		
		System.out.println("Digite a altura do triângulo: ");
		altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.println("Erro! A altura do triângulo não pode ser menor ou igual a zero.");
			System.out.println("Digite a altura do triângulo: ");
			altura = sc.nextDouble();
		}
		
		area = base * altura / 2;
		System.out.println("A área deste triângulo é: " + area);
	}

}