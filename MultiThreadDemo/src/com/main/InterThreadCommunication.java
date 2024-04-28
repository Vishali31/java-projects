package com.main;

public class InterThreadCommunication {

	public static void main(String[] args) {
		NumberGenerator numberGenerator = new NumberGenerator();

		EvenThread t1 = new EvenThread(numberGenerator);
		t1.setName("E");
		t1.start();

		OddThread t2 = new OddThread(numberGenerator);
		t2.setName("o");
		t2.start();

	}

}
