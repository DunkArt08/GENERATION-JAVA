package Lista02;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		float saldo = 1000.00f, valorOperacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o código da operação: ");
		cod = leia.nextInt();
		
		switch (cod) {
		case 1:
			System.out.printf("\t\tOperação - Saldo\nSaldo: R$%.2f",saldo);
			break;
		case 2:
			System.out.println("\t\t Operação - Saque\nInsira o valor do saque: ");
			valorOperacao = leia.nextFloat();
			if(valorOperacao < saldo) {
				saldo = saldo - valorOperacao;
				System.out.printf("Novo saldo: %.2f",saldo);
			}else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		case 3:
			System.out.println("\t\t Operação - Depósito\nInsira o valor do depósito: ");
			valorOperacao = leia.nextFloat();
			if(valorOperacao > 0) {
				saldo = saldo + valorOperacao;
				System.out.printf("Novo saldo: %.2f",saldo);
			}else {
				System.out.println("INSIRA UM VALOR DE DEPÓSITO VÁLIDO!");
			}
			break;
		default:
			System.out.println("OPERAÇÃO INVÁLIDA!");
			break;
		}
	}

}
