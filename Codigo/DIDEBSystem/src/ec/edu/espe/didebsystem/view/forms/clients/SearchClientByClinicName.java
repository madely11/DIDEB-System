package ec.edu.espe.didebsystem.view.forms.clients;

import ec.edu.espe.didebsystem.model.Client;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebask8er
 */
public class SearchClientByClinicName extends javax.swing.JFrame {
    private static SearchClientByClinicName form;
    
    public static SearchClientByClinicName getInstance(){
        if(form == null) form = new SearchClientByClinicName();
        return form;
    }

    private SearchClientByClinicName() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        list = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar cliente por nombre de la clinica");

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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Buscar cliente por nombre de la clinica");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 490, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/backgroundModel.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Nombre de la clínica");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnReturn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 120, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        if(!this.list.getSelectedItem().toString().equals("Seleccione")){
            ClientDAO DAO = ClientDAO.getInstance();
            ArrayList<Client> clients = DAO.searchClientByClinicName(this.list.getSelectedItem().toString());

            loadTable(clients);
        } else {
            emptyFields();
        }
    }//GEN-LAST:event_listActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    
    private void loadList() {
        ClientDAO DAO = ClientDAO.getInstance();
        ArrayList<Client> clients = DAO.getClients();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        model.addElement("Seleccione");
        
        boolean bool = false;
        
        for(int i=0; i<clients.size(); i++) {
            bool = false;
            String newName = clients.get(i).getClinicName();
            for(int j=0; j<model.getSize(); j++){
                if(model.getElementAt(j).equals(newName)) bool = true;
            }
            if(!bool) model.addElement(newName);
        }

        list.setModel(model);
    }

    private void emptyFields() {
        this.list.setSelectedIndex(0);
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String []{"Nombre", "Dirección", "Nombre Clínica", "Teléfono/s"}
        );
        this.table.setModel(dtm);
    }

    private void loadTable(ArrayList<Client> clients) {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String []{"Nombre", "Dirección", "Nombre Clínica", "Teléfono/s"}
        );
        
        for (int i = 0; i < clients.size(); i++) {
            dtm.addRow(
                    new Object []{
                        clients.get(i).getName(),
                        clients.get(i).getAddress(),
                        clients.get(i).getClinicName(),
                        clients.get(i).getPhones()
                    }
            );
        }
        
        this.table.setModel(dtm);
    }
}
