package br.com.udemy.advancedjava.multithreading.lesson18;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		Scanner scanner = new Scanner(System.in);
		scanner.hasNextLine();

		myThread.shutDown();
		scanner.close();
	}

}

class MyThread extends Thread {
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		this.running = false;
	}
}