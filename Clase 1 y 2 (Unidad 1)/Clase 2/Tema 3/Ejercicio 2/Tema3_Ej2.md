Ejercicio 2 (intermedio): Implementar el cálculo de potencia potencia(int base, int
exponente) (exponente entero no negativo) de dos formas: una recursiva y otra iterativa.
Ejecutar ambas con el mismo caso de prueba y confirmar que devuelven el mismo
resultado. Agregar un comentario o un archivo Tema3_Ej2.md breve justificando cuál de las
dos versiones se preferiría en un programa real pensado para exponentes grandes, y por
qué.

--------------------------------------------------------------------------------------------

En el método recursivo, la función se llama a sí misma reduciendo el exponente hasta llegar
al caso base, multiplicando la base por sí misma tantas veces como indique el exponente.

En el caso iterativo, se usa un for para multiplicar la base por sí misma tantas veces diga el exponente.

--------------------------------------------------------------------------------------------

Es mucho más preferible la opción iterativa, ya que si se usa la recursiva, las llamadas se acumulan en la memoria, y podrían llegar a causar un desbordamiento de pila (Stack Overflow) al consumir todas las pilas del sistema.
Con el caso iterativo, desde el principio se sabe cuantas n veces se realizará el bucle, por lo cual mantendrá un consumo de memoria constante.