package ec.edu.espe.didebsystem.view.forms.product;

import ec.edu.espe.didebsystem.model.Product;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class AddProduct extends javax.swing.JFrame {

    private static AddProduct form;

    public static AddProduct getInstance() {
        if (form == null) {
            form = new AddProduct();
        }
        return form;
    }

    private AddProduct() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNameProduct = new javax.swing.JTextField();
        txtPriceC = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPriceV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formuladir para añadir producto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProductActionPerformed(evt);
            }
        });
        txtNameProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameProductKeyTyped(evt);
            }
        });
        jPanel1.add(txtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 364, -1));

        txtPriceC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceCKeyTyped(evt);
            }
        });
        jPanel1.add(txtPriceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 364, -1));
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 364, 92));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del Producto ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 169, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Precio de compra");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 137, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio de venta ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        btnReturn.setBackground(new java.awt.Color(51, 153, 255));
        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 111, 30));

        btnInsert.setBackground(new java.awt.Color(51, 204, 0));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("Agregar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 115, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Añadir Productos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 210, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Descripción");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 108, -1));

        txtPriceV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceVActionPerformed(evt);
            }
        });
        txtPriceV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceVKeyTyped(evt);
            }
        });
        jPanel1.add(txtPriceV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 364, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 108, -1));

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 364, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtNameProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProductActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (validateFields()) {
            ProductDAO DAO = ProductDAO.getInstance();
            DAO.insertProduct(
                    new Product(
                            0,
                            this.txtNameProduct.getText(),
                            this.txtPriceC.getText(),
                            this.txtPriceV.getText(),
                            this.txtDescription.getText()
                    )
            );

            DAO.insertProductAmount(this.txtAmount.getText());

            emptyFields();
            JOptionPane.showMessageDialog(this, "Has ingresado el producto " + this.txtNameProduct.getText() + " correctamente!", "Ingreso de producto correcto", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtNameProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameProductKeyTyped

        int key = evt.getKeyChar();
        boolean upperKeys = key >= 65 && key <= 90;
        boolean lowerKeys = key >= 97 && key <= 122;
        boolean numberKeys = key >= 48 && key <= 57;
        boolean spaceKey = key == 32;
        boolean hyphenKey = key == 45;
        boolean pointkey = key == 46;
        boolean slashkey = key == 47;
        boolean backHyphenkey = key == 95;
        boolean deleteKey = key == 8;
        if (!(upperKeys || lowerKeys || numberKeys || spaceKey || hyphenKey || pointkey || slashkey || backHyphenkey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El nombre del producto debe contener solamente letras, espacios, y (/,.,_,-)", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtNameProductKeyTyped

    private void txtPriceCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceCKeyTyped

        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean pointKey = key == 46;
        boolean deleteKey = key == 8;

        if (!(numberKeys || pointKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El precio de compra deben contener solamente números entero o decimales.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPriceCKeyTyped

    private void txtPriceVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceVActionPerformed

    private void txtPriceVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceVKeyTyped

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean deleteKey = key == 8;

        if (!(numberKeys || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La cantidad del producto debe contener solamente números enteros.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtPriceC;
    private javax.swing.JTextField txtPriceV;
    // End of variables declaration//GEN-END:variables

    private boolean validateFields() {
        boolean productNameFlag = false;
        boolean productPurchasePriceFlag = false;
        boolean productSellPriceFlag = false;
        boolean descriptionFlag = false;

        int productNameLength = this.txtNameProduct.getText().trim().length();
        int productPurchasePriceLength = this.txtPriceC.getText().trim().length();
        int productSellPriceLength = this.txtAmount.getText().trim().length();
        int descriptionLength = this.txtDescription.getText().trim().length();

        if (productNameLength >= 6 && productNameLength <= 32) {
            productNameFlag = true;
        }
        if (productPurchasePriceLength >= 1 && productPurchasePriceLength <= 10) {
            productPurchasePriceFlag = true;
        }
        if (productSellPriceLength >= 1 && productSellPriceLength <= 10) {
            productSellPriceFlag = true;
        }
        if (descriptionLength >= 8 && descriptionLength <= 128) {
            descriptionFlag = true;
        }

        if (!productNameFlag || !productPurchasePriceFlag || !productSellPriceFlag || !descriptionFlag) {
            String errorMessage = "Ingrese correctamente los campos:\n";
            if (!productNameFlag) {
                errorMessage += "* Nombre del producto (Cadena de caracteres que posea únicamente espacios, numeros [0-9], letras [a-z, A-Z] y caracteres especiales [.,_,/,-] con un tamaño mínimo de 6 y máximo de 32 caracteres ).\n";
            }
            if (!productPurchasePriceFlag) {
                errorMessage += "* El precio de compra del Producto (Cadena de numeros [0-9] y punto con un tamaño mínimo de 1 y máximo de 10 caracteres).\n";
            }
            if (!productSellPriceFlag) {
                errorMessage += "* El precio de venta del Producto (Cadena de numeros [0-9] y punto con un tamaño mínimo de 1 y máximo de 10 caracteres).\n";
            }
            if (!descriptionFlag) {
                errorMessage += "* La descripcion del producto (Cadena de caracteres que posea únicamente espacios, numeros [0-9] y letras [a-z, A-Z] con un tamaño mínimo de 8 y máximo de 64 caracteres ).\n";
            }

            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        return productNameFlag && productPurchasePriceFlag && productSellPriceFlag && descriptionFlag;
    }

    private void emptyFields() {
        this.txtNameProduct.setText("");
        this.txtDescription.setText("");
        this.txtAmount.setText("");
        this.txtPriceC.setText("");
        this.txtPriceV.setText("");
    }
}
