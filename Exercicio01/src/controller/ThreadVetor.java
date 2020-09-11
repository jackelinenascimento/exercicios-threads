package controller;

public class ThreadVetor extends Thread {
	
	private int numero;
	private int[] vetor;
	
	public ThreadVetor(int numero, int[] vetor) {
		this.numero = numero;
		this.vetor = vetor;
	}
	
	public void run() {
		
		long start = System.currentTimeMillis();
		
		if(numero % 2 == 1) {
			for(int i=0; i<vetor.length; i++) {}
		} else {
			for(int vet: vetor) {}
		}
		
		long time = System.currentTimeMillis() - start;
		
		if(numero % 2 == 1) {			
			System.out.println("Thread impar ==> levou " + time + " ms.");
		} else {
			System.out.println("Thread par ==> levou " + time + " ms.");
		}
	}
}
