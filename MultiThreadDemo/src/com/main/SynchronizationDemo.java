package com.main;

public class SynchronizationDemo {

	public static void main(String[] args) {
		String st = "dfghh";
		 MyResource  myResource = new  MyResource();
		  SThread Sthread = new  SThread( myResource );
		  Sthread.setName("s1");
		  Sthread.start();
		  
		  SThread Sthread2 = new  SThread( myResource );
		  Sthread2.setName("s2");
		  Sthread2.start();
	}

}