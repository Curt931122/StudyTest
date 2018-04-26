package com.study.thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String[] arg = {"callable1","callable2","callabl3"};
		ExecutorService pool = Executors.newFixedThreadPool(3);
	    Set<Future<String>> set = new HashSet<Future<String>>();
	    for (String word: arg) {
	      Callable<String> callable = new CallableDemo(word);
	      Future<String> future = pool.submit(callable);
	      set.add(future);
	    }
	    String sum = "";
	    for (Future<String> future : set) {
	    	sum = sum + future.get();
	    }
	    System.out.printf(sum);
	    pool.shutdown();
	}

}
