package Lista01;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("digite o número desejado: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf("O numero %d é par e positivo", numero);
			} else {
				System.out.printf("O numero %d é par e negativo", numero);
			}
		} else {
			if (numero > 0) {
				System.out.printf("O numero %d é impar e positivo", numero);
			} else {
				System.out.printf("O numero %d é impar e negativo", numero);
			}
		}

	}

}
