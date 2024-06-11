package JavaBasico;

import java.util.Arrays;

public class ExMatriz {

    public static void main(String[] args) {
    	//*************ORDENAR ARRAYS EM ORDEM CRESCENTE E DECRESCENTE!*****************************
    	/*
        int vetorInteiros[] = { 3, 2, 1, 6, 5, 10, 7, 4, 9, 8 };

		Arrays.sort(vetorInteiros);

		System.out.println("Array de primitivos em Ordem Crescente \n");
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(vetorInteiros[indice]);
		}
		
		System.out.println("Na posição 9 tem o valor: " + vetorInteiros[9]);

		
		System.out.println("\nArray de primitivos em Ordem Decrescente \n");
		
		int[] reverseArray = new int[vetorInteiros.length];

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			reverseArray[indice] = vetorInteiros[(vetorInteiros.length - 1) - indice];
		}

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(reverseArray[indice]);
		}
		*/
    	
    	//*************Procurar um valor dentro da Array!*****************************
    	int vetorInteiros[] = {1,2,3,4,5,10,7,6,9,8};
		
		//Ordena o Vetor 
		Arrays.sort(vetorInteiros);
		
		System.out.println("\nVetor Ordenado");
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			 System.out.println(vetorInteiros[indice]);
		}

        System.out.println("\nO elemento 10 Existe? Qual é a posição?");

        int posicao = Arrays.binarySearch(vetorInteiros, 10);
        
        // Se a posição for positiva = Encontrou
        if (posicao >= 0 )
			System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
		else
			System.out.println("\nElemento não encontrado!");

    }		
    }

