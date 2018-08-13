package com.study.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestVolatile2 {
	private volatile static boolean flag = false;
    public static void main(String[] args) {
    	try {
			TestVolatile2.refershFlag();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void refershFlag() throws InterruptedException {
	    
	    Thread threadA = new Thread(new Runnable() {
	        
	        @Override
	        public void run() {
	            while (!flag) {
	                //do something
	            }
	        }
	    });
	    
	    Thread threadB = new Thread(new Runnable() {
	        
	        @Override
	        public void run() {
	            
	            flag = true;
	        }
	    });
	    
	    DateFormat dateFormat  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    
	    System.out.println("threadA start" + dateFormat.format(new java.util.Date()));
	    threadA.start();
	    
	    Thread.sleep(100);
	    
	    threadB.start();
	    
	    threadA.join();
	    System.out.println("threadA end" + dateFormat.format(new java.util.Date()));
	}
}
