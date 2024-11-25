package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Questão 25, capítulo 5
		Scanner sc = new Scanner(System.in);
		
		double preco, imp, transp = 0, seguro, fina, total_imp = 0, origem;
		String meio_t, carga;
		
		System.out.println("Digite o preço unitário: ");
		preco = sc.nextDouble();
	
		while (preco > 0) { 
		
			System.out.println("Digite o país de origem. (1) - Estados Unidos, (2) - México, (3) - Outros ");
			origem = sc.nextDouble();
			System.out.println("Digite o meio de transporte transporte. (T) - Terrestre, (F) — Fluvial e (A) - Aéreo ");
			meio_t = sc.next();
			System.out.println("Digite se a carga é perigosa. (S) - Sim, (N) - Não)");
			carga = sc.next();
			
			if (preco <= 100) {
				imp = preco * 5 / 100;
			}
			else { 
				imp = preco * 10 / 100;
			}
			if (carga.equals("S") || carga.equals("s")) {
				if (origem == 1) {
					transp = 50;
				}
				else if (origem == 2) {
					transp = 21;
				}
				if (origem == 3) {
					transp = 24;
				}
			}
		
			if (carga.equals("N") || carga.equals("n")) {
				if (origem == 1) {
					transp = 12;
				}
				else if (origem == 2) {
					transp = 21;
				}
				else if (origem == 3) {
					transp = 60;
				}
			}
	
			if (origem == 2 || meio_t.equalsIgnoreCase("A")) {
				seguro = preco / 2;
			}
			else {
				seguro = 0;
			}
			
			fina = preco + imp + transp + seguro;
			total_imp = total_imp + imp;
			
			System.out.println("O valor do imposto foi de R$" + imp);
			System.out.println("O valor do transporte foi de R$" + transp);
			System.out.println("O valor do seguro foi de R$" + seguro);
			System.out.println("O preço final foi de R$" + fina);
	
			System.out.println("Digite o preço unitário: ");
			preco = sc.nextDouble();
		
		}
		
		System.out.println("O total dos impostos foi de " + total_imp);
	}

}