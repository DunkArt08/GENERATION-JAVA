package ExLacoRepeticao;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,totalNum=0;
		float mediaNum,somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num % 3 == 0 && num != 0) {
				somaNum += num;
				totalNum++;
			}
		}while(num != 0);
		
		mediaNum = somaNum / totalNum;
		
		System.out.printf("\nVocê digitou exatos números múltiplos de 3 é: %d", totalNum);
		System.out.printf("A soma de todos os números múltiplos de 3 é: %.2f", somaNum);
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", mediaNum);
		
	}

}
