package ExEstruturadeDados;
import java.util.*;
public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String nomes;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("************************************************************************************\n");
		System.out.println("\t \t 1 - Adicionar Cliente na fila \n"
				+ "\t \t 2 - Listar todos os Clientes \n"
				+ "\t \t 3 - Retirar Cliente da fila\n"
				+ "\t \t 0 - Sair");
		System.out.println("\n************************************************************************************\n");
		System.out.print("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
		
		switch (opcao) {
		case 1:
			leia.nextLine();
			System.out.println("Digite um nome: ");
			nomes = leia.nextLine();
			fila.add(nomes);
			System.out.println("Fila: \n" + fila);
			System.out.println("Cliente adicionado!");
			break;
		case 2:
			System.out.println("\nLista de Clientes na Fila: \n" + fila + "\n");
			break;
		case 3:
			if(fila.peek() != null) {
				System.out.println("\nO cliente " + fila.remove() + " foi chamado!\n \nFila atual: \n" + fila +"\n");
			}else {
				System.out.println("\nA fila está vazia!!\n");
			}
			
			break;
		case 0:
			System.out.println("Programa finalizado!");
			break;
		default:
			System.out.println("\nPor gentileza insira uma das opções listadas: \n");
			break;
		}
		}while(opcao != 0);
		
	}
}