package ExEstruturadeDados;
import java.util.*;
public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> livros = new Stack<String>();
		int opcao;
		String nomes;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(livros.size());
		
		do {
			System.out.println("************************************************************************************\n");
			System.out.println("\t \t 1 - Adicionar Livro na pilha \n"
					+ "\t \t 2 - Listar todos os Livros \n"
					+ "\t \t 3 - Retirar Livro da pilha\n"
					+ "\t \t 0 - Sair");
			System.out.println("\n************************************************************************************\n");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o título: ");
				nomes = leia.nextLine();
				livros.push(nomes);
				System.out.println("Filha: \n" + livros);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("\nLista de livros na pilha: \n" + livros + "\n");
				break;
			case 3:
				if(livros.size() > 0) {
					System.out.println("\nO livro " + livros.pop() + " foi retirado do topo da pilha!\n \nFila atual: \n" + livros +"\n");
				}else {
					System.out.println("\nA pilha está vazia!!\n");
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
