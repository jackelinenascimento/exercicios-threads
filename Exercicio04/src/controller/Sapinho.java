package controller;

import java.util.Random;

public class Sapinho extends Thread {
	
	private int maxSalto;
	private int distanciaCorrida;
	
	public Sapinho(int maxSalto, int distanciaCorrida) {
		this.maxSalto = maxSalto;
		this.distanciaCorrida = distanciaCorrida;
	}
	
	@Override
	public void run() {
		caminhoPercorrido(distanciaCorrida);
		
	}
	
	private int saltar(int maxSalto) {	
		Random gerador = new Random();
		int salto = gerador.nextInt()*maxSalto;
		return salto;
	}
	
	private void caminhoPercorrido(int distanciaCorrida) {
		
		int caminho = 0;
		int pulos = 0;
		
		while(caminho < distanciaCorrida){
			caminho += saltar(maxSalto);
			pulos++;
			System.out.println("Pulo nro: " + pulos + " do sapinho id#" + getId());
		}
		
		System.out.println("Sapinho " + getId() + " ==> Chegou!");
	}
}
