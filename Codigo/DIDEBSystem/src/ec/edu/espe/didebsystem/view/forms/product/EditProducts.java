package ec.edu.espe.didebsystem.view.forms.product;

import ec.edu.espe.didebsystem.model.Product;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class EditProducts extends javax.swing.JFrame {

    private static EditProducts form;

    public static EditProducts getInstance() {
        if (form == null) {
            form = new EditProducts();
        }
        return form;
    }

    public EditProducts() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        list = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtPriceC = new javax.swing.JTextField();
        txtPriceV = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NombreApellido1", "NombreApellido2", "INombreApellido3", "NombreApellido4" }));
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel1.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 30));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("Descripción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Editar Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Precio de Compra");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Precio de venta ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 300, 50));
        jPanel1.add(txtPriceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 20));
        jPanel1.add(txtPriceV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 20));

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 330, 110, -1));

        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, -1));

        btnRefresh.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 70, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        if (!this.list.getSelectedItem().toString().equals("Seleccione")) {
            ProductDAO DAO = ProductDAO.getInstance();
            Product product = DAO.searchProductByName(this.list.getSelectedItem().toString());

            this.txtPriceC.setText(product.getPricePurchase());
            this.txtPriceV.setText(product.getPriceSell());
            this.txtDescription.setText(product.getDescription());
        } else {
            emptyFields();
        }
    }//GEN-LAST:event_listActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateFields()) {
            ProductDAO DAO = ProductDAO.getInstance();
            DAO.editProduct(
                    new Product(
                            0,
                            this.list.getSelectedItem().toString(),
                            this.txtPriceV.getText(),
                            this.txtPriceC.getText(),
                            this.txtDescription.getText()
                    )
            );

            emptyFields();
            JOptionPane.showMessageDialog(this, "Has editado al producto " + this.list.getSelectedItem().toString() + " correctamente!", "Edicion del producto correcta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los campos correctamente!", "Error en la edicion del producto!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPriceC;
    private javax.swing.JTextField txtPriceV;
    // End of variables declaration//GEN-END:variables

    private void loadList() {
        ProductDAO DAO = ProductDAO.getInstance();
        ArrayList<Product> products = DAO.getProducts();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < products.size(); i++) {
            model.addElement(products.get(i).getName());
        }

        list.setModel(model);
    }

    private boolean validateFields() {
        boolean flag = false;
        boolean clinicNameFlag = false;

        if (!this.txtDescription.getText().isEmpty() && !isNumeric(this.txtDescription.getText())
                && !this.txtPriceC.getText().isEmpty() && isNumeric(this.txtPriceC.getText())
                && !this.txtPriceV.getText().isEmpty() && isNumeric(this.txtPriceV.getText())) {
            flag = true;
        }

        return flag;
    }

    private boolean isNumeric(String string) {
        return string.matches("[+-]?\\d*(\\.\\d+)?");
    }

    private void emptyFields() {
        this.txtPriceC.setText("");
        this.txtPriceV.setText("");
        this.txtDescription.setText("");
        this.list.setSelectedIndex(0);
    }
}
