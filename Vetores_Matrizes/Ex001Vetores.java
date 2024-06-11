package Vetores_Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex001Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  numeros[] = {2,5,1,3,4,9,7,8,10,6};
		int valor,i,confere=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o numero que deseja encontrar: ");
		valor = leia.nextInt();
		System.out.println(valor);
		
		for(i = 0; i<numeros.length;i++) {
			if(numeros[i] == valor) {
				confere = i;
			}
		}
		if(confere !=0) {
		System.out.printf("O numero %d está na posição: %d",valor,confere);
		}else {
			System.out.printf("O numero %d não foi encontrado!",valor);
		}
		
		
	}

}
