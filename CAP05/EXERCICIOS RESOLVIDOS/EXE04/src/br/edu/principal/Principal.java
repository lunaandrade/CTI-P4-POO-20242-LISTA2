package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 04, capítulo 5
		Scanner sc = new Scanner(System.in); 
		int  cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0, media_vei, soma_vei, media_acid, soma_acid, cont_acid;
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		 for(cont = 1; cont <= 5; cont++) {
		        System.out.print("Digite o codigo: ");
		        cod = sc.nextInt();
		        System.out.print("Digite o numero de veiculos: ");
		        num_vei = sc.nextInt();
		        System.out.print("Digite o numero de acidentes: ");
		        num_acid = sc.nextInt();

		        if (cont == 1) {
		            maior = num_acid;
		            cid_maior = cod;
		            menor = num_acid;
		            cid_menor = cod;
		        } 
		        else {
		            if (num_acid > maior) {
		                maior = num_acid;
		                cid_maior = cod;
		            }
		            if (num_acid < menor) {
		                menor = num_acid;
		                cid_menor = cod;
		            }

		            soma_vei = soma_vei + num_vei;
		            if (num_vei < 2000) {
		                soma_acid = soma_acid + num_acid;
		                cont_acid = cont_acid + 1;
		            }
		        }
		    }

		    media_vei = soma_vei / 5;

		    System.out.println("O maior é: " + maior + " A cidade maior é: " + cid_maior);
		    System.out.println("O menor é: " + menor + " A informaçao da cidade menor é: " + cid_menor);
		    System.out.println("A média de veículos é: " + media_vei);

		    if (cont_acid == 0) {
		        System.out.println("Não recebi nenhuma cidade com menos de 2000 veículos.");
		    } 
		    else {
		        media_acid = soma_acid / cont_acid;
		        System.out.println("A média dos acidentes nas cidades é: " + media_acid);
		    }
		}
}