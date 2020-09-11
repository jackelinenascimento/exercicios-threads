package controller;

public class ThreadCalc extends Thread{
	
	int linha;
	private double num1, num2, num3, num4, num5;
	
	public ThreadCalc(int linha, double num1, double num2, double num3, double num4, double num5) {
		this.linha = linha;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}
	
	@Override
	public void run() {
		calc(linha, num1, num2, num3, num4, num5);
	}

	private void calc(int linha, double num1, double num2, double num3, double num4, double num5) {
		double resp = num1 + num2 + num3 + num4 + num5;
		System.out.println("Soma da linha: " + linha + " é " + resp);
	}

}
