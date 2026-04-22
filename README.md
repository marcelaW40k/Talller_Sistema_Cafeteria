# Talller_Sistema_Cafeteria

# EQUIPO:
# Marcela Ardila
# Yeison Cruz
# Valeria Beltran

# ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?
Rta: Por que permite manejar numeros decimales, lo cual es necesario en valores monetarios.
Apareceria error de compilacion.
El valor quedaria en 3 perdiendo los centavos.

# ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?
Rta: El operador fue > Mayor que.
Devuelve un valor tipo **boolean** true o false.


Ejercicio 5: Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
el orden de ejecución.
- Porque nos piden simular al menos una interacción con un valor inválido.
- Con Do While, se ejecuta primero el programa, generando una primera iteración
- A lo ultimo realiza la validación, para saber si continua o finaliza el programa.
-A diferencia del while, el tiene su condición al inicio,
-Es decir, apenas el detecta que su condición no se cumple, cierra el programa sin iterar ni 1 sola vez.

Ejercicio 6: Pregunta: ¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando
conoces el número de elementos?
- Porque se conoce el numero total de iteraciones
- el while se utilizas mas, cuando depende de una condición
- Por otro lado tenemos dos arreglos que recorrer que se pueden recorrer en una sola linea de codigo.

Ejercicio 7: Pregunta: ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
lógico? ¿Cómo los distingues?
-3 ERRORES

