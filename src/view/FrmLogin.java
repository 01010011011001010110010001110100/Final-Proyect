package view;


import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    
    //Variables to get and save the mouse position in the frame
    public FrmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgorund = new javax.swing.JPanel();
        pnlBar = new javax.swing.JPanel();
        pnlX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        pnlLeftBlack = new javax.swing.JPanel();
        lblTitleTip = new javax.swing.JLabel();
        lblDecriptionTip = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTextTop = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBackgorund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBar.setBackground(new java.awt.Color(51, 51, 51,0));

        pnlX.setBackground(new java.awt.Color(38, 38, 38,255));

        lblX.setFont(new java.awt.Font("Gorgonzolla", 0, 18)); // NOI18N
        lblX.setText("X");

        javax.swing.GroupLayout pnlXLayout = new javax.swing.GroupLayout(pnlX);
        pnlX.setLayout(pnlXLayout);
        pnlXLayout.setHorizontalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlXLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblX)
                .addGap(14, 14, 14))
        );
        pnlXLayout.setVerticalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblX)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBarLayout = new javax.swing.GroupLayout(pnlBar);
        pnlBar.setLayout(pnlBarLayout);
        pnlBarLayout.setHorizontalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarLayout.createSequentialGroup()
                .addGap(0, 853, Short.MAX_VALUE)
                .addComponent(pnlX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarLayout.setVerticalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBackgorund.add(pnlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        pnlLeftBlack.setBackground(new java.awt.Color(0, 0, 0, 125));

        lblTitleTip.setFont(new java.awt.Font("Poppins ExtraBold", 0, 20)); // NOI18N
        lblTitleTip.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleTip.setText("Motivation between Books");

        lblDecriptionTip.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        lblDecriptionTip.setForeground(new java.awt.Color(255, 255, 255));
        lblDecriptionTip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDecriptionTip.setText("<html><p> In every book, find the drive to reach new heights. The library, your haven of inspiration.</p><html>");
        lblDecriptionTip.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlLeftBlackLayout = new javax.swing.GroupLayout(pnlLeftBlack);
        pnlLeftBlack.setLayout(pnlLeftBlackLayout);
        pnlLeftBlackLayout.setHorizontalGroup(
            pnlLeftBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftBlackLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlLeftBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDecriptionTip, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleTip))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlLeftBlackLayout.setVerticalGroup(
            pnlLeftBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftBlackLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lblTitleTip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDecriptionTip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pnlBackgorund.add(pnlLeftBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        pnlRight.setBackground(new java.awt.Color(38, 38, 38));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        pnlRight.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        lblTextTop.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        lblTextTop.setForeground(new java.awt.Color(180, 180, 180));
        lblTextTop.setText("Enter your username and password ");
        pnlRight.add(lblTextTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 267, 25));

        tfUser.setBackground(new java.awt.Color(6, 6, 6));
        tfUser.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfUser.setForeground(new java.awt.Color(255, 255, 255));
        tfUser.setToolTipText("user");
        tfUser.setBorder(null);
        tfUser.setName(""); // NOI18N
        tfUser.setPreferredSize(new java.awt.Dimension(300, 48));
        pnlRight.add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        btnLogin.setBackground(new java.awt.Color(2, 166, 166));
        btnLogin.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.setPreferredSize(new java.awt.Dimension(240, 43));
        pnlRight.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        lblMessage.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(224, 34, 22));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setToolTipText("");
        pnlRight.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, 20));

        tfPassword.setBackground(new java.awt.Color(6, 6, 6));
        tfPassword.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfPassword.setToolTipText("password");
        tfPassword.setBorder(null);
        tfPassword.setPreferredSize(new java.awt.Dimension(300, 48));
        pnlRight.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GreyLine_Icon.png"))); // NOI18N
        pnlRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        pnlBackgorund.add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 600));

        lblLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LibraryBackground.png"))); // NOI18N
        pnlBackgorund.add(lblLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgorund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackgorund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDecriptionTip;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTextTop;
    private javax.swing.JLabel lblTitleTip;
    public javax.swing.JLabel lblX;
    public javax.swing.JPanel pnlBackgorund;
    public javax.swing.JPanel pnlBar;
    private javax.swing.JPanel pnlLeftBlack;
    public javax.swing.JPanel pnlRight;
    public javax.swing.JPanel pnlX;
    public javax.swing.JPasswordField tfPassword;
    public javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}