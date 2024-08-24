/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazpersonas;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Profesor implements Serializable {

    String nombre, papa, mama, materia, contraseña, grupo;

    public Profesor(String nombre, String papa, String mama, String grupo, String contraseña, String materia) {
        this.nombre = nombre;
        this.papa = papa;
        this.mama = mama;
        this.grupo = grupo;
        this.contraseña = contraseña;
        this.materia = materia;
    }

}
