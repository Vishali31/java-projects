package com.corejava;

public class Bike extends AbstractManufacturer implements Vehicle {

	private String bikeType;

	public Bike(String name, String modelName, String bikeType) {
		super(name, modelName);
		this.bikeType = bikeType;
	}

	@Override
	public String getType() {
		return this.bikeType;
	}

	@Override
	public int maxSpeed(String bikeType) {
		if (bikeType.equalsIgnoreCase("sports")) {
			return 360;
		} else if (bikeType.equalsIgnoreCase("splender")) {
			return 230;
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