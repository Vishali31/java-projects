package com.main;

public class OddThread extends Thread {
	private NumberGenerator numberGenerator;
    
	   
	   public OddThread(NumberGenerator numberGenerator) {
		   this.numberGenerator = numberGenerator;
		   
	   }
	   public void run() {
		   try {
			   numberGenerator.generateOdd();
			   
		   }catch (InterruptedException e) {
			   e.printStackTrace();
		   }
	   }
}
