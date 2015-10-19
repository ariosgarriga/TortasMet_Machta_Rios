
import java.awt.Color;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Aplicacion extends javax.swing.JFrame {
    
    private  Almacen Harina;
    private Almacen Leche;
    private Almacen Azucar;
    private Pastelero P1;
    private Pastelero P2;
    private ArrayList<Empleado> EmpH;
    private ArrayList<Empleado> EmpL;
    private ArrayList<Empleado> EmpA;
    private ArrayList<Integer> pedidos; 
    private FileReader fr;
    private BufferedReader br;
    private File archivo= new File("archivo.txt");
    int aux=0;
            
    public Aplicacion() throws IOException {
        initComponents();
        this.setSize(700, 480);
        
        Harina= new Almacen(15);
        Leche= new Almacen(10);
        Azucar= new Almacen(25);
        EmpH = new ArrayList<Empleado>();
        EmpA = new ArrayList<Empleado>();
        EmpL = new ArrayList<Empleado>();
        pedidos = new ArrayList<Integer>();
        archivoTexto();
        
        System.out.println(pedidos);
        
        
        
        for(int i=0; i<2; i++){
            Empleado emp = new Empleado(Harina,Ventana,20, "HARINA");
            EmpH.add(emp);
        }
        for(int i=0; i<3; i++){
            Empleado emp = new Empleado(Azucar,Ventana,30, "AZUCAR");
            EmpA.add(emp);
        }
        Empleado emp = new Empleado(Leche,Ventana,45, "LECHE");
        EmpL.add(emp);
        
        P1 = new Pastelero(Harina, Azucar, Leche, pedidos, Ventana);
        P2 = new Pastelero(Harina, Azucar, Leche, pedidos, Ventana);
        
        
    }
    
    public void archivoTexto() throws IOException{
         try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        br= new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            int cant=0;
            
            char[] aux=linea.toCharArray();
            int pos=aux.length;
            for(int i=1; i<aux.length;i++){
                if(aux[i]!=' '){
                    cant+=Character.getNumericValue(aux[i])*Math.pow(10, aux.length-1-i);
                }
            }
            for(int i=0; i<cant; i++)
                pedidos.add(Character.getNumericValue(aux[0]));
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ventana = new javax.swing.JTextArea();
        Verde = new javax.swing.JPanel();
        Parar = new javax.swing.JButton();
        Reanudar = new javax.swing.JButton();
        PararCocina = new javax.swing.JButton();
        ReanudarCocina = new javax.swing.JButton();
        AgregarCocinero = new javax.swing.JButton();
        TipoEmpleado = new javax.swing.JComboBox();
        Mas = new javax.swing.JButton();
        AgregarEmpleado = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        NumEmpleado = new javax.swing.JTextField();
        Quitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Inicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Inicio.setText("ABRIR TORTASMET\n");
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Inicio);
        Inicio.setBounds(90, 10, 530, 43);

        //Ventana.setBackground(Color.red);
        Ventana.setBackground(new java.awt.Color(229, 120, 120));
        Ventana.setColumns(20);
        Ventana.setRows(5);
        jScrollPane2.setViewportView(Ventana);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 70, 291, 207);

        Verde.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout VerdeLayout = new javax.swing.GroupLayout(Verde);
        Verde.setLayout(VerdeLayout);
        VerdeLayout.setHorizontalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        VerdeLayout.setVerticalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        getContentPane().add(Verde);
        Verde.setBounds(20, 10, 26, 43);

        Parar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Parar.setText("Parar Empleado");
        Parar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PararMouseClicked(evt);
            }
        });
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });
        getContentPane().add(Parar);
        Parar.setBounds(470, 120, 190, 23);

        Reanudar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Reanudar.setText("Reanudar Empleado");
        Reanudar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReanudarMouseClicked(evt);
            }
        });
        Reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReanudarActionPerformed(evt);
            }
        });
        getContentPane().add(Reanudar);
        Reanudar.setBounds(470, 140, 190, 23);

        PararCocina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PararCocina.setText("Parar Cocina");
        PararCocina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PararCocinaMouseClicked(evt);
            }
        });
        PararCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararCocinaActionPerformed(evt);
            }
        });
        getContentPane().add(PararCocina);
        PararCocina.setBounds(470, 190, 190, 23);

        ReanudarCocina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ReanudarCocina.setText("Reanudar Cocina");
        ReanudarCocina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReanudarCocinaMouseClicked(evt);
            }
        });
        ReanudarCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReanudarCocinaActionPerformed(evt);
            }
        });
        getContentPane().add(ReanudarCocina);
        ReanudarCocina.setBounds(470, 210, 190, 23);

        AgregarCocinero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AgregarCocinero.setText("Agregar Cocinero");
        AgregarCocinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarCocineroMouseClicked(evt);
            }
        });
        getContentPane().add(AgregarCocinero);
        AgregarCocinero.setBounds(470, 230, 190, 23);

        TipoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Harina", "Azucar", "Leche", " " }));
        TipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(TipoEmpleado);
        TipoEmpleado.setBounds(460, 360, 130, 20);

        Mas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Mas.setText("+");
        Mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasMouseClicked(evt);
            }
        });
        Mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasActionPerformed(evt);
            }
        });
        getContentPane().add(Mas);
        Mas.setBounds(610, 330, 40, 20);

        AgregarEmpleado.setBackground(new java.awt.Color(255, 255, 51));
        AgregarEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AgregarEmpleado.setForeground(new java.awt.Color(204, 0, 0));
        AgregarEmpleado.setText("Agregar Empleado");
        getContentPane().add(AgregarEmpleado);
        AgregarEmpleado.setBounds(460, 340, 130, 20);

        OkButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        OkButton.setText("Agregar");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton);
        OkButton.setBounds(510, 390, 80, 23);

        Menos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Menos.setText("-");
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });
        getContentPane().add(Menos);
        Menos.setBounds(610, 390, 40, 23);

        NumEmpleado.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        NumEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(NumEmpleado);
        NumEmpleado.setBounds(610, 360, 40, 20);

        Quitar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Quitar.setText("Quitar");
        Quitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitarMouseClicked(evt);
            }
        });
        Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarActionPerformed(evt);
            }
        });
        getContentPane().add(Quitar);
        Quitar.setBounds(430, 390, 67, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pasteleria2.JPG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 680, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        Verde.setBackground(Color.GREEN);
        P1.start();
        
        for(int i=0; i<2; i++){
           EmpH.get(i).start();
        }
        for(int i=0; i<3; i++){
           
            EmpA.get(i).start();
        }
        
        EmpL.get(0).start();
    }//GEN-LAST:event_InicioMouseClicked

    private void PararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PararMouseClicked
        
    }//GEN-LAST:event_PararMouseClicked

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
          for(int i=0;i<EmpH.size();i++){
          EmpH.get(i).setRun(false);
          }
          for(int i=0;i<EmpL.size();i++){
          EmpL.get(i).setRun(false);
          }
          for(int i=0;i<EmpA.size();i++){
          EmpA.get(i).setRun(false);
          }
    }//GEN-LAST:event_PararActionPerformed

    private void ReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReanudarActionPerformed
        
    }//GEN-LAST:event_ReanudarActionPerformed

    private void ReanudarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReanudarMouseClicked
        System.out.println("---------");
        
        for(int i=0;i<EmpH.size();i++){
        EmpH.get(i).setRun(true);
        System.out.println("Harina--");
        }
        for(int i=0;i<EmpL.size();i++){
        EmpL.get(i).setRun(true);
        System.out.println("Leche--");
        }
        for(int i=0;i<EmpA.size();i++){
        EmpA.get(i).setRun(true);
        System.out.println("Azucar--");
        }
       
    }//GEN-LAST:event_ReanudarMouseClicked

    private void PararCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararCocinaActionPerformed
        P1.setRun(false);
        P2.setRun(false);
    }//GEN-LAST:event_PararCocinaActionPerformed

    private void PararCocinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PararCocinaMouseClicked
    
    }//GEN-LAST:event_PararCocinaMouseClicked

    private void AgregarCocineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarCocineroMouseClicked
     P2.start();
    }//GEN-LAST:event_AgregarCocineroMouseClicked

    private void ReanudarCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReanudarCocinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReanudarCocinaActionPerformed

    private void ReanudarCocinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReanudarCocinaMouseClicked
     P1.setRun(true);
     P2.setRun(true);
    
    }//GEN-LAST:event_ReanudarCocinaMouseClicked

    private void TipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoEmpleadoActionPerformed

    private void MasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasMouseClicked
    aux++;
    NumEmpleado.setText(Integer.toString(aux));
    }//GEN-LAST:event_MasMouseClicked

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
     aux--;
     NumEmpleado.setText(Integer.toString(aux));
    }//GEN-LAST:event_MenosActionPerformed

    private void MasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
 
        int j=Integer.parseInt(NumEmpleado.getText());

        if(TipoEmpleado.getSelectedItem().toString().equals("Harina")){
            
            for(int i=0; i<j; i++){
                
                Empleado emp = new Empleado(Harina,Ventana,20, "HARINA");
                emp.start();
                EmpH.add(emp);
            }
            
        }
        else if(TipoEmpleado.getSelectedItem().toString().equals("Azucar")){
            for(int i=0; i<j; i++){
                Empleado emp = new Empleado(Azucar,Ventana,30, "AZUCAR");
                emp.start();
                EmpA.add(emp);
            }
        }
        else{
            for(int i=0; i<j; i++){
                Empleado emp = new Empleado(Leche,Ventana,45, "LECHE");
                emp.start();
                EmpL.add(emp);
            } 
        }
     
    }//GEN-LAST:event_OkButtonActionPerformed

    private void QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitarActionPerformed

    private void QuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitarMouseClicked
        int j=Integer.parseInt(NumEmpleado.getText());
        
        if(TipoEmpleado.getSelectedItem().toString().equals("Harina")){
            if(j<=EmpH.size())
                for(int i=0; i<j; i++){
                    Empleado aux = EmpH.remove(0);
                    aux.setRun(false);
                }
            else
                System.out.println("NO SE PUEDE ELIMINAR HARINA");
        }
        else if(TipoEmpleado.getSelectedItem().toString().equals("Azucar")){
            if(j<=EmpA.size())
                for(int i=0; i<j; i++){
                    Empleado aux = EmpA.remove(0);
                    aux.setRun(false);
                }
            else
                System.out.println("NO SE PUEDE ELIMINAR AZUCAR");
        }
        else{
            if(j<=EmpL.size())
                for(int i=0; i<j; i++){
                    Empleado aux = EmpL.remove(0);
                    aux.setRun(false);
                }
            else
                System.out.println("NO SE PUEDE ELIMINAR LECHE");
            
        }
    }//GEN-LAST:event_QuitarMouseClicked

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
                try {
                    new Aplicacion().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCocinero;
    private javax.swing.JLabel AgregarEmpleado;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Mas;
    private javax.swing.JButton Menos;
    private javax.swing.JTextField NumEmpleado;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton Parar;
    private javax.swing.JButton PararCocina;
    private javax.swing.JButton Quitar;
    private javax.swing.JButton Reanudar;
    private javax.swing.JButton ReanudarCocina;
    private javax.swing.JComboBox TipoEmpleado;
    private javax.swing.JTextArea Ventana;
    private javax.swing.JPanel Verde;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
