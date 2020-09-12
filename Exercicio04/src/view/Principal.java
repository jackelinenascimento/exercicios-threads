package view;

import controller.Sapinho;

public class Principal {

	public static void main(String[] args) {

		double maxSalto = Math.random()*5;
		double distanciaCorrida = Math.random()*50;
		
		for(int sapo = 1; sapo<6; sapo++) {
			Thread sapinho = new Sapinho(maxSalto, distanciaCorrida);
			sapinho.start();
		}

	}

}
