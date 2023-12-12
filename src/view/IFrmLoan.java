/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class IFrmLoan extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmClient
     */
    public IFrmLoan() {
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

        tfISBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnApply = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfIdClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfLoanTime = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfISBN.setBackground(new java.awt.Color(6, 6, 6));
        tfISBN.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfISBN.setForeground(new java.awt.Color(255, 255, 255));
        tfISBN.setToolTipText("");
        tfISBN.setBorder(null);
        tfISBN.setName(""); // NOI18N
        tfISBN.setPreferredSize(new java.awt.Dimension(250, 36));
        getContentPane().add(tfISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 210, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel1.setText("ISNB of book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 500, 10));

        btnApply.setBackground(new java.awt.Color(2, 166, 166));
        btnApply.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnApply.setForeground(new java.awt.Color(255, 255, 255));
        btnApply.setText("APPLY");
        btnApply.setPreferredSize(new java.awt.Dimension(240, 43));
        getContentPane().add(btnApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        jLabel2.setText("Apply for loan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 440, 30));

        tfIdClient.setBackground(new java.awt.Color(6, 6, 6));
        tfIdClient.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfIdClient.setForeground(new java.awt.Color(255, 255, 255));
        tfIdClient.setToolTipText("");
        tfIdClient.setBorder(null);
        tfIdClient.setName(""); // NOI18N
        tfIdClient.setPreferredSize(new java.awt.Dimension(250, 36));
        getContentPane().add(tfIdClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 210, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel3.setText("ID of client");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel4.setText("Loan time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        tfLoanTime.setBackground(new java.awt.Color(6, 6, 6));
        tfLoanTime.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfLoanTime.setForeground(new java.awt.Color(255, 255, 255));
        tfLoanTime.setToolTipText("");
        tfLoanTime.setBorder(null);
        tfLoanTime.setName(""); // NOI18N
        tfLoanTime.setPreferredSize(new java.awt.Dimension(250, 36));
        getContentPane().add(tfLoanTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnApply;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField tfISBN;
    public javax.swing.JTextField tfIdClient;
    public javax.swing.JTextField tfLoanTime;
    // End of variables declaration//GEN-END:variables
}
