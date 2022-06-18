package ec.edu.espe.didebsystem.view.forms.sales;

import ec.edu.espe.didebsystem.model.Sales;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sebask8er
 */
public class EditSale extends javax.swing.JFrame {

    private static EditSale form;

    public static EditSale getInstance() {
        if (form == null) {
            form = new EditSale();
        }
        return form;
    }

    private EditSale() {
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
        jLabel6 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPastPayment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Editar venta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Monto a pagar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        list.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID1", "ID2", "ID3", "ID4" }));
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel1.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 340, 30));

        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, -1));

        btnEdit.setBackground(new java.awt.Color(51, 153, 255));
        btnEdit.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEdit.setLabel("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, -1));

        btnRefresh.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 70, 110, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("ID de la Venta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentKeyTyped(evt);
            }
        });
        jPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 340, 30));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Monto pendiente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtPastPayment.setEnabled(false);
        txtPastPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPastPaymentKeyTyped(evt);
            }
        });
        jPanel1.add(txtPastPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        SalesDAO DAO = SalesDAO.getInstance();
        Sales sale = DAO.searchSalesBySaleID(list.getSelectedItem().toString());

        txtPastPayment.setText("$" + sale.getRestOfPayment());
    }//GEN-LAST:event_listActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateFields()) {
            SalesDAO DAO = SalesDAO.getInstance();
            Sales sale = DAO.searchSalesBySaleID(list.getSelectedItem().toString());

            sale.setPayment(sale.getPayment() + Double.parseDouble(txtPayment.getText()));

            DAO.editSale(sale);
            JOptionPane.showMessageDialog(this, "Has editado a la venta " + list.getSelectedItem().toString() + " correctamente!", "Edición de la venta correcta", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnRefreshActionPerformed

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

    private void txtPastPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPastPaymentKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPastPaymentKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JTextField txtPastPayment;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables

    private void loadList() {
        SalesDAO DAO = SalesDAO.getInstance();
        ArrayList<Sales> sales = DAO.getSales();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");

        for (int i = 0; i < sales.size(); i++) {
            model.addElement(String.valueOf(sales.get(i).getIdSale()));
        }

        list.setModel(model);
    }

    private boolean validateFields() {
        boolean paymentFlag = false;
        boolean IDFlag = list.getSelectedIndex() != 0;

        int paymentLength = this.txtPayment.getText().trim().length();

        double pastPayment = Double.parseDouble(this.txtPastPayment.getText().replace("$", ""));
        double payment = Double.parseDouble(this.txtPayment.getText());

        if (paymentLength > 1 && paymentLength < 10 && payment <= pastPayment) {
            paymentFlag = true;
        }

        if (!paymentFlag || !IDFlag) {
            String errorMessage = "Ingrese correctamente los campos:\n";
            if (!IDFlag) {
                errorMessage += "* ID de la venta.\n";
            }
            if (!paymentFlag) {
                errorMessage += "* Monto a pagar (Cadena de caracteres que posea únicamente numeros [0-9] y [.] menor o igual al precio de venta).\n";
            }

            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

        return IDFlag && paymentFlag;
    }

    private void emptyFields() {
        loadList();
        txtPayment.setText("");
        txtPastPayment.setText("");
    }
}
