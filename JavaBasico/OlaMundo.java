package JavaBasico;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Daniel Lucas";
		int idade = 19;
		float altura = 1.84f, nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nSeu nome é: " + nome );
		System.out.println("\nSua idade é: " + idade);
		System.out.println("\nSua altura é: " + altura);
		
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nA sua média foi de: " + media);
		//Para arredondar os valores da média
		System.out.printf("\nSua média foi de: %.2f",media);
		
		nota1 = (float) Math.pow(nota2,3);
		nota2 = (float) Math.sqrt(nota3);
		
		// char resp = 'S'; 
	}

}
