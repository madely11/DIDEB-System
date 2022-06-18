package ec.edu.espe.didebsystem.view.forms.clients;

import ec.edu.espe.didebsystem.model.Client;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AddClients extends javax.swing.JFrame {
    private static AddClients form;

    public static AddClients getInstance(){
        if(form == null) form = new AddClients();
        return form;
    }
    
    private AddClients() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtClinicName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhones = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar nuevo cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Agregar cliente ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Dirección");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 20));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Nombre de la Clínica");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtClinicName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClinicNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtClinicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, 20));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono/s");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtPhones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhonesKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 20));

        btnInsert.setBackground(new java.awt.Color(0, 153, 204));
        btnInsert.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnInsert.setText("Agregar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 30));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 20));

        btnReturn.setBackground(new java.awt.Color(0, 153, 204));
        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if(validateFields()){
            ClientDAO DAO = ClientDAO.getInstance();
            DAO.insertClient(
                    new Client(
                            this.txtName.getText(),
                            this.txtClinicName.getText(),
                            this.txtAddress.getText(),
                            this.txtPhones.getText()
                    )
            );
            
            JOptionPane.showMessageDialog(this, "Has ingresado al cliente "+this.txtName.getText()+" correctamente!","Ingreso de cliente correcto", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();

        boolean upperKeys = key >= 65 && key <= 90;
        boolean lowerKeys = key >= 97 && key <= 122;
        boolean spaceKey = key == 32;
        boolean deleteKey = key == 8;

        if (!(upperKeys || lowerKeys || spaceKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El nombre del cliente debe contener solamente letras y espacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        int key = evt.getKeyChar();

        boolean upperKeys = key >= 65 && key <= 90;
        boolean lowerKeys = key >= 97 && key <= 122;
        boolean spaceKey = key == 32;
        boolean deleteKey = key == 8;

        if (!(upperKeys || lowerKeys || spaceKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "La dirección del cliente debe contener solamente letras y espacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtClinicNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClinicNameKeyTyped
        int key = evt.getKeyChar();

        boolean upperKeys = key >= 65 && key <= 90;
        boolean lowerKeys = key >= 97 && key <= 122;
        boolean spaceKey = key == 32;
        boolean deleteKey = key == 8;

        if (!(upperKeys || lowerKeys || spaceKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El nombre de la clínica debe contener solamente letras y espacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtClinicNameKeyTyped

    private void txtPhonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhonesKeyTyped
        int key = evt.getKeyChar();

        boolean numberKeys = key >= 48 && key <= 57;
        boolean comaKey = key == 44;
        boolean spaceKey = key == 32;
        boolean deleteKey = key == 8;

        if (!(numberKeys || comaKey || spaceKey || deleteKey)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Los teléfonos deben contener solamente números, comas y espacios!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPhonesKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClinicName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhones;
    // End of variables declaration//GEN-END:variables
    
    private void emptyFields(){
        this.txtName.setText("");
        this.txtAddress.setText("");
        this.txtClinicName.setText("");
        this.txtPhones.setText("");
    }

    private boolean validateFields() {
        boolean clientNameFlag = false;
        boolean clientAddressFlag = false;
        boolean clinicNameFlag = false;
        boolean phonesFlag = false;
                
        int clientNameLength = this.txtName.getText().trim().length();
        int clientAddressLength = this.txtAddress.getText().trim().length();
        int clinicNameLength = this.txtClinicName.getText().trim().length();
        int phonesLength = this.txtPhones.getText().trim().length();
        
        if(clientNameLength >= 6 && clientNameLength <= 32) clientNameFlag = true;
        if(clientAddressLength >= 6 && clientAddressLength <= 64) clientAddressFlag = true;   
        if(clinicNameLength == 0) clinicNameFlag = true;
        else if(clinicNameLength >= 6 && clinicNameLength <= 32) clinicNameFlag = true;
        if(phonesLength >= 7 && phonesLength <= 64) phonesFlag = true;
        
        if(!clientNameFlag || !clientAddressFlag || !clinicNameFlag || !phonesFlag){
            String errorMessage = "Ingrese correctamente los campos:\n";
            if(!clientNameFlag) errorMessage += "* Nombre del cliente (Cadena de caracteres que posea únicamente espacios y letras [a-z, A-Z] con un tamaño mínimo de 6 y máximo de 32 caracteres).\n";
            if(!clientAddressFlag) errorMessage += "* Dirección del cliente (Cadena de caracteres que posea únicamente espacios y letras [a-z, A-Z] con un tamaño mínimo de 6 y máximo de 64 caracteres).\n";
            if(!clinicNameFlag) errorMessage += "* Nombre de la clínica (Cadena de caracteres que posea únicamente espacios y letras [a-z, A-Z] con un tamaño mínimo de 6 y máximo de 32 caracteres o Cadena de caracteres vacía).\n";
            if(!phonesFlag) errorMessage += "* Teléfonos (Cadena de caracteres que representa valores numéricos enteros separados con comas (,)  y espacios con un tamaño mínimo de 7 y máximo de 64 caracteres).\n";
            
            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
        return clientNameFlag && clientAddressFlag && clinicNameFlag && phonesFlag;
    }
}
