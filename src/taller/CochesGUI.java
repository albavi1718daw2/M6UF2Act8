package taller;

import java.util.List;
import javax.persistence.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bazag
 */
public class CochesGUI extends javax.swing.JFrame {

    /**
     * Creates new form PersonasGUI
     */
    public CochesGUI() {
        initComponents();
        mostrarCoches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtCoches = new javax.swing.JTable();
        jbCocheNuevo = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtCoches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Marca", "Modelo", "Año", "Reparado", "Propietario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCoches);
        if (jtCoches.getColumnModel().getColumnCount() > 0) {
            jtCoches.getColumnModel().getColumn(0).setResizable(false);
            jtCoches.getColumnModel().getColumn(1).setResizable(false);
            jtCoches.getColumnModel().getColumn(2).setResizable(false);
            jtCoches.getColumnModel().getColumn(3).setResizable(false);
            jtCoches.getColumnModel().getColumn(4).setResizable(false);
            jtCoches.getColumnModel().getColumn(5).setResizable(false);
        }

        jbCocheNuevo.setText("Añadir coche nuevo");
        jbCocheNuevo.setActionCommand("Añadir coche nuevo");
        jbCocheNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCocheNuevoActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCocheNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jbCocheNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.setVisible(false);
        new MenuGUI().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbCocheNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCocheNuevoActionPerformed
        this.setVisible(false);
        new InsertCochesGUI().setVisible(true);
    }//GEN-LAST:event_jbCocheNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CochesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CochesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CochesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CochesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CochesGUI().setVisible(true);
            }
        });
    }
    
    public void mostrarCoches() {
        
        // Abrimos la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/Taller.odb");
        EntityManager em = emf.createEntityManager();
        
        // Cogemos todas las personas de la BD
        TypedQuery<Coche> query = em.createQuery("SELECT c FROM Coche c", Coche.class);
        List<Coche> results = query.getResultList();
        DefaultTableModel model = (DefaultTableModel) jtCoches.getModel();
        
        // Borrmos las filas de la tabla
        model.setRowCount(0);

        // Mostramos cada resultado en su respectiva fila
        for (Coche c : results) {
            
            model.addRow(new Object[]{c.getId(), c.getMarca(), c.getModelo(),
                                      c.getAños(), c.isReparado(), c.getPropietario()});
        } 
        
        // Cerramos la conexión con la BD
        em.close();
        emf.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCocheNuevo;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTable jtCoches;
    // End of variables declaration//GEN-END:variables
}
