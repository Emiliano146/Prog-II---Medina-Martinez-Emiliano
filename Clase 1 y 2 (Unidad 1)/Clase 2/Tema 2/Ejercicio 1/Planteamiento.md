Ejercicio 1 (básico): Escribir un método intercambiar(int a, int b) que intente
intercambiar los valores de sus dos parámetros. Invocarlo desde main con dos variables
int, e imprimir esas variables antes y después de la llamada. Documentar en un comentario
por qué no cambian, en términos de qué es lo que efectivamente recibe el método.

--------------------------------------------------------------------------------------------

Primero hago el método para intercambiarlos.

Dentro uso una variable llamada temp, ya que no puedo intercambiar dos variables sin que
se pisen entre sí.
Por ejemplo, si hago a = b, pierdo el valor original de a.

El intercambio no cambia las variables originales. Java envía una copia como parámetro,
no un puntero.