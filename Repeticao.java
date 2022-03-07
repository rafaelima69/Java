package br.com.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {

		//variaveis
		Locale.setDefault(Locale.US);
		try (Scanner leia = new Scanner (System.in)) {
			final int PESSOAS = 150;
			int contador =1;
			char continua = 'S';
			int idade=0;
			char sexo;
			char opcao;
			int pessoasCalmas=0;
			int mulheresNervosas=0;
			int homensAgressivos=0;
			int outrosCalmos=0;
			int pessosNervosasAcima40Anos=0;
			int pessoasCalmasMenor18anos=0;

			while (continua=='S' && contador<=PESSOAS) {
				System.out.println("Pessoa "+contador);
				System.out.println("Digite a idade: ");
				idade = leia.nextInt();
				System.out.println("Informa: \n1- Femino\n2- Masculino\n3- Outros");
				sexo = leia.next().charAt(0);
				System.out.println("Selecione:\n1- Pessoa era calma\n2- Pessoa nervosa\n3- Pessoa era agressiva ");
				opcao = leia.next().charAt(0);
				
				if(opcao=='1') {
					pessoasCalmas++;
				}if (sexo=='1' && opcao=='2') {
					mulheresNervosas++;
				}if (sexo=='2' && opcao=='3') {
					homensAgressivos++;
				}if (sexo=='3' && opcao=='1') {
					outrosCalmos++;
				}if (opcao=='2' && idade>40) {
					pessosNervosasAcima40Anos++;
				}if (opcao=='1' && idade>18) {
					pessoasCalmasMenor18anos++;
				}
				contador++;
				if (contador<=PESSOAS) {
					System.out.println("Continua S/N: ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			}
				System.out.println("Pessoas calmas "+pessoasCalmas);
				System.out.println("Mulheres nervosas: "+mulheresNervosas);
				System.out.println("Homens agressivos: "+homensAgressivos);
				System.out.println("Outros calmos: "+outrosCalmos);
				System.out.println("Pessoas nervosas acima de 40 anos: "+pessosNervosasAcima40Anos);
				System.out.println("Pessoas calmas menores que 18 anos: "+pessoasCalmasMenor18anos);
		}


	}
}
