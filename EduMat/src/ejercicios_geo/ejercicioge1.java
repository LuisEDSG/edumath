package ejercicios_geo;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import ejercicios_geo.*;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ejercicioge1 extends javax.swing.JInternalFrame {
    public ejercicioge1() {
        initComponents();
        btnSiguiente.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
        btnSiguiente.setVisible(false);
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblp5.setVisible(false);
        lblp8.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp5 = new javax.swing.JLabel();
        lblp8 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        BtnEqui1 = new javax.swing.JButton();
        BtnEqui5 = new javax.swing.JButton();
        cbresultado1 = new javax.swing.JComboBox<>();
        BtnEqui = new javax.swing.JButton();
        cbresultado5 = new javax.swing.JComboBox<>();
        cbresultado6 = new javax.swing.JComboBox<>();
        BtnEqui4 = new javax.swing.JButton();
        BtnEqui3 = new javax.swing.JButton();
        cbresultado2 = new javax.swing.JComboBox<>();
        BtnEqui6 = new javax.swing.JButton();
        cbresultado3 = new javax.swing.JComboBox<>();
        btnverf = new javax.swing.JButton();
        cbresultado4 = new javax.swing.JComboBox<>();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        lblch6 = new javax.swing.JLabel();
        lbluch6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Figuras y formas geométricas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        getContentPane().add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        getContentPane().add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        lblp8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp8.setForeground(new java.awt.Color(255, 255, 255));
        lblp8.setText("0");
        getContentPane().add(lblp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 120, 30));

        BtnEqui1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand3.png"))); // NOI18N
        BtnEqui1.setBorder(null);
        BtnEqui1.setBorderPainted(false);
        BtnEqui1.setContentAreaFilled(false);
        BtnEqui1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui1.setIconTextGap(-3);
        BtnEqui1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand1.png"))); // NOI18N
        BtnEqui1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand2.png"))); // NOI18N
        BtnEqui1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 223, -1));

        BtnEqui5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pent3.png"))); // NOI18N
        BtnEqui5.setBorder(null);
        BtnEqui5.setBorderPainted(false);
        BtnEqui5.setContentAreaFilled(false);
        BtnEqui5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui5.setIconTextGap(-3);
        BtnEqui5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pent1.png"))); // NOI18N
        BtnEqui5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pent2.png"))); // NOI18N
        BtnEqui5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui5ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 207, 223, -1));

        cbresultado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo", " " }));
        cbresultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbresultado1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbresultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 44, -1, -1));

        BtnEqui.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect3.png"))); // NOI18N
        BtnEqui.setBorder(null);
        BtnEqui.setBorderPainted(false);
        BtnEqui.setContentAreaFilled(false);
        BtnEqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui.setIconTextGap(-3);
        BtnEqui.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect1.png"))); // NOI18N
        BtnEqui.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect2.png"))); // NOI18N
        BtnEqui.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEquiActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 0, 223, -1));

        cbresultado5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo" }));
        cbresultado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbresultado5ActionPerformed(evt);
            }
        });
        getContentPane().add(cbresultado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 230, -1, -1));

        cbresultado6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo", " " }));
        getContentPane().add(cbresultado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 224, -1, -1));

        BtnEqui4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo3.png"))); // NOI18N
        BtnEqui4.setBorder(null);
        BtnEqui4.setBorderPainted(false);
        BtnEqui4.setContentAreaFilled(false);
        BtnEqui4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui4.setIconTextGap(-3);
        BtnEqui4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo1.png"))); // NOI18N
        BtnEqui4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo2.png"))); // NOI18N
        BtnEqui4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui4ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui4, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 207, 223, -1));

        BtnEqui3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3equilatero.png"))); // NOI18N
        BtnEqui3.setBorder(null);
        BtnEqui3.setBorderPainted(false);
        BtnEqui3.setContentAreaFilled(false);
        BtnEqui3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui3.setIconTextGap(-3);
        BtnEqui3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1equilatero.png"))); // NOI18N
        BtnEqui3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2equilatero.png"))); // NOI18N
        BtnEqui3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui3, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 0, 223, -1));

        cbresultado2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo" }));
        getContentPane().add(cbresultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 43, -1, -1));

        BtnEqui6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rombo3.png"))); // NOI18N
        BtnEqui6.setBorder(null);
        BtnEqui6.setBorderPainted(false);
        BtnEqui6.setContentAreaFilled(false);
        BtnEqui6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui6.setIconTextGap(-3);
        BtnEqui6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rombo1.png"))); // NOI18N
        BtnEqui6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rombo2.png"))); // NOI18N
        BtnEqui6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui6ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui6, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 207, 223, -1));

        cbresultado3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo" }));
        getContentPane().add(cbresultado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 42, -1, -1));

        btnverf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnverf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnverf.setText("Verificar");
        btnverf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverfActionPerformed(evt);
            }
        });
        getContentPane().add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 419, -1, -1));

        cbresultado4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rombo", "Pentágono", "Circulo", "Triangulo", "Cuadrado", "Rectángulo", " " }));
        cbresultado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbresultado4ActionPerformed(evt);
            }
        });
        getContentPane().add(cbresultado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 236, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        lblch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, -1, -1));

        lbluch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1000, 510));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
    String Rombo="Rombo",Penta="Pentágono",Circ="Circulo",Tria="Triangulo",Cuad="Cuadrado",Rect="Rectángulo";
         String r1 =this.cbresultado1.getSelectedItem().toString();
         String r2 =this.cbresultado2.getSelectedItem().toString();
         String r3 =this.cbresultado3.getSelectedItem().toString();
         String r4 =this.cbresultado4.getSelectedItem().toString();
         String r5 =this.cbresultado5.getSelectedItem().toString();
         String r6 =this.cbresultado6.getSelectedItem().toString();
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
        btnSiguiente.setVisible(false);
       if(r1.equals(Cuad)&& r2.equals(Rect)&& r3.equals(Tria)&& r4.equals(Penta)&& r5.equals(Rombo)&& r6.equals(Circ)){
           JOptionPane.showMessageDialog(null,"La respuestas  son correctas");
            lblch5.setVisible(true);
            lblch1.setVisible(true);
            lblch2.setVisible(true);
            lblch3.setVisible(true);
            lblch4.setVisible(true);
            lblch6.setVisible(true);
            btnSiguiente.setVisible(true);
            lblp1.setVisible(true);
            lblp2.setVisible(true);
            lblp3.setVisible(true);
            lblp4.setVisible(true);
            lblp5.setVisible(true);
            lblp8.setVisible(true);
            lblp1.setText("5");
            lblp2.setText("5");
            lblp3.setText("5");
            lblp4.setText("5");
            lblp5.setText("5");
            lblp8.setText("5");
       }else
       {
           JOptionPane.showMessageDialog(null,"La respuestas no son correctas");
          if(r1.equals(Cuad)==false){
           lbluch1.setVisible(true);
           btnSiguiente.setVisible(false);
          }
          else{
              lblch1.setVisible(true);
              lblp1.setVisible(true);
              lblp1.setText("5");
          }
          if(r2.equals(Rect)==false){
           lbluch2.setVisible(true);
            btnSiguiente.setVisible(false);
          }else{
              lblch2.setVisible(true);
              lblp2.setVisible(true);
              lblp2.setText("5");
          }
          
           if(r3.equals(Tria)==false){
           lbluch3.setVisible(true);
            btnSiguiente.setVisible(false);
       }
           else{
              lblch3.setVisible(true);
              lblp3.setVisible(true);
              lblp3.setText("5");
          }
         
          if(r4.equals(Penta)==false){
           lbluch4.setVisible(true);
            btnSiguiente.setVisible(false);
       }
          else{
              lblch4.setVisible(true);
              lblp4.setVisible(true);
              lblp4.setText("5");
          }
          if(r5.equals(Rombo)==false){
              lbluch5.setVisible(true);
               btnSiguiente.setVisible(false);
       }
          else{
              lblch5.setVisible(true);
              lblp5.setVisible(true);
              lblp5.setText("5");
          }
            if(r6.equals(Circ)==false){
           lbluch6.setVisible(true);
            btnSiguiente.setVisible(false);
       }
            else{
              lblch6.setVisible(true);
              lblp8.setVisible(true);
              lblp8.setText("5");
          }
       }
    }//GEN-LAST:event_btnverfActionPerformed

    private void cbresultado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbresultado4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbresultado4ActionPerformed

    private void cbresultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbresultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbresultado1ActionPerformed

    private void BtnEqui5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Polígono de cinco lados iguales y cinco ángulos iguales.");
    }//GEN-LAST:event_BtnEqui5ActionPerformed

    private void cbresultado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbresultado5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbresultado5ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioge2 ejge2 = new ejercicioge2();
        pescrit.add(ejge2);
        ejge2.pack();
        ejge2.lblusu.setText(usu);
        ejge2.setVisible(true); 
        try {
            ejge2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void BtnEqui1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Polígono de cuatro lados, con la particularidad de que todos ellos son iguales.\n Además sus cuatro ángulos son de 90 grados cada uno.");
    }//GEN-LAST:event_BtnEqui1ActionPerformed

    private void BtnEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEquiActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null," Polígono de cuatro lados, iguales dos a dos.\n Sus cuatro ángulos son de 90 grados cada uno.");
         
    }//GEN-LAST:event_BtnEquiActionPerformed

    private void BtnEqui3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui3ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Polígono formado por tres lados y tres ángulos.\n La suma de todos sus ángulos siempre es 180 grados.");
    }//GEN-LAST:event_BtnEqui3ActionPerformed

    private void BtnEqui6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui6ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null," Polígono de cuatro lados iguales, pero sus cuatro ángulos son distintos de 90º.");
    }//GEN-LAST:event_BtnEqui6ActionPerformed

    private void BtnEqui4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui4ActionPerformed
        // TODO add your handling code here:
          JOptionPane.showMessageDialog(null,"Región delimitada por una circunferencia, \n siendo ésta el lugar geométrico de los puntos que equidistan del centro.");
       
    }//GEN-LAST:event_BtnEqui4ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi1=0,pi2=0,pi3=0,pi4=0,pi5=0,pi8=0,tot1=0;
        String nom=lblusu.getText();
        String ps1=lblp1.getText();
        String ps2=lblp2.getText();
        String ps3=lblp3.getText();
        String ps4=lblp4.getText();
        String ps5=lblp5.getText();
        String ps8=lblp8.getText();
        pi1 = Integer.parseInt(ps1);
        pi2 = Integer.parseInt(ps2);
        pi3 = Integer.parseInt(ps3);
        pi4 = Integer.parseInt(ps4);
        pi5 = Integer.parseInt(ps5);
        pi8 = Integer.parseInt(ps8);
        tot1=pi1+pi2+pi3+pi4+pi5+pi8;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
        String sql="INSERT INTO geometria (`nombre`,`ejercicio1`) VALUES (?,?)";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, tot1s);
            int num=pst.executeUpdate();
            if(num>0){
                JOptionPane.showMessageDialog(null,"Tu puntaje fue guardado.");
            }
        }catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnguardarActionPerformed
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEqui;
    private javax.swing.JButton BtnEqui1;
    private javax.swing.JButton BtnEqui3;
    private javax.swing.JButton BtnEqui4;
    private javax.swing.JButton BtnEqui5;
    private javax.swing.JButton BtnEqui6;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnverf;
    private javax.swing.JComboBox<String> cbresultado1;
    private javax.swing.JComboBox<String> cbresultado2;
    private javax.swing.JComboBox<String> cbresultado3;
    private javax.swing.JComboBox<String> cbresultado4;
    private javax.swing.JComboBox<String> cbresultado5;
    private javax.swing.JComboBox<String> cbresultado6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblch5;
    private javax.swing.JLabel lblch6;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp8;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    private javax.swing.JLabel lbluch5;
    private javax.swing.JLabel lbluch6;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}
