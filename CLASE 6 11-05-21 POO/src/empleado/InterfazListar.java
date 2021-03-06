/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class InterfazListar extends javax.swing.JFrame implements java.io.Serializable{

    /**
     * Creates new form InterfazListar
     */
    
    DefaultTableModel tabla = new DefaultTableModel();
    public InterfazListar() {
        initComponents();setLocationRelativeTo(null);
        tabla.addColumn("CODIGO");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("GENERO");
        tabla.addColumn("FECHA NAC");
        tabla.addColumn("INGRESO");
        tabla.addColumn("SALARIO");
        jTMostrarEmpleado.setModel(tabla);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.BLACK);
        jLabel1.setForeground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMostrarEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBListar = new javax.swing.JButton();
        jBSalarioModificar6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTMostrarEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMostrarEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 578, 230));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText(" Listar Empleado ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jBListar.setBackground(new java.awt.Color(0, 0, 0));
        jBListar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jBListar.setForeground(new java.awt.Color(255, 255, 255));
        jBListar.setText("Mostrar");
        jBListar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });
        jPanel1.add(jBListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 40));

        jBSalarioModificar6.setBackground(new java.awt.Color(0, 0, 0));
        jBSalarioModificar6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jBSalarioModificar6.setForeground(new java.awt.Color(255, 255, 255));
        jBSalarioModificar6.setText("Volver");
        jBSalarioModificar6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jBSalarioModificar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalarioModificar6ActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalarioModificar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        // TODO add your handling code here:
        String v[] = new String[7];
        tabla.setNumRows(1);
        tabla.removeRow(0);
        //        for(int i = 0; i < ne; i++){
            //        aux.removeTableModelListener(jTableMostarEmpleado);
            //        for(int i = 0; i < nroEmpleados; i++){
        ObjectInputStream arch = null;
        String nomArch = "Empleado.dat";
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado empleado = new Empleado();
                empleado = (Empleado)arch.readObject();
                v[0] = empleado.getCodigo();
                v[1] = empleado.getNombre();
                v[2] = empleado.getApellido();
                v[3] = empleado.getGenero();
                v[4] = empleado.getFechaNac();
                v[5] = empleado.getFechaIngresoEmpresa();
                v[6] = String.valueOf(empleado.getSalario());
                    tabla.addRow(v);
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazListar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
                //        }
    }//GEN-LAST:event_jBListarActionPerformed

    private void jBSalarioModificar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalarioModificar6ActionPerformed
        // TODO add your handling code here:
        InterfazArchivo cur = new InterfazArchivo();
        cur.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBSalarioModificar6ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBSalarioModificar6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMostrarEmpleado;
    // End of variables declaration//GEN-END:variables
}
