package ExLacoRepeticao;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2, i;
		Scanner leitura= new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero do intervalo: ");
		n1 = leitura.nextInt();
		System.out.println("Digite o último numero do intervalo: ");
		n2 = leitura.nextInt();
		
		if(n1 < n2) {
			for(i = n1; i <= n2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n%d é multiplo de 3 e 5",i);
				}
			}
			
		}else {
			System.out.println("Intervalo inválido!");
		}
	}
}

