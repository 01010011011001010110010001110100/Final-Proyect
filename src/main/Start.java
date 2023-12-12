package main;

import extras.TextPrompt;
import com.formdev.flatlaf.FlatDarkLaf;
import controller.LoginController;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.FrmLogin;
import model.ConnectionMYSQL;


public class Start {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
            
            //CREACION DE VISTA Y CONTROLADOR LOGIN
            FrmLogin lv = new FrmLogin();
            LoginController lc = new LoginController(lv);
        
            //ESTABLECIMIENTO DE LOOK AND FEEL MEDIANTE FLATLAF
            try {
                //Set the lookAndFeelFlat to the components of the view
                UIManager.setLookAndFeel( new FlatDarkLaf() );
                UIManager.put("TextComponent.arc", 20);
                UIManager.put( "Button.arc", 999);
                SwingUtilities.updateComponentTreeUI(lv);
            } catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }
            
            //ESTABLECIENDO LA CONEXION A LA BASE DE DATOS 
            //(apesar de que no se almacene, esto es solo para inicializarla desde que inicie el proyecto)
            ConnectionMYSQL.getConnection();
            
            //ESTABLECIMIENTO DE HOLDERS PARA LOS TEXOTS INICIALES
            TextPrompt th1 = new TextPrompt("User or Gmail", lv.tfUser); //Establecer placeHolders en los Textfields
            TextPrompt th2 = new TextPrompt("Password", lv.tfPassword); //Establecer placeHolders en los Textfields
            lv.setVisible(true);
    }
}
