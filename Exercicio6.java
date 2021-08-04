package Lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6- Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos 
		//números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner leia = new Scanner(System.in);
		int numero, quantidadeDeNumerosDigitados = 0;
		int somaMultiplos = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			quantidadeDeNumerosDigitados += 1;
			if(numero % 3 == 0) {
				somaMultiplos++;
			}
		} while (numero > 0);
		
		System.out.println("A média dos numeros multiplos de 3 é: " + (somaMultiplos-1) + quantidadeDeNumerosDigitados);

	
	}
}
