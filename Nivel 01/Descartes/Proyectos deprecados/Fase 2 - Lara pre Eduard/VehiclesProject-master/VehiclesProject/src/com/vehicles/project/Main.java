package com.vehicles.project;

import java.util.*;

public class Main {

	public static String preguntarUsuario(String pregunta) {

		System.out.println("Por favor, introduce " + pregunta + " de tu coche.");
		String respuesta;
		Scanner entrada = new Scanner(System.in);
		entrada = new Scanner(System.in);
		respuesta = entrada.nextLine();
	 
		return respuesta;
	}
	
	
	public static void main(String[] args) {
		
		try {

			//Crear variables para preguntar al usuario.
			
			 String plate;
			 String brand;
			 String color;
			 List<Wheel> frontWheels = new ArrayList<Wheel>();
			 String ruedaDelMarca;
			 String ruedaDelDiam;
			 List<Wheel> backWheels = new ArrayList<Wheel>();
			 String ruedaTrasMarca;
			 String ruedaTrasDiam;
			
			//Preguntar al usuario por consola.
			 
			plate = preguntarUsuario("la matrícula");
			brand = preguntarUsuario("la marca");
			color = preguntarUsuario("el color");
			ruedaDelMarca = preguntarUsuario("la marca de las ruedas delanteras");
			ruedaDelDiam = preguntarUsuario("el diámetro de las ruedas delanteras");
			ruedaTrasMarca = preguntarUsuario("la marca de las ruedas traseras");
			ruedaTrasDiam = preguntarUsuario("el diámetro de las ruedas traseras");
			
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
			//System.out.println("Tu coche: \n\tMatrícula: " + Coche.plate + "\n\tMarca: " + Coche.brand + "\n\tColor: " + Coche.color + "\n\tRuedas delanteras: " + Coche.wheels + "\n\tRuedas traseras: " + Coche.wheels);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Mensaje de error: " + e.getMessage());

		
		}
		
	}

}
