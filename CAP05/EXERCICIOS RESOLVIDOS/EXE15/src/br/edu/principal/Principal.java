package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 15, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double i = 1, preco, custo_est = 0, imp, preco_final, adicional = 0;
		double maior_p = 0, menor_p = 0, tot_imp = 0, qtd_b = 0, qtd_n = 0, qtd_c = 0;
		String refri, categ;
		
		for (i = 1; i <= 12; i ++) {
		System.out.println("Digite o preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.println("Digite a refrigeração deste produto. (S) - Se o produto precisa de refrigeração e (N) - Se o produto não precisa");
		refri = sc.next();
		System.out.println("Digite a categoria do produto. (A) - Alimentação, (L) - Limpeza e (V) - Vestuário");
		categ = sc.next();
		
		if (preco <= 20) {
			if (categ.equals("A") || categ.equals("a")) {
				custo_est = 2;
			}
			else if (categ.equals("L") || categ.equals("l")) {
				custo_est = 3;
			}
			else if (categ.equals("V") || categ.equals("v")) {
				custo_est = 4;
			}
		}

		else if (preco > 20 && preco <= 50) {
			if (refri.equals("S") || refri.equals("s")) {
				custo_est = 6;
			}
			else {
				custo_est = 0;
			}
		}
		
		else if (preco > 50) {
			if (refri.equals("S") || refri.equals("s")) {
				if (categ.equals("A") || categ.equals("a")) {
					custo_est = 5;
				}
				else if (categ.equals("L") || categ.equals("l")) {
					custo_est = 2;
				}
				else if (categ.equals("V") || categ.equals("v")) {
					custo_est = 4;
				}
			}
		
			else { 
				
				if ((categ.equals("A") || categ.equals("a")) || (categ.equals("V") || categ.equals("v"))) {
					custo_est = 0;
				}
				else if (categ.equals("L") || categ.equals("l")) {
					custo_est = 1;
				}
			}
		}	

		
		if  (!categ.equalsIgnoreCase("A") && !refri.equalsIgnoreCase("S")) {
			imp = (preco * 2) / 100;
		}
		else {
			imp = (preco * 4) / 100;
		}
		
		preco_final = preco + custo_est + imp;
		System.out.println("O custo de estocagem foi de R$" + custo_est);
		System.out.println("O imposto foi de R$" + imp);
		System.out.println("O preço final foi de R$" + preco_final);
	
		if (preco_final <= 20) {
		qtd_b += 1;
		System.out.println("A classificação do produto é 'Barato'");
		}
		else if ((preco_final > 20) && (preco_final <= 100)) {
		qtd_n += 1;
		System.out.println("A classificação do produto é 'Normal'");
		}
		else if (preco_final > 100) {
		qtd_c += 1;
		System.out.println("A classificação do produto é 'Caro'");
		}

		adicional = adicional + custo_est + imp;
		tot_imp += imp;
		if (i == 1) {
		maior_p = preco_final;
		menor_p = preco_final;
		}
		
		else { 
			if (preco_final > maior_p) {
				maior_p = preco_final;
			}
			if (preco_final < menor_p) {
				menor_p = preco_final;
			}
		}
		

	}
		adicional = adicional / 12;
		System.out.println("A média dos valores adicionais foi de R$" + adicional);
		System.out.println("O maior preço final foi R$" + maior_p);
		System.out.println("O menor preço final foi de R$" + menor_p);
		System.out.println("O total dos impostos foi de R$" + tot_imp);
		System.out.println("A quantidade de produtos na classificação 'barato' é " + qtd_b);
		System.out.println("A quantidade de produtos na classificação 'normal' é " + qtd_n);
		System.out.println("A quantidade de produtos na classificação 'caro' é " + qtd_c);

	}
}