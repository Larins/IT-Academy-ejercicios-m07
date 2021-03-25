package com.vehicles.project;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	//TITULAR
	Titular LaraTitular = new Titular("Lara", "Saiz", "22-03-1988", "123456789");
	LaraTitular.parking = true;
	LaraTitular.insurance = true;
	System.out.println("DATOS TITULAR\n\tNombre completo: " + LaraTitular.name + " " + LaraTitular.surname + "\n\tLicencia ID: " + LaraTitular.license + "\n\n");
	
	//LICENCIA
	License LaraLicense = new License("123456789","Truck","Lara Saiz","15-07-2022");
	System.out.println("DATOS LICENCIA DE CONDUCCIÓN: \n\tNombre completo: " + LaraLicense.fullname + "\n\tLicencia ID: " + LaraLicense.id + "\n\tTipo de vehículo: " + LaraLicense.type + "\n\n");
	
	//VEHICLE (CORRECTO)
	//Truck LaraTruck = new Truck("JDT-1234","Pegaso","Purple");
	//System.out.println("DATOS VEHÍCULO: \n\tMatrícula: " + LaraTruck.plate + "\n\tMarca: " + LaraTruck.brand + "\n\tColor: " + LaraTruck.color + "\n\tTipo de vehículo: " + LaraTruck.type + "\n\n");

	//VEHICLE (INCORRECTO)
	//Sirve para comprobar el IF/ELSE
	//Para ello, comentar el anterior vehículo (truck) y descomentar este (bike).
	Bike LaraTruck = new Bike("JDT-1234","Pegaso","Purple");
	System.out.println("DATOS VEHÍCULO: \n\tMatrícula: " + LaraTruck.plate + "\n\tMarca: " + LaraTruck.brand + "\n\tColor: " + LaraTruck.color + "\n\tTipo de vehículo: " + LaraTruck.type + "\n\n");
	
	//EXCEPTION
	
	//System.out.println(LaraLicense.type);
	//System.out.println(LaraTruck.type);
	
	if (LaraLicense.type == LaraTruck.type) {

		//System.out.println("Los datos son correctos.");

		Component componentePadre = null;
		int confirmado = JOptionPane.showConfirmDialog(
				componentePadre,
				"¿El titular será también el conductor?");

			if (JOptionPane.OK_OPTION == confirmado) {

				//CONDUCTOR
				//Creado automáticamente a partir de los datos del TITULAR.
				//Esto solo ocurre si el titular tiene una licencia adecuada
				
				JOptionPane.showMessageDialog(
						   componentePadre,
						   "Clonaremos los DATOS TITULAR a DATOS CONDUCTOR/A.");

				Driver LaraConductor = new Driver(LaraTitular.name, LaraTitular.surname, LaraTitular.birthdate, LaraTitular.license);
				System.out.println("DATOS CONDUCTOR/A\n\tNombre completo: " + LaraConductor.name + " " + LaraConductor.surname + "\n\tLicencia ID: " + LaraConductor.license + "\n\n");
				System.out.println("Todos los datos han sido registrados.");

			}
			else
				JOptionPane.showMessageDialog(
						   componentePadre,
						   "Por favor, introduce los DATOS CONDUCTOR/A con licencia para el tipo de vehículo.");

			String name = JOptionPane.showInputDialog(
				componentePadre,
			   "Introduzca el nombre del CONDUCTOR/A.",
			   JOptionPane.QUESTION_MESSAGE); 
			
			String surname = JOptionPane.showInputDialog(
					componentePadre,
				   "Introduzca el apellido del CONDUCTOR/A.",
				   JOptionPane.QUESTION_MESSAGE); 
			
			String nacimiento = JOptionPane.showInputDialog(
					componentePadre,
				   "Introduzca la fecha de nacimiento del CONDUCTOR/A.\nFormato: DD-MM-AAAA.",
				   JOptionPane.QUESTION_MESSAGE); 
			
			String licencia = JOptionPane.showInputDialog(
					componentePadre,
				   "Introduzca la licencia ID del CONDUCTOR/A.",
				   JOptionPane.QUESTION_MESSAGE); 
			
			Driver LaraConductor = new Driver(name, surname, nacimiento, licencia);
			System.out.println("DATOS CONDUCTOR/A\n\tNombre completo: " + LaraConductor.name + " " + LaraConductor.surname + "\n\tLicencia ID: " + LaraConductor.license + "\n\n");
			System.out.println("Todos los datos han sido registrados.");

	}
	else {

		Component componentePadre = null;

		JOptionPane.showMessageDialog(
				   componentePadre,
				   "El titular no tiene licencia para el tipo de vehículo.");
		
		JOptionPane.showMessageDialog(
				   componentePadre,
				   "Por favor, introduce los DATOS CONDUCTOR/A con licencia para el tipo de vehículo.");

	String name = JOptionPane.showInputDialog(
		componentePadre,
	   "Introduzca el nombre del CONDUCTOR/A.",
	   JOptionPane.QUESTION_MESSAGE); 
	
	String surname = JOptionPane.showInputDialog(
			componentePadre,
		   "Introduzca el apellido del CONDUCTOR/A.",
		   JOptionPane.QUESTION_MESSAGE); 
	
	String nacimiento = JOptionPane.showInputDialog(
			componentePadre,
		   "Introduzca la fecha de nacimiento del CONDUCTOR/A.\nFormato: DD-MM-AAAA.",
		   JOptionPane.QUESTION_MESSAGE); 
	
	String licencia = JOptionPane.showInputDialog(
			componentePadre,
		   "Introduzca la licencia ID del CONDUCTOR/A.",
		   JOptionPane.QUESTION_MESSAGE); 
	
	Driver LaraConductor = new Driver(name, surname, nacimiento, licencia);
	System.out.println("DATOS CONDUCTOR/A\n\tNombre completo: " + LaraConductor.name + " " + LaraConductor.surname + "\n\tLicencia ID: " + LaraConductor.license + "\n\n");
	System.out.println("Todos los datos han sido registrados.");
		
	}



	
}}
