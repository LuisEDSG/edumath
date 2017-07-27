package ejercicios_geo;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import clases.conectar;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
public class ejercicioge3 extends javax.swing.JInternalFrame {
    public ejercicioge3() {
        initComponents();
        BtnSiguiente.setVisible(false);
        LblRrect.setVisible(false);
        LblRcuad.setVisible(false);
        LblRtria.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        
        jLabel1Area.setVisible(false);
        DecimalFormat df = new DecimalFormat("0.00");
        Random num1 = new Random();
        Random num2 = new Random();
        Random num3 = new Random();
        Random num4 = new Random();
        Random num5 = new Random();
        int lc1,lrb1,lrh2,ltb1,lth2,arect,acuad,atria;
        //double atria,n1,n2;
       String slc1,slrb1,slrh2,sltb1,slth2,ac,ar,at;
       lc1=(num1.nextInt(99)+1);
       lrb1=(num2.nextInt(150-70+1)+70);
       lrh2=(num3.nextInt(59-20+1)+20);
       ltb1=(num4.nextInt(150-50+1)+50);
       lth2=(num5.nextInt(150-70+1)+70);
       slc1=String.valueOf(lc1);
       slrb1=String.valueOf(lrb1);
       slrh2=String.valueOf(lrh2);
       sltb1=String.valueOf(ltb1);
       slth2=String.valueOf(lth2);
       LblCl1.setText(slc1);
       LblRb1.setText(slrb1);
       LblRh1.setText(slrh2);        
       LblTb2.setText(sltb1);
       LblTh2.setText(slth2);
        acuad=(Integer.parseInt(slc1))*(Integer.parseInt(slc1));
        atria=((Integer.parseInt(sltb1)*(Integer.parseInt(slth2)/2)));
       //atria=df.format((n1/n2)/2);
        arect=(Integer.parseInt(slrb1))*(Integer.parseInt(slrh2));
         at=String.valueOf(atria);
         ar=String.valueOf(arect);
         ac=String.valueOf(acuad);
         LblRrect.setText(ar);
         LblRcuad.setText(ac);
         LblRtria.setText(at); 
         lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel1Area = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LblCl1 = new javax.swing.JLabel();
        LblTh2 = new javax.swing.JLabel();
        LblTb2 = new javax.swing.JLabel();
        LblRh1 = new javax.swing.JLabel();
        LblRb1 = new javax.swing.JLabel();
        BtnRect = new javax.swing.JButton();
        BtnTria = new javax.swing.JButton();
        LblRrect = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        BtnCuad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtrArect = new javax.swing.JTextField();
        TxtrAtria = new javax.swing.JTextField();
        BtnSiguiente = new javax.swing.JButton();
        LblRtria = new javax.swing.JLabel();
        TxtrAcuad = new javax.swing.JTextField();
        BtnVerificar = new javax.swing.JButton();
        LblRcuad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Área");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Área");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("b=");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel1Area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/area.gif"))); // NOI18N
        getContentPane().add(jLabel1Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 200));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("2");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 30, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("cm");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 30, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 30, -1));

        LblCl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCl1.setForeground(new java.awt.Color(255, 255, 255));
        LblCl1.setText("jLabel1");
        getContentPane().add(LblCl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        LblTh2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTh2.setForeground(new java.awt.Color(255, 255, 255));
        LblTh2.setText("jLabel1");
        getContentPane().add(LblTh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        LblTb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTb2.setForeground(new java.awt.Color(255, 255, 255));
        LblTb2.setText("jLabel1");
        getContentPane().add(LblTb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        LblRh1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRh1.setForeground(new java.awt.Color(255, 255, 255));
        LblRh1.setText("jLabel1");
        getContentPane().add(LblRh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        LblRb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRb1.setForeground(new java.awt.Color(255, 255, 255));
        LblRb1.setText("jLabel1");
        getContentPane().add(LblRb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        BtnRect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnRect.setForeground(new java.awt.Color(255, 255, 255));
        BtnRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect3.png"))); // NOI18N
        BtnRect.setBorder(null);
        BtnRect.setBorderPainted(false);
        BtnRect.setContentAreaFilled(false);
        BtnRect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRect.setIconTextGap(-3);
        BtnRect.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect1.png"))); // NOI18N
        BtnRect.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rect2.png"))); // NOI18N
        BtnRect.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnRect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRectActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRect, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 223, -1));

        BtnTria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnTria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3equilatero.png"))); // NOI18N
        BtnTria.setBorder(null);
        BtnTria.setBorderPainted(false);
        BtnTria.setContentAreaFilled(false);
        BtnTria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTria.setIconTextGap(-3);
        BtnTria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1equilatero.png"))); // NOI18N
        BtnTria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2equilatero.png"))); // NOI18N
        BtnTria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnTria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnTria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTriaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 223, -1));

        LblRrect.setForeground(new java.awt.Color(255, 255, 255));
        LblRrect.setText("jLabel1");
        getContentPane().add(LblRrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, -1, -1));

        BtnCuad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCuad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand3.png"))); // NOI18N
        BtnCuad.setBorder(null);
        BtnCuad.setBorderPainted(false);
        BtnCuad.setContentAreaFilled(false);
        BtnCuad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCuad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCuad.setIconTextGap(-3);
        BtnCuad.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand1.png"))); // NOI18N
        BtnCuad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand2.png"))); // NOI18N
        BtnCuad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCuad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuadActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 223, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("h=");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("h=");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 30, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("cm");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 30, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("cm");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 30, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("cm");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 30, -1));

        TxtrArect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrArectKeyTyped(evt);
            }
        });
        getContentPane().add(TxtrArect, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, -1));

        TxtrAtria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrAtriaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtrAtria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 80, -1));

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, 30));

        LblRtria.setForeground(new java.awt.Color(255, 255, 255));
        LblRtria.setText("jLabel1");
        getContentPane().add(LblRtria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        TxtrAcuad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrAcuadKeyTyped(evt);
            }
        });
        getContentPane().add(TxtrAcuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 80, -1));

        BtnVerificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        BtnVerificar.setText("Verificar");
        BtnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, 30));

        LblRcuad.setForeground(new java.awt.Color(255, 255, 255));
        LblRcuad.setText("jLabel1");
        getContentPane().add(LblRcuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("b=");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 30, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("L=");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 30, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Encuentre el area de las siguientes figuras:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 620, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Área: es la medida de la superficie de una\n figura; es decir, la medida de su región interior.\nEl centímetro cuadrado (cm 2 ) es una unidad que nos \n permite medir áreas.");
         jLabel1Area.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRectActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Área  del rectángulo  = Base(b) x Altura(h)");
    }//GEN-LAST:event_BtnRectActionPerformed

    private void BtnTriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTriaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Área del triángulo = (Base(b) x Altura(h)) / 2");
    }//GEN-LAST:event_BtnTriaActionPerformed

    private void BtnCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuadActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Área del cuadrado = Lado al cuadrado (LxL)");
    }//GEN-LAST:event_BtnCuadActionPerformed

    private void BtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerificarActionPerformed
        // TODO add your handling code here:
          if(TxtrArect.getText().isEmpty()&&TxtrAcuad.getText().isEmpty()&&TxtrAtria.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Error Campos vacios");
       }
          else{
           try{
        
          int r1,r3;
        int a1,a3;
        double a2,r2;
        r1=Integer.parseInt(TxtrArect.getText());
        r2=Double.parseDouble(TxtrAtria.getText());
        r3=Integer.parseInt(TxtrAcuad.getText());
        a1=Integer.parseInt(LblRrect.getText());
        a2=Double.parseDouble(LblRtria.getText());
        a3=Integer.parseInt(LblRcuad.getText());
        if (a1==r1 && a2==r2 && a3==r3){ 
         JOptionPane.showMessageDialog(null,"Las respuestas  son correctas");
           BtnSiguiente.setVisible(true);
          lblch1.setVisible(true);
           lblch2.setVisible(true);
            lblch3.setVisible(true);
            lblp1.setVisible(true);
        lblp2.setVisible(true);
        lblp3.setVisible(true);
        lblp1.setText("5");
            lblp2.setText("5");
            lblp3.setText("5");
       }else{
           JOptionPane.showMessageDialog(null,"Las respuestas  NO correctas");
          BtnSiguiente.setVisible(false);
           if((a1==r1)==false){
                lbluch2.setVisible(true);
           }else{
               lblch2.setVisible(true);
               lblp2.setVisible(true);
              lblp2.setText("5");
           }
           if((a2==r2)==false){
               lbluch1.setVisible(true);
           }else{
               lblch1.setVisible(true);
               lblp1.setVisible(true);
              lblp1.setText("5");
           }
           if((a3==r3)==false){
               lbluch3.setVisible(true);
           }else{
                lblch3.setVisible(true);
                lblp1.setVisible(true);
              lblp1.setText("5");
           }
           
       }
           
        
       }catch(Exception e){
               
               }
       }
        
        
        
        
        
    }//GEN-LAST:event_BtnVerificarActionPerformed

    private void TxtrArectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrArectKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrArectKeyTyped

    private void TxtrAtriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrAtriaKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrAtriaKeyTyped

    private void TxtrAcuadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrAcuadKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrAcuadKeyTyped

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioge4 ejge4 = new ejercicioge4();
        pescrit.add(ejge4);
        ejge4.pack();
        ejge4.lblusu.setText(usu);
        ejge4.setVisible(true); 
        try {
            ejge4.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi1=0,pi2=0,pi3=0,tot1=0;
        String nom=lblusu.getText();
        String ps1=lblp1.getText();
        String ps2=lblp2.getText();
        String ps3=lblp3.getText();
        pi1 = Integer.parseInt(ps1);
        pi2 = Integer.parseInt(ps2);
        pi3 = Integer.parseInt(ps3);
        tot1=pi1+pi2+pi3;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
        String sql="UPDATE geometria SET ejercicio3 = ? WHERE nombre = '"+nom+"'";
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, tot1s);
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
    private javax.swing.JButton BtnCuad;
    private javax.swing.JButton BtnRect;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JButton BtnTria;
    private javax.swing.JButton BtnVerificar;
    private javax.swing.JLabel LblCl1;
    private javax.swing.JLabel LblRb1;
    private javax.swing.JLabel LblRcuad;
    private javax.swing.JLabel LblRh1;
    private javax.swing.JLabel LblRrect;
    private javax.swing.JLabel LblRtria;
    private javax.swing.JLabel LblTb2;
    private javax.swing.JLabel LblTh2;
    private javax.swing.JTextField TxtrAcuad;
    private javax.swing.JTextField TxtrArect;
    private javax.swing.JTextField TxtrAtria;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel1Area;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}
