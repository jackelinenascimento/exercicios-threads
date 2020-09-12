package view;

import java.util.Random;

import controller.Sapinho;

public class Principal {

	public static void main(String[] args) {

		Random gerador = new Random();
		int salto = gerador.nextInt();
		int[] vetorRanking = new int[5];
				
		int maxSalto = gerador.nextInt(5);
		int distanciaCorrida = gerador.nextInt(25);
		
		System.out.println("Salto máximo: " + maxSalto);
		System.out.println("Distância da corrida: " + distanciaCorrida);
		
		System.out.println("***** CORRIDA DE SAPINHOS *****");
		
		for(int sapo = 0; sapo<5; sapo++) {
			Thread sapinho = new Sapinho(maxSalto, distanciaCorrida);
			sapinho.start();
			vetorRanking[sapo] = (int)sapinho.getId();
		}

	}

}
