package com.blackwell;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private BlockingQueue<Integer> queue = null;
	
	public Consumer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			int value = -1;
			while(value != 99){
				Thread.sleep((long)(Math.random()*1000));
				value = queue.take();
				System.out.println("Consumed: " + value);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
