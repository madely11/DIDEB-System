package ec.edu.espe.didebsystem.view.forms;

import ec.edu.espe.didebsystem.controller.ClientController;
import ec.edu.espe.didebsystem.controller.ProductController;
import ec.edu.espe.didebsystem.controller.PurchaseController;
import ec.edu.espe.didebsystem.controller.SalesController;
import ec.edu.espe.didebsystem.controller.SupplierController;
import ec.edu.espe.didebsystem.view.forms.clients.ClientView;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.modelDAO.PurchaseDAO;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;
import ec.edu.espe.didebsystem.modelDAO.SupplierDAO;
import ec.edu.espe.didebsystem.view.forms.product.ProductView;
import ec.edu.espe.didebsystem.view.forms.purchase.PurchaseView;
import ec.edu.espe.didebsystem.view.forms.sales.SalesView;
import ec.edu.espe.didebsystem.view.forms.supplier.SupplierView;

/**
 *
 * @author sebask8er
 */
public class Menu extends javax.swing.JFrame {
    private static Menu menu;
    
    public static Menu getInstance(){
        if(menu == null) menu = new Menu();
        
        return menu;
    }
    
    private Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnClientMangement1 = new javax.swing.JButton();
        btnSupplierMangement = new javax.swing.JButton();
        btnProductManagement = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnPurchaseManagement = new javax.swing.JButton();
        btnSaleMangement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 41, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setText("__________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        jPanel3.setBackground(new java.awt.Color(4, 83, 242));

        btnExit.setBackground(new java.awt.Color(0, 204, 204));
        btnExit.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(848, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jPanel4.setBackground(new java.awt.Color(12, 12, 12));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 950, 40));

        btnClientMangement1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnClientMangement1.setText("Clientes");
        btnClientMangement1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnClientMangement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientMangement1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientMangement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 110, -1));

        btnSupplierMangement.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnSupplierMangement.setText("Proveedores");
        btnSupplierMangement.setToolTipText("");
        btnSupplierMangement.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnSupplierMangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierMangementActionPerformed(evt);
            }
        });
        jPanel2.add(btnSupplierMangement, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 160, -1));

        btnProductManagement.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnProductManagement.setText("Productos");
        btnProductManagement.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnProductManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductManagementActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 140, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel3.setText("de tu negocio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 360, 60));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel4.setText("Administra las operaciones ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 460, 60));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("DIDEB");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/Prodcuts.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 260, 170));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/Croods - Sitting on Floor.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 410, 340));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/Croods - Projector.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 220, 300));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/Croods - Proveedor.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 230, 280));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("_______________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, 20));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Otras opciones de administración");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("<");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("<");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("_______________");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 20));

        btnPurchaseManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnPurchaseManagement.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnPurchaseManagement.setText("Gestión de Compras");
        btnPurchaseManagement.setBorder(null);
        btnPurchaseManagement.setBorderPainted(false);
        btnPurchaseManagement.setContentAreaFilled(false);
        btnPurchaseManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseManagementActionPerformed(evt);
            }
        });
        jPanel2.add(btnPurchaseManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 210, -1));

        btnSaleMangement.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnSaleMangement.setText("Gestión de Ventas");
        btnSaleMangement.setBorder(null);
        btnSaleMangement.setBorderPainted(false);
        btnSaleMangement.setContentAreaFilled(false);
        btnSaleMangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleMangementActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaleMangement, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login login = Login.getInstance();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClientMangement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientMangement1ActionPerformed
        this.setVisible(false);
        ClientController controller = new ClientController(
            ClientDAO.getInstance(),
            ClientView.getInstance()
        );
        controller.updateView();
    }//GEN-LAST:event_btnClientMangement1ActionPerformed

    private void btnSupplierMangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierMangementActionPerformed
        this.setVisible(false);
        SupplierController controller = new SupplierController(
            SupplierDAO.getInstance(),
            SupplierView.getInstance()
        );
        controller.updateView();
    }//GEN-LAST:event_btnSupplierMangementActionPerformed

    private void btnSaleMangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleMangementActionPerformed
        this.setVisible(false);
        SalesController controller = new SalesController(
                SalesDAO.getInstance(),
                SalesView.getInstance()
        );
        controller.updateView();
    }//GEN-LAST:event_btnSaleMangementActionPerformed

    private void btnProductManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductManagementActionPerformed
        this.setVisible(false);
        ProductController controller = new ProductController(
                ProductDAO.getInstance(),
                ProductView.getInstance()
        );
        controller.updateView();
    }//GEN-LAST:event_btnProductManagementActionPerformed

    private void btnPurchaseManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseManagementActionPerformed
        this.setVisible(false);
        PurchaseController controller = new PurchaseController(
                PurchaseDAO.getInstance(),
                PurchaseView.getInstance()
        );
        controller.updateView();
    }//GEN-LAST:event_btnPurchaseManagementActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientMangement1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProductManagement;
    private javax.swing.JButton btnPurchaseManagement;
    private javax.swing.JButton btnSaleMangement;
    private javax.swing.JButton btnSupplierMangement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
