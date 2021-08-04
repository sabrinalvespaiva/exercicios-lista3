package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero;
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <= 10; x++){
			System.out.print("Digite 10 numeros positivos: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				System.out.println(numero + " São pares");
			} else if (numero % 2 == 1) {
				System.out.println(numero + " São impares");
			}
		}
		

	}

}
