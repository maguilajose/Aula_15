package Auladia15;

import java.util.Random;

public class atividade1 {

	public static void main(String[] args) {
		 int[][] matriz = new int[5][5];
	        int soma = 0;

	        Random random = new Random();
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                
	                int percent = random.nextInt(100) + 1;
	                
	                
	                if (percent <= 50) {
	                    matriz[i][j] = random.nextInt(51) * 2; 
	                } else {
	                    matriz[i][j] = random.nextInt(50) * 2 + 1; 
	                }
	                
	                soma += matriz[i][j]; 
	            }
	        }

	        
	        System.out.println("Matriz 5x5 de inteiros pares:");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        
	        System.out.println("Soma de todos os números da matriz: " + soma);
	    }
	}