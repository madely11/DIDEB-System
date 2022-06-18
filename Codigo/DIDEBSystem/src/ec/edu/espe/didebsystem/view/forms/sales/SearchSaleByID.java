package ec.edu.espe.didebsystem.view.forms.sales;

import ec.edu.espe.didebsystem.model.Purchase;
import ec.edu.espe.didebsystem.model.Sales;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.modelDAO.PurchaseDAO;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;
import ec.edu.espe.didebsystem.modelDAO.SupplierDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebask8er
 */
public class SearchSaleByID extends javax.swing.JFrame {

    private static SearchSaleByID form;

    public static SearchSaleByID getInstance() {
        if (form == null) {
            form = new SearchSaleByID();
        }
        return form;
    }

    private SearchSaleByID() {
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
        listClients = new javax.swing.JComboBox<>();
        btnRefresh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Buscar venta por nombre del cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 470, 40));

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
        jLabel6.setText("Nombre del cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        listClients.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        listClients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NombreApellido1", "NombreApellido2", "INombreApellido3", "NombreApellido4" }));
        listClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClientsActionPerformed(evt);
            }
        });
        jPanel1.add(listClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 30));

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

    private void listClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClientsActionPerformed

    }//GEN-LAST:event_listClientsActionPerformed

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
    private javax.swing.JComboBox<String> listClients;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadList() {
        SalesDAO DAO = SalesDAO.getInstance();
        ClientDAO cDAO = ClientDAO.getInstance();

        ArrayList<Sales> sales = DAO.getSales();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < sales.size(); i++) {
            String clientName = cDAO.getNameByCode(sales.get(i).getIdClient());
            model.addElement(clientName);
        }

        listClients.setModel(model);
    }

    private void loadTable() {
        SalesDAO DAO = SalesDAO.getInstance();
        ArrayList<Sales> sales = DAO.getSales();
        ClientDAO cDAO = ClientDAO.getInstance();
        ProductDAO pDAO = ProductDAO.getInstance();

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String[]{"Nombre del Cliente", "Fecha de venta", "Producto/s", "Precio total", "Pendiente"}
        );

        for (int i = 0; i < sales.size(); i++) {
            Integer salesSize = DAO.getSales().size();
            Integer saleCode = DAO.getSales().get(i).getIdSale();
            ArrayList<Integer> productCodes = DAO.getProductCodesBySaleCode(saleCode);
            ArrayList<String> productNames = pDAO.getProductNamesByCodes(productCodes);

            String clientName = listClients.getSelectedItem().toString();
            String currentClientName = cDAO.getNameByCode(sales.get(i).getIdClient());

            if (clientName.equals(currentClientName)) {
                dtm.addRow(
                        new Object[]{
                            cDAO.getNameByCode(sales.get(i).getIdClient()),
                            sales.get(i).getDateSale(),
                            productNames.toString().replace("[", "").replace("]", ""),
                            sales.get(i).getTotalPrice(),
                            sales.get(i).getRestOfPayment()
                        }
                );
            }
        }

        this.table.setModel(dtm);
    }
}
