package view;

import controller.ThreadMatriz;

public class Principal3 {

	public static void main(String[] args) {
		int[][] matriz = new int [3][5];
		
		for(int i = 0; i < 3 ; i++){  
	           for(int k = 0; k < 5 ; k++){  
	            matriz[i][k] = (int)(Math.random()*10);  
	           System.out.println(matriz[i][k]);
	           }  
	           System.out.println();
		}  
		
		for (int i = 0; i < 3; i++){
			Thread ThreadMatriz = new ThreadMatriz(matriz, i);
			ThreadMatriz.start();
			}
	}
}
