package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import extras.ToolComp;
import model.User;
import model.UserDAO;
import view.IFrmManageUser;
import view.IFrmUser;

public class UserController implements ActionListener, MouseListener, KeyListener{
    
    
    //Vistas
    private IFrmUser usv = new IFrmUser();
    private IFrmManageUser musv = new IFrmManageUser();
    private User us = new User();
    private UserDAO usdao = new UserDAO();
    
    //Crea el modelo de la tabla y sobreescribir el metodo de que las celdas no sean
    // editables dandole doble click
    private DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    
    //Controlador
    public UserController (IFrmUser usv, IFrmManageUser musv){
        this.usv = usv;
        this.musv = musv;

        
        ////////////////////////////////////AGREGAR LISTENERS AQUI
        this.usv.btnRegister.addActionListener(this);
        this.musv.btnSearch.addMouseListener(this);
        this.musv.tfSearch.addKeyListener(this);
        this.musv.tblUser.addMouseListener(this);
        this.musv.btnUpdate.addActionListener(this);
        this.musv.btnDelete.addActionListener(this);
        //////////////////////////////////////////////////////////
                
        //Agregar cargos a elemento de la GUI
        //Cargar en los combobox los valores que hay en la base de datos
        for (String allAccess : usdao.getColumn("descAccess","tbl_access",0)) { 
            this.usv.cmbLevelAccess.addItem(allAccess); 
            this.musv.cmbLevelAccess.addItem(allAccess);
        }
        
        //Agregar todos los los elementos de la tabla state y cargarlos en el formulario
        for (String allStates : usdao.getColumn("descState","tbl_state",2)) { 
            this.musv.cmbState.addItem(allStates);
        }
        
        
        //Establecer la estructura de la tablaba manage user
        tableModel.addColumn("ID");
        tableModel.addColumn("User");
        tableModel.addColumn("Email");
        tableModel.addColumn("Password");
        tableModel.addColumn("Access");
        tableModel.addColumn("State");
        showUser("");
        
    }

    ///////////////////////////////////////////////////////////////////////////////// FUNCIONES
    //Este metodo intentara agregar un usuario
    private void TryAddUser() {
        if (ToolComp.validateFields(usv.pnlPrincipal) && ToolComp.validateEmail(usv.tfUserEmail.getText(),usv)) {
            
            //Llenando el modelo
            us.setUserName(usv.tfUserName.getText());
            us.setUserEmail(usv.tfUserEmail.getText());
            us.setUserPassword(usv.tfUserPassword.getText());
            us.setIdAccess(usv.cmbLevelAccess.getSelectedIndex()+1);
            
            if (usdao.AddUser(us)) {
                //Accion si se pudo agregar
                JOptionPane.showMessageDialog(usv, "The action was carried out successfully!"
                    ,"Done", JOptionPane.INFORMATION_MESSAGE);
                ToolComp.cleanFields(usv.pnlPrincipal);
                usv.tfUserName.requestFocus();
                showUser("");
            } else {
                JOptionPane.showMessageDialog(usv, "The action could not be performed!"
                    ,"Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    //Este metodo intentara actualizar un usuario
    private void TryUpdateUser() {
        try {
            if (ToolComp.validateFields(musv.pnlFields) && ToolComp.validateEmail(musv.tfUserEmail.getText(),usv)) {
                //Llenando el modelo
                us.setIdUser(Integer.parseInt(musv.tblUser.getValueAt(musv.tblUser.getSelectedRow(), 0).toString()));
                us.setUserName(musv.tfUserName.getText());
                us.setUserEmail(musv.tfUserEmail.getText());
                us.setUserPassword(musv.tfUserPassword.getText());
                us.setIdAccess(musv.cmbLevelAccess.getSelectedIndex()+1);
                us.setIdState(musv.cmbState.getSelectedIndex()+1);

                if (usdao.UpdateUser(us)){
                    //Accion si se pudo actualizar
                    JOptionPane.showMessageDialog(musv, "The action was carried out successfully!"
                        ,"Done", JOptionPane.INFORMATION_MESSAGE);
                    ToolComp.cleanFields(musv.pnlFields);
                    musv.tfUserName.requestFocus();
                    showUser("");
                } else {
                    JOptionPane.showMessageDialog(musv, "The action could not be performed!"
                        ,"Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(musv, "Please, select an user"
                ,"Not row selected!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Este metodo intentara borrar un usuario
    private void TryDeleteUser(){
        try {
            //Rellenando modelo
            us.setIdUser(Integer.parseInt(musv.tblUser.getValueAt(musv.tblUser.getSelectedRow(), 0).toString()));
            
            //Ejecutando accion
            if (usdao.DeleteUser(us)){
                //Accion si se pudo actualizar
                JOptionPane.showMessageDialog(musv, "The action was carried out successfully!"
                    ,"Done", JOptionPane.INFORMATION_MESSAGE);
                ToolComp.cleanFields(musv.pnlFields);
                musv.tfUserName.requestFocus();
                showUser("");
            } else {
                JOptionPane.showMessageDialog(musv, "The action could not be performed!"
                    ,"Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(musv, "Please, select an user"
                ,"Not row selected!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    //Este evento lo que hace es mostrar en una tabla todos los registros de una tabla
    // de la base de datos, en este caso la tabla usuarios
    private void showUser(String value) {
        //Clear the table
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i = i - 1;
        }
        
        ArrayList<User> users = usdao.getAllRegisters(value);
        Object[] obj = new Object[6];
        
        for (int i = 0; i < users.size(); i++) {
            obj[0] = users.get(i).getIdUser();
            obj[1] = users.get(i).getUserName();
            obj[2] = users.get(i).getUserEmail();
            obj[3] = users.get(i).getUserPassword();
            obj[4] = musv.cmbLevelAccess.getItemAt(users.get(i).getIdAccess()-1);
            obj[5] = musv.cmbState.getItemAt(users.get(i).getIdState()-1);
            tableModel.addRow(obj);
        }
        musv.tblUser.setModel(tableModel);
    }
    
    // ENCARGADO DE RELLENAR TODOS LOS FIELDS
    private void UploadForm() {
        int row = musv.tblUser.getSelectedRow();
        musv.tfUserName.setText(musv.tblUser.getValueAt(row, 1).toString());
        musv.tfUserEmail.setText(musv.tblUser.getValueAt(row, 2).toString());
        musv.tfUserPassword.setText(musv.tblUser.getValueAt(row, 3).toString());
        musv.cmbLevelAccess.setSelectedItem(musv.tblUser.getValueAt(row, 4).toString());
        musv.cmbState.setSelectedItem(musv.tblUser.getValueAt(row, 5).toString());
    }
    
    //////////////////////////////////////////////////////////////////////////// LISTENER DE LOS EVENTOS
    @Override
    public void actionPerformed(ActionEvent e) {
        //Intentar agregar usuario
        if (e.getSource() == usv.btnRegister) {
            TryAddUser();
        }
        
        //Intentar actualizar usuario
        if (e.getSource() == musv.btnUpdate) {
            TryUpdateUser();
        }
        
        //Intentar eliminar usuario
        if (e.getSource() == musv.btnDelete) {
            TryDeleteUser();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Cargar formulario
        if (e.getSource() == musv.tblUser) {
            UploadForm();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Buscar 
        if (e.getSource() == musv.btnSearch) {
            showUser(musv.tfSearch.getText());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == musv.tfSearch && e.getKeyCode() == KeyEvent.VK_ENTER) {
            showUser(musv.tfSearch.getText());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
