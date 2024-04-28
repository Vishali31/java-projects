package com.corejava;

public class Car extends AbstractManufacturer implements Vehicle {

	private String carType;

	public Car(String name, String modelName, String carType) {
		super(name, modelName);
		this.carType = carType;

	}

	@Override
	public String getType() {
		return this.carType;
	}

	@Override
	public int maxSpeed(String carType) {
		if (carType.equalsIgnoreCase("sports")) {
			return 250;
		} else if (carType.equalsIgnoreCase("sedan")) {
			return 190;
		} else {
			return 0;
		}

	}

	@Override
	public String getManufacturerInformation() {
		return String.format("Bike {manufacturer name: '%s',modelName:'%s',Type:'%s'}", getName(), getModelName(),
				getType());
	}

}