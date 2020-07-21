package tabla;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/tienda?autoReconnet=true&useSSL=false";
    public static final String user = "root";
    public static final String key = "admin";
    
    public Connection getConnection(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, user, key);
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
        return conexion;
    }
}