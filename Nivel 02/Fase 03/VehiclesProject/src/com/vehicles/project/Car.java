package com.vehicles.project;

import java.util.*;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color, String type) {
		super(plate, brand, color, type);
	}

	public String getbrand() {
		return brand;
	}
	public String getcolor() {
		return color;
	}
	public String getplate() {
		return plate;
	}
	public String gettype() {
		return type;
	}
	
	public static void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public static void addTwoWheels(List<Wheel> wheels){

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);			

		wheels.add(leftWheel);
		wheels.add(rightWheel);
	}
	
	public static void main(String[] args) {
		
	}
}
