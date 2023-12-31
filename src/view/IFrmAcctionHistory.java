/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author usuario
 */
public class IFrmAcctionHistory extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmManageClient
     */
    public IFrmAcctionHistory() {
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
        btnUndo = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDelete1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_Icon.png"))); // NOI18N
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 30, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 790, 10));

        btnUndo.setBackground(new java.awt.Color(2, 166, 166));
        btnUndo.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnUndo.setForeground(new java.awt.Color(255, 255, 255));
        btnUndo.setText("UNDO");
        btnUndo.setPreferredSize(new java.awt.Dimension(240, 43));
        getContentPane().add(btnUndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 180, 40));

        tfSearch.setBackground(new java.awt.Color(6, 6, 6));
        tfSearch.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(255, 255, 255));
        tfSearch.setToolTipText("");
        tfSearch.setBorder(null);
        tfSearch.setName(""); // NOI18N
        tfSearch.setPreferredSize(new java.awt.Dimension(250, 36));
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        jLabel3.setText("Filter");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 790, 410));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 490, 30));

        btnDelete1.setBackground(new java.awt.Color(166, 2, 2));
        btnDelete1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("DELETE");
        btnDelete1.setPreferredSize(new java.awt.Dimension(240, 43));
        getContentPane().add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 180, 40));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 24)); // NOI18N
        jLabel4.setText("Acction History");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Register", "Inventory", "Circulation" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 30));

        jMenu1.setText("Generate");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DownloadReport_Icon.png"))); // NOI18N
        jMenuItem1.setText("Report");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete1;
    private javax.swing.JLabel btnSearch;
    public javax.swing.JButton btnUndo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblHistory;
    public javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
