package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Questão 25, capítulo 4
		Scanner sc = new Scanner(System.in); 
		double ang, voltas;
		
		 System.out.print("Digite o angulo: ");
	        ang = sc.nextDouble();
	        
	        if(ang > 360 || ang < -360) {
	            voltas = ang / 360;
	            ang = ang % 360; 
	        } 
	        else { 
	            voltas = 0;
	        }

	        if(ang == 0 || ang == 90 || ang == 180 || ang == 270 || ang == 360 || ang == -90 || ang == -180 || ang == -270 || ang == -360) {
	            System.out.print("Está em cima dos eixos ");
	        }

	        if ((ang > 0 && ang < 90) || (ang < -270 && ang > -360)) {
	            System.out.print("1º Quadrante ");
	        }
	        if ((ang > 90 && ang < 180) || (ang < -180 && ang > -270)) {
	            System.out.print("2º Quadrante ");
	        }
	        if ((ang > 180 && ang < 270) || (ang < -90 && ang > -180)) {
	            System.out.print("3º Quadrante ");
	        }
	        if ((ang > 270 && ang < 360) || (ang < 0 && ang > -90)) {
	            System.out.print("4º Quadrante ");
	        }

	        if (ang < 0) {
	            System.out.print("A volta está no sentido horário");
	        } 
	        else { 
	            System.out.print("A volta está no sentido anti-horário");
	        }
	    }
	}