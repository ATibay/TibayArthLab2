package com.car;

public class Hybrid extends Car {
	String motor;
	String charging;
	
	public Hybrid(String driveTrain, String engine, String color, String body, String transmission, String fuelType, double fuelCapacity, int engineOutput, int priceRange, double displacement,String motor, String charging) {
		super(driveTrain, engine, color, body, transmission, fuelType, fuelCapacity, engineOutput, priceRange, displacement);
		this.motor = motor;
		this.charging = charging;
		
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public void setCharging(String charging) {
		this.charging = charging;
	}
	
	public String motor() {
		return this.motor;
		
	}
	
	public String charging() {
		return this.charging;
		
	}
	
	public void periodicEngineShutOff(String automatic) {
		System.out.println("This car has the ability to " + automatic + " when it stops.");
		
	}
	
	public void reduceDrag(String advancedAerodynamics) {
		System.out.println("This car has the ability to " + advancedAerodynamics);
		
	}
	
}