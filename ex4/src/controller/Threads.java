package controller;

import java.util.Random;

public class Threads extends Thread{
	Random r = new Random(); 
	private int idfrog;
	public double percurso;
	static int posicoes;
	public Threads(int idfrog, double percurso) {
		this.idfrog = idfrog;
		this.percurso = percurso;
	}
	
	@Override
	public void run() {
		
		int percorrido = 0;
		while (percorrido < percurso){
			int salto = r.nextInt(5);
			System.out.println("Sapo " + (idfrog + 1) + " Salto: " + salto);
			percorrido = percorrido + salto;
			
		} 
			System.out.println("Sapo: " + (idfrog + 1) + " Colocação " + posicoes() + "\n ");
		}

		
	public int posicoes() {
		posicoes++;
		return posicoes;
	}
}
	
