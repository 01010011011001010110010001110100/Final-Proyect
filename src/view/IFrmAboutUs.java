/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class IFrmAboutUs extends javax.swing.JInternalFrame  {

    /**
     * Creates new form IFrmAboutUs
     */
    public IFrmAboutUs() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 120));

        jLabel2.setFont(new java.awt.Font("Poppins Black", 0, 25)); // NOI18N
        jLabel2.setText("About Us");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html><p text-align: left;>Lib<br><br>\n" +
            "-----------------<br><br>\n" +
            "\n" +
            "Greetings, this is the lib application, which will allow you to perform several actions to manage your library in a simple way.<br><br>\n" +
            "\n" +
            "\n" +
            "Version: 1.0.0<br><br>\n" +
            "\n" +
            "Publication year: 2023<br><br>\n" +
            "\n" +
            "Main Features:<br><br>\n" +
            "\n" +
            "- CRUD:<br>\n" +
            "\n" +
            "-Users<br>\n" +
            "-Employee<br><br>\n" +
            "\n" +
            "Credits and Thanks:<br><br>\n" +
            "\n" +
            "- Developed by: Moises and Jerony<br><br>\n" +
            "\n" +
            "- Icons provided Moises<br><br>\n" +
            "\n" +
            "Contact:\n" +
            "\n" +
            "### - ### - ####<br><br>\n" +
            "\n" +
            "Privacy Policy:\n" +
            "\n" +
            "############<br><br>\n" +
            "\n" +
            "Terms and Conditions:\n" +
            "[################]<br><br>\n" +
            "\n" +
            "© 2027 Lib</p><html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 580, 640));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
