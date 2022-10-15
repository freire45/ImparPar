package br.com.erickfreire.imparpar;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Programa que verifica se um valor é impar ou par: ");
		System.out.print("Digite um valor: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0)
			System.out.println("O número é Par!");
		
		if(numero % 2 == 1)
			System.out.println("O número é Ímpar!");

	}

}
