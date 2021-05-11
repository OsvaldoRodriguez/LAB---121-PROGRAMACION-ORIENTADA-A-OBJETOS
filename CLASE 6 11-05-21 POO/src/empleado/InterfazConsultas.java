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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class InterfazConsultas extends javax.swing.JFrame implements java.io.Serializable{

    /**
     * Creates new form InterfazConsultas
     */
    public InterfazConsultas() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jBCalcularPrestacion = new javax.swing.JButton();
        jBCalcularEdad = new javax.swing.JButton();
        jBCalcularAntiguedad = new javax.swing.JButton();
        jTCodigo = new javax.swing.JTextField();
        jTCalcularEdad = new javax.swing.JTextField();
        jTCalcularAntiguedad = new javax.swing.JTextField();
        jTCalcularPrestacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBSalarioModificar6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCalcularPrestacion.setBackground(new java.awt.Color(0, 0, 0));
        jBCalcularPrestacion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jBCalcularPrestacion.setForeground(new java.awt.Color(255, 255, 255));
        jBCalcularPrestacion.setText("Calcular prestaciones");
        jBCalcularPrestacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jBCalcularPrestacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularPrestacionActionPerformed(evt);
            }
        });
        jPanel2.add(jBCalcularPrestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 40));

        jBCalcularEdad.setBackground(new java.awt.Color(0, 0, 0));
        jBCalcularEdad.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jBCalcularEdad.setForeground(new java.awt.Color(255, 255, 255));
        jBCalcularEdad.setText("Calcular Edad");
        jBCalcularEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jBCalcularEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularEdadActionPerformed(evt);
            }
        });
        jPanel2.add(jBCalcularEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jBCalcularAntiguedad.setBackground(new java.awt.Color(0, 0, 0));
        jBCalcularAntiguedad.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jBCalcularAntiguedad.setForeground(new java.awt.Color(255, 255, 255));
        jBCalcularAntiguedad.setText("Calcular Antiguedad");
        jBCalcularAntiguedad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jBCalcularAntiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularAntiguedadActionPerformed(evt);
            }
        });
        jPanel2.add(jBCalcularAntiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 40));

        jTCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 50, 40));

        jTCalcularEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTCalcularEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTCalcularEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 360, 40));

        jTCalcularAntiguedad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTCalcularAntiguedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTCalcularAntiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 360, 40));

        jTCalcularPrestacion.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTCalcularPrestacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTCalcularPrestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 300, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 600, 160));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText(" Consultas ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

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
        jPanel1.add(jBSalarioModificar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularPrestacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularPrestacionActionPerformed
        // TODO add your handling code here:
        // arreglar
        String nomArch = "Empleado.dat";
        String codigo = jTCodigo.getText();
        ObjectInputStream arch = null;
        int mx = 0;
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado aux = new Empleado();
                aux = (Empleado)arch.readObject();
                if(aux.getCodigo().equals(codigo)){
                    Calendar c = Calendar.getInstance();
                    String annio = Integer.toString(c.get(Calendar.YEAR));
                    String anio = aux.getFechaIngresoEmpresa().substring(6, 10);
                    int anio2 = Integer.parseInt(anio);
                    int year = Integer.parseInt(annio);
                    int actual = year - anio2;
                    Double res = (actual * aux.getSalario()) / 12.0;
                jTCalcularPrestacion.setText(res + "");
                }
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String nombre = jTCodigo.getText();
        //        for(int i = 0; i < nroEmpleados; i++){
            //            if(empleado[i].getNombre().equals(nombre)){
                
                //            }
            //        }
    }//GEN-LAST:event_jBCalcularPrestacionActionPerformed

    private void jBCalcularEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularEdadActionPerformed
        // TODO add your handling code here:
        
        String nomArch = "Empleado.dat";
        ObjectInputStream arch = null;
        int mx = 0;
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado aux = new Empleado();
                aux = (Empleado)arch.readObject();
                Calendar c = Calendar.getInstance();
                String annio = Integer.toString(c.get(Calendar.YEAR));
                int year = Integer.parseInt(annio); // año actual pero del sistema
                String anio = aux.getFechaNac().substring(6, 10);
                int edad = year - Integer.parseInt(anio);
                if(edad > mx){
                   mx = edad;
                }
//                    jTCalcularEdad.setText(edad + "");
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado aux = new Empleado();
                aux = (Empleado)arch.readObject();
                Calendar c = Calendar.getInstance();
                String annio = Integer.toString(c.get(Calendar.YEAR));
                int year = Integer.parseInt(annio); // año actual pero del sistema
                String anio = aux.getFechaNac().substring(6, 10);
                int edad = year - Integer.parseInt(anio);
                if(edad == mx){
//                   mx = edad;

                    jTCalcularEdad.setText(jTCalcularEdad.getText() + ", " + aux.getNombre());
                }
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //        for(int i = 0; i < nroEmpleados; i++){
            
                //            }
            //        }

        // arreglar        String anio = E1.getFechaNac().substring(6, 10);
        //        12/12/1222

        //        int edad = year - Integer.parseInt(anio);
        //        jTCalcularEdad.setText(edad + "");
    }//GEN-LAST:event_jBCalcularEdadActionPerformed

    private void jBCalcularAntiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularAntiguedadActionPerformed

        String nomArch = "Empleado.dat";
        ObjectInputStream arch = null;
        int mx = 0;
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado aux = new Empleado();
                aux = (Empleado)arch.readObject();
                Calendar c = Calendar.getInstance();
                String annio = Integer.toString(c.get(Calendar.YEAR));
                int year = Integer.parseInt(annio); // año actual pero del sistema
                String anio = aux.getFechaIngresoEmpresa().substring(6, 10);
                int edad = year - Integer.parseInt(anio);
                if(edad > mx){
                   mx = edad;
                }
//                    jTCalcularEdad.setText(edad + "");
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            arch = new ObjectInputStream(new FileInputStream(nomArch));
            while(true){
                Empleado aux = new Empleado();
                aux = (Empleado)arch.readObject();
                Calendar c = Calendar.getInstance();
                String annio = Integer.toString(c.get(Calendar.YEAR));
                int year = Integer.parseInt(annio); // año actual pero del sistema
                String anio = aux.getFechaIngresoEmpresa().substring(6, 10);
                int edad = year - Integer.parseInt(anio);
                if(edad == mx){
//                   mx = edad;

                    jTCalcularAntiguedad.setText(jTCalcularAntiguedad.getText() + ", " + aux.getNombre());
                }
            }
        } catch (Exception e) {
        }finally{
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazConsultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBCalcularAntiguedadActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcularAntiguedad;
    private javax.swing.JButton jBCalcularEdad;
    private javax.swing.JButton jBCalcularPrestacion;
    private javax.swing.JButton jBSalarioModificar6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTCalcularAntiguedad;
    private javax.swing.JTextField jTCalcularEdad;
    private javax.swing.JTextField jTCalcularPrestacion;
    private javax.swing.JTextField jTCodigo;
    // End of variables declaration//GEN-END:variables
}
