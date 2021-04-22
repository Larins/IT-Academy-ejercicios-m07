package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected static String plate;
	protected static String brand;
	protected static String color;
	protected static List<Wheel> wheels = new ArrayList<Wheel>();
	protected static String type;

	public Vehicle(String plate, String brand, String color, String type) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
}
