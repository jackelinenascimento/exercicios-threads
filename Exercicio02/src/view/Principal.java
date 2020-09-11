package view;

import controller.Threads;

public class Principal {

	public static void main(String[] args) {

		for(int idThread = 0; idThread < 5; idThread++) {
			Thread elemento = new Threads(idThread);
			elemento.start();
		}

	}

}
