package com.vehicles.project;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
	
	public static String preguntarUsuario(String pregunta) {

		System.out.println("\nPor favor, introduce " + pregunta);
		String respuesta;
		Scanner entrada = new Scanner(System.in);
		entrada = new Scanner(System.in);
		respuesta = entrada.nextLine();
		return respuesta;
	}
	
	public static void main(String[] args) {
		boolean fin=false;
		do {
			fin=false;
			try {
	
				//Crear variables para preguntar al usuario.
				
					//Variables del usuario
					String fullname;
					String birthdate;
					String insurance; 
					String parking;
					List<LicenseData> id = new ArrayList<LicenseData>();
					List<LicenseData> namesurname = new ArrayList<LicenseData>();
					List<LicenseData> expdate = new ArrayList<LicenseData>();
					List<LicenseData> category = new ArrayList<LicenseData>();
					String idLicense;
					String namesurnameLicense;
					String expdateLicense;
					String categoryLicense;

					//Variables del veh�culo
					String type; 
					String plate;
					String brand;
					String color;
					List<Wheel> frontWheels = new ArrayList<Wheel>();
					List<Wheel> backWheels = new ArrayList<Wheel>();
					String ruedaTrasMarca;
					String ruedaDelMarca;
					String ruedaTrasDiam;
					String ruedaDelDiam;
				 
				//Preguntar al usuario por consola.
			
				type = preguntarUsuario("el TIPO DE VEH�CULO (coche, moto o cami�n)");
				if ((type.toLowerCase().contains("coche") || type.toLowerCase().contains("moto") || type.toLowerCase().contains("camion") || type.toLowerCase().contains("cami�n")) == true) {
						type = type;
				}else{
					throw new Exception("El TIPO solo puede ser COCHE, MOTO o CAMI�N.");				
				};
					
				plate = preguntarUsuario("la MATR�CULA");
				String plateExpression = "[0-9]{4}[A-Za-z]{2,3}";
				if (Pattern.matches(plateExpression, plate) == true) {
						plate = plate;
				}else{
					throw new Exception("La MATR�CULA debe tener 4 n�meros y 2 � 3 letras.");				
				};

				brand = preguntarUsuario("la MARCA");
				color = preguntarUsuario("el COLOR");
				ruedaDelMarca = preguntarUsuario("la MARCA DE LAS RUEDAS DELANTERAS");
				ruedaTrasMarca = preguntarUsuario("la MARCA DE LAS RUEDAS TRASERAS");
				
				ruedaDelDiam = preguntarUsuario("el DI�METRO DE LAS RUEDAS DELANTERAS");
				if (Double.parseDouble(ruedaDelDiam) <= 4 && Double.parseDouble(ruedaDelDiam) >= 0.4) {
					ruedaDelDiam = ruedaDelDiam;
				}else {
					throw new Exception("El DI�METRO debe estar entre 0,4 y 4.");
				}

				ruedaTrasDiam = preguntarUsuario("el DI�METRO DE LAS RUEDAS TRASERAS");
				if (Double.parseDouble(ruedaTrasDiam) <= 4 && Double.parseDouble(ruedaTrasDiam) >= 0.4) {
					ruedaTrasDiam = ruedaTrasDiam;
				}else {
					throw new Exception("El DI�METRO debe ser un n�mero entre 0,4 y 4.");
				}
				
			
				//Crear objetos ruedas.
				
				Wheel Rueda1 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda2 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda3 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				Wheel Rueda4 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				
				frontWheels.add(Rueda1);
				frontWheels.add(Rueda2);
				
				backWheels.add(Rueda3);
				backWheels.add(Rueda4);
				

				//Crear objeto coche, moto o cami�n, y a�adir las ruedas.
				
				if (type.toLowerCase().contains("coche") == true) {
					Car Coche = new Car(plate, brand, color, type);		
					Car.addWheels(frontWheels, backWheels);
					System.out.println("\nDatos del veh�culo: \n\tTipo: " + Coche.type + "\n\tMatr�cula: " + Coche.plate + "\n\tMarca: " + Coche.brand + "\n\tColor: " + Coche.color + "\n\tRuedas: " + Coche.wheels);
				}if ((type.toLowerCase().contains("camion") || type.toLowerCase().contains("cami�n")) == true) {
					Truck Camion = new Truck(plate, brand, color, type);
					Truck.addWheels(frontWheels, backWheels);
					System.out.println("\nDatos del veh�culo: \n\tTipo: " + Camion.type + "\n\tMatr�cula: " + Camion.plate + "\n\tMarca: " + Camion.brand + "\n\tColor: " + Camion.color + "\n\tRuedas: " + Camion.wheels);
				}else{
					Bike Moto = new Bike(plate, brand, color, type);		
					Bike.addWheels(frontWheels, backWheels);
					System.out.println("\nTu veh�culo: \n\tTipo: " + Bike.type + "\n\tMatr�cula: " + Bike.plate + "\n\tMarca: " + Bike.brand + "\n\tColor: " + Bike.color + "\n\tRuedas: " + Bike.wheels);
				}
				
				
				fin=true;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("\tERROR!\n\t" + e.getMessage() + "\n");
			}
		}while(!fin);
		
	}

}
