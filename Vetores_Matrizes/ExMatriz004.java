package Vetores_Matrizes;

public class ExMatriz004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  notasAlunos[][]  = {{4,5,7,3}        , 
				                    {2.5,6.5,4.7,8}  ,
				                    {10,8.5,9.5,8}   ,
				                    {9,6.5,7.6,8.2}  ,
				                    {5,5,5,6.3}      ,
				                    {7,8,9,8.5}      ,
				                    {5.5,3.5,2.5,1}  ,
				                    {8,9,10,9.5}     ,
				                    {5.6,5.8,6.5,7}  ,
				                    {7.5,8.5,9.5,10}};
		float mediaAlunos[] = new float [10];
		float soma=0;
		
		
		for(int linha = 0; linha < notasAlunos.length; linha++) {
			for(int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				soma += notasAlunos[linha][coluna]; 
			}
			mediaAlunos[linha] = soma/4;
			soma = 0;
		}
		for(int i = 0; i < mediaAlunos.length; i++) {
			System.out.printf("\nAluno " + (i+1) + ": %.1f",mediaAlunos[i]);
		}
		
		
		
	}

}
