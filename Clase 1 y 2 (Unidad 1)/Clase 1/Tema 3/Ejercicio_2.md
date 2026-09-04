Ejercicio 2 (intermedio): Traducir a Java el algoritmo de números primos del Tema 1
(Ejercicio 1): crear la clase VerificadorPrimo con un método esPrimo(int n) y un main
que lea el número por teclado con Scanner e imprima si es primo o no. Ejecutar el
programa contra cada uno de los casos de la tabla de prueba armada en el Tema 1 y
confirmar que el resultado coincide con lo esperado.

--------------------------------------------------------------------------------------------

El problema es el mismo que el ejercicio 1, pero ahora se separa para no hacerlo todo
en el main.

Voy a usar el mismo método, pero esta vez, sí voy a usar un for: apenas se descubra que
el número no es primo, se detendrá la ejecución.

--------------------------------------------------------------------------------------------

Tabla con los diferentes casos:

Número | Resultado
-------------------
23     | 23 es primo.
33     | 33 no es primo.
-12    | El número debe ser mayor que 1.
0      | El número debe ser mayor que 1.
1      | El número debe ser mayor que 1.