package ejercicios_geo;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ejercicioge2 extends javax.swing.JInternalFrame {
    public ejercicioge2() {
        initComponents();
        txtrRectan.setText("0");
        txtrCuad.setText("0");
        txtrTrian.setText("0");
        btnSiguiente.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblPerim.setVisible(false);
        LblRtriag.setVisible(false);
        LblRcuad.setVisible(false);
        LblRrect.setVisible(false);
       Random num1 = new Random();
        Random num2 = new Random();
         Random num3 = new Random();
          Random num4 = new Random();
       int lc1,lr1,lr2,lt1,prect,pcuad,ptria;
       String slc1,slr1,slr2,slt1,pc,pr,pt;
       lc1=(num1.nextInt(99)+1);
       lr1=(num2.nextInt(59-20+1)+20);
       lr2=(num3.nextInt(150-70+1)+70);
       lt1=(num4.nextInt(150-50+1)+50);
       slc1=String.valueOf(lc1);
       slr1=String.valueOf(lr1);
       slr2=String.valueOf(lr2);
       slt1=String.valueOf(lt1);
       LblC1.setText(slc1);
       LblC2.setText(slc1);
       LblC3.setText(slc1);
       LblC4.setText(slc1);
       LblRL1.setText(slr1);
       LblRL2.setText(slr2);
       LblRL3.setText(slr2);
       LblRL4.setText(slr1);
       LblT1.setText(slt1);
       LblT2.setText(slt1);
       LblT3.setText(slt1);
       pcuad=(Integer.parseInt(slc1)*4);
        ptria=(Integer.parseInt(slt1)*3);
         prect=((Integer.parseInt(slr1)*2) +(Integer.parseInt(slr2)*2));
         pt=String.valueOf(ptria);
          pr=String.valueOf(prect);
           pc=String.valueOf(pcuad);
           LblRrect.setText(pr);
           LblRcuad.setText(pc);
           LblRtriag.setText(pt);
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
        jLabel1 = new javax.swing.JLabel();
        LblT3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblT2 = new javax.swing.JLabel();
        LblRL1 = new javax.swing.JLabel();
        LblRL4 = new javax.swing.JLabel();
        LblRL3 = new javax.swing.JLabel();
        LblC3 = new javax.swing.JLabel();
        LblRL2 = new javax.swing.JLabel();
        LblT1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LblC1 = new javax.swing.JLabel();
        lblPerim = new javax.swing.JLabel();
        LblC4 = new javax.swing.JLabel();
        LblC2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnRect = new javax.swing.JButton();
        BtnCuad = new javax.swing.JButton();
        BtnTria = new javax.swing.JButton();
        txtrRectan = new javax.swing.JTextField();
        txtrCuad = new javax.swing.JTextField();
        txtrTrian = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblRtriag = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        LblRrect = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LblRcuad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Perimetro");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 43, -1, -1));

        LblT3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblT3.setForeground(new java.awt.Color(255, 255, 255));
        LblT3.setText("n1");
        getContentPane().add(LblT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("P=");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        LblT2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblT2.setForeground(new java.awt.Color(255, 255, 255));
        LblT2.setText("n1");
        getContentPane().add(LblT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        LblRL1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRL1.setForeground(new java.awt.Color(255, 255, 255));
        LblRL1.setText("n1");
        getContentPane().add(LblRL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        LblRL4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRL4.setForeground(new java.awt.Color(255, 255, 255));
        LblRL4.setText("n1");
        getContentPane().add(LblRL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        LblRL3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRL3.setForeground(new java.awt.Color(255, 255, 255));
        LblRL3.setText("n1");
        getContentPane().add(LblRL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        LblC3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblC3.setForeground(new java.awt.Color(255, 255, 255));
        LblC3.setText("n1");
        getContentPane().add(LblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, -1));

        LblRL2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRL2.setForeground(new java.awt.Color(255, 255, 255));
        LblRL2.setText("n1");
        getContentPane().add(LblRL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        LblT1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblT1.setForeground(new java.awt.Color(255, 255, 255));
        LblT1.setText("n1");
        getContentPane().add(LblT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Perimetro");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        LblC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblC1.setForeground(new java.awt.Color(255, 255, 255));
        LblC1.setText("n1");
        getContentPane().add(LblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        lblPerim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perimetro.gif"))); // NOI18N
        getContentPane().add(lblPerim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 293, 245));

        LblC4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblC4.setForeground(new java.awt.Color(255, 255, 255));
        LblC4.setText("n1");
        getContentPane().add(LblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        LblC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblC2.setForeground(new java.awt.Color(255, 255, 255));
        LblC2.setText("n1");
        getContentPane().add(LblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Encuentre el perimetro de las siguientes figuras:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 690, -1));

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
        getContentPane().add(BtnRect, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 223, -1));

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

        txtrRectan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrRectanKeyTyped(evt);
            }
        });
        getContentPane().add(txtrRectan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 60, -1));

        txtrCuad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrCuadKeyTyped(evt);
            }
        });
        getContentPane().add(txtrCuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 60, -1));

        txtrTrian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrTrianKeyTyped(evt);
            }
        });
        getContentPane().add(txtrTrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 60, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jButton2.setText("Verificar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("P=");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("P=");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        LblRtriag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRtriag.setForeground(new java.awt.Color(255, 255, 255));
        LblRtriag.setText("jLabel4");
        getContentPane().add(LblRtriag, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cm");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("cm");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        LblRrect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRrect.setForeground(new java.awt.Color(255, 255, 255));
        LblRrect.setText("jLabel4");
        getContentPane().add(LblRrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("cm");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        LblRcuad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRcuad.setForeground(new java.awt.Color(255, 255, 255));
        LblRcuad.setText("jLabel4");
        getContentPane().add(LblRcuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("n1");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Perímetro: es la suma de los lados de una figura geométrica. Es su contorno.","Información",JOptionPane.INFORMATION_MESSAGE);
         lblPerim.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRectActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"El perímetro del rectángulo lo obtenemos sumando todos sus lados:\n P= L1 + L2 + L3 + L4");

    }//GEN-LAST:event_BtnRectActionPerformed

    private void BtnCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuadActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"El perímetro del cuadrado lo obtenemos sumando todos sus lados:\n P= L1 + L2 + L3 + L4");
    }//GEN-LAST:event_BtnCuadActionPerformed

    private void BtnTriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTriaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"El perímetro del triangulo lo obtenemos sumando todos sus lados:\n P= L1 + L2 + L3");
    }//GEN-LAST:event_BtnTriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       if(txtrRectan.getText().isEmpty()&&txtrCuad.getText().isEmpty()&&txtrTrian.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Error Campos vacios");
       }
       else{
           try{
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        int r1,r2,r3;
        int a1,a2,a3;
       // String sr1,sr2,sr3,psrec,pscuad,pstri;
        r1=Integer.parseInt(txtrRectan.getText());
        r2=Integer.parseInt(txtrTrian.getText());
        r3=Integer.parseInt(txtrCuad.getText());
        a1=Integer.parseInt(LblRrect.getText());
        a2=Integer.parseInt(LblRtriag.getText());
        a3=Integer.parseInt(LblRcuad.getText());
      
      
       if (a1==r1 && a2==r2 && a3==r3){ 
         JOptionPane.showMessageDialog(null,"Las respuestas  son correctas");
           btnSiguiente.setVisible(true);
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
          btnSiguiente.setVisible(false);
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
                lblp3.setVisible(true);
              lblp3.setText("5");
           }         
       }
       }catch(Exception e){
               }
       }
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtrRectanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrRectanKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtrRectanKeyTyped

    private void txtrTrianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrTrianKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtrTrianKeyTyped

    private void txtrCuadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrCuadKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtrCuadKeyTyped

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       String usu=lblusu.getText();
       this.dispose();
        ejercicioge3 ejge3 = new ejercicioge3();
        pescrit.add(ejge3);
        ejge3.pack();
        ejge3.lblusu.setText(usu);
        ejge3.setVisible(true); 
        try {
            ejge3.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
        String sql="UPDATE geometria SET ejercicio2 = ? WHERE nombre = '"+nom+"'";
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
    private javax.swing.JButton BtnTria;
    private javax.swing.JLabel LblC1;
    private javax.swing.JLabel LblC2;
    private javax.swing.JLabel LblC3;
    private javax.swing.JLabel LblC4;
    private javax.swing.JLabel LblRL1;
    private javax.swing.JLabel LblRL2;
    private javax.swing.JLabel LblRL3;
    private javax.swing.JLabel LblRL4;
    private javax.swing.JLabel LblRcuad;
    private javax.swing.JLabel LblRrect;
    private javax.swing.JLabel LblRtriag;
    private javax.swing.JLabel LblT1;
    private javax.swing.JLabel LblT2;
    private javax.swing.JLabel LblT3;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblPerim;
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
    private javax.swing.JTextField txtrCuad;
    private javax.swing.JTextField txtrRectan;
    private javax.swing.JTextField txtrTrian;
    // End of variables declaration//GEN-END:variables
}
