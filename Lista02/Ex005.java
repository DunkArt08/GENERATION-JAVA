package Lista02;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod, quantidade;
		float preco1 = 10.00f, preco2 = 15.00f, preco3 = 18.00f, preco4 = 12.00f, preco5 = 8.00f, preco6 = 13.00f,
				valorTotal;

		Scanner leia = new Scanner(System.in);

		System.out.println("Insira o código do produto: ");
		cod = leia.nextInt();
		System.out.println("Insira a quantidade: ");
		quantidade = leia.nextInt();

		switch (cod) {
		case 1:
			valorTotal = quantidade * preco1;
			System.out.printf("O valor total do seu Cachorro quente foi de: %.2f",valorTotal);
			break;
		case 2:
			valorTotal = quantidade * preco2;
			System.out.printf("O valor total do seu X-Salada foi de: %.2f",valorTotal);
			break;
		case 3:
			valorTotal = quantidade * preco3;
			System.out.printf("O valor total do seu X-Bacon foi de: %.2f",valorTotal);
			break;
		case 4:
			valorTotal = quantidade * preco4;
			System.out.printf("O valor total do seu Bauru foi de: %.2f",valorTotal);
			break;
		case 5:
			valorTotal = quantidade * preco5;
			System.out.printf("O valor total do seu Refrigerante foi de: %.2f",valorTotal);
			break;
		case 6:
			valorTotal = quantidade * preco6;
			System.out.printf("O valor total do seu Suco de Laranja foi de: %.2f",valorTotal);
			break;
		default:
			System.out.println("Por gentileza insira um indice de produto válida!");
			break;
		}
	}

}
