package br.com.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int idade;
		
		System.out.println("D�gite sua idade: ");
		idade = leia.nextInt();
		
			if (idade >=10 && idade <=14) {
			System.out.println("Voc� � do grupo infantil!");
			}
		
			else if(idade >= 11 && idade <= 17) {
				System.out.println("Voc� � do grupo juvenil!");
		    }
	
			else if(idade >= 18 && idade <= 25) {
				System.out.println("Voc� � do grupo adulto");
		    }
			
			else {
				System.out.println("Voc� n�o pertence a nenhum grupo");
				
			}
			
			 leia.close();
		
	}


	}


