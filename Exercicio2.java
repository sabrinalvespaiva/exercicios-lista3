package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int numero;
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <= 10; x++){
			System.out.print("Digite 10 numeros positivos: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				System.out.println(numero + " S�o pares");
			} else if (numero % 2 == 1) {
				System.out.println(numero + " S�o impares");
			}
		}
		

	}

}
