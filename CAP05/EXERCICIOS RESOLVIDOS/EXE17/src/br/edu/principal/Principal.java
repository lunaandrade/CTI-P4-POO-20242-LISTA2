package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args){
		//Questão 17, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double sal_carlos, sal_joao, meses = 0;
		
		System.out.println("Digite o salário de Carlos: ");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos / 3;
		
		while (sal_joao <= sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 2 / 100);
			sal_joao = sal_joao + (sal_joao * 5 / 100);
			meses = meses + 1;
		}
		
		System.out.println("O número de meses necessários foi: " + meses);
	}

}