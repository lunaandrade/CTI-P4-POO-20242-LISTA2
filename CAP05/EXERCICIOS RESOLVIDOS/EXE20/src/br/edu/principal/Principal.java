package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String [] args){
		//Questão 20, capítulo 5
		Scanner sc = new Scanner(System.in);
		double codigo, num_h, sal_b, sal_l = 0, media_m = 0, media_f = 0, cont_m = 0, cont_f = 0;
		String sexo;
		
		System.out.println("Digite o código: ");
		codigo = sc.nextDouble();

	
		while (codigo != 99999) {
		
			System.out.println("Digite o sexo (M/F): ");
			sexo = sc.next();
			System.out.println("Digite o número de horas mensais: ");
			num_h = sc.nextDouble();
			sal_b = num_h * 30;
			if (sexo.equals("M") || sexo.equals("m")) {
				sal_l = sal_b - (sal_b * 10 / 100);
				media_m = media_m + sal_l;
				cont_m += 1; 
			} 
				
			else if (sexo.equals("F") || sexo.equals("f")) {	
				sal_l = sal_b - (sal_b * 5 / 100);
				media_f = media_f + sal_l;
				cont_f += 1; 
			}
		System.out.println("O código é " + codigo);
		System.out.println("O salário bruto foi de R$" + sal_b);
		System.out.println("O salário líquido foi de R$" + sal_l);
		
		System.out.println("Digite o código: ");
		codigo = sc.nextDouble();
		}
		
		if (cont_m == 0) {
		System.out.println("Nenhum professor do sexo masculino");
		}
		else {
		media_m = media_m / cont_m;
		System.out.println(media_m);
		}
		
		if (cont_f == 0) {
			System.out.println("Nenhum professor do sexo feminino");
		}
		else {
		media_f = media_f / cont_f;
		System.out.println(media_f);
		}
	}
}