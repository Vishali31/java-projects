package com.corejava;

 

public abstract class AbstractManufacturer implements Vehicle {
	private String name;
	private String modelName;
	
	public AbstractManufacturer(String name,String modelName) {
		this.name = name;
		this.modelName = modelName;
	}
	
	public String getModelName() {
		return modelName;
	}
	 public abstract String getType();
	
	public String getName()	{
		return name;
	}
	
	public abstract String getManufacturerInformation();
	
}

