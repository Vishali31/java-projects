package com.corejava;

public class polymorphismMain {

	public static void main(String[] args) {
		VehicleService service = new VehicleService();
		Car car1 = service.createCar("Hyundai Creta", "Hyundai Creta 2024", "SX Tech");
		Car car2 = service.createCar("toyoto", "camry", "sedan");
		Bike bike1 = service.createBike("hero-honda", "Xpulse 400", "Super Splendor");
		Bike bike2 = service.createBike("Yamaha FZ", "FZS-FI V4 ", "The Yamaha MT-07");

		System.out.println(car1.getManufacturerInformation());
		System.out.println(car2.getManufacturerInformation());
		System.out.println(bike1.getManufacturerInformation());
		System.out.println(bike2.getManufacturerInformation());

		System.out.println("maximux speed of car: " + service.compareMaxSpeed(car1, car2) + "km/h");
		System.out.println("maximux speed of bike: " + service.compareMaxSpeed(bike1, bike2) + "km/h");
	}

}
