package ExLacoRepeticao;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,idGenero,funcaoDev,mulherFront=0,homemVelhoMobile=0,nBiFullstack=0,backend=0, totalPessoas=0;
		String continuar = "S";
		float mediaIdade,totalIdade=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(continuar.equalsIgnoreCase("S")) {
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
			System.out.println("Identidade de gênero: ");
			idGenero = leia.nextInt();
			System.out.println("Pessoa Desenvolvedora: ");
			funcaoDev = leia.nextInt();
			switch (idGenero) {
			case 1:// Mulher CIS			
				if(funcaoDev == 2) { // Mulher que é Frontend
					mulherFront++;
				}
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			case 2: // Homem Cis
				if(funcaoDev == 3 && idade >= 40) {
					homemVelhoMobile++;
				}
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			case 3: // Nao Binario
				if(funcaoDev == 4 && idade <= 30) {
					nBiFullstack++;
				}
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			case 4: // Mulher Trans
				if(funcaoDev == 2) { // Mulher que é Frontend
					mulherFront++;
				}
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			case 5: // Homem Trans
				if(funcaoDev == 3 && idade >= 40) {
					homemVelhoMobile++;
				}
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			case 6: //Outros
				if(funcaoDev == 1) {
					backend++;
				}
				break;
			default:
				System.out.println("Insira uma indentidade de genêro válida!");
				break;
			}
			if( (idGenero > 0 && idGenero <= 6 )  && (funcaoDev > 0 && funcaoDev <= 4)) {//Verifica se a pessoa respondeu corretamente o formulario!
				totalPessoas++; // Adiciona a pessoa	
				totalIdade += idade;
			}
			
			System.out.println("Deseja continuar? (S/N): ");
			continuar = leia.next();
		}
		
		mediaIdade = totalIdade / totalPessoas; // Calcular a média de idade geral
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d",backend);
		System.out.printf("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: %d",mulherFront);
		System.out.printf("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d",homemVelhoMobile);
		System.out.printf("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d",nBiFullstack);
		System.out.printf("\nO número total de pessoas que responderam à pesquisa: %d",totalPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
		
	}

}
