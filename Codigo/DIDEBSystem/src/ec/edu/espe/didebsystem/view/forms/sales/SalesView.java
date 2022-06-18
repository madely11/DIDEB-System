package ec.edu.espe.didebsystem.view.forms.sales;

import ec.edu.espe.didebsystem.model.Sales;
import ec.edu.espe.didebsystem.view.forms.Menu;
import ec.edu.espe.didebsystem.modelDAO.ClientDAO;
import ec.edu.espe.didebsystem.modelDAO.SalesDAO;
import ec.edu.espe.didebsystem.modelDAO.ProductDAO;
import ec.edu.espe.didebsystem.view.forms.sales.DeleteSales;
import ec.edu.espe.didebsystem.view.forms.sales.EditSale;
import ec.edu.espe.didebsystem.view.forms.sales.SearchSaleByID;
import ec.edu.espe.didebsystem.view.forms.sales.SearchSaleByRange;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SalesView extends javax.swing.JFrame {

    private static SalesView form;

    public static SalesView getInstance() {
        if (form == null) {
            form = new SalesView();
        }
        return form;
    }

    private SalesView() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Ventas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Cliente", "Fecha de Venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 730, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/Lifesavers - Using Computer.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 400, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/didebsystem/view/assets/images/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1090, 210));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Ventas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        btnRefresh.setBackground(new java.awt.Color(102, 255, 102));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 130, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("DIDEB");
        jMenu1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem1.setText("Volver al menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");
        jMenu2.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem2.setText("Editar venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem3.setText("Agregar venta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem4.setText("Eliminar venta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Búsquedas");
        jMenu3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem5.setText("Búsqueda por cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jMenuItem6.setText("Búsqueda por fecha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AddSale addSales = AddSale.getInstance();
        addSales.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DeleteSales deleteSales = DeleteSales.getInstance();
        deleteSales.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        SearchSaleByID form = SearchSaleByID.getInstance();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        SearchSaleByRange form = SearchSaleByRange.getInstance();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        Menu menu = Menu.getInstance();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EditSale form = EditSale.getInstance();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        SalesDAO DAO = SalesDAO.getInstance();
        ArrayList<Sales> sales = DAO.getSales();
        ClientDAO cDAO = ClientDAO.getInstance();        
        ProductDAO pDAO = ProductDAO.getInstance();
        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(
                new String []{"ID de la venta", "Nombre del Cliente", "Fecha de venta", "Producto/s", "Precio total", "Pendiente"}
        );

        for (int i = 0; i < sales.size(); i++) {
            Integer salesSize = DAO.getSales().size();
            Integer saleCode = DAO.getSales().get(i).getIdSale();
            ArrayList<Integer> productCodes = DAO.getProductCodesBySaleCode(saleCode);
            ArrayList<String> productNames = pDAO.getProductNamesByCodes(productCodes);
            
            dtm.addRow(
                    new Object []{
                        sales.get(i).getIdSale(),
                        cDAO.getNameByCode(sales.get(i).getIdClient()),
                        sales.get(i).getDateSale(),
                        productNames.toString().replace("[", "").replace("]", ""),
                        sales.get(i).getTotalPrice(),
                        sales.get(i).getRestOfPayment()
                    }
            );
        }

        this.table.setModel(dtm);
    }
}
