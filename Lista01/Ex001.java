package Lista01;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		c = leia.nextInt();
		
		resultado = a+b;
		
		if(resultado > c) {
			System.out.println("A soma de A e B são maiores que C!");
		}else if(resultado < c) {
			System.out.println("A soma de A e B são menores que C!");
		}else{
			System.out.println("A soma de A e B são iguais a C!");
		}
	}

}
