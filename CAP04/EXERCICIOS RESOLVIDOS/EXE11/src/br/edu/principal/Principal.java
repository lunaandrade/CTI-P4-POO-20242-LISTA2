package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 11, capítulo 4
		Scanner sc = new Scanner(System.in);
		double 	hora_i, hora_f, hora_d, min_i, min_f, min_d;
		System.out.println("Digite o horário inicial");
		System.out.print("Hora: ");
		hora_i = sc.nextDouble();
		System.out.print("Minuto: ");
		min_i = sc.nextDouble();
		System.out.println("Digite o horário final");
		System.out.print("Hora: ");
		hora_f = sc.nextDouble();
		System.out.print("Minuto: ");
		min_f = sc.nextDouble();
		
		if (hora_i >= hora_f) {
			hora_f = hora_f + 23;
		}
		if (min_i > min_f) {
			min_f = min_f + 60;
			hora_f = hora_f--;
		}
		if (min_i == min_f) {
			hora_f = hora_f + 1;
		
		}
		min_d = min_f - min_i;
		hora_d = hora_f - hora_i;
		System.out.print("O jogo durou " + hora_d + " hora(s) e " + min_d + " minuto(s)");
	}

}
