package com.car;

public class Test2 {

	public static void main(String[] args) {
		Hybrid h1 = new Hybrid ("Parallel", "Hybrid fuel", "Black", "Coupe", "Automatic", "Gasoline", 17.2, 120, 2339000, 5.0, "Electric", "Level Two");
			System.out.println("Hybrid : h1");
			System.out.println("Drivetrain : " + h1.getDriveTrain());
			System.out.println("Engine : " + h1.getEngine());
			System.out.println("Color : " + h1.getColor());
			System.out.println("Body : " + h1.getBody());
			System.out.println("Transmission : " + h1.getTransmission());
			System.out.println("Fuel Type : " + h1.getFuelType());
			System.out.println("Fuel Capacity : " + h1.getFuelCapacity());
			System.out.println("Engine Output : " + h1.getEngineOutput());
			System.out.println("Price Range : " + h1.getPriceRange());
			System.out.println("Displacement : " + h1.getDisplacement());
			h1.periodicEngineShutOff("automatically shut-off engine");
			h1.reduceDrag("reduce drag. ");
			System.out.println();
			
		Hybrid h2 = new Hybrid("Series", "Continuously Outboard Recharged Electric Vehicle", "Blue", "Sedan", "Continuously Variable Transmission", "Diesel", 15.9, 120, 2354000, 5.0, "Electric", "Level One");
			System.out.println("Hybrid : h2");
			System.out.println("Drivetrain : " + h2.getDriveTrain());
			System.out.println("Engine : " + h2.getEngine());
			System.out.println("Color : " + h2.getColor());
			System.out.println("Body : " + h2.getBody());
			System.out.println("Transmission : " + h2.getTransmission());
			System.out.println("Fuel Type : " + h2.getFuelType());
			System.out.println("Fuel Capacity : " + h2.getFuelCapacity());
			System.out.println("Engine Output : " + h2.getEngineOutput());
			System.out.println("Price Range : " + h2.getPriceRange());
			System.out.println("Displacement : " + h2.getDisplacement());
			h1.periodicEngineShutOff("automatically shut-off engine");
			h1.reduceDrag("reduce drag. ");
			System.out.println();
			
		Car c1 = new Car ("AWD","V8","Black", "SUV", "Automatic", "Diesel", 6.5, 120, 1500000, 5.0);
			System.out.println("Car : c1");
			System.out.println("Drivetrain : " + c1.getDriveTrain());
			System.out.println("Engine : " + c1.getEngine());
			System.out.println("Color : " + c1.getColor());
			System.out.println("Body : " + c1.getBody());
			System.out.println("Transmission : " + c1.getTransmission());
			System.out.println("Fuel Type : " + c1.getFuelType());
			System.out.println("Fuel Capacity : " + c1.getFuelCapacity());
			System.out.println("Engine Output : " + c1.getEngineOutput());
			System.out.println("Price Range : " + c1.getPriceRange());
			System.out.println("Displacement : " + c1.getDisplacement());
			c1.regulateTemp("Yes.");
			c1.safetyFeature("Airbags and Seatbelts.");
			c1.shiftGears(6);
			System.out.println();

	}

}
