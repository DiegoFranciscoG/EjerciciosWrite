/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

/**
 *
 * @author diego
 */
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\ejercicio.txt");
            archivo.write("Y el mejor jugador del mundo es Cristiano Ronaldo\n");
            archivo.write("La mejor musica para edit de futbol es el hiphop\n");
            archivo.write("2pac es el mejor rapero con Snoop Doog");
            
            archivo.close();
            
            FileReader archivoLectura = new FileReader ("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\ejercicio.txt");
            BufferedReader lectura = new BufferedReader(archivoLectura);
            String linea = lectura.readLine();
            
            while(linea !=null){
                System.out.println(linea);
                linea = lectura.readLine();
                
        }
        }catch(IOException e){
            e.printStackTrace();
        }
        //ingresar mas texto a un archivo existente
         try (FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\ejercicio.txt", true)) {
             String texto = "\n El documental de Farid Dieck sobre Cristiano Ronaldo, titulado \n" + "\n Lo TACHARON de ARROGANTE" +"\n Infancia y Familia: Se describe la difícil infancia de Ronaldo, incluyendo el alcoholismo de su padre y problemas económicos familiares";
             String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
             archivo.write(texto + " Fecha: " + fecha + "\n");
             System.out.println("Texto añadido: " + texto + " Fecha: " + fecha);
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         
         //Escribir un array de Strings en un archivo
         
         String[] datos = {"\nInicio de su Carrera: Comienzo de su carrera futbolística en Andorinha y Nacional, destacándose desde joven \n", "\nManchester United: Transferencia al Manchester United y su desarrollo bajo Alex Ferguson\n", "\nProblemas Personales: Muerte de su padre y diagnóstico de cáncer de su madre\n"};
         try (FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\array.txt")) {
             for (String dato : datos) {
                 archivo.write(dato + "\n");
             }
             System.out.println("Array de Strings añadido al archivo.");
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         //Escribir datos de un objeto en un archivo
         JugadorProfesional jugador = new JugadorProfesional("Cristiano Ronaldo", 36);
         try (FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\jugador.txt")) {
             archivo.write(jugador.toString());
             System.out.println("Datos se agregaron al archivo");
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         // Manejo de excepciones con recursos (try-with-resources)
         
         try (FileWriter archivo = new FileWriter("C:\\Users\\diego\\Documents\\NetBeansProjects\\Ejercicio\\excepciones.txt")) {
             archivo.write("Real Madrid: Transferencia al Real Madrid y sus éxitos en el club español.\n");
             archivo.write("Eurocopa 2016: Victoria en la Eurocopa 2016 y su liderazgo en el equipo portugués.\n");
             archivo.write("Palabras Motivadoras:\n");
             archivo.write("\"El talento sin trabajo duro no sirve para nada.\" Esta frase refleja la ética de trabajo de Ronaldo y su dedicación constante.\n");
             archivo.write("\"No soy perfecto, pero trato de serlo.\" Una muestra de su búsqueda incansable de la excelencia.\n");
             archivo.write("\"La presión es parte de mi vida. La acepto y la manejo.\" Ronaldo habla sobre cómo enfrenta la presión y la utiliza como motivación.\n");
             System.out.println("Texto añadido con manejo de exepciones");
         } catch (IOException e) {
             e.printStackTrace();
}
    }
    
}
