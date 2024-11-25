package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 10, capítulo 5
		 Scanner sc = new Scanner(System.in); 
	        double cont_time, cont_j, idade, media_idade_time = 0, media_altura_time = 0;
	        double peso, altura, qtde, media_i = 0, media_alt, porc, tot80, media_a = 0, media_al = 0;
	        int jogador_time;
	        qtde = 0;  
	        tot80 = 0;  
	        media_alt = 0;  
	        
	        for (cont_time = 1; cont_time <= 5; cont_time++) {  
	            System.out.println("Time: " + cont_time);
	            jogador_time = 11;  
	            
	            for (cont_j = 1; cont_j <= 11; cont_j++) {  
	                System.out.print("Digite a idade do jogador: ");
	                idade = sc.nextDouble();
	                media_i += idade;  
	                
	                System.out.print("Digite o peso do jogador: ");
	                peso = sc.nextDouble();
	                
	                System.out.print("Digite a altura do jogador: ");
	                altura = sc.nextDouble();
	                media_alt += altura;  
	                
	                if (idade < 18) {
	                    qtde += 1;
	                }
	                
	                if (peso > 80) {
	                    tot80 += 1;
	                }
	                
	                media_idade_time += idade;  
	                media_altura_time += altura;  
	                
	                media_a += (media_idade_time / jogador_time) / 5;
	                media_al += (media_altura_time / jogador_time) / 5;
	            }
	            
	            System.out.println("Média das idades do Time: " + media_a );
	            System.out.println("Média das alturas: " + media_al );
	        }
	        
	        media_i = media_i / (5 * 11);  
	        System.out.println("Média das idades de todos os jogadores: " + media_i);
	        
	        media_alt = media_alt / (5 * 11);  
	        System.out.println("Média das alturas dos jogadores: " + media_alt);
	        
	        porc = (tot80 * 100) / (5 * 11);  
	        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porc );
	        
	        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
	       
	    }
	}
