package Vetores_Matrizes;

public class ExMatriz003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros ={{1,2,3} ,
						  {4,5,6} , 
						  {7,8,9}};
		int[] numerosPrincipal = new int[3];
		int somaSecundario = 0, somaPrincipal=0;
		
		//Armazena os valores da diagonal principal dentro do Vetor numerosPrincipal
		for(int i = 0; i < numeros.length;i++) {
			numerosPrincipal[i] = numeros[i][i];
		}
		
		//Mostrar os valores da Diagonal Principal
		System.out.println("\nElementos da Diagonal Principal:");
		for(int i = 0; i < numerosPrincipal.length; i++) {
			System.out.printf(numerosPrincipal[i] + "\t");
		}
		
		System.out.println("\nElementos da Diagonal Secundaria: ");
		for(int coluna = 2; coluna >= 0; coluna--) {
		
			System.out.printf(numeros[2 - coluna][coluna] + "\t");
			somaSecundario +=  numeros[2 - coluna][coluna];		
		}
		//MOSTRA A SOMA DA DIAGONAL PRINCIPAL
		System.out.println("\nSoma dos elementos da diagonal principal: ");
		for(int i = 0; i < numerosPrincipal.length; i++) {
			somaPrincipal += numerosPrincipal[i];
		}
		System.out.println(somaPrincipal);
		
		//Mostra a soma da diagonal secundaria!
		System.out.printf("Soma dos elementos da diagonal secundaria: \n%d", somaSecundario);
		
	}

}
