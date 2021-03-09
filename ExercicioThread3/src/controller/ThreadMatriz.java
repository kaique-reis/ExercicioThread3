package controller;

public class ThreadMatriz extends Thread{

	int matriz[][];
	int i;
	
	public ThreadMatriz(int matriz[][], int i){
		this.matriz = matriz;
		this.i = i;
	}
	@Override
	public void run() {
		Soma(matriz, i);
	}
	
	private void Soma (int matriz[][], int i ){
		int res = 0;
		for (int j = 0; j < 5; j++){
				res += matriz[i][j]; 
			}
			System.out.println("TID #"+getId() + " Soma da linha " + (i + 1 ) + " é: " + res);
		}
	}
