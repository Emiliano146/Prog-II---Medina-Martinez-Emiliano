Algoritmo Primos
	
	// Le pido al usuario un número y lo guardo en la variable n.
	
	Escribir "Introduce un número a comprobar si es primo: "
	Leer n
	
	// Si el número ingresado es menor o igual a 1, aviso al usuario y termino el programa.
	
	Si n <= 1 Entonces
		Escribir "El número debe ser mayor que 1."
	Sino
		// Ya que el número es mayor que 1, el programa continúa.
		// Creo un bool para saber después si es primo o no, por defecto lo pongo en verdadero.
		
		esPrimo <- Verdadero
		
		// Hago un mientras, el cual actuará como un for,
		// desde el número 2 (el primo más pequeño) hasta la raíz cuadrada de n.
		// El bucle se detiene automáticamente si se encuentra un divisor.
		
		i <- 2
		Mientras i <= Trunc(Raiz(n)) Y esPrimo Hacer
			
			// Si el resto del número dividido por i es 0, entonces no es primo.
			
			Si n MOD i = 0 Entonces
				esPrimo <- Falso
			FinSi
			
			i <- i + 1
			
		FinMientras
		
		// Si el número es primo, la variable esPrimo seguirá siendo verdadera.
		
		Si esPrimo Entonces
			Escribir n, " es primo."
		Sino
			Escribir n, " no es primo."
		FinSi
		
	FinSi

FinAlgoritmo