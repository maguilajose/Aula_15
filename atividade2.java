package Auladia15;

public class atividade2 {

	public static void main(String[] args) {
		 int[][] matriz = new int[4][4];

	        // Preenchendo a diagonal da matriz
	        for (int i = 0; i < 4; i++) {
	            matriz[i][i] = i + 1; // Preenche a diagonal com valores de 1 a 4
	        }

	        // Apresentando a matriz
	        System.out.println("A matriz resultante é:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}