# Ejercicios Write

## Descripción

Este proyecto en Java realiza varias tareas relacionadas con la manipulación de archivos. Aquí encontrarás ejemplos de cómo añadir texto a un archivo existente, escribir un array de Strings en un archivo, escribir datos de un objeto en un archivo y manejar excepciones con recursos (`try-with-resources`). Todo está en un solo código para facilitar su uso y comprensión.

## Funcionalidades

1. **Añadir texto a un archivo existente**: Añade texto al archivo y muestra en la consola el texto añadido junto con la fecha y hora actuales.
2. **Escribir un array de Strings en un archivo**: Escribe un array de Strings en el archivo y muestra en la consola que se ha añadido el array.
3. **Escribir datos de un objeto en un archivo**: Escribe los datos de un objeto en el archivo y muestra en la consola que se han añadido los datos.
4. **Manejo de excepciones con recursos (`try-with-resources`)**: Utiliza `try-with-resources` para asegurar que los recursos se cierren automáticamente y muestra en la consola que se ha añadido texto con manejo de excepciones.

## Ejemplo de Código

Aquí tienes un ejemplo de cómo se maneja el ejercicio de excepciones con recursos:

```java
try (FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\excepciones.txt")) {
    archivo.write("Real Madrid: Transferencia al Real Madrid y sus éxitos en el club español 2.\n");
    archivo.write("Eurocopa 2016: Victoria en la Eurocopa 2016 y su liderazgo en el equipo portugués 2.\n");
    archivo.write("Palabras Motivadoras:\n");
    archivo.write("\"El talento sin trabajo duro no sirve para nada.\" Esta frase refleja la ética de trabajo de Ronaldo y su dedicación constante 1.\n");
    archivo.write("\"No soy perfecto, pero trato de serlo.\" Una muestra de su búsqueda incansable de la excelencia 1.\n");
    archivo.write("\"La presión es parte de mi vida. La acepto y la manejo.\" Ronaldo habla sobre cómo enfrenta la presión y la utiliza como motivación 1.\n");
    System.out.println("Texto añadido al archivo con manejo de excepciones.");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Cómo Ejecutar

1. Abre el proyecto en tu IDE favorito (por ejemplo, NetBeans).
2. Ejecuta la clase `Clase` para ver cómo se realizan las tareas mencionadas.
