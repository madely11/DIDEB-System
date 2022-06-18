package ec.edu.espe.didebsystem.view.forms.sales;

import ec.edu.espe.didebsystem.model.Sales;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;
import javax.swing.JOptionPane;
import ec.edu.espe.didebsystem.model.Product;
import ec.edu.espe.didebsystem.model.Client;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.view.forms.clients.AddClients;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joha
 */
public class AddSale extends javax.swing.JFrame {

    private static AddSale form;
    private ArrayList<String> details;
    private ArrayList<Integer> amounts;

    public static AddSale getInstance() {
        if (form == null) {
            form = new AddSale();
        }
        return form;
    }

    private AddSale() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadClientList();
        loadProductList();
        details = new ArrayList<>();
        amounts = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();
        listClients = new javax.swing.JComboBox<>();
        btnAgregar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        listProducts = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsDetail = new javax.swing.JList<>();
        btnReturn = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsAmount = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar nuevo venta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Agregar venta ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnRefresh1.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh1.setText("Refrescar");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 110, -1));

        listClients.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        listClients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NombreApellido1", "NombreApellido2", "INombreApellido3", "NombreApellido4" }));
        listClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClientsActionPerformed(evt);
            }
        });
        jPanel1.add(listClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 30));

        btnAgregar1.setBackground(new java.awt.Color(255, 255, 102));
        btnAgregar1.setText("Agregar nuevo");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de Venta (DD/MM/AAAA)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 310, 30));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Productos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        listProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductsActionPerformed(evt);
            }
        });
        jPanel1.add(listProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, 30));

        add.setBackground(new java.awt.Color(51, 153, 255));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 50, 30));

        btnRefresh.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, -1));

        jScrollPane1.setViewportView(productsDetail);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 150));

        btnReturn.setBackground(new java.awt.Color(0, 153, 204));
        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 120, 30));

        btnInsert.setBackground(new java.awt.Color(0, 153, 204));
        btnInsert.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnInsert.setText("Agregar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 120, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel10.setText("Detalle de la venta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 250, 30));

        jScrollPane2.setViewportView(productsAmount);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 80, 150));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setText("Cantidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel12.setText("Precio");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        txtPrice.setEnabled(false);
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 310, 30));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel13.setText("Abono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentKeyTyped(evt);
            }
        });
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (validateFields()) {
            ProductDAO productDAO = ProductDAO.getInstance();
            ArrayList<Integer> codes = productDAO.getCodesByName(details);
            ClientDAO clientDAO = ClientDAO.getInstance();
            Integer code = clientDAO.getCodeByName(this.listClients.getSelectedItem().toString());
            SalesDAO saleDAO = SalesDAO.getInstance();
            saleDAO.addSale(new Sales(
                    0,
                    code,
                    this.txtDate.getText(),
                    Double.parseDouble(this.txtPrice.getText().replace("$", "")),
                    Double.parseDouble(this.txtPayment.getText())
            ), codes, amounts
            );

            JOptionPane.showMessageDialog(this, "Has ingresado una venta del cliente " + this.listClients.getSelectedItem().toString() + " correctamente!", "Ingreso de venta correcto", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadProductList();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (!txtAmount.getText().equals("")) {
            details.add(listProducts.getSelectedItem().toString());
            amounts.add(Integer.parseInt(txtAmount.getText()));

            DefaultListModel dlm1 = new DefaultListModel();
            DefaultListModel dlm2 = new DefaultListModel();

            for (String detail : details) {
                dlm1.addElement(detail);
            }

            for (Integer amount : amounts) {
                dlm2.addElement(amount);
            }

            productsDetail.setModel(dlm1);
            productsAmount.setModel(dlm2);

            ProductDAO pDAO = ProductDAO.getInstance();
            ArrayList<Integer> codes = pDAO.getCodesByName(details);
            txtPrice.setText("$" + pDAO.calculateTotalPrice(codes, amounts, "SALES"));
            
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad del producto!", "Error en el ingreso de la compra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformed

    private void listProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProductsActionPerformed

    }//GEN-LAST:event_listProductsActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        AddClients form = AddClients.getInstance();
        form.setVisible(true);
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void listClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClientsActionPerformed

    }//GEN-LAST:event_listClientsActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        loadClientList();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean deleteKey = key == 8;

        if (!(numberKeys || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La cantidad de productos debe contener solamente numeros!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean slashkey = key == 47;
        boolean deleteKey = key == 8;

        if (!(numberKeys || slashkey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La fecha de la venta debe contener solamente numeros y '/'!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtDateKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean pointKey = key == 46;
        boolean deleteKey = key == 8;

        if (!(numberKeys || pointKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El abono deben contener solamente números enteros o decimales.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPaymentKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listClients;
    private javax.swing.JComboBox<String> listProducts;
    private javax.swing.JList<String> productsAmount;
    private javax.swing.JList<String> productsDetail;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
  private void loadClientList() {
        ClientDAO DAO = ClientDAO.getInstance();
        ArrayList<Client> clients = DAO.getClients();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < clients.size(); i++) {
            model.addElement(clients.get(i).getName());
        }

        listClients.setModel(model);
    }

    private void loadProductList() {
        ProductDAO DAO = ProductDAO.getInstance();
        ArrayList<Product> suppliers = DAO.getProducts();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < suppliers.size(); i++) {
            model.addElement(suppliers.get(i).getName());
        }

        listProducts.setModel(model);
    }

    private void emptyFields() {
        this.txtDate.setText("");
        this.txtAmount.setText("");
        this.txtPrice.setText("");
        this.txtPayment.setText("");
        this.listClients.setSelectedIndex(0);
        this.listProducts.setSelectedIndex(0);
        details = new ArrayList<>();
        amounts = new ArrayList<>();
        DefaultListModel dlm = new DefaultListModel();
        productsDetail.setModel(dlm);
        productsAmount.setModel(dlm);
    }

    private boolean validateFields() {
        boolean dateFlag = false;
        boolean paymentFlag = false;
        boolean detailsFlag = !details.isEmpty();
        boolean amountsFlag = !amounts.isEmpty();

        int dateLength = this.txtDate.getText().trim().length();
        int paymentLength = this.txtPayment.getText().trim().length();

        double price = Double.parseDouble(this.txtPrice.getText().replace("$", ""));
        double payment = Double.parseDouble(this.txtPayment.getText());
        
        if (dateLength == 8) dateFlag = true;
        if (paymentLength > 1 && paymentLength < 10 && payment <= price) paymentFlag = true;

        if (!dateFlag || !detailsFlag || !amountsFlag || !paymentFlag) {
            String errorMessage = "Ingrese correctamente los campos:\n";
            if (!dateFlag) {
                errorMessage += "* Fecha de la venta (Cadena de caracteres que posea únicamente numeros [0-9] y [/] con el formato DD/MM/AAAA y un tamaño de 10 caracteres).\n";
            }
            if (!detailsFlag) {
                errorMessage += "* Detalles de productos.\n";
            }
            if (!amountsFlag) {
                errorMessage += "* Cantidad de productos.\n";
            }
            if (!paymentFlag) {
                errorMessage += "* Abono (Cadena de caracteres que posea únicamente numeros [0-9] y [.] menor o igual al precio de venta).\n";
            }

            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        return dateFlag && detailsFlag && amountsFlag && paymentFlag;
    }
}
