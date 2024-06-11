package ExCollections;
import java.util.*;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
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
		
		System.out.println("Digite o numero que deseja encontrar: ");
		num = leia.nextInt();
		
		if(numeros.indexOf(num) >= 0) {
			System.out.println("\nO numero " + num + " está localizado na posição: " + numeros.indexOf(num));
		}else {
			System.out.println("\nO numero " + num + " não foi encontrado!");
		}
		
	}

}
