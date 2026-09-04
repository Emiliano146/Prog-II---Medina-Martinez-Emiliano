Ejercicio 2 (intermedio): Se entrega el siguiente pseudocódigo, que pretende clasificar un
triángulo según sus lados (equilátero, isósceles o escaleno) a partir de tres valores a, b, c:

si a = b y b = c entonces
    "Equilátero"
sino si a = b o b = c entonces
    "Isósceles"
sino
    "Escaleno"

Aplicar el proceso de verificación con casos de prueba: encontrar al menos un caso
concreto de valores para los que el pseudocódigo da un resultado incorrecto o no
contemplado (pista: no valida que los lados formen un triángulo válido), documentar ese
caso y corregir el pseudocódigo para que lo maneje.

--------------------------------------------------------------------------------------------

Encontré un caso en el que el código de un resultado incorrecto.
Voy a asumir que se usan centímetros:

    Para hacer un triángulo, cada lado debe medir mayor a 0cm,
    pero en este código los lados pueden valer 0cm o menos.

Para arreglarlo, agrego una comprobación antes:

si a <= 0 o b <= 0 o c <= 0 entonces
    "Hay al menos un lado que mide 0cm o menos"
sino
    si a = b y b = c entonces
        "Equilátero"
    sino si a = b o b = c entonces
        "Isósceles"
    sino
        "Escaleno"


    