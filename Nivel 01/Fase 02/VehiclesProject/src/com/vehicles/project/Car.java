package com.vehicles.project;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("El size debe ser diferente de 2.");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if ((rightWheel.getbrand() != leftWheel.getbrand()) || (rightWheel.getdiameter() != leftWheel.getdiameter()))
			throw new Exception("Las ruedas izquierda y derecha no son iguales.");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	
	public String getbrand() {
		return brand;
	}
	public String getcolor() {
		return color;
	}
	
	public static void main(String[] args) {
	}
}
