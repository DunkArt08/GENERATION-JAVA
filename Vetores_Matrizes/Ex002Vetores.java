package Vetores_Matrizes;

public class Ex002Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {2,5,1,3,4,9,7,8,10,6};
		int numPar,numImpar;
		float media = 0,numSoma=0;
		
		
		//Mostra os indices que contém numeros impares
		System.out.println("Elementos nos índices ímpares:");
		for(int i = 0; i < numeros.length;i++) {
			if(i % 2 != 0) {
				System.out.printf( numeros[i] + "\t");
			}
		}
		
		//Mostra os números pares
		System.out.println("\nElementos pares:");
		for(int i = 0; i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				System.out.printf(numeros[i] + "\t");
			}
		}
		
		//Soma Todos os numeros
		for (int i = 0; i < numeros.length; i++) {
			numSoma += numeros[i];
		}
		System.out.println("\n\nSoma: " + numSoma);
	
		//Média
		if(numSoma != 0) {
			media = numSoma / numeros.length;
			System.out.printf("\nMédia: %.2f" , media);
		}	
	}

}
