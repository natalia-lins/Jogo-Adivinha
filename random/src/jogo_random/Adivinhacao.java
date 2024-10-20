package jogo_random;

import java.util.Scanner;

import java.util.Random;

public class Adivinhacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
		int escolha;
		
		Random md = new Random();
		int x = md.nextInt(10);
		int y = md.nextInt(100);
		int z = md.nextInt(1000);
		
		System.out.println("Bem vindo ao jogo de adivinhação!");
		System.out.println();
		
		do {
		System.out.println("1 - Fácil: Adivinhe entre 0 a 10");
		System.out.println("2 - Médio: Adivinhe entre 0 a 100");
		System.out.println("3 - Difícil: Adivinhe entre 0 a 1000");
		System.out.println("0 - Sair");
		System.out.println();
		System.out.print("Escolha a opção desejada: ");
		escolha = ler.nextInt();
		System.out.println();
		
		switch (escolha) {
		case 0:
			System.out.print("Adeus! Obrigada e volte sempre :)");
			break;
		case 1:
			do {
				System.out.print("Digite um número: ");
				num = ler.nextInt();
				System.out.println();
				if(num==x) {
					System.out.println("Parabéns, o número " + num + " é o certo! Vamos jogar novamente?");
					System.out.println();
				}
				else if (num<0 || num>10) {
					System.out.println("O número " + num + " está fora da escala, tente um valor de 0 até 10.");
				}
				else {
					if(num>x) {
						System.out.println("O número " + num + " está errado, tente um valor MENOR!");
					}
					else {
						System.out.println("O número " + num + " está errado, tente um valor MAIOR!");
					}
				}
			} while (num!=x);
			break;
		case 2:
			do {
				System.out.print("Digite um número: ");
				num = ler.nextInt();
				System.out.println();
				if(num==y) {
					System.out.println("Parabéns, o número " + num + " é o certo! Vamos jogar novamente?");
					System.out.println();
				}
				else if (num<0 || num>100) {
					System.out.println("O número " + num + " está fora da escala, tente um valor de 0 até 100.");
				}
				else {
					if(num>y) {
						System.out.println("O número " + num + " está errado, tente um valor MENOR!");
					}
					else {
						System.out.println("O número " + num + " está errado, tente um valor MAIOR!");
					}
				}
			} while (num!=y);
			break;
		case 3:
			do {
				System.out.print("Digite um número: ");
				num = ler.nextInt();
				System.out.println();
				if(num==z) {
					System.out.println("Parabéns, o número " + num + " é o certo! Vamos jogar novamente?");
					System.out.println();
				}
				else if (num<0 || num>1000) {
					System.out.println("O número " + num + " está fora da escala, tente um valor de 0 até 1000.");
				}
				else {
					if(num>z) {
						System.out.println("O número " + num + " está errado, tente um valor MENOR!");
					}
					else {
						System.out.println("O número " + num + " está errado, tente um valor MAIOR!");
					}
				}
			} while (num!=z);
			break;
		default: 
            System.out.println("Opção Inválida! Tente novamente.");
            System.out.println();
            break;
		}
		
		} while (escolha>0);
		
	}

}
