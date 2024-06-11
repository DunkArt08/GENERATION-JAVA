package Lista01;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		String tipo1, tipo2, tipo3;

		Scanner leia = new Scanner(System.in);

		System.out.println("É Vertebrado ou Invertebrado?: ");
		tipo1 = leia.next();
		System.out.println("Entre com o segundo argumento: ");
		tipo2 = leia.next();
		System.out.println("Entre com a terceiro argumento ");
		tipo3 = leia.next();

		if (tipo1.equalsIgnoreCase("vertebrado")) {
			if (tipo2.equalsIgnoreCase("ave")) {
				if (tipo3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma águia!");
				} else {
					System.out.println("É uma pomba!");
				}
			} else {
				if (tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um ser humano!");
				} else {
					System.out.println("É uma vaca!");
				}
			}
		} else {
			if (tipo2.equalsIgnoreCase("inseto")) {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga!");
				} else {
					System.out.println("É uma lagarta!");
				}
			} else {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga!");
				} else {
					System.out.println("É uma minhoca!");
				}
			}
		}

	}

}