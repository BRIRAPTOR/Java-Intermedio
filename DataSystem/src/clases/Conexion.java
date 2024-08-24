package clases;
/**
 * @author brian
 */
import java.sql.*;

public class Conexion {
//Conexión Local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conección local" + e);
        }
        return null;
    }
}