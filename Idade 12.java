package br.com.generation.aula01;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dias;
		int idade;
		
		System.out.println("Idade em anos: ");
		ano = leia.nextInt();
		System.out.println("Idade em meses: ");
		mes = leia.nextInt();
		System.out.println("Idade em dias: ");
		dias = leia.nextInt();

		idade = ano * 365 + mes * 30 + dias;
		System.out.println("Idade em dias: " + idade);
	}

}
