


import java.awt.Color;
import javax.swing.JLabel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class InterfazAvion extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAvion
     */
    private JLabel[] label = new JLabel[55];
    
    private Avioni avion = new Avioni();
    public InterfazAvion() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        label[0] = jLabelA;
        label[1] = jLabelA1;
        label[2] = jLabelA2;
        label[3] = jLabelA3;
        label[4] = jLabelA4;
        label[5] = jLabelA5;
        label[6] = jLabelA6;
        label[7] = jLabelA7;
        
        
        
        label[8] = jLabelA8;
        label[9] = jLabelA9;
        label[10] = jLabelA10;
        label[11] = jLabelA11;
        label[12] = jLabelA12;
        label[13] = jLabelA13;
        label[14] = jLabelA14;
        label[15] = jLabelA15;
        
//        label[16] = jLabelA16;
//        label[17] = jLabelA1;
//        label[18] = jLabelA2;
//        label[19] = jLabelA3;
//        label[20] = jLabelA4;
//        label[21] = jLabelA5;
//        label[22] = jLabelA6;
//        label[23] = jLabelA7;
        
        for(int i = 0; i < 8; i++){
            label[i].setOpaque(true);
            label[i].setBackground(Color.yellow);
        }  
        
        for(int i = 8; i < 16; i++){
            label[i].setOpaque(true);
            label[i].setBackground(Color.blue);
        }  
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelA1 = new javax.swing.JLabel();
        jLabelA2 = new javax.swing.JLabel();
        jLabelA3 = new javax.swing.JLabel();
        jLabelA4 = new javax.swing.JLabel();
        jLabelA5 = new javax.swing.JLabel();
        jLabelA6 = new javax.swing.JLabel();
        jLabelA7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBRegistrarPasajero = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCi = new javax.swing.JTextField();
        jTNroAsiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelA8 = new javax.swing.JLabel();
        jLabelA9 = new javax.swing.JLabel();
        jLabelA10 = new javax.swing.JLabel();
        jLabelA11 = new javax.swing.JLabel();
        jLabelA12 = new javax.swing.JLabel();
        jLabelA13 = new javax.swing.JLabel();
        jLabelA14 = new javax.swing.JLabel();
        jLabelA15 = new javax.swing.JLabel();
        jLabelA16 = new javax.swing.JLabel();
        jLabelA17 = new javax.swing.JLabel();
        jLabelA18 = new javax.swing.JLabel();
        jLabelA19 = new javax.swing.JLabel();
        jLabelA20 = new javax.swing.JLabel();
        jLabelA21 = new javax.swing.JLabel();
        jLabelA22 = new javax.swing.JLabel();
        jLabelA23 = new javax.swing.JLabel();
        jLabelA24 = new javax.swing.JLabel();
        jLabelA25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avion.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avionizquierda.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avionderecha.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 300));

        jLabelA.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA.setText("1");
        jPanel1.add(jLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 30));

        jLabelA1.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA1.setText("5");
        jPanel1.add(jLabelA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 30, 30));

        jLabelA2.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA2.setText("2");
        jPanel1.add(jLabelA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 30, 30));

        jLabelA3.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA3.setText("3");
        jPanel1.add(jLabelA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 30, 30));

        jLabelA4.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA4.setText("4");
        jPanel1.add(jLabelA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30, 30));

        jLabelA5.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA5.setText("8");
        jPanel1.add(jLabelA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 30, 30));

        jLabelA6.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA6.setText("7");
        jPanel1.add(jLabelA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 30, 30));

        jLabelA7.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA7.setText("6");
        jPanel1.add(jLabelA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 30, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("jButton1");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("jButton1");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("jButton1");

        jBMostrar.setBackground(new java.awt.Color(0, 0, 0));
        jBMostrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jBMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("jButton1");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBRegistrarPasajero.setBackground(new java.awt.Color(0, 0, 0));
        jBRegistrarPasajero.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jBRegistrarPasajero.setForeground(new java.awt.Color(255, 255, 255));
        jBRegistrarPasajero.setText("Registrar Pasajero");
        jBRegistrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarPasajeroActionPerformed(evt);
            }
        });
        jPanel3.add(jBRegistrarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 219, 45));

        jTNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPanel3.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 190, 40));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 40));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Ci:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 40));

        jTCi.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTCi.setText("0");
        jPanel3.add(jTCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 40));

        jTNroAsiento.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTNroAsiento.setText("0");
        jPanel3.add(jTNroAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Nro Asiento:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 690, 440));

        jLabelA8.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA8.setText("5");
        jPanel1.add(jLabelA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 30, 30));

        jLabelA9.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA9.setText("5");
        jPanel1.add(jLabelA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 30, 30));

        jLabelA10.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA10.setText("5");
        jPanel1.add(jLabelA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 30, 30));

        jLabelA11.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA11.setText("5");
        jPanel1.add(jLabelA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 30, 30));

        jLabelA12.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA12.setText("5");
        jPanel1.add(jLabelA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 30, 30));

        jLabelA13.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA13.setText("5");
        jPanel1.add(jLabelA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 30, 30));

        jLabelA14.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA14.setText("5");
        jPanel1.add(jLabelA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 30, 30));

        jLabelA15.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA15.setText("5");
        jPanel1.add(jLabelA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 30, 30));

        jLabelA16.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA16.setText("5");
        jPanel1.add(jLabelA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 30, 30));

        jLabelA17.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA17.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA17.setText("5");
        jPanel1.add(jLabelA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 30, 30));

        jLabelA18.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA18.setText("5");
        jPanel1.add(jLabelA18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 30, 30));

        jLabelA19.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA19.setText("5");
        jPanel1.add(jLabelA19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 30, 30));

        jLabelA20.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA20.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA20.setText("5");
        jPanel1.add(jLabelA20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 30, 30));

        jLabelA21.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA21.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA21.setText("5");
        jPanel1.add(jLabelA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 30, 30));

        jLabelA22.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA22.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA22.setText("5");
        jPanel1.add(jLabelA22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 30, 30));

        jLabelA23.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA23.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA23.setText("5");
        jPanel1.add(jLabelA23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 30, 30));

        jLabelA24.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA24.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA24.setText("5");
        jPanel1.add(jLabelA24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 30, 30));

        jLabelA25.setBackground(new java.awt.Color(255, 102, 102));
        jLabelA25.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelA25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA25.setText("5");
        jPanel1.add(jLabelA25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarPasajeroActionPerformed
        int nro = Integer.parseInt(jTNroAsiento.getText());
        System.out.println(nro);
        Pasajero P = new Pasajero();
        
        String nombre= jTNombre.getText();
        int ci = Integer.parseInt(jTCi.getText());
        int nro1 = Integer.parseInt(jTNroAsiento.getText());
//        P.setNombre(jTNombre.getText());
//        P.setCi(Integer.parseInt(jTCi.getText()));
//        P.setNroAsiento(Integer.parseInt(jTNroAsiento.getText()));
        System.out.println(nro);
//        avion.getSilla()[nro].addiPasajero(nombre, ci, nro1);
        label[nro].setBackground(Color.red);
        
//        avion.getSilla()[1].addiPasajero(cur);
        
    }//GEN-LAST:event_jBRegistrarPasajeroActionPerformed

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        InterfazMostrar aux = new InterfazMostrar(avion);
        aux.setVisible(true);
    }//GEN-LAST:event_jBMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMostrar;
    private javax.swing.JButton jBRegistrarPasajero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelA1;
    private javax.swing.JLabel jLabelA10;
    private javax.swing.JLabel jLabelA11;
    private javax.swing.JLabel jLabelA12;
    private javax.swing.JLabel jLabelA13;
    private javax.swing.JLabel jLabelA14;
    private javax.swing.JLabel jLabelA15;
    private javax.swing.JLabel jLabelA16;
    private javax.swing.JLabel jLabelA17;
    private javax.swing.JLabel jLabelA18;
    private javax.swing.JLabel jLabelA19;
    private javax.swing.JLabel jLabelA2;
    private javax.swing.JLabel jLabelA20;
    private javax.swing.JLabel jLabelA21;
    private javax.swing.JLabel jLabelA22;
    private javax.swing.JLabel jLabelA23;
    private javax.swing.JLabel jLabelA24;
    private javax.swing.JLabel jLabelA25;
    private javax.swing.JLabel jLabelA3;
    private javax.swing.JLabel jLabelA4;
    private javax.swing.JLabel jLabelA5;
    private javax.swing.JLabel jLabelA6;
    private javax.swing.JLabel jLabelA7;
    private javax.swing.JLabel jLabelA8;
    private javax.swing.JLabel jLabelA9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTCi;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNroAsiento;
    // End of variables declaration//GEN-END:variables
}
