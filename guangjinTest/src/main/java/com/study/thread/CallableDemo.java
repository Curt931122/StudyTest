package com.study.thread;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String>{
	private String threadName;
	
	public CallableDemo(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
		return threadName;
	}

}
