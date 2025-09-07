package controller;

import java.util.concurrent.Semaphore;

public class CozinhaCtrl extends Thread {
	private final int dishNumber;
	private Semaphore mutex;
	
	public CozinhaCtrl(int dishNumber, Semaphore mutex) {
		this.dishNumber = dishNumber;
		this.mutex = mutex;
	}
	

	@Override
	public void run() {
		writeDish();
	}

	
	private int getRandomTime(int minTime, int maxTime) {
		int timeNeeded = (int)(minTime + (maxTime - minTime) * Math.random());
		return timeNeeded;
		
	}

	
	private void writeDish() {
		int minTime = 0;
		int maxTime = 0;
		int timeNeeded = 0;
		
		if (dishNumber % 2 != 0) {
			System.out.println("prato numero #"+dishNumber+", sopa de cebola, enviado para o preparo");
			minTime = 500;
			maxTime = 800;

		} else {
			System.out.println("prato numero #"+dishNumber+", lasanha a bolonhesa, enviado para o preparo");
			minTime = 600;
			maxTime = 1200;

		}

			timeNeeded = getRandomTime(minTime, maxTime);
			dishProgress(timeNeeded);
			finished();
	}
	

	private int calculatePercentage(int currentTime, int timeNeeded) {
		double purePercentage = (currentTime / (double)timeNeeded);
		int percentage = (int)(purePercentage * 100);
		return percentage;
		
	}
	
	private void finished() {
		try {
			mutex.acquire();
			sendDish();
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
			
		} finally {
			mutex.release();
			
		}

	}

	private void dishProgress(int timeNeeded) {
		int currentTime = 0;
		int percentage = 0;
		final int sleepyTime = 100; // 100ms :)

		while (currentTime < timeNeeded) {
			percentage = calculatePercentage(currentTime, timeNeeded);
			System.out.println("prato #"+dishNumber+" "+percentage+"% concluido");
			currentTime += 100;
			
			try {
				sleep(sleepyTime);
				
			} catch (Exception e) {
				System.err.println(e.getStackTrace());
				
			}

		}
	
	}
	
	private void sendDish() {
		System.out.println("prato n° #"+dishNumber+" finalizado e enviado para a entrega...");
		
		try {
			sleep(500);
			
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
			
		}
		
	}
}
