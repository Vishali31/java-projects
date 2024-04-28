package com.main;

public class MyRunnable implements Runnable {
	
	 @Override
		public void run() {
		 
		 for(int j=1;j<=50;j++) {
			 
			 System.out.println(Thread.currentThread().getName()+""+j)
;		    
		 }
	 }

}
