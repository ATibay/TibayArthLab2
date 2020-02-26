package com.car;

public class Car {
		private String driveTrain;
		private String engine;
		private String color;
		private String body;
		private String transmission;
		private String fuelType;
		private double fuelCapacity;
		private int engineOutput;
		private int priceRange;
		private double displacement;
		
		public Car (String driveTrain, String engine, String color, String body, String transmission, String fuelType, double fuelCapacity, int engineOutput, int priceRange, double displacement) {
			this.driveTrain = driveTrain;
			this.engine = engine;
			this.color = color;
			this.body = body;
			this.transmission = transmission;
			this.fuelType = fuelType;
			this.fuelCapacity = fuelCapacity;
			this.engineOutput = engineOutput;
			this.priceRange = priceRange;
			this.displacement = displacement;
			
		}
		
		public String getDriveTrain() {
			return this.driveTrain;
		}
		
		public String getEngine() {
			return this.engine;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public String getBody() {
			return this.body;
		}
		
		public String getTransmission() {
			return this.transmission;
		}
		
		public String getFuelType() {
			return this.fuelType;
		}
		
		public double getFuelCapacity() {
			return this.fuelCapacity;
		}
		
		public int getEngineOutput() {
			return this.engineOutput;
		}
		
		public int getPriceRange() {
			return this.priceRange;
		}
		
		public double getDisplacement() {
			return this.displacement;
		}
		
		public void regulateTemp (String temp) {
			System.out.println("Can this car regulate its temperature? " + temp);
		}
		
		public void safetyFeature (String safety) {
			System.out.println("This car has a safety feature of " + safety);
		}
		
		public void shiftGears (int gear) {
			System.out.println("This car has " + gear + " gears.");
		}
}
