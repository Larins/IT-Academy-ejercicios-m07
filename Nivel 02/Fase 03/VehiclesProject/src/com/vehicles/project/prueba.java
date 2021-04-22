package com.vehicles.project;
import java.util.*;

public class prueba {

	public static void main(String[] args) throws Exception {

		System.out.println("\n¿El titular es el usuario del coche?");
		String yesorno;
		Scanner pregunta = new Scanner(System.in);
		pregunta = new Scanner(System.in);
		yesorno = pregunta.nextLine();
		
		if(yesorno.toLowerCase().contains("si") || yesorno.toLowerCase().contains("sí") == true) {
			System.out.println("\nGracias, todos los datos han sido guardados.\n");
		}if(yesorno.toLowerCase().contains("no") == true) {
			System.out.println("\nPor favor, introduzca los datos del usuario.\n");
		}else{
			throw new Exception("\nHa ocurrido un error.\n");
		}
		
		
	}

}
