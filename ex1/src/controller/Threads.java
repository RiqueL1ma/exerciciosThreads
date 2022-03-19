package controller;

public class Threads extends Thread{
	private int idThread;
	
	public Threads(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		System.out.println("TID: " + getId() + ", Progresso: " + idThread);
		
	}
	
}
