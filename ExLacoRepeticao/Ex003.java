package ExLacoRepeticao;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, idadeMaior=0,idadeMenor=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade > 50) {
				idadeMaior++;
			}else if(idade <= 21 && idade > 0) {
				idadeMenor++;
			}
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d",idadeMenor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d",idadeMaior);
	}

}
