package ec.edu.espe.didebsystem.view.forms.purchase;

import ec.edu.espe.didebsystem.model.Purchase;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.modelDAO.PurchaseDAO;
import ec.edu.espe.didebsystem.modelDAO.SupplierDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebask8er
 */
public class SearchPurchaseByID extends javax.swing.JFrame {

    private static SearchPurchaseByID form;

    public static SearchPurchaseByID getInstance() {
        if (form == null) {
            form = new SearchPurchaseByID();
        }
        return form;
    }

    private SearchPurchaseByID() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        listSuppliers = new javax.swing.JComboBox<>();
        btnRefresh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Buscar compra por nombre del proveedor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 470, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        btnSearch.setBackground(new java.awt.Color(102, 255, 102));
        btnSearch.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 120, 30));

        jScrollPane1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id del Proveedor", "Fecha de compra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 780, 300));

        btnReturn.setBackground(new java.awt.Color(0, 153, 204));
        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 120, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del proveedor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        listSuppliers.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        listSuppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NombreApellido1", "NombreApellido2", "INombreApellido3", "NombreApellido4" }));
        listSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSuppliersActionPerformed(evt);
            }
        });
        jPanel1.add(listSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 30));

        btnRefresh1.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh1.setText("Refrescar");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void listSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSuppliersActionPerformed

    }//GEN-LAST:event_listSuppliersActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        loadList();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listSuppliers;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadList() {
        PurchaseDAO DAO = PurchaseDAO.getInstance();
        SupplierDAO sDAO = SupplierDAO.getInstance();

        ArrayList<Purchase> suppliers = DAO.getPurchases();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < suppliers.size(); i++) {
            String supplierName = sDAO.getNameByCode(suppliers.get(i).getIdSupplier());
            model.addElement(supplierName);
        }

        listSuppliers.setModel(model);
    }

    private void loadTable() {
        SupplierDAO sDAO = SupplierDAO.getInstance();
        PurchaseDAO DAO = PurchaseDAO.getInstance();
        ProductDAO pDAO = ProductDAO.getInstance();
        ArrayList<Purchase> purchases = DAO.getPurchases();

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String[]{"Nombre del Proveedor", "Fecha de compra", "Producto/s", "Precio total"}
        );

        for (int i = 0; i < purchases.size(); i++) {
            Integer purchasesSize = DAO.getPurchases().size();
            Integer purchaseCode = DAO.getPurchases().get(i).getIdPurchase();
            ArrayList<Integer> productCodes = DAO.getProductCodesByPurchaseCode(purchaseCode);
            ArrayList<String> productNames = pDAO.getProductNamesByCodes(productCodes);

            String supplierName = sDAO.getNameByCode(purchases.get(i).getIdSupplier());
            
            if (this.listSuppliers.getSelectedItem().toString().equals(supplierName)) {
                dtm.addRow(
                        new Object[]{
                            supplierName,
                            purchases.get(i).getDatePurchase(),
                            productNames.toString().replace("[", "").replace("]", ""),
                            purchases.get(i).getTotalPrice()
                        }
                );
            }
        }

        this.table.setModel(dtm);
    }
}
