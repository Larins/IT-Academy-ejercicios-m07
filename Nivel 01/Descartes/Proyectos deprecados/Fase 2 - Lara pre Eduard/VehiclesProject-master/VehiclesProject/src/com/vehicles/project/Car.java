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

		//Comento esta parte porque equals compara los objetos y no sus valores.
		/*if (!rightWheel.equals(leftWheel))
		throw new Exception("Las ruedas izquierda y derecha no son iguales.");*/
		
		//La excepción alternativa a continuación:
		//Nota: Como los atributos BRAND y DIAMETER son privados, hay que meterlos en forma de GETER
		if ((rightWheel.getbrand() != leftWheel.getbrand()) || (rightWheel.getdiameter() != leftWheel.getdiameter()))
			throw new Exception("Las ruedas izquierda y derecha no son iguales.");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	
	public String getplate() throws Exception{
		String plateExpression = "[A-Za-z]{4}-[0-9]{2,3}";
		if (plate != plateExpression)
			throw new Exception("La matrícula debe tener 4 números y 2 ó 3 letras.");
		return plate;
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
