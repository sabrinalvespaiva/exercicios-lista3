package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
		// de 21 anos. Total de pessoas
		// com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

		Scanner leia = new Scanner(System.in);
		int idade = 0;
		int pessoasMenos21 = 0;
		int pessoasMais50 = 0;

		while (idade > -98) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade < 21) {
				pessoasMenos21 = pessoasMenos21 + 1;
			}
			if (idade > 50) {
				pessoasMais50 = pessoasMais50 + 1;
			}
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + (pessoasMenos21 -1));
		System.out.println("Total de pessoas com mais de 50 anos: " + pessoasMais50);

	}

}
