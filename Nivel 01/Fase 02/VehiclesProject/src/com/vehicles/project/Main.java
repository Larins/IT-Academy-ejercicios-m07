package com.vehicles.project;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

	public static String preguntarUsuario(String pregunta) {

		System.out.println("\nPor favor, introduce " + pregunta + " de tu coche.");
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
				

				//Crear objetos ruedas.
				
				Wheel Rueda1 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda2 = new Wheel(ruedaDelMarca, Double.parseDouble(ruedaDelDiam));
				Wheel Rueda3 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				Wheel Rueda4 = new Wheel(ruedaTrasMarca, Double.parseDouble(ruedaTrasDiam));
				
				frontWheels.add(Rueda1);
				frontWheels.add(Rueda2);
				
				backWheels.add(Rueda3);
				backWheels.add(Rueda4);
				
				//Crear objeto coche.
				Car Coche = new Car(plate, brand, color);
		
				//Añadir las ruedas al objeto coche.			
				Coche.addWheels(frontWheels, backWheels);
				
				//Podemos imprimir los atributos para comprobar que los resultados se han guardado.
				//System.out.println("\nTu coche: \n\tMatrícula: " + Coche.plate + "\n\tMarca: " + Coche.brand + "\n\tColor: " + Coche.color + "\n\tRuedas delanteras: " + Coche.wheels + "\n\tRuedas traseras: " + Coche.wheels);
	
				fin=true;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("\tERROR!\n\t" + e.getMessage() + "\n");
			}
		}while(!fin);
		
	}

}
