package com.blackwell;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue<Integer> queue = null;
	
	public Producer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
		try{
			for(int i = 0; i < 50; i++){
				Thread.sleep((long)(Math.random()*750));
				queue.put(i);
				System.out.println("Produced: " + i);
			}
		}catch(InterruptedException ie){
			System.out.println("Interrupted Exception in producer run.");
		}
		
	}

}
