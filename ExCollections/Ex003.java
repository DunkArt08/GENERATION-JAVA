package ExCollections;
import java.util.*;
public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numeros = new HashSet<Integer>();
		Integer num;
		Scanner leia = new Scanner(System.in);
		String confirma;
		
		do {
			System.out.println("Insira um numero: ");
			numeros.add(leia.nextInt());
			System.out.println("Deseja continuar inserindo numeros(S/N)?: ");
			confirma = leia.next();
		}while(confirma.equalsIgnoreCase("s"));
		
		Iterator<Integer> iNumeros = numeros.iterator();
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		
 	}

}
