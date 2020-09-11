package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
	
		
		int[] vetor = new int[1000];
		Random random = new Random();
		
		for(int vet: vetor) {
			int randomNumber = random.nextInt(100)+1;
			vetor[vet] = randomNumber;
		}
		
		for(int i=1; i<3; i++) {			
			Thread vetorComNroPar = new ThreadVetor(i, vetor);
			vetorComNroPar.start();		
		}
	}
}
