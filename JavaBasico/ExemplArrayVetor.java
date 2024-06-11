package JavaBasico;

import java.util.Scanner;

public class ExemplArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] media = new float[4];	
		float n1,n2,n3,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++) {
			System.out.println("Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3) / 3;
			somaMedia += media[x];
			
		}
	}

}
