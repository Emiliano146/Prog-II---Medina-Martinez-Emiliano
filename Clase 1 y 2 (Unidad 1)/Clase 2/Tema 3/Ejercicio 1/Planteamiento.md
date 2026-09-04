Ejercicio 1 (básico): Implementar de forma recursiva el método sumarDigitos(int n),
que devuelve la suma de los dígitos de un entero positivo. Identificar con un comentario,
dentro del propio método, cuál línea corresponde al caso base y cuál al caso recursivo.

--------------------------------------------------------------------------------------------

Para hacer un caso recursivo, el método debe llamarse a sí mismo.

Para poder sumar todos los dígitos de un número, hay que sumar el último dígito
(se obtiene con el resto del número dividido 10) a una variable suma, y quitar el último dígito
(se hace dividiendo el número por 10). Si no es el último dígito, se vuelve a repetir.

