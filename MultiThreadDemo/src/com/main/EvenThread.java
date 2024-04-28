package com.main;

public class EvenThread extends Thread{
   private NumberGenerator numberGenerator;
    
   
   public EvenThread(NumberGenerator numberGenerator) {
	   this.numberGenerator = numberGenerator;
	   
   }
   public void run() {
	   try {
		   numberGenerator.generateEven();
		   
	   }catch (InterruptedException e) {
		   e.printStackTrace();
	   }
   }
}
