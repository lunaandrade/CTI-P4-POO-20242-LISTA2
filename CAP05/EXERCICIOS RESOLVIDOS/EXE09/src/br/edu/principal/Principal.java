package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 09, capítulo 5
		Scanner sc = new Scanner(System.in); 
        double media, cont, n1 = 0, n2 = 0, rep = 0, apo = 0, exa = 0, media_class;
        
        for(cont = 1; cont <= 5; cont++) {
        System.out.println("Digite sua nota: " );
        n1 = sc.nextDouble();
        System.out.println("Digite sua nota: ");
        n2 = sc.nextDouble();
        cont ++;
        
        media = (n1 + n2) / 2;
        
        if(media < 3) {
        	 rep ++;
        }

        else if(media == 3 || media <= 7) {
       	 exa ++;
       }
        
        else if(media > 7) {
       	 apo ++;
       }
        
        media_class = n1 + n2;
        System.out.println("quantidade de reprovados:" + rep );
        System.out.println("numeros de que precisam fazer os exames:" +exa);
        System.out.println("quantidade de aprovados:" + apo);
        System.out.println("Media da classe:" + media_class);
        }
        }
}
