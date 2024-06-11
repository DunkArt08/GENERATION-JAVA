package ExLacoRepeticao;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros,contPar = 0,contImpar = 0,i;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(i = 1; i <= 10; i++) {
			System.out.printf("Escreva o %d° numero: ",i);
			numeros = leia.nextInt();
			if(numeros %2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		System.out.printf("Total de números pares: %d",contPar);
		System.out.printf("\nTotal de números impares: %d",contImpar);
	}

}
