package com.corejava;

public class VehicleService {
	public Car createCar(String name, String modelName, String Type) {
		return new Car(name, modelName, Type);
	}

	public Bike createBike(String name, String modelName, String Type) {
		return new Bike(name, modelName, Type);
	}

	public int compareMaxSpeed(Vehicle first, Vehicle second) {
		String type1 = first.getType();
		String type2 = second.getType();

		if (!type1.equalsIgnoreCase("sports") || !type2.equalsIgnoreCase("sports")) {
			return 200;
		}
		int maxSpeed1 = first.maxSpeed(type1);
		int maxSpeed2 = second.maxSpeed(type2);
		return Integer.compare(maxSpeed1, maxSpeed2);

	}
}