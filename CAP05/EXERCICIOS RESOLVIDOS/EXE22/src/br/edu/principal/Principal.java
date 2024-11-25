package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 22, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0;
		double cont_f1 = 0, media_idade, perc, menor_idade = 0;
		String sexo, expe;
		
		System.out.println("Digite a idade: ");
		idade = sc.nextDouble();
		
		while (idade != 0) { 
		
			System.out.println("Digite o sexo (M/F): ");
			sexo = sc.next(); 
			System.out.println("Digite a experiência. (S) - para sim e (N) - para não ");
			expe = sc.next();
			
			if (sexo.equalsIgnoreCase("F") && expe.equalsIgnoreCase("S")) {
				 if (tot == 0) {
					menor_idade = idade;
					tot = 1;
				 }
				 else {
					if (idade < menor_idade) {
						menor_idade = idade;
					}
				 }
			}
		

			if (sexo.equals("M") || sexo.equals("m")) {
				tot_m += 1;
			}
			else if (sexo.equals("F") || sexo.equals("f")) {
				tot_f += 1;
			}
			else if (sexo.equalsIgnoreCase("F") && idade < 21 && expe.equalsIgnoreCase("S")) {
				cont_f1 += 1;
			}
			else if (sexo.equalsIgnoreCase("M") && idade > 45) {
				cont_m1 += 1;
			}
			else if (sexo.equalsIgnoreCase("M") && expe.equalsIgnoreCase("S")) {
				soma1 = soma1 + idade;
				cont_m2 += 1;
			}
		
			System.out.println("Digite a idade: ");
			idade = sc.nextDouble();
		}
	 
	
		System.out.println("O número de candidatos do sexo feminino foi " + tot_f);
		System.out.println("O número de candidatos do sexo masculino foi " + tot_m);
		
		if (cont_m2 == 0) {
			System.out.println("Nenhum homem com experiência");
		}
		else {
			media_idade = soma1 / cont_m2;
			System.out.println("A idade média de homens com experiência no serviço é de" + media_idade);
		}
		
		if (tot_m == 0) {
			System.out.println("Nenhum homem");
		}
		else { 
			perc = cont_m1 * 100 / tot_m;
			System.out.println("A porcentagem dos homens com mais de 45 anos é de " + perc);
		}
	 	
		if (cont_f1 == 0) {
			System.out.println("Nenhuma mulher com menos de 21 anos com experiência foi cadastrada");
		}
		else {
			System.out.println("O número de mulheres com menos de 21 anos com experiência no seviço é de " + cont_f1);

		}
		if (tot == 0) {
		    System.out.println("Nenhuma mulher com experiência foi cadastrada");
		    } 
		else {
		    System.out.println("A menor idade dentre as mulheres que já têm experiência é de " + menor_idade);
		}
		
	}
}