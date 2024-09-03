package com.tnsif.day12.ThreadLifecycle;

import com.tnsif.day11.ThreadandMultithread.MyChildThread;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		MyChildThread myThread = new MyChildThread();
		System.out.println("Before Runnable stage Thread is alive or not?"+myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(4000);
		}catch (InterruptedException exp) {
			System.out.println("Thread is Interrupted!"+exp);
		}
		System.out.println("After complete excution of Thread, it is alive or not?"+myThread.isAlive());
	}

}
