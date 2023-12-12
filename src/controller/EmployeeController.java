package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import extras.ToolComp;
import model.Employee;
import model.EmployeeDAO;
import java.text.SimpleDateFormat;
import view.IFrmEmployee;
import view.IFrmManageEmployee;



public class EmployeeController implements ActionListener, MouseListener, KeyListener {
    
    
    //variables
    private IFrmEmployee ev;
    private IFrmManageEmployee mev;
    private Employee e = new Employee();
    private EmployeeDAO edao = new EmployeeDAO();
    
    
        
    //Crea el modelo de la tabla y sobreescribir el metodo de que las celdas no sean
    // editables dandole doble click
    DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    
    //constructor
    public EmployeeController(IFrmEmployee ev, IFrmManageEmployee mev) {
        this.ev = ev;
        this.mev = mev;
        
        
        
        ////////////////////////////////////AGREGAR LISTENERS AQUI
        this.ev.btnRegister.addActionListener(this);
        this.mev.btnSearch.addMouseListener(this);
        this.mev.tfSearch.addKeyListener(this);
        this.mev.tblEmployee.addMouseListener(this);
        this.mev.btnUpdate.addActionListener(this);
        this.mev.btnDelete.addActionListener(this);
        //////////////////////////////////////////////////////////
        
        
        //Agregar cargos a elemento de la GUI

        //Agregar todos los los elementos de la tabla state y cargarlos en el formulario
        for (String allStates : edao.getColumn("descState","tbl_state",2)) { 
            this.ev.cmbState.addItem(allStates);
            this.mev.cmbState.addItem(allStates);
        }
        for (String allSex : edao.getColumn("descSex","tbl_sex",0)) { 
            this.ev.cmbSex.addItem(allSex);
            this.mev.cmbSex.addItem(allSex);
        } 
        for (String allWorkPosition : edao.getColumn("descWorkPosition","tbl_workPosition",0)) { 
            this.ev.cmbWorkPosition.addItem(allWorkPosition);
            this.mev.cmbWorkPosition.addItem(allWorkPosition);
        }
        
        //Establecer la estructura de la tablaba manage
        tableModel.addColumn("ID");
        tableModel.addColumn("NIP");
        tableModel.addColumn("Name");
        tableModel.addColumn("Adress");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Birthdate");
        tableModel.addColumn("Sex");
        tableModel.addColumn("Work Position");
        tableModel.addColumn("Salaray");
        tableModel.addColumn("Integration date");
        tableModel.addColumn("State");
        showEmp("");
    }

    
    ///////////////////////////////////////////////////// FUNCIONES
    //Este metodo intentara agregar un empleado
    private void TryAddEmp() {
        if (ToolComp.validateFields(ev.pnlFlieds)) {
            
            //Llenando el modelo
            e.setNIPEmp(ev.tfINDI.getText());
            e.setNameEmp(ev.tfName.getText());
            e.setAddressEmp(ev.tfAdress.getText());
            e.setPhoneNumberEmp(ev.tfPhoneNumber.getText());
            e.setBirthdateEmp(new SimpleDateFormat("yyyy-MM-dd").format(ev.dcBirthdate.getDate()));
            e.setIdSex(ev.cmbSex.getSelectedIndex()+1);
            e.setIdWorkPosition(ev.cmbWorkPosition.getSelectedIndex()+1);
            e.setSalaryEmp(Double.parseDouble(ev.tfSalary.getText()));
            e.setIntegrationDate(new SimpleDateFormat("yyyy-MM-dd").format(ev.dcIntegration.getDate()));
            e.setIdState(ev.cmbState.getSelectedIndex()+1);

            
            if (edao.AddEmp(e)) {
                //Accion si se pudo agregar
                JOptionPane.showMessageDialog(ev, "The action was carried out successfully!"
                    ,"Done", JOptionPane.INFORMATION_MESSAGE);
                ToolComp.cleanFields(ev.pnlFlieds);
                ev.tfName.requestFocus();
                showEmp("");
            } else {
                JOptionPane.showMessageDialog(ev, "The action could not be performed!"
                    ,"Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    
    //Este metodo intentara actualizar un empleado
    private void TryUpdateEmp() {
        try{
            if (ToolComp.validateFields(mev.pnlFlieds)) {

                //Llenando el modelo
                e.setIdEmp(Integer.parseInt( mev.tblEmployee.getValueAt(mev.tblEmployee.getSelectedRow(), 0).toString()));
                e.setNIPEmp(mev.tfNDI.getText());
                e.setNameEmp(mev.tfName.getText());
                e.setAddressEmp(mev.tfAdress.getText());
                e.setPhoneNumberEmp(mev.tfPhoneNumber.getText());
                e.setBirthdateEmp(new SimpleDateFormat("yyyy-MM-dd").format(mev.dcBirthdate.getDate()));
                e.setIdSex(mev.cmbSex.getSelectedIndex()+1);
                e.setIdWorkPosition(mev.cmbWorkPosition.getSelectedIndex()+1);
                e.setSalaryEmp(Double.parseDouble(mev.tfSalary.getText()));
                e.setIntegrationDate(new SimpleDateFormat("yyyy-MM-dd").format(mev.dcIntegration.getDate()));
                e.setIdState(mev.cmbState.getSelectedIndex()+1);

                if (edao.UpdateEmp(e)){
                    //Accion si se pudo actualizar
                    JOptionPane.showMessageDialog(mev, "The action was carried out successfully!"
                        ,"Done", JOptionPane.INFORMATION_MESSAGE);
                    ToolComp.cleanFields(mev.pnlFlieds);
                    mev.tfName.requestFocus();
                    showEmp("");
                } else {
                    JOptionPane.showMessageDialog(mev, "The action could not be performed!"
                        ,"Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(mev, "Please, select an employee"
                ,"Not row selected!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    
    
    //Este metodo intentara borrar un empleado
    private void TryDeleteEmp(){
        try {
            //Rellenando modelo
            e.setIdEmp(Integer.parseInt( mev.tblEmployee.getValueAt(mev.tblEmployee.getSelectedRow(), 0).toString()));

            if (edao.DeleteUser(e)){
                //Accion si se pudo actualizar
                JOptionPane.showMessageDialog(mev, "The action was carried out successfully!"
                    ,"Done", JOptionPane.INFORMATION_MESSAGE);
                ToolComp.cleanFields(mev.pnlFlieds);
                mev.tfName.requestFocus();
                showEmp("");
            } else {
                JOptionPane.showMessageDialog(mev, "The action could not be performed!"
                    ,"Error!", JOptionPane.ERROR_MESSAGE);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(mev, "Please, select an employee"
                ,"Not row selected!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
   
    //Este evento lo que hace es mostrar en una tabla todos los registros de una tabla
    // de la base de datos, en este caso la tabla usuarios
    private void showEmp(String value) {
        //Clear the table
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tableModel.removeRow(i);
            i = i - 1;
        }
        
        ArrayList<Employee> emps = edao.getAllRegisters(value);
        Object[] obj = new Object[11];
        
        for (int i = 0; i < emps.size(); i++) {
            obj[0] = emps.get(i).getIdEmp();
            obj[1] = emps.get(i).getNIPEmp();
            obj[2] = emps.get(i).getNameEmp();
            obj[3] = emps.get(i).getAddressEmp();
            obj[4] = emps.get(i).getPhoneNumberEmp();
            obj[5] = emps.get(i).getBirthdateEmp();
            obj[6] = mev.cmbSex.getItemAt(emps.get(i).getIdSex()-1);
            obj[7] = mev.cmbWorkPosition.getItemAt(emps.get(i).getIdWorkPosition()-1);
            obj[8] = emps.get(i).getSalaryEmp();
            obj[9] = emps.get(i).getIntegrationDate();
            obj[10] = mev.cmbState.getItemAt(emps.get(i).getIdState()-1);
            tableModel.addRow(obj);
        }
        mev.tblEmployee.setModel(tableModel);
    }
    
   
    
    
    // ENCARGADO DE RELLENAR TODOS LOS FIELDS
    private void UploadForm() {
        int row = mev.tblEmployee.getSelectedRow();

        mev.tfNDI.setText(mev.tblEmployee.getValueAt(row, 1).toString());
        mev.tfName.setText(mev.tblEmployee.getValueAt(row, 2).toString());
        mev.tfAdress.setText(mev.tblEmployee.getValueAt(row, 3).toString());
        mev.tfPhoneNumber.setText(mev.tblEmployee.getValueAt(row, 4).toString());
        try {
            mev.dcBirthdate.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(mev.tblEmployee.getValueAt(row, 5).toString()));
            mev.dcIntegration.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(mev.tblEmployee.getValueAt(row, 9).toString()));
        } catch (ParseException e) {
            System.out.println("Error to parse dates: " + e);
        }
        mev.cmbSex.setSelectedItem(mev.tblEmployee.getValueAt(row, 6).toString());
        mev.cmbWorkPosition.setSelectedItem(mev.tblEmployee.getValueAt(row, 7).toString());
        mev.tfSalary.setText(mev.tblEmployee.getValueAt(row, 8).toString());
        mev.cmbState.setSelectedItem(mev.tblEmployee.getValueAt(row, 10).toString());

    }
    
    
    
    //////////////////////////////////////////////////// ACCIONES DE LOS BOTONOES Y LISENERS
    @Override
    public void actionPerformed(ActionEvent e) {
            //Intentar agregar usuario
        if (e.getSource() == ev.btnRegister) {
            TryAddEmp();
        }
        
        //Intentar actualizar usuario
        if (e.getSource() == mev.btnUpdate) {
            TryUpdateEmp();
        }
        
        //Intentar eliminar usuario
        if (e.getSource() == mev.btnDelete) {
            TryDeleteEmp();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Cargar formulario
        if (e.getSource() == mev.tblEmployee) {
            UploadForm();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Buscar 
        if (e.getSource() == mev.btnSearch) {
            showEmp(mev.tfSearch.getText());
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
        if (e.getSource() == mev.tfSearch && e.getKeyCode() == KeyEvent.VK_ENTER) {
            showEmp(mev.tfSearch.getText());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
