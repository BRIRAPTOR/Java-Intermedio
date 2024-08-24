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
public class Estudiante2 implements Serializable {

    String nombre, paterno, materno, grupo;
    int boleta;

    public Estudiante2(String nombre, String paterno, String materno, String grupo, int boleta) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.grupo = grupo;
        this.boleta = boleta;
    }
}
