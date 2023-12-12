package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


////////////////////////////////////////////  USE OF PATERN DESING SINGELTON
public class ConnectionMYSQL {
    private static ConnectionMYSQL instance;
    private Connection con;
    
    //Metodo constructor y encargado de establecer la conecion con la base de datos en MySQL
    private ConnectionMYSQL() {
        System.out.println("Intentando extablecer conexion con la DB...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost/Lib",
               "root",
            "");
            System.out.println("! CONEXION ESTABLECIDA CON EXITO !");
        } catch (Exception e) {
            System.out.println("Error al conectar con la DB: " + e);
        }
    }
    
    //Este metodo sera el encargado de obtener la conexion del unico objeto instanciado de esta clase
    public static Connection getConnection(){
        return (instance == null) ? (instance = new ConnectionMYSQL()).con : instance.con;
    }
    
    //Este metodo me permite obtener la instanica unica de esta clase
    public static ConnectionMYSQL getInstance(){
        return (instance == null) ? (instance = new ConnectionMYSQL()) : instance;
    }
}
