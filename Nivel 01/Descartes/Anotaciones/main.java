//donde pone el System.out.println();

			//Pero hay que crear un método publico mostrar() en la clase coche que devuelva un string con los atributos.
			//System.out.println(Coche.mostrar())




//dentro del main

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca la matrícula: ");
			int matricula = sc.nextInt();
			final int PLATE_MAX = 100;
		try {
			if(matricula < PLATE_MAX){
				System.out.println("Matrícula correcta.");
			}else {
				throw new PlateException("La matrícula debe tener 4 números y 2 ó 3 letras.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


//como metodo alternativo de entrada para plate

		<1-3 letters><1-2 letters><1-4 numbers>

or [A-Za-z]{1,3}-[A-Za-z]{1,2}-[0-9]{1,4}


1-4 letras, 2-3 numeros
[A-Za-z]{4}-[0-9]{2-3}


	public static String preguntarUsuarioPlate(String preguntaPlate) {

		System.out.println("Por favor, introduce " + preguntaPlate + " de tu coche.");
		String respuestaPlate;
		Scanner entrada = new Scanner(System.in);
		entrada = new Scanner(System.in);
		entrada.useDelimiter("[A-Za-z]{4}-[0-9]{2,3}");
		respuestaPlate = entrada.nextLine();
	 
		return respuestaPlate;
	
	}