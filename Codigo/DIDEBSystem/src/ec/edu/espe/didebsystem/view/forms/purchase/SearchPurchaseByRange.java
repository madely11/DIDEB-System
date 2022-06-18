package ec.edu.espe.didebsystem.view.forms.purchase;

import ec.edu.espe.didebsystem.model.Purchase;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.modelDAO.PurchaseDAO;
import ec.edu.espe.didebsystem.modelDAO.SupplierDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebask8er
 */
public class SearchPurchaseByRange extends javax.swing.JFrame {

    private static SearchPurchaseByRange form;

    public static SearchPurchaseByRange getInstance() {
        if (form == null) {
            form = new SearchPurchaseByRange();
        }
        return form;
    }

    private SearchPurchaseByRange() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtInitDate = new javax.swing.JTextField();
        txtFinishDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Buscar compra por rango de fechas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 360, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Fecha inicial (DD/MM/AAAA)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtInitDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInitDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtInitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 20));

        txtFinishDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinishDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtFinishDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 300, 20));

        btnSearch.setBackground(new java.awt.Color(102, 255, 102));
        btnSearch.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 120, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel10.setText("Fecha final (DD/MM/AAAA)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

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
        if (validateFields()) {
            loadTable();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtInitDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInitDateKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean slashkey = key == 47;
        boolean deleteKey = key == 8;

        if (!(numberKeys || slashkey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La fecha inicial debe contener solamente numeros y '/'!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtInitDateKeyTyped

    private void txtFinishDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinishDateKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean slashkey = key == 47;
        boolean deleteKey = key == 8;

        if (!(numberKeys || slashkey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La fecha inicial debe contener solamente numeros y '/'!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtFinishDateKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFinishDate;
    private javax.swing.JTextField txtInitDate;
    // End of variables declaration//GEN-END:variables

    private boolean validateFields() {
        boolean initDateFlag = false;
        boolean finishDateFlag = false;

        int initDateLength = this.txtInitDate.getText().trim().length();
        int finishDateLength = this.txtFinishDate.getText().trim().length();

        if (initDateLength == 10) {
            initDateFlag = true;
        }
        if (finishDateLength == 10) {
            finishDateFlag = true;
        }

        if (!initDateFlag || !finishDateFlag) {
            String errorMessage = "Ingrese correctamente los campos:\n";
            if (!initDateFlag) {
                errorMessage += "* Fecha inicial (Cadena de caracteres que posea únicamente numeros [0-9] y [/] con el formato DD/MM/AAAA y un tamaño de 10 caracteres).\n";
            }
            if (!finishDateFlag) {
                errorMessage += "* Fecha final (Cadena de caracteres que posea únicamente numeros [0-9] y [/] con el formato DD/MM/AAAA y un tamaño de 10 caracteres).\n";
            }

            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        return initDateFlag && finishDateFlag;
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

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yy");

            try {
                Date initDate = dateFormat.parse(txtInitDate.getText());
                Date finishDate = dateFormat.parse(txtFinishDate.getText());
                Date currentDate = dateFormat2.parse(purchases.get(i).getDatePurchase());

                if ((currentDate.after(initDate) || currentDate.equals(initDate)) && (currentDate.before(finishDate) || currentDate.equals(initDate))) {
                    dtm.addRow(
                            new Object[]{
                                sDAO.getNameByCode(purchases.get(i).getIdSupplier()),
                                purchases.get(i).getDatePurchase(),
                                productNames.toString().replace("[", "").replace("]", ""),
                                purchases.get(i).getTotalPrice()
                            }
                    );
                }

            } catch (ParseException ex) {
                Logger.getLogger(SearchPurchaseByRange.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.table.setModel(dtm);
    }
}
