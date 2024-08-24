/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazpersonas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Funcionext {

    ArrayList<Estudiante2> arrayest = new ArrayList();
    ArrayList<Profesor> arrayprof = new ArrayList();

    String nombre, paterno, materno, grupo, papa, mama, contraseña, materia;
    int boleta;

    public Funcionext() {

    }

    void guardarEstudiantes(String nombre, String paterno, String materno, String grupo, int boleta) throws IOException {
    Estudiante2 est = new Estudiante2(nombre, paterno, materno, grupo, boleta);
     
    // Verificar si el estudiante ya está registrado
    for (Estudiante2 estExistente : arrayest) {
        System.out.println("Existen " + estExistente.nombre + " nombre: " + nombre);
        if (estExistente.nombre.equals(nombre)) {
            // Ya está registrado, mostrar mensaje y salir
            JOptionPane.showMessageDialog(null, "Ya está registrado");
            return;
        }
    }

    // Si no se encontró coincidencia, agregar el estudiante a la lista
    arrayest.add(est);

    // Guardar en el archivo
    try (FileOutputStream fos1 = new FileOutputStream("Estudiantes.txt");
         ObjectOutputStream oos1 = new ObjectOutputStream(fos1)) {
        oos1.writeObject(arrayest);
        JOptionPane.showMessageDialog(null, "Se guardó exitosamente");
    }
}


    void eliminarProfesor(String nombre) throws IOException, ClassNotFoundException {
    Iterator<Profesor> iterator = arrayprof.iterator();

    while (iterator.hasNext()) {
        Profesor profe = iterator.next();
        if (profe.nombre.equals(nombre)) {
            iterator.remove(); // Eliminamos el profesor usando el iterador
            JOptionPane.showMessageDialog(null, "Se eliminó");
            break; // No es necesario seguir buscando
        }
    }

    try (FileOutputStream fos = new FileOutputStream("Profesores.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(arrayprof); // Guardamos el ArrayList actualizado
    }
}

  void eliminarEstudiantes(String nombre) throws IOException, ClassNotFoundException {
    Iterator<Estudiante2> iterator = arrayest.iterator();

    while (iterator.hasNext()) {
        Estudiante2 estu2 = iterator.next();
        if (estu2.nombre.equals(nombre)) {
            iterator.remove(); // Eliminamos el estudiante usando el iterador
            JOptionPane.showMessageDialog(null, "Se eliminó");
            break; // No es necesario seguir buscando
        }
    }

    try (FileOutputStream fos = new FileOutputStream("Estudiantes.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(arrayest); // Guardamos el ArrayList actualizado
    }
}


    void consultarestudiantes() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Estudiantes.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        String datos = "";

        arrayest = (ArrayList<Estudiante2>) ois.readObject();
        for (int i = 0; i < arrayest.size(); i++) {

            Estudiante2 estu = arrayest.get(i);
            datos = datos + "Nombre: " + estu.nombre + ", " + "Paterno: " + estu.paterno + ", " + "Materno: " + estu.materno + ", " + "Grupo: " + estu.grupo + ", " + "Boleta: " + estu.boleta + "\n";

        }
        JOptionPane.showMessageDialog(null, datos);
    }

    /*void guardarProfesor(String nombre, String papa, String mama, String grupo, String contraseña, String materia) {

        Profesor prof = new Profesor(nombre, papa, mama, grupo, contraseña, materia);
        arrayprof.add(prof);
        JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
    }
     */
   void guardarArchivoProfesor(String nombre, String papa, String mama, String grupo, String contraseña, String materia) throws FileNotFoundException, IOException {
    Profesor prof = new Profesor(nombre, papa, mama, grupo, contraseña, materia);

    // Verificar si el profesor ya está registrado
    for (Profesor profExistente : arrayprof) {
       
        if (profExistente.nombre.equals(nombre)) {
            // Ya está registrado, mostrar mensaje y salir
            JOptionPane.showMessageDialog(null, "Ya está registrado");
            return;
        }
    }

    // Si no se encontró coincidencia, agregar el profesor a la lista
    arrayprof.add(prof);

    // Guardar en el archivo
    try (FileOutputStream fos = new FileOutputStream("Profesores.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(arrayprof);
        JOptionPane.showMessageDialog(null, "Se guardó exitosamente");
    } catch (IOException e) {
        e.printStackTrace(); // Manejar la excepción de IO si ocurre
    }
}

    /* void consultaprofesor() {
        String datos = "";
        for (int i = 0; i < arrayprof.size(); i++) {

            Profesor profe = arrayprof.get(i);
            datos = datos + "Nombre: " + profe.nombre + ", " + "Paterno: " + profe.papa + ", " + "Materno: " + profe.mama + ", " 
    + "Materia: " + profe.materia + ", " + "Contraseña: " + profe.contraseña + ", " + "Grupo favorito: " + profe.grupo + ", " + "\n";
            JOptionPane.showMessageDialog(null, datos);

        }

    }*/
    void consultaprofesorArchivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Profesores.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        String datos = "";
        arrayprof = (ArrayList<Profesor>) ois.readObject();
        for (int i = 0; i < arrayprof.size(); i++) {
            Profesor profe = arrayprof.get(i);
            System.out.println("array indice i " + i);
            datos = datos + "Nombre: " + profe.nombre + ", " + "Paterno: " + profe.papa + ", " + "Materno: " + profe.mama
                    + ", " + "Materia: " + profe.materia + ", " + "Contraseña: " + profe.contraseña + ", " + "Grupo favorito: " + profe.grupo + ", " + "\n";

        }
        JOptionPane.showMessageDialog(null, datos);
    }

}
