package Lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5- Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, 
		//mostre a soma dos n�meros digitados.(DO...WHILE)
		
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma += numero; 
		} while (numero > 0);
		
		System.out.println("A soma dos valores digitados �: " + soma);

	}

}
