package com.blackwell;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MultiThreadDriver {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(20);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
		System.out.println("Thread1 name: " + t1.getName() + " Priority: " + t1.getPriority());
		System.out.println("Thread2 name: " + t2.getName() + " Priority: " + t2.getPriority());
	}

}
