package Lista01;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade, confirmacao;
		boolean primeiraDoacao;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("//////////////////////////////////////////////////////////////////////////////");
			System.out.println("Olá! vamos começar o atendimento virtual, primeiramente qual é o seu nome?: ");
			nome = leia.nextLine();
			System.out.println("Qual é a sua idade?: ");
			idade = leia.nextInt();
			System.out.println(
					"É a sua primeira doação?\n caso sim coloque 0, caso não seja a primeira doação coloque 1: ");
			confirmacao = leia.nextInt();

			switch (confirmacao) {
			case 0:
				primeiraDoacao = true;
				break;
			case 1:
				primeiraDoacao = false;
				break;
			default:
				System.out.println("Por gentileza coloque um numero válido na área de primeira doação!!!");
				primeiraDoacao = false;
				break;
			}
		} while (confirmacao < 0 || confirmacao > 1);

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && !primeiraDoacao) {
				System.out.printf("%s está apto para doar sangue", nome);
			} else {
				System.out.printf("%s não está apto para doar sangue", nome);
			}
		} else {
			System.out.printf("%s não está apto para doar sangue", nome);
		}
	}

}
