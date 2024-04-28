package com.main;

public class ThreadDemoOne {

	public static void main(String[] args) {
		
		 System.out.println("main starts...");
		 
		 MyThread mt = new MyThread();
		 mt.setName("T1");
		 mt.start();
		 
		 MyThread mt2 = new MyThread();
		 mt2.setName("T2");
		 mt2.start();
		 
		 for(int j=51;j<=100;j++) {
			  System.out.println(Thread.currentThread().getName()+""+j)
;		  } 
		 System.out.println("main ends...");
	}

}
