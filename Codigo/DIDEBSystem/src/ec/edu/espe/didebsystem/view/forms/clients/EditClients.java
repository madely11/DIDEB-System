package ec.edu.espe.didebsystem.view.forms.clients;

import ec.edu.espe.didebsystem.model.Client;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EditClients extends javax.swing.JFrame {
    private static EditClients form;
    
    public static EditClients getInstance(){
        if(form == null) form = new EditClients();
        return form;
    }
    
    private EditClients() {
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
        txtPhones = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtClinicName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar cliente");

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
        jLabel5.setText("Teléfono/s");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Editar cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Dirección");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Nombre de la Clínica");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtPhones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhonesKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 300, 20));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 20));

        txtClinicName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClinicNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtClinicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 20));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(validateFields()){
            ClientDAO DAO = ClientDAO.getInstance();
            DAO.editClient(
                    new Client(
                            this.list.getSelectedItem().toString(),
                            this.txtClinicName.getText(),
                            this.txtAddress.getText(),
                            this.txtPhones.getText()
                    )
            );
            
            JOptionPane.showMessageDialog(this, "Has editado al cliente "+this.list.getSelectedItem().toString()+" correctamente!","Edicion de cliente correcta", JOptionPane.INFORMATION_MESSAGE);
            emptyFields();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        if(!this.list.getSelectedItem().toString().equals("Seleccione")){
            ClientDAO DAO = ClientDAO.getInstance();
            Client client = DAO.searchClientByName(this.list.getSelectedItem().toString());
            
            this.txtAddress.setText(client.getAddress());
            this.txtClinicName.setText(client.getClinicName());
            this.txtPhones.setText(client.getPhones());
        } else {
            emptyFields();
        }
    }//GEN-LAST:event_listActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClinicName;
    private javax.swing.JTextField txtPhones;
    // End of variables declaration//GEN-END:variables
    
    private void loadList() {
        ClientDAO DAO = ClientDAO.getInstance();
        ArrayList<Client> clients = DAO.getClients();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");
        
        for(int i=0; i<clients.size(); i++) {
            model.addElement(clients.get(i).getName());
        }

        list.setModel(model);
    }
    
    private boolean validateFields() {
        boolean clientAddressFlag = false;
        boolean clinicNameFlag = false;
        boolean phonesFlag = false;
                
        int clientAddressLength = this.txtAddress.getText().trim().length();
        int clinicNameLength = this.txtClinicName.getText().trim().length();
        int phonesLength = this.txtPhones.getText().trim().length();
        
        if(clientAddressLength >= 6 && clientAddressLength <= 64) clientAddressFlag = true;   
        if(clinicNameLength == 0) clinicNameFlag = true;
        else if(clinicNameLength >= 6 && clinicNameLength <= 32) clinicNameFlag = true;
        if(phonesLength >= 7 && phonesLength <= 64) phonesFlag = true;
        
        if(!clientAddressFlag || !clinicNameFlag || !phonesFlag){
            String errorMessage = "Ingrese correctamente los campos:\n";
            if(!clientAddressFlag) errorMessage += "* Dirección del cliente (Cadena de caracteres que posea únicamente espacios y letras [a-z, A-Z] con un tamaño mínimo de 6 y máximo de 64 caracteres).\n";
            if(!clinicNameFlag) errorMessage += "* Nombre de la clínica (Cadena de caracteres que posea únicamente espacios y letras [a-z, A-Z] con un tamaño mínimo de 6 y máximo de 32 caracteres o Cadena de caracteres vacía).\n";
            if(!phonesFlag) errorMessage += "* Teléfonos (Cadena de caracteres que representa valores numéricos enteros separados con comas (,)  y espacios con un tamaño mínimo de 7 y máximo de 64 caracteres).\n";
            
            JOptionPane.showMessageDialog(this, errorMessage, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
        return clientAddressFlag && clinicNameFlag && phonesFlag;
    }

    private void emptyFields(){
        this.txtAddress.setText("");
        this.txtClinicName.setText("");
        this.txtPhones.setText("");
        this.list.setSelectedIndex(0);
    }
}
