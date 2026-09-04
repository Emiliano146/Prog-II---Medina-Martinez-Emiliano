Ejercicio 2 (intermedio): El siguiente fragmento no compila:

int resultado;
    if (x > 0) {
    int resultado = x * 2;
}
System.out.println(resultado);

Identificar el error de ámbito (¿qué variable existe en qué bloque?), corregirlo, y agregar un
segundo método propio donde un parámetro y un atributo o variable local compartan
nombre (shadowing), documentando en un comentario cuál de los dos valores prevalece
dentro del cuerpo del método y por qué.

--------------------------------------------------------------------------------------------

No compila por tres motivos:

1) No existe la variable x.
2) resultado se declara dos veces (uno fuera del if y otro dentro)
3) resultado puede llegar a no contener nada al hacer System.out.println(resultado),
   ya que está fuera del if.

Hay que solucionar esas tres cosas:
Declaro una variable x junto con resultado (o la recibo si es un método).
Elimino la declaraciónd de resultado dentro del if.
Muevo System.out.println(resultado) dentro del if.

En vez de mover System.out.println(resultado), podríamos hacer que resultado inicie con 0.
Si el if no iniciase, imprimiría 0.