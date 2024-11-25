package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 12, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double num_ope, num_pec, cont = 0, total_f = 0, total_p = 0;
		double media_m = 0, media_f = 0, cont_m = 0, cont_f = 0, salario_min = 300, salario_op = 0;
		double sal_maior = 0, num_maior = 0;
		String sexo;
		
		for (cont = 0; cont <= 15; cont ++) {
			System.out.println("Digite o número do" + cont + "º operário: ");
			num_ope = sc.nextInt();
			System.out.println("Digite o número total de peças fabricadas pelo" + cont + "º operário: ");
			num_pec = sc.nextInt();
			System.out.println("Digite o sexo do operário (M/F): ");
			sexo = sc.next();
			
			if (num_pec > 0 && num_pec <= 30) {
				salario_op = salario_min;
			} 	
			else if (num_pec > 30 && num_pec <= 50) { 
				salario_op = salario_min + ((num_pec - 30) * 0.03 * salario_min);
			}
			else {
				salario_op = salario_min + ((num_pec - 30) * 0.05 * salario_min);
			}
			
			System.out.println("O operario de número " + num_ope + " recebe R$" + salario_op + " de salário.");
			total_f = total_f + salario_op;
			total_p = total_p + num_pec;
			
			if (sexo.equals("M") || sexo.equals("m")) {
				media_m = media_m + num_pec;
				cont_m = cont_m + 1;
			}
			else {
				media_f = media_f + num_pec;
				cont_f = cont_f + 1;
			}
			
			if (cont == 1) {
				sal_maior = salario_op;
 				num_maior = num_ope;
			}
			else {
				if (salario_op > sal_maior) {
					sal_maior = salario_op;
					num_maior = num_ope;
				}
			}
		}
		
		System.out.println("O total da folha de pagamento foi de R$" + total_f);
		System.out.println("O total de peças fabricadas no mês foi de " + total_p);
		
		if (cont_m == 0) {
			System.out.println("Nenhum homem");
		}
		else {
			media_m = media_m / cont_m;
			System.out.println("Média de peças fabricadas por homens = " + media_m);
		}
		if (cont_f == 0) {
			System.out.println("Nenhuma mulher"); 
		}
		else {
			media_f = media_f / cont_f;
			System.out.println("Média de peças fabricadas por mulheres = " + media_f);
		}
		
		System.out.println("O número do operário com maior salário é " + num_maior);
	}

}