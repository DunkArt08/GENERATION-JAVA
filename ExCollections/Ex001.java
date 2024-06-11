package ExCollections;
import java.util.*;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cores = new ArrayList();
		String cor;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i<5 ; i++) {
			System.out.println("Insira uma cor: ");
			cor = leia.nextLine();
			cores.add(i,cor);
		}
		System.out.println("\n Listar as cores adicionadas: ");
		System.out.println(cores);
		System.out.println("\n Ordenar as cores adicionadas: ");
		cores.sort(null);
		System.out.print(cores);
	}

}
