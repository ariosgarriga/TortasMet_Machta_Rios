
import java.util.ArrayList;


public class Aplicacion extends javax.swing.JFrame {
    
    public Almacen Harina;
    public Almacen Leche;
    public Almacen Azucar;
    public Pastelero P1;
    public Pastelero P2;
    public ArrayList EmpH;
    public ArrayList EmpL;
    public ArrayList EmpA;
    public ArrayList pedidos;
            
            
    public Aplicacion() {
        initComponents();
        Harina= new Almacen(15);
        Leche= new Almacen(10);
        Azucar= new Almacen(25);
        EmpH = new ArrayList<Empleado>();
        EmpA = new ArrayList<Empleado>();
        EmpL = new ArrayList<Empleado>();
        
        for(int i=0; i<2; i++){
            Empleado emp = new Empleado(Harina,Ventana,20, "HARINA");
            EmpH.add(emp);
        }
        for(int i=0; i<3; i++){
            Empleado emp = new Empleado(Azucar,Ventana,20, "AZUCAR");
            EmpA.add(emp);
        }
        Empleado emp = new Empleado(Leche,Ventana,20, "LECHE");
        EmpL.add(emp);
        
        P1 = new Pastelero(Harina, Azucar, Leche, pedidos);
        P2 = new Pastelero(Harina, Azucar, Leche, pedidos);
        
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inicio.setText("ABRIR TortasMet");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Restar.setText("-");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        Sumar.setText("+");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HARINA", "LECHE", "AZUCAR" }));

        Ventana.setColumns(20);
        Ventana.setRows(5);
        jScrollPane2.setViewportView(Ventana);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Sumar)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Restar)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sumar)
                        .addGap(16, 16, 16)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Restar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestarActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Sumar;
    private javax.swing.JTextArea Ventana;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
