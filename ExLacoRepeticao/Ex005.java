package ExLacoRepeticao;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,somaNumero=0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero >0) {
				somaNumero += numero;
			}
			
		}while(numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d",somaNumero);
	}

}
