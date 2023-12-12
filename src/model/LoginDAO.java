package model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    //FUNCION PARA COMPROBAR SI UN REGISTRO EN ESPECIFICO EXISTE MEDIANTE ARGUMENTOS OBTENIDOS
    public boolean userExists(User us){
        String sql = "SELECT * FROM tbl_user WHERE (userName = '" + 
                us.getUserName() + "' OR userEmail = '" +
                us.getUserEmail() + "') AND userPassword = '" + us.getUserPassword() + "'";
 
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            if (((ResultSet) ps.executeQuery()).next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("A ocurrido un error al buscar en la DB: " + e);
        }
        
        return false;
    }
    
    
    //FUNCION PARA OBTENER EL NIVEL DE ACCESO DE UN REGISTRO
    public int getLevelAccess(User us) {
        String sql = "SELECT * FROM tbl_user WHERE userName = '" + us.getUserName() + "' OR userEmail = '" +
                us.getUserEmail() + "'";
        
        try {
            ResultSet rs = ConnectionMYSQL.getConnection().prepareStatement(sql).executeQuery();
            while (rs.next()) {                
                return rs.getInt(5);
            }
        } catch (SQLException e) {
             System.out.println("A intentando obtener el nivel de acceso: " + e);
        }
        return 0;
    }
}
