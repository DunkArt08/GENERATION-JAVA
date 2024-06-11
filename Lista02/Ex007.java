package Lista02;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, resultado;
		int cod;

		Scanner leia = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o segundo numero: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o código da operação: ");
		cod = leia.nextInt();

		switch (cod) {
		case 1:
			resultado = n1 + n2;
			System.out.printf("%.1f + %.1f = %.1f", n1, n2, resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.printf("%.1f - %.1f = %.1f", n1, n2, resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.printf("%.1f * %.1f = %.1f", n1, n2, resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.printf("%.1f / %.1f = %.1f", n1, n2, resultado);
			break;
		default:
			System.out.println("OPERAÇÃO INVALIDA");
			break;
		}
	}

}
