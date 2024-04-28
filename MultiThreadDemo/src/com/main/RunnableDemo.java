package com.main;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("main starts...");
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread (myRunnable,"T1");
		t1.start();
		 for(int j=51;j<=100;j++) {
			  System.out.println(Thread.currentThread().getName()+""+j)
;		  } 
		 System.out.println("main ends...");
	}

	}


