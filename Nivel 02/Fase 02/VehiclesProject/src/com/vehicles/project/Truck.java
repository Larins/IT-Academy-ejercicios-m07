package com.vehicles.project;

import java.util.*;

public class Truck extends Vehicle {

	public Truck(String plate, String brand, String color, String type) {
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

	public static void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("El size debe ser diferente de 2.");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if ((rightWheel.getbrand() != leftWheel.getbrand()) || (rightWheel.getdiameter() != leftWheel.getdiameter()))
			throw new Exception("Las ruedas izquierda y derecha no son iguales.");

		wheels.add(leftWheel);
		wheels.add(rightWheel);
	}
	
	public static void main(String[] args) {
		
	}
}
