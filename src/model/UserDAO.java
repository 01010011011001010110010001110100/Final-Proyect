package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserDAO {
    
    

    // FUNCION PARA AGREGAR USUARIOS A LA BASE DE DATOS
    public boolean AddUser(User us) {
        String sql = "INSERT INTO tbl_user(userName, userEmail, userPassword, idAccess, idState) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ps.setString(1, us.getUserName());
            ps.setString(2, us.getUserEmail());
            ps.setString(3, us.getUserPassword());
            ps.setInt(4, us.getIdAccess());
            ps.setInt(5, 1);
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error when trying to add user to the DB: " + e);
        }
        
        return false;
    }
    
    // FUNCION PARA ACTUALIZAR USUARIO EN LA BASE DE DATOS
    public boolean UpdateUser(User us){
        String sql = "UPDATE tbl_user SET userName = '" + us.getUserName() + "', userEmail = '" 
                + us.getUserEmail()+  "', userPassword = '" + us.getUserPassword() + 
                "', idAccess = "+ us.getIdAccess() + ", idState = " + us.getIdState() + 
                " WHERE idUser = " + us.getIdUser();
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error when trying to Update user to the DB: " + e);
        }
        return false;
    }
    
    
    // FUNCION PARA BORRAR USUARIO DE LA BASE DE DATOS
    public boolean DeleteUser(User us){
        String sql = "DELETE FROM tbl_user WHERE idUser = " + us.getIdUser();
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error when trying to Update user to the DB: " + e);
        }
        return false;
    }
    
    
    //FUNCION PARA OBTENER LOS X CANTIDAD DE REGISTROS DE UNA COLUMMNA
    public ArrayList<String> getColumn(String column, String table, int Amount){
        ArrayList<String> allAccess = new ArrayList<>();
        
        //Depende la cantidad de Amount hara algo
        //Si es 0, este traera todos los registros de esa columna
        // pero si es mayor a 0, entonces traera a partir de esa cantidad
        String sql = (Amount == 0) ? 
                "SELECT ("+column+") FROM " + table :
                "SELECT ("+column+") FROM " + table + " LIMIT " + Amount;
        
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
 
            while(rs.next()) {
                allAccess.add(rs.getString(1));
            }
            
        } catch (SQLException e) {
            System.out.println("Error when trying to obtain access: to the DB: " + e);
        }
        return allAccess;
    }
    
    
    //FUNCION PARA PBTENER TODOS LOS REGISTROS DE LA TABLA USERS Y DEVOLVER UN ATTAY
    public ArrayList<User> getAllRegisters(String value) {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT * FROM tbl_user where CONCAT(idUser,userName, userEmail, userPassword, idAccess, idState) LIKE '%"+value+"%'";
        
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                User us = new User(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getInt(6)
                );
                users.add(us);
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while trying to "
                    + "obtain all the records" + e);
        }
        return users;
    }
}
