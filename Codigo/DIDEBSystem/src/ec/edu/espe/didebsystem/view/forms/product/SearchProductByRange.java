package ec.edu.espe.didebsystem.view.forms.product;

import ec.edu.espe.didebsystem.model.Client;
import ec.edu.espe.didebsystem.model.Product;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.view.forms.clients.SearchClientByClinicName;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class SearchProductByRange extends javax.swing.JFrame {

    private static SearchProductByRange form;
    
    public static SearchProductByRange getInstance(){
        if(form == null) form = new SearchProductByRange();
        return form;
    }
    private SearchProductByRange() {
        initComponents();
        this.setLocationRelativeTo(null);
        //loadTable();
        emptyFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        txtPriceMin = new javax.swing.JTextField();
        txtPriceMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Buscar Producto por Rango");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 490, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Rango de Precios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "Nombre Clinica", "Telefono/s"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 620, 180));

        btnRefresh.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 100, 110, 30));
        jPanel1.add(txtPriceMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, -1));
        jPanel1.add(txtPriceMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 120, -1));

        jLabel1.setText("Valor Minimo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setText("Valor Máximo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtPriceMax;
    private javax.swing.JTextField txtPriceMin;
    // End of variables declaration//GEN-END:variables

    private void emptyFields() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String []{"Nombre", "Precio de Venta", "Precio de Compra", "Descripción"}
        );
        this.table.setModel(dtm);
        this.txtPriceMax.setText("");
        this.txtPriceMin.setText("");
    }

    private void loadTable() {
       if(
               !this.txtPriceMin.getText().isEmpty() && isNumeric(this.txtPriceMin.getText()) &&
               !this.txtPriceMax.getText().isEmpty() && isNumeric(this.txtPriceMax.getText())
               ){
           
            ProductDAO DAO = ProductDAO.getInstance();
            ArrayList<Product> products = DAO.searchProductByRange(Double.parseDouble(txtPriceMin.getText()), Double.parseDouble(txtPriceMax.getText()));

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(
                    new String []{"Nombre", "Precio de Venta", "Precio de Compra", "Descripción"}
            );

            for (int i = 0; i < products.size(); i++) {
                dtm.addRow(
                        new Object []{
                            products.get(i).getName(),
                            products.get(i).getPricePurchase(),
                            products.get(i).getPriceSell(),
                            products.get(i).getDescription()
                        }
                );
            }

            this.table.setModel(dtm);
       } else {
           JOptionPane.showMessageDialog(this, "Ingrese los campos correctamente!","Error en el ingreso del producto!", JOptionPane.ERROR_MESSAGE);
       }
        
    }
    
    private boolean isNumeric(String string){
        return string.matches("[+-]?\\d*(\\.\\d+)?");
    }
    
}
