package Lista02;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int cod;
		float salario, novoSalario;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o nome do colaborador: ");
		nome = leitura.nextLine();
		System.out.println("Insira o código do cargo: ");
		cod = leitura.nextInt();
		System.out.println("Insira o salário atual do colaborador: ");
		salario = leitura.nextFloat();
		
		switch (cod) {
		case 1:
			novoSalario = (float) (salario + (0.10 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Gerente \nSalário: %.2f",nome,novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario + (0.07 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Vendedor \nSalário: %.2f",nome,novoSalario);
			break;
		case 3:
			novoSalario = (float) (salario + (0.09 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Supervisor \nSalário: %.2f",nome,novoSalario);
			break;
		case 4:
			novoSalario = (float) (salario + (0.06 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Motorista \nSalário: %.2f",nome,novoSalario);
			break;
		case 5:
			novoSalario = (float) (salario + (0.05 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Estoquista \nSalário: %.2f",nome,novoSalario);
			break;
		case 6:
			novoSalario = (float) (salario + (0.08 * salario));
			System.out.printf("Nome do colaborador: %s \nCargo: Técnico de T.I. \nSalário: %.2f",nome,novoSalario);
			break;
		default:
			System.out.println("Por gentileza insira um código de cargo válido!!!");
			break;
		}
	}

}
