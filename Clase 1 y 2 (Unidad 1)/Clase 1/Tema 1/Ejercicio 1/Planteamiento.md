Ejercicio 1 (básico): Para el problema “determinar si un número entero es primo”,
documentar las fases de desarrollo: análisis del problema, diseño en pseudocódigo, y una
tabla de al menos 5 casos de prueba que incluya casos normales, casos límite (0, 1, 2) y un
caso de error (número negativo). No es necesario codificar todavía; el entregable es el
pseudocódigo y la tabla.

--------------------------------------------------------------------------------------------

El problema es simple: determinar si un número es primo o no. Con las siguientes reglas:

1) Debe ser entero.
2) Si es negativo o 0, debe dar error.

Un número es primo si solo es divisible por sí mismo y por 1.
Para no tener que comprobar con números infinitos, solo hay que comprobar
hasta la raíz del número. Se puede hacer con un Mientras.

También se puede hacer con un Para, pero yo quiero detener la ejecución
apenas se descubra que el número no es primo, lo cual creo que no se puede
hacer en pseint, aunque sí en pseudocódigo puro.

--------------------------------------------------------------------------------------------

Tabla con los diferentes casos:

Número | Resultado
-------------------
71     | 71 es primo.
9      | 9 no es primo.
-55    | El número debe ser mayor que 1.
0      | El número debe ser mayor que 1.
2      | 2 es primo.