package controller;

import java.util.Random;

public class Sapinho extends Thread {
	
	private double maxSalto;
	private double distanciaCorrida;
	
	public Sapinho(double maxSalto, double distanciaCorrida) {
		this.maxSalto = maxSalto;
		this.distanciaCorrida = distanciaCorrida;
	}
	
	@Override
	public void run() {
		caminhoPercorrido(distanciaCorrida);
		
	}
	
	private double saltar(double maxSalto) {	
		Random gerador = new Random();
		double salto = gerador.nextDouble()*maxSalto;
		return salto;
	}
	
	private void caminhoPercorrido(double distanciaCorrida) {
		
		double caminho = 0;
		int pulos = 0;
		
		do {
			caminho += saltar(maxSalto);
			pulos++;
			System.out.println("Pulo nro: " + pulos + " do sapinho id#" + getId());
		} while(caminho < distanciaCorrida);
		
		System.out.println("Sapinho " + getId() + " ==> Distancia percorrida: " + caminho + " da distância total: " + distanciaCorrida);
	}
}
