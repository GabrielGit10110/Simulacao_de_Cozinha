package view;

import java.util.concurrent.Semaphore;

import controller.CozinhaCtrl;

public class Cozinha {
	
	public static void main(String[] args) {
		Semaphore mutex = new Semaphore(1);
		
		for (int plate = 1; plate <= 5; plate++) {
			CozinhaCtrl makeDish = new CozinhaCtrl(plate, mutex);
			makeDish.start();
			
		}
		
	}

}
