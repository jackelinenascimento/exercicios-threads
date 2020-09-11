package view;

import java.util.Random;

import controller.ThreadCalc;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] matriz = new double[3][5];
		
		Random random = new Random();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = random.nextDouble()*100; 
			}
		}
		
		for(int i=0; i<3; i++) {
			
			Thread threadCalc = new ThreadCalc(i+1, matriz[i][0], matriz[i][1], matriz[i][2], matriz[i][3], matriz[i][4]);
			threadCalc.start();
		}
	}

}
