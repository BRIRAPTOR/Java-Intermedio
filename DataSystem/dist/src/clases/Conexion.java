package clases;
/**
 * @author brian
 */
import java.sql.*;

public class Conexion {
//Conexión Local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://srv1288.hstgr.io:3306/u266478322_bd_ds","u266478322_briraptor","A#Sit14e+V");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conección local" + e);
        }
        return null;
    }
}
//"jdbc:mysql://localhost/bd_ds","root",""