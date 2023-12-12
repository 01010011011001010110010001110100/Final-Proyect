package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class EmployeeDAO {
    
    // FUNCION PARA AGREGAR EMPLEADO A LA BASE DE DATOS
    public boolean AddEmp(Employee e) {
        String sql = "INSERT INTO tbl_employee (NDIEmp, nameEmp, addressEmp, "
                + "phoneNumberEmp, birthdateEmp, idSex, idWorkPosition, "
                + "salaryEmp, integrationDate, idState) VALUES (?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ps.setString(1, e.getNIPEmp());
            ps.setString(2, e.getNameEmp());
            ps.setString(3, e.getAddressEmp());
            ps.setString(4, e.getPhoneNumberEmp());
            ps.setString(5, e.getBirthdateEmp());
            ps.setInt(6, e.getIdSex());
            ps.setInt(7, e.getIdWorkPosition());
            ps.setDouble(8, e.getSalaryEmp());
            ps.setString(9, e.getIntegrationDate());
            ps.setInt(10, e.getIdState());
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException ea) {
            System.out.println("Error when trying to add user to the DB: " + ea);
        }
        
        return false;
    }
    
    
    // FUNCION PARA ACTUALIZAR EMPLEADO A LA BASE DE DATOS
    public boolean UpdateEmp(Employee e){
        String sql = "UPDATE tbl_employee SET NDIEmp = ?, nameEmp = ?, addressEmp = ?, " +
                    "phoneNumberEmp = ?, birthdateEmp = ?, idSex = ?, idWorkPosition = ?, salaryEmp = ?, " +
                    "integrationDate = ?, idState = ? WHERE idEmp = ?";
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ps.setString(1, e.getNIPEmp());
            ps.setString(2, e.getNameEmp());
            ps.setString(3, e.getAddressEmp());
            ps.setString(4, e.getPhoneNumberEmp());
            ps.setString(5, e.getBirthdateEmp());
            ps.setInt(6, e.getIdSex()); 
            ps.setInt(7, e.getIdWorkPosition()); 
            ps.setDouble(8, e.getSalaryEmp()); 
            ps.setString(9, e.getIntegrationDate());
            ps.setInt(10, e.getIdState()); 
            ps.setInt(11, e.getIdEmp()); 

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ee) {
            System.out.println("Error when trying to Update user to the DB: " + ee);
        }
        return false;
    }
    
    
    // FUNCION PARA BORRAR EMPLEADO DE LA BASE DE DATOS
    public boolean DeleteUser(Employee e){
        String sql = "DELETE FROM tbl_employee WHERE idEmp = " + e.getIdEmp();
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException eae) {
            System.out.println("Error when trying to Update user to the DB: " + eae);
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
    
    
    
   //FUNCION PARA PBTENER TODOS LOS REGISTROS DE LA TABLA EMPLEADO Y DEVOLVER UN ATTAY
    public ArrayList<Employee> getAllRegisters(String value) {
        ArrayList<Employee> emps = new ArrayList<>();
        String sql = "SELECT * FROM tbl_employee WHERE CONCAT"
                + "(idEmp, NDIEmp, nameEmp, addressEmp, phoneNumberEmp, birthdateEmp, idSex,"
                + " idWorkPosition, salaryEmp, integrationDate, idState)"
                + " LIKE '%"+value+"%'";
        
        try {
            PreparedStatement ps = ConnectionMYSQL.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {              
                Employee em = new Employee(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getInt(8),
                    rs.getDouble(9),
                    rs.getString(10),
                    rs.getInt(11)
                );
                emps.add(em);
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while trying to "
                    + "obtain all the records" + e);
        }
        return emps;
    }
    
}
