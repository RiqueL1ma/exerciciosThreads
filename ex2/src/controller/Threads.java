package controller;

public class Threads extends Thread{
	private int[][] matriz;
	private int aux;
	
	public Threads(int[][] matriz, int aux) {
		this.matriz = matriz;
		this.aux = aux;
		
	}
	
	@Override
	public void run() {
			int i = aux;
			int soma = 0;
			for(int j = 0; j < 5; j++) {
			
			 soma = soma + matriz[i][j];
			 
			}
			System.out.println("Linha " + (i+1) + " - Soma = " + soma);
		
	}
	
}
