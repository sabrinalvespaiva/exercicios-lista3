package Lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo; // 1 feminino, 2 masculino, 3 outros
		char opcoes; // 1 pessoa calma, 2 nervosa, 3 agressiva
		char op = 'S';
		int contadorPessoas = 0;
		final int LIMITE_PESSOAS_ENTREVISTADAS = 150;

		int numeroPessoasCalmas = 0;
		int numeroMulheresNervosas = 0;
		int numeroHomensAgressivos = 0;
		int numeroOutrosCalmos = 0;
		int numeroPessoasNervosasMais40 = 0;
		int numeroPessoasCalmasMenos18 = 0;

		while (contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS && op == 'S') {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite a opção:\n1-feminino\n2-masculino\n3-outros");
			sexo = leia.next().charAt(0);
			System.out.println("Digite a opção:\n1-pessoa calma\n2-pessoa nervosa\n3-pessoa agressiva");
			opcoes = leia.next().charAt(0);
			contadorPessoas++;
			System.out.println("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			if (opcoes == '1') {
				numeroPessoasCalmas++;
			}
			if (sexo == '1' && opcoes == '2') {
				numeroMulheresNervosas++;
			}
			if (sexo == '2' && opcoes == '3') {
				numeroHomensAgressivos++;
			}
			if (sexo == '3' && opcoes == '1') {
				numeroOutrosCalmos++;
			}
			if (opcoes == '2' && idade > 40) {
				numeroPessoasNervosasMais40++;
			}
			if (opcoes == '1' && idade < 18) {
				numeroPessoasCalmasMenos18++;
			}

		}

		System.out.println("Pessoas calmas " + numeroPessoasCalmas);
		System.out.println("Mulheres nervosas " + numeroMulheresNervosas);
		System.out.println("Homens Agressivos " + numeroHomensAgressivos);
		System.out.println("Outros calmos " + numeroOutrosCalmos);
		System.out.println("Pessoas nervosas acima de 40 anos " + numeroPessoasNervosasMais40);
		System.out.println("Pessoas calmas abaixo de 18 anos " + numeroPessoasCalmasMenos18);

	}

}
