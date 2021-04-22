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
				
					//Variables del titular
					String fullname;
					String birthdate;
					String insurance; 
					String parking;
					String id;
					String namesurname;
					String expdate;
					String category;

					//Variables del vehículo
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
					
					//Preguntas sobre el titular.

					fullname = preguntarUsuario("el NOMBRE COMPLETO DEL TITULAR");
					birthdate = preguntarUsuario("la FECHA de NACIMIENTO");	
					
					insurance = preguntarUsuario("SÍ o NO tiene seguro");
					if ((insurance.toLowerCase().contains("sí") || insurance.toLowerCase().contains("si") || insurance.toLowerCase().contains("no")) == true) {
						insurance = insurance;
					}else{
						throw new Exception("La respuesta solo puede ser SÍ o NO.");				
					}
					
					parking = preguntarUsuario("SÍ o NO tiene aparcamiento");
					if ((parking.toLowerCase().contains("sí") || parking.toLowerCase().contains("si") || parking.toLowerCase().contains("no")) == true) {
						parking = parking;
					}else{
						throw new Exception("La respuesta solo puede ser SÍ o NO.");				
					};
					
					id = preguntarUsuario("el nº del CARNET DE CONDUCIR");
					namesurname = preguntarUsuario("el NOMBRE COMPLETO (tal como figura en el CARNET)");
					expdate = preguntarUsuario("la FECHA DE CADUCIDAD");
					
					category = preguntarUsuario("la CATEGORÍA del carnet (coche, moto o camión)");
					if ((category.toLowerCase().contains("coche") || category.toLowerCase().contains("moto") || category.toLowerCase().contains("camión") || category.toLowerCase().contains("camion")) == true) {
							category = category;
					}else{
						throw new Exception("La CATEGORÍA solo puede ser COCHE, MOTO o CAMIÓN.");				
					};	
				
					//Preguntas sobre el coche.
					
					type = preguntarUsuario("el TIPO DE VEHÍCULO (coche, moto o camión)");
					if ((type.toLowerCase().contains("coche") || type.toLowerCase().contains("moto") || type.toLowerCase().contains("camión") || type.toLowerCase().contains("camion")) == true) {
						if (type.toLowerCase().contains(category) == true) {
							type = type;
						}else {
							throw new Exception("La CATEGORÍA de carnet (" + category + ") y el TIPO de vehículo (" + type + ") no coinciden.");
						}
					}else{
						throw new Exception("El TIPO solo puede ser COCHE, MOTO o CAMIÓN.");				
					};
						
					plate = preguntarUsuario("la MATRÍCULA");
					String plateExpression = "[0-9]{4}[A-Za-z]{2,3}";
					if (Pattern.matches(plateExpression, plate) == true) {
							plate = plate;
					}else{
						throw new Exception("La MATRÍCULA debe tener 4 números y 2 ó 3 letras.");				
					};
	
					brand = preguntarUsuario("la MARCA");
					color = preguntarUsuario("el COLOR");
					ruedaDelMarca = preguntarUsuario("la MARCA DE LAS RUEDAS DELANTERAS");
					ruedaTrasMarca = preguntarUsuario("la MARCA DE LAS RUEDAS TRASERAS");
					
					ruedaDelDiam = preguntarUsuario("el DIÁMETRO DE LAS RUEDAS DELANTERAS");
					if (Double.parseDouble(ruedaDelDiam) <= 4 && Double.parseDouble(ruedaDelDiam) >= 0.4) {
						ruedaDelDiam = ruedaDelDiam;
					}else {
						throw new Exception("El DIÁMETRO debe estar entre 0,4 y 4.");
					}
	
					ruedaTrasDiam = preguntarUsuario("el DIÁMETRO DE LAS RUEDAS TRASERAS");
					if (Double.parseDouble(ruedaTrasDiam) <= 4 && Double.parseDouble(ruedaTrasDiam) >= 0.4) {
						ruedaTrasDiam = ruedaTrasDiam;
					}else {
						throw new Exception("El DIÁMETRO debe ser un número entre 0,4 y 4.");
					}

				//Crear objeto carnet.
					
				LicenseData carnetTitular = new LicenseData(id, namesurname, expdate, category);
					
				//Crear objeto titular.
				Titular Tit = new Titular(fullname, birthdate, insurance, parking);
				System.out.println("\nDatos del titular: \n\tNombre: " + Tit.fullname + "\n\tFecha de nacimiento: " + Tit.birthdate + "\n\tSeguro: " + Tit.insurance + "\n\tAparcamiento: " + Tit.parking + "\n\t\tCarnet nombre: " + carnetTitular.getnamesurname() + "\n\t\tCarnet ID: " + carnetTitular.getid() + "\n\t\t Carnet categoría: " + carnetTitular.getcategory() + "\n\t\t Carnet caducidad: " + carnetTitular.getexpdate());

				//Crear objetos ruedas.
				
				Wheel Rueda1 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda2 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda3 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				Wheel Rueda4 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				
				frontWheels.add(Rueda1);
				frontWheels.add(Rueda2);
				
				backWheels.add(Rueda3);
				backWheels.add(Rueda4);
				

				//Crear objeto coche, moto o camión, y añadir las ruedas.
				
				if (type.toLowerCase().contains("coche") == true) {
					Car Coche = new Car(plate, brand, color, type);		
					Car.addWheels(frontWheels, backWheels);
					System.out.println("\nDatos de tu COCHE: \n\tTipo: " + Coche.type + "\n\tMatrícula: " + Coche.plate + "\n\tMarca: " + Coche.brand + "\n\tColor: " + Coche.color + "\n\tRuedas delanteras: " + Rueda1.getbrand() + ", diámetro " + Rueda1.getdiameter() + "\n\tRuedas traseras: " + Rueda3.getbrand() + ", diámetro " + Rueda3.getdiameter());
				}if ((type.toLowerCase().contains("camion") || type.toLowerCase().contains("camión")) == true) {
					Truck Camion = new Truck(plate, brand, color, type);
					Truck.addWheels(frontWheels, backWheels);
					System.out.println("\nDatos de tu CAMIÓN: \n\tTipo: " + Camion.type + "\n\tMatrícula: " + Camion.plate + "\n\tMarca: " + Camion.brand + "\n\tColor: " + Camion.color + "\n\tRuedas delanteras: " + Rueda1.getbrand() + ", diámetro " + Rueda1.getdiameter() + "\n\tRuedas traseras: " + Rueda3.getbrand() + ", diámetro " + Rueda3.getdiameter());
				}if (type.toLowerCase().contains("moto") == true) {
					Bike Moto = new Bike(plate, brand, color, type);		
					Bike.addWheels(frontWheels, backWheels);
					System.out.println("\nDatos de tu MOTO: \n\tTipo: " + Bike.type + "\n\tMatrícula: " + Bike.plate + "\n\tMarca: " + Bike.brand + "\n\tColor: " + Bike.color + "\n\tRuedas delanteras: " + Rueda1.getbrand() + ", diámetro " + Rueda1.getdiameter() + "\n\tRuedas traseras: " + Rueda3.getbrand() + ", diámetro " + Rueda3.getdiameter());
				}
			
			//Preguntar si usuario y titular serán la misma persona
				
				
				System.out.println("\n¿El TITULAR es el CONDUCTOR del coche?");
				String yesorno;
				Scanner pregunta = new Scanner(System.in);
				pregunta = new Scanner(System.in);
				yesorno = pregunta.nextLine();
				
				if(yesorno.toLowerCase().contains("si") || yesorno.toLowerCase().contains("sí") == true) {
					System.out.println("\nGracias, todos los datos han sido guardados.\n");
					fin=true;
				}if(yesorno.toLowerCase().contains("no") == true) {
					
					//Preguntas sobre el conductor.
					System.out.println("\nPor favor, introduzca los datos del CONDUCTOR.");
					
					fullname = preguntarUsuario("el NOMBRE COMPLETO DEL CONDUCTOR");
					birthdate = preguntarUsuario("la FECHA de NACIMIENTO");	
					id = preguntarUsuario("el nº del CARNET DE CONDUCIR");
					namesurname = preguntarUsuario("el NOMBRE COMPLETO (tal como figura en el CARNET)");
					expdate = preguntarUsuario("la FECHA DE CADUCIDAD");
					
					category = preguntarUsuario("la CATEGORÍA del carnet (coche, moto o camión)");
					if ((category.toLowerCase().contains("coche") || category.toLowerCase().contains("moto") || category.toLowerCase().contains("camión") || category.toLowerCase().contains("camion")) == true) {
							category = category;
					}else{
						throw new Exception("La CATEGORÍA solo puede ser " + type.toUpperCase());				
					};	
					
				}else {
					throw new Exception("\nHa ocurrido un error.\n");
				}
				
				//Crear objeto carnet.
				LicenseData carnetDriver = new LicenseData(id, namesurname, expdate, category);
				
				//Crear objeto conductor.
				
				Driver Conductor = new Driver(fullname, birthdate);
				System.out.println("\nDatos del Conductor: \n\tNombre: " + Driver.fullname + "\n\tFecha de nacimiento: " + Driver.birthdate + "\n\t\tCarnet nombre: " + carnetDriver.getnamesurname() + "\n\t\tCarnet ID: " + carnetDriver.getid() + "\n\t\t Carnet categoría: " + carnetDriver.getcategory() + "\n\t\t Carnet caducidad: " + carnetDriver.getexpdate());


				
				fin=true;
				System.out.print("\nGracias, todos los datos han sido guardados.");
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("\tERROR!\n\t" + e.getMessage() + "\n");
			}
		}while(!fin);
		
	}

}
