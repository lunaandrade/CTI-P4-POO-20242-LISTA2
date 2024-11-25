package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//Questão 06, capítulo 5
		Scanner sc = new Scanner(System.in); 
		double cod, num_h_trab_mes, val_h_trab, sal_ini, aux, sal_fin;
        String turno_trab, cat;
        
        System.out.print("Digite o seu codigo todo em numeros: ");
        cod = sc.nextDouble();
        
        System.out.print("Digite o numero de horas que voce trabalha no mes: ");
        num_h_trab_mes = sc.nextDouble();
        
        System.out.print("Digite o turno em que voce trabalha (M - Manhã, N - Noite, V - Vespertino): ");
        turno_trab = sc.next();
        
        while (!(turno_trab.equals("M") || turno_trab.equals("N") || turno_trab.equals("V"))) {
            System.out.print("Turno inválido. Digite M, N ou V: ");
            turno_trab = sc.next();
        }
        
        System.out.print("Digite o seu cargo na empresa (G - Gerente, O - Operário): ");
        cat = sc.next();
        
        while (!(cat.equals("G") || cat.equals("O"))) {
            System.out.print("Cargo inválido. Digite G ou O: ");
            cat = sc.next();
        }
        
        if (cat.equals("G") && turno_trab.equals("N")) {
            val_h_trab = 450 * 18 / 100.0;
            System.out.println("O Valor da hora trabalhada: R$ " + val_h_trab);
        }
        else if (cat.equals("G") && turno_trab.equals("M")) {
            val_h_trab = 450 * 15 / 100.0;
            System.out.println("Valor da hora trabalhada: R$ " + val_h_trab);
        }
        else if (cat.equals("O") && turno_trab.equals("N")) {
            val_h_trab = 450 * 13 / 100.0;
            System.out.println("Valor da hora trabalhada: R$ " + val_h_trab);
        }
        else if (cat.equals("O") && turno_trab.equals("M")) {
            val_h_trab = 450 * 10 / 100.0;
            System.out.println("Valor da hora trabalhada: R$ " + val_h_trab);
        }
        else {
            System.out.println("Não foi possível calcular o valor da hora.");
            val_h_trab = 0;
        }
        
        sal_ini = val_h_trab * num_h_trab_mes;
        System.out.println("Salário inicial: R$ " + sal_ini);
        
        if (sal_ini < 300) {
            aux = sal_ini * 20 / 100.0;
        }
        else if (sal_ini <= 600) {
            aux = sal_ini * 15 / 100.0;
        }
        else {
            aux = sal_ini * 5 / 100.0;
        }
        
        sal_fin = sal_ini + aux;
        System.out.println("Auxílio: R$ " + aux);
        System.out.println("Salário final: R$ " + sal_fin);
        
        System.out.println("Código: " + cod);
        System.out.println("Horas trabalhadas no mês: " + num_h_trab_mes);
        System.out.println("Turno: " + turno_trab);
        System.out.println("Cargo: " + cat);
        System.out.println("Salário inicial: R$ " + sal_ini);
        System.out.println("Auxílio: R$ " + aux);
        System.out.println("Salário final: R$ " + sal_fin);
    }
}