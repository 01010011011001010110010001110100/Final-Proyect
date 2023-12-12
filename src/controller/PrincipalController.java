package controller;

import com.raven.menu.EventMenu;
import com.raven.menu.MainForm;
import com.raven.menu.MenuItem;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import view.*;


public class PrincipalController {
    
    //VARS
    private int levelAccess = 0; //Nivel de acceso a la aplicacion segun usuario iniciado
    
    ///////////////////////////////////////////////////////////ALL VIEWS OF PRINCIPAL VIEW
    
    //VISTAS (jFrames)
    private FrmPrincipal pv = new FrmPrincipal();
    private IFrmAboutUs auv = new IFrmAboutUs();
    
    //CREACION DE LAS VISTAS (INTERNAL FRAME) para el Jdesktop
    private IFrmUser usv = new IFrmUser();
    private IFrmClient cv = new IFrmClient();    
    private IFrmEmployee ev = new IFrmEmployee();
    private IFrmManageUser msuv = new IFrmManageUser();
    private IFrmManageEmployee mev = new IFrmManageEmployee();
    private IFrmManageClient mcv = new IFrmManageClient();
    private IFrmBook bv = new IFrmBook();
    private IFrmCategory ctgv = new IFrmCategory();
    private IFrmManageCategory mctgv = new IFrmManageCategory();
    private IFrmManageBook mbv = new IFrmManageBook();
    private IFrmLoan lnv = new IFrmLoan();
    private IFrmManageReturn mrv = new IFrmManageReturn();
    private IFrmAcctionHistory ahv = new IFrmAcctionHistory();
    
    //CREACION DE CONTROLADOS DE LAS VISTAS (SIN INICIALIZAR)
    private UserController usc;
    private EmployeeController ec;
    
    //CONSTRUCTOR
    public PrincipalController(FrmPrincipal pv, int levelAccess) {

        this.levelAccess = levelAccess;
        this.pv = pv;
        configInternalFrames();
        
        //EXTABLECIENDO EL TEXTO DE UN JLABEL SEGUN EL ACCESO
        pv.tfTyUser.setText((levelAccess == 1) ? "Admin" : "User");
        
        //////////////////////////////////////////CONFIGURACION DE LOS SUBMENUS SEGUN EL NIVEL DE ACCESO
        DefaultListModel<String> dlmIcon = new DefaultListModel<>();
        DefaultListModel<String> dlmText = new DefaultListModel<>();

        //Panel de Usuarios
        dlmText.addElement("Add User");
        dlmText.addElement("Add client");
        dlmText.addElement("Add employee");
        dlmText.addElement("Manage User");
        dlmText.addElement("Manage client");
        dlmText.addElement("Manage employee");
        dlmText.addElement("User history");
        dlmIcon.addElement("images/Add_Icon.png");
        dlmIcon.addElement("images/Add_Icon.png");
        dlmIcon.addElement("images/Add_Icon.png");
        dlmIcon.addElement("images/Manage_Icon.png");
        dlmIcon.addElement("images/Manage_Icon.png");
        dlmIcon.addElement("images/Manage_Icon.png");
        dlmIcon.addElement("images/Manage_Icon.png");
        
        if (levelAccess == 2) {
            int[] toRemove = new int[]{
                5,3,2,0
            };
            for (int i : toRemove) {
                dlmText.remove(i);
                dlmIcon.remove(i);
            }
            this.pv.menu1.getComponent(5).setEnabled(false);
        }
        this.pv.menuItem2.setMenuModel(dlmText);
        this.pv.menuItem2.setMenuIcon(dlmIcon);
        ///////////////////////////////////////////////////INICIALIZANDO CONTROLADORES
        
        usc = new UserController(usv,msuv);
        ec = new EmployeeController(ev, mev);
        
        ///////////////////////////////////////////////////////////ACCTIONLISTENER DEL MENU LATERAL IZQUIERDO
        this.pv.menu1.addEventMenuSelected(new EventMenu() {
            @Override
            public  void mainMenuSelected (MainForm mainForm, int index, MenuItem menuItem){
            }

            @Override
            public  void subMenuSelected (MainForm mainForm, int index,int subMenuIndex, Component menuItem){
                
                // EL PRIMER SWITCH ES PARA COMPROBAR QUE MENU ESTA SELECCIONADO
                // EL SEGUNDO SWITCH ES PARA COMPROBAR QUE SUBMENU ESTA SELECCIONADO DEL MENU
                switch(index){
                    case 0:
                        switch (subMenuIndex) {
                            case 0: auv.setVisible(true); break;
                        }
                    break;
                    case 1:
                        if (levelAccess == 1) {
                            switch (subMenuIndex) {
                                case 0: usv.setVisible(true); break;
                                case 1: cv.setVisible(true); break;
                                case 2: ev.setVisible(true); break;
                                case 3: msuv.setVisible(true); break;
                                case 4: mcv.setVisible(true); break;
                                case 5: mev.setVisible(true); break;
                                case 6: ahv.setVisible(true); break;
                            }
                        } else if (levelAccess == 2) {
                            switch (subMenuIndex) {
                                case 0: cv.setVisible(true); break;
                                case 1: mcv.setVisible(true); break;
                                case 2: ahv.setVisible(true); break;
                            }
                        }
                    break;
                    case 2:
                        switch (subMenuIndex) {
                            case 0: bv.setVisible(true); break;
                            case 1: ctgv.setVisible(true); break;
                            case 2: mbv.setVisible(true); break;
                            case 3: mctgv.setVisible(true); break;
                            case 4: ahv.setVisible(true); break;
                        }
                    break;
                    case 3:
                        switch (subMenuIndex) {
                            case 0: lnv.setVisible(true); break;
                            case 1: mrv.setVisible(true); break;
                            case 2: ahv.setVisible(true); break;
                        }
                    break;
                    case 4:
                        switch (subMenuIndex) {
                            case 0:
                                //NADA
                            break;
                        }
                    break;
                    case 5:
                        switch (subMenuIndex) {
                            case 0:
                                FrmLogin lv = new FrmLogin();
                                LoginController lc = new LoginController(lv);
                                SwingUtilities.updateComponentTreeUI(lv);
                                lv.setVisible(true);
                                pv.dispose();
                            break;
                            case 1:
                                System.exit(0);
                        }
                    break;
                }
            }
        });
        this.pv.menu1.setSelectedIndex(0);
        ///////////////////////////////////////////////////////////////////////////////////
    }
    
    
    //////////////////////////////////////////////////// FUNCIONES DE LA APLICACION PRINCIPAL
    
    //CONFIGURAR TODOS LOS FRAMES INTERNOS DEL COMPONENTE DESKTOP CREADO EN EL PNLRIGHT
    private void configInternalFrames() {
        
        ArrayList<JInternalFrame> IFL = new ArrayList<>(); //IFList
        
        //AGREGANDO TODOS LOS INTERNAL FRAME A UNA LISTA
        IFL.add(auv);
        IFL.add(usv);
        IFL.add(cv);
        IFL.add(ev);
        IFL.add(msuv);
        IFL.add(mev);
        IFL.add(mcv);
        IFL.add(bv);
        IFL.add(ctgv);
        IFL.add(mctgv);
        IFL.add(mbv);
        IFL.add(lnv);
        IFL.add(mrv);
        IFL.add(ahv);
        
        //ACTUALIZAR LA UI DE CADA INTERNAL FRAME PARA APLICAR EL NUEVO LOOK AND FEEL
        for (JInternalFrame obj : IFL) {
            SwingUtilities.updateComponentTreeUI(obj);
        }
        
        //AGREGANDO TODOS LOS INTERNAL FRAMES AL JDESKTOP 
        for (JInternalFrame obj : IFL) {
            this.pv.dpnViews.add(obj);
        }
        
        //CONFIGURANDO EL EVENTO DE CERRADO DE LA VENTANA DE UN INTERNAL FRAME
        //(ESTO PARA QUE CUANDO SE INTENTE CERRAR NO SE CIERRE, SINO, QUE SE OCULTE)
        for (JInternalFrame obj : IFL) {
            obj.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            obj.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosing(InternalFrameEvent e) {
                    obj.setVisible(false);
                }
            });
        }

        //HACER VISIBLE EL ABOUT
        auv.setVisible(true);
    }
    

}
