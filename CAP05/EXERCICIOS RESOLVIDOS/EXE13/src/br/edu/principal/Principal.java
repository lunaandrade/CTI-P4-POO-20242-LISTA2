package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) { 
		//Questão 13, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double num_cri = 0, i = 1, meses_v = 0, total_m = 0, total_f = 0, total_24 = 0;
		double porc_m = 0, porc_f = 0, porc_24 = 0;
		String sexo;
		
		System.out.println("Digite o número de crianças nascidas no período: ");
		num_cri = sc.nextInt();
		
		for (i = 1; i <= num_cri; i ++) { 
			System.out.println("Digite o sexo da " + i + "ª criança (M/F): ");
			sexo = sc.next();
			System.out.println("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
			meses_v = sc.nextInt();
			
			if (sexo.equals("M") || sexo.equals("m")) {
				total_m = total_m + 1;
			}
			else if (sexo.equals("F") || sexo.equals("f")) {
				total_f = total_f + 1;
			}
			if (meses_v <= 24) {
				total_24 = total_24+ 1;
			}
		}
		if (num_cri == 0) {
			System.out.println("Nenhuma criança digitada");
		}
		else {
			porc_m = total_m * 100 / num_cri;
			porc_f = total_f * 100 / num_cri;
			porc_24 = total_24 * 100 / num_cri;
			System.out.println("Percentual de crianças do sexo feminino mortas:  " + porc_f);
			System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_m);
			System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24);
		}
		
	}

}