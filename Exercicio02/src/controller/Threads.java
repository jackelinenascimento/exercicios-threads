package controller;

public class Threads extends Thread {

	private int idThread;
	
	public Threads(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		print(idThread);
	}

	private void print(int idThread) {
		System.out.println("Identificação: " + idThread);
	}
	
	
}
