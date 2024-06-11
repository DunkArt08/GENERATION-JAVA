package ExCollections;
import java.util.*;
public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numeros = new HashSet<Integer>();
		Integer num;
		
		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		
		if(numeros.contains(num)) {
			System.out.println("O numero " + num + " foi encontrado!");
		}else {
			System.out.println("O numero " + num + " não foi encontrado!");
		}
		
	}

}
