package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import extras.ToolComp;
import view.FrmLogin;
import model.User;
import model.LoginDAO;
import view.FrmPrincipal;

public class LoginController implements ActionListener, MouseListener, MouseMotionListener, KeyListener {
    
    
    //Vars
    private int xMouse,yMouse; // Es para obtener y almacenar la posicion del componente pnlX y usarlo luego
    private FrmLogin lv = new FrmLogin(); //VISTA A CONTROLAR
    private User us = new User(); //MODELO A GESTIONAR
    private LoginDAO ldao = new LoginDAO(); //CONSULAR PARA UTILIZAR
    
    //CONSTRUCTOR DEL CONTROLADOR LOGIN
    public LoginController(FrmLogin lv) {
        this.lv = lv;
        this.lv.btnLogin.addActionListener(this);
        this.lv.pnlX.addMouseListener(this);
        this.lv.pnlBar.addMouseMotionListener(this);
        this.lv.pnlBar.addMouseListener(this);
        this.lv.tfPassword.addKeyListener(this);
        
        
    }
    
    
    ///////////////////////////////////////////////////////////// FUNCIONES DEL CONTROLADOR
    
    //Este metodo intentara acceder mediante un usuario 
    public void TrylogIn() {
        if (ToolComp.validateFields(lv.pnlRight)) {
            
            //Llenando el modelo
            us.setUserEmail(lv.tfUser.getText());
            us.setUserName(lv.tfUser.getText()); 
            us.setUserPassword(lv.tfPassword.getText());          
            int levelAccess = ldao.getLevelAccess(us);   //Obtener el nivel de acceso
  
            if (ldao.userExists(us)) {                  // comprobar si el usuario existe
                if (levelAccess != 0) {                 // comprobar que no hubo problema obteniendo el acceso
                    FrmPrincipal pv = new FrmPrincipal();
                    PrincipalController pc = new PrincipalController(pv,levelAccess);
                    pv.setVisible(true);
                    lv.dispose();
                } else {
                    JOptionPane.showMessageDialog(lv, 
                        "Ocurrio un error el nivel de acceso", "Error!", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                lv.lblMessage.setText("Incorrect user or password");
            }
            ToolComp.cleanFields(lv.pnlRight);
        }
    }
    
    
    ///////////////////////////////////////////////////////////// AQUII TODOS LOS EVENTOS QUE PASEN CON LOS BOTONES DEL LOGIN
    // OJO: Los metodos lo cuales no tengan nada dentro se deben de quedar igual, ya que etamos implementadolos desde una interfaz (NO SE DEBEN BORRAR)
    @Override
    public void actionPerformed(ActionEvent e) {
        //Cuando se precione el boton LOGIN este llenara el modelo y accionara el metodo LogIn para 
        //iniciar la aplicacion si es exitoso el resultado
        if (e.getSource() == lv.btnLogin) {
            lv.lblMessage.setText("");
            TrylogIn();
            ToolComp.cleanFields(lv.pnlRight);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        //Si es precionado el panel pnlX este terminara la aplicacion
        if (e.getSource() == lv.pnlX) {
             System.exit(0);
        }
        
        //Almacenar la posicion de la barra cuando se precione el click
        if (e.getSource() == lv.pnlBar){
            xMouse = e.getX();
            yMouse = e.getY();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Si se pasa el mouse sobre el panel pnlX este cambiara de color junto al lblX
        if (e.getSource() == lv.pnlX) {
            lv.pnlX.setBackground(new Color(35,35,35,255));
            lv.lblX.setForeground(new Color(200,40,40,255));  
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Si se pasa el mouse sobre el panel pnlX este cambiara de color junto al lblX
        if (e.getSource() == lv.pnlX) {
            lv.pnlX.setBackground(new Color(38,38,38,255));
            lv.lblX.setForeground(Color.white);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //Si se arrastra el panel la vista FrmLogin seguira la posicion del mouse
        if (e.getSource() == lv.pnlBar) {
            lv.setLocation(e.getXOnScreen() - xMouse,e.getYOnScreen() -  yMouse);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Este evento se encarga de que cuando presione enter cuando password esta seleccionado
        //entonces que haga click en boton btnLogin
        if (e.getSource() == lv.tfPassword && e.getKeyCode() == KeyEvent.VK_ENTER) { //13 es enter en el keycode
            lv.btnLogin.doClick();
            lv.tfUser.requestFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
