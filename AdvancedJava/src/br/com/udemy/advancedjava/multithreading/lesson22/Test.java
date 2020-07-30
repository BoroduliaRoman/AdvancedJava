package br.com.udemy.advancedjava.multithreading.lesson22;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

	}

	private static void produce() throws InterruptedException {
		Random random = new Random();

		while (true) {
			queue.put(random.nextInt(100));
		}
	}

	private static void consumer() throws InterruptedException {
		Random random = new Random();

		while (true) {
			Thread.sleep(100);

			if (random.nextInt(10) == 5) {

				System.out.println(queue.take());
				System.out.println("Queue size is: " + queue.size());
			}
		}
	}
}
