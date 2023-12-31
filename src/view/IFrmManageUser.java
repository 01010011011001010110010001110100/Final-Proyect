/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class IFrmManageUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmManageClient
     */
    public IFrmManageUser() {
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

        btnSearch = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlFields = new javax.swing.JPanel();
        tfUserEmail = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        tfUserPassword = new javax.swing.JTextField();
        cmbState = new javax.swing.JComboBox<>();
        cmbLevelAccess = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnGenerate = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_Icon.png"))); // NOI18N
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 30, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 790, 10));

        btnUpdate.setBackground(new java.awt.Color(2, 166, 166));
        btnUpdate.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setPreferredSize(new java.awt.Dimension(240, 43));
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 170, 40));

        btnDelete.setBackground(new java.awt.Color(166, 2, 2));
        btnDelete.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setPreferredSize(new java.awt.Dimension(240, 43));
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 180, 40));

        tfSearch.setBackground(new java.awt.Color(6, 6, 6));
        tfSearch.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(255, 255, 255));
        tfSearch.setToolTipText("");
        tfSearch.setBorder(null);
        tfSearch.setName(""); // NOI18N
        tfSearch.setPreferredSize(new java.awt.Dimension(250, 36));
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        jLabel3.setText("Manage user");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 790, 260));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 480, 30));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel8.setText("User Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel4.setText("Level Acces");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel9.setText("State");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        tfUserEmail.setBackground(new java.awt.Color(6, 6, 6));
        tfUserEmail.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfUserEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfUserEmail.setToolTipText("email");
        tfUserEmail.setBorder(null);
        tfUserEmail.setName(""); // NOI18N
        tfUserEmail.setPreferredSize(new java.awt.Dimension(250, 36));

        tfUserName.setBackground(new java.awt.Color(6, 6, 6));
        tfUserName.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfUserName.setForeground(new java.awt.Color(255, 255, 255));
        tfUserName.setToolTipText("user name");
        tfUserName.setBorder(null);
        tfUserName.setName(""); // NOI18N
        tfUserName.setPreferredSize(new java.awt.Dimension(250, 36));

        tfUserPassword.setBackground(new java.awt.Color(6, 6, 6));
        tfUserPassword.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfUserPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfUserPassword.setToolTipText("password");
        tfUserPassword.setBorder(null);
        tfUserPassword.setName(""); // NOI18N
        tfUserPassword.setPreferredSize(new java.awt.Dimension(250, 36));

        cmbState.setToolTipText("state of user");
        cmbState.setPreferredSize(new java.awt.Dimension(72, 36));

        cmbLevelAccess.setToolTipText("level access");
        cmbLevelAccess.setPreferredSize(new java.awt.Dimension(72, 36));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel5.setText("User Email");

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jLabel1.setText("User name");

        javax.swing.GroupLayout pnlFieldsLayout = new javax.swing.GroupLayout(pnlFields);
        pnlFields.setLayout(pnlFieldsLayout);
        pnlFieldsLayout.setHorizontalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFieldsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFieldsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(tfUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addComponent(tfUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(cmbLevelAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        pnlFieldsLayout.setVerticalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(cmbLevelAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 490, 200));

        mnGenerate.setText("Generate");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DownloadReport_Icon.png"))); // NOI18N
        jMenuItem1.setText("Report");
        mnGenerate.add(jMenuItem1);

        jMenuBar1.add(mnGenerate);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete;
    public javax.swing.JLabel btnSearch;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox<String> cmbLevelAccess;
    public javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JMenu mnGenerate;
    public javax.swing.JPanel pnlFields;
    public javax.swing.JTable tblUser;
    public javax.swing.JTextField tfSearch;
    public javax.swing.JTextField tfUserEmail;
    public javax.swing.JTextField tfUserName;
    public javax.swing.JTextField tfUserPassword;
    // End of variables declaration//GEN-END:variables
}
