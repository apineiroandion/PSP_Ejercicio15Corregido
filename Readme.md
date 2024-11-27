#  Ejercicio 15 Corregido

Esta es la versión corregida del ejercicio 15.

## Enunciado

Programa que simule un buzón de correo (recurso compartido), de manera que se pueda leer un mensaje o enviarlo. El buzón solamente puede almacenar un mensaje, de manera que para poder escribir se debe encontrar vacío y para poder leer debe de estar lleno. Crear varios hilos lectores y escritores que manejen el buzón de manera sincronizada.

Crea una aplicación en Java que simule el funcionamiento de un buzón de correo (compartido) entre varios hilos lectores y escritores. El buzón solo puede almacenar un mensaje a la vez. Tened en cuenta que:

1. Un hilo escritor solo puede escribir en el buzón si este está vacío.
2. Un hilo lector solo puede leer del buzón si este contiene un mensaje.
3. Si un escritor intenta escribir cuando el buzón está lleno, debe esperar hasta que el buzón sea leído (y esté vacío).
4. Si un lector intenta leer cuando el buzón está vacío, debe esperar hasta que haya un mensaje disponible.

Implementa las clases necesarias para que varios hilos lectores y escritores interactúen de manera concurrente con el buzón. Asegúrate de utilizar mecanismos de sincronización para evitar condiciones de carrera. Para simular la operación, cada escritor debe enviar un mensaje de texto al buzón, y los lectores deben leer ese mensaje. Una vez que un mensaje es leído, el buzón se vacía y queda disponible para un nuevo mensaje.