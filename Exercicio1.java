package Lista3;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		int contador = 0;
		for(int x = 1000; x <= 1999; x++){
			if(x % 11 == 5){
				contador++;
				System.out.println("Os numero de 1000 a 1999 que divididos por 11 e resta 5 são: " + x);
			}
		}
		
		System.out.println("Com um total de :" + contador);
	}

}
