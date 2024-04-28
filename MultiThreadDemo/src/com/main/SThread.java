package com.main;

public class SThread extends Thread{
	private MyResource myResource;
	 public SThread(MyResource  myResource) {
		 this. myResource =  myResource;
		 
	 }
	
public void run() {
	 myResource.display();
}
}
