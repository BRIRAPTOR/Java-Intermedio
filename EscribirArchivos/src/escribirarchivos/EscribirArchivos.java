/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirarchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author brira
 */
public class EscribirArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            // Crear un archivo para escribir
            File fileToWrite = new File("archivo_para_escribir.txt");
            if (fileToWrite.createNewFile()) {
                System.out.println("Archivo creado: " + fileToWrite.getName());
                // Escribir en el archivo
                FileWriter writer = new FileWriter("archivo_para_escribir.txt");
                writer.write("Este es un texto de prueba.");              
                writer.close();
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Crear un archivo para borrar
            File fileToDelete = new File("archivo_para_borrar.txt");
            if (fileToDelete.createNewFile()) {
                System.out.println("Archivo creado: " + fileToDelete.getName());
                // Borrar el archivo
                if (fileToDelete.delete()) {
                    System.out.println("Archivo borrado: " + fileToDelete.getName());
                } else {
                    System.out.println("No se pudo borrar el archivo.");
                }
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
          
         
    }
    
}
