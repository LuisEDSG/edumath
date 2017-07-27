package ejercicios_alj;
import java.util.Random;
import javax.swing.JOptionPane;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class ejercicioal5 extends javax.swing.JInternalFrame {
    public ejercicioal5() {
        initComponents();
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblr1.setVisible(false);
        lblr2.setVisible(false);
        lblr3.setVisible(false);
        lblr4.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        Random num1 = new Random();
        Random num2 = new Random();
         Random num3 = new Random();
          Random num4 = new Random();
           Random num5 = new Random();
        Random num6 = new Random();
        Random num7 = new Random();
          Random num8 = new Random();
          int n1s3,n2s3,n1s4,n2s4,n1r2,n2r2,n1r1,n2r1,rr1,rr2,rs3,rs4;
          String sn1s3,sn2s3,sn1s4,sn2s4,sn1r1,sn2r1,sn1r2,sn2r2,s1,s2,r3,r4;
          n1r1=(num5.nextInt(99-40+1)+40);
          n2r1=(num6.nextInt(24)+1);
          n1r2=(num7.nextInt(99-40+1)+40);
          n2r2=(num8.nextInt(24)+1);
          n1s3=(num1.nextInt(49)+1);
          n2s3=(num2.nextInt(49)+1);
          n1s4=(num3.nextInt(49)+1);
          n2s4=(num4.nextInt(49)+1);
          sn1r1 =String.valueOf(n1r1);   
           sn2r1 =String.valueOf(n2r1); 
            sn1r2 =String.valueOf(n1r2); 
            sn2r2 =String.valueOf(n2r2);
            sn1s3=String.valueOf(n1s3);
          sn2s3=String.valueOf(n2s3);
          sn1s4=String.valueOf(n1s4);
          sn2s4=String.valueOf(n2s4);
               lblr1n1.setText(sn1r1);
             lblr1n2.setText(sn2r1);
             lblr2n1.setText(sn1r2);
             lblr2n2.setText(sn2r2);
             lbls1n1.setText(sn1s3);
              lbls1n2.setText(sn2s3);
               lbls2n1.setText(sn1s4);
                lbls2n2.setText(sn2s4);
                rr1=(Integer.parseInt(sn1r1)) -(Integer.parseInt(sn2r1));
                 rr2=(Integer.parseInt(sn1r2)) -(Integer.parseInt(sn2r2));
                 rs3=(Integer.parseInt(sn1s3)) +(Integer.parseInt(sn2s3));
                 rs4=(Integer.parseInt(sn1s4)) +(Integer.parseInt(sn2s4));
                 s1=String.valueOf(rr1);
                 s2=String.valueOf(rr2);
                 r3=String.valueOf(rs3);
                 r4=String.valueOf(rs4);
                 lblr1.setText(s1);
                 lblr2.setText(s2);
                 lblr3.setText(r3);
                 lblr4.setText(r4);      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblp1 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        lblr1n2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblr1n1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblr2n1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblr2n2 = new javax.swing.JLabel();
        lbls1n1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbls1n2 = new javax.swing.JLabel();
        lbls2n1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbls2n2 = new javax.swing.JLabel();
        txts3 = new javax.swing.JTextField();
        txtr2 = new javax.swing.JTextField();
        txts4 = new javax.swing.JTextField();
        txtr1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lblr1 = new javax.swing.JLabel();
        lblr3 = new javax.swing.JLabel();
        lblr2 = new javax.swing.JLabel();
        lblr4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ecuaciones de primer grado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        getContentPane().add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, 30));

        lblr1n2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblr1n2.setForeground(new java.awt.Color(255, 255, 255));
        lblr1n2.setText("jLabel1");
        getContentPane().add(lblr1n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 90, -1, -1));

        lblr1n1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblr1n1.setForeground(new java.awt.Color(255, 255, 255));
        lblr1n1.setText("jLabel1");
        getContentPane().add(lblr1n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("+");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        lblr2n1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblr2n1.setForeground(new java.awt.Color(255, 255, 255));
        lblr2n1.setText("jLabel1");
        getContentPane().add(lblr2n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("+");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("=");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        lblr2n2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblr2n2.setForeground(new java.awt.Color(255, 255, 255));
        lblr2n2.setText("jLabel1");
        getContentPane().add(lblr2n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        lbls1n1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbls1n1.setForeground(new java.awt.Color(255, 255, 255));
        lbls1n1.setText("jLabel1");
        getContentPane().add(lbls1n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 308, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 308, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 308, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("=");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 308, -1, -1));

        lbls1n2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbls1n2.setForeground(new java.awt.Color(255, 255, 255));
        lbls1n2.setText("jLabel1");
        getContentPane().add(lbls1n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 308, -1, -1));

        lbls2n1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbls2n1.setForeground(new java.awt.Color(255, 255, 255));
        lbls2n1.setText("jLabel1");
        getContentPane().add(lbls2n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 271, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 271, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("X");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 271, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("=");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 271, -1, -1));

        lbls2n2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbls2n2.setForeground(new java.awt.Color(255, 255, 255));
        lbls2n2.setText("jLabel1");
        getContentPane().add(lbls2n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 271, -1, -1));

        txts3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txts3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txts3KeyTyped(evt);
            }
        });
        getContentPane().add(txts3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 355, 106, -1));

        txtr2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr2KeyTyped(evt);
            }
        });
        getContentPane().add(txtr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 149, 101, -1));

        txts4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txts4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txts4KeyTyped(evt);
            }
        });
        getContentPane().add(txts4, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 327, 88, -1));

        txtr1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr1KeyTyped(evt);
            }
        });
        getContentPane().add(txtr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 181, 93, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("X");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 181, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("=");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 181, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 358, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("=");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 358, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("X");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 149, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("=");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 149, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("X");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 330, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("=");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 30));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        lblr1.setText("jLabel1");
        getContentPane().add(lblr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        lblr3.setText("jLabel3");
        getContentPane().add(lblr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        lblr2.setText("jLabel6");
        getContentPane().add(lblr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        lblr4.setText("jLabel10");
        getContentPane().add(lblr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resuelve las siguientes ecuaciones de primer grado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(txtr1.getText().isEmpty()&&txtr2.getText().isEmpty()&&txts3.getText().isEmpty()&&txts4.getText().isEmpty()){//&&txtr4.getText().isEmpty()
           JOptionPane.showMessageDialog(null,"Error Campos vacios");
       }else{
           try{
                int r1,r2,r3,r4;
        int a1,a2,a3,a4,s1,s2,s3,s4,s5;
         a1=Integer.parseInt(lblr1.getText());
        a2=Integer.parseInt(lblr2.getText());
        a3=Integer.parseInt(lblr3.getText());
          a4=Integer.parseInt(lblr4.getText());
           r1=Integer.parseInt(txtr1.getText());
        r2=Integer.parseInt(txtr2.getText());
        r3=Integer.parseInt(txts3.getText());
         r4=Integer.parseInt(txts4.getText());
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
       
          if ((a1==r1 )&& (a2==r2 )&& (a3==r3)&& (a4==r4)){ //&& (a4==r4&& g4.equals(Positivo))
         JOptionPane.showMessageDialog(null,"Las respuestas  son correctas");
          lblch1.setVisible(true);
           lblch2.setVisible(true);
            lblch3.setVisible(true);
            lblch4.setVisible(true);
            lblp1.setText("5");
               lblp2.setVisible(true);
               lblp2.setText("5");
               lblp3.setVisible(true);
                lblp3.setText("5");
                lblp4.setVisible(true);
                lblp4.setText("5");
       }else{
           JOptionPane.showMessageDialog(null,"Las respuestas  NO son correctas");
           if((a1==r1)==false){
                lbluch1.setVisible(true);
           }else{
               lblch1.setVisible(true);
               lblp1.setVisible(true);
               lblp1.setText("5");
           }
           if((a2==r2)==false){
               lbluch2.setVisible(true);
           }else{
               lblch2.setVisible(true);
               lblp2.setVisible(true);
               lblp2.setText("5");
           }
           if((a3==r3)==false){
               lbluch3.setVisible(true);
           }else{
                lblch3.setVisible(true);
                lblp3.setVisible(true);
                lblp3.setText("5");
           }if((a4==r4)==false){
               lbluch4.setVisible(true);
           }else{
                lblch4.setVisible(true);
                lblp4.setVisible(true);
                lblp4.setText("5");
           }
           
       }
       }catch(Exception e){
               
               }
       }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi1=0,pi2=0,pi3=0,pi4=0,tot1=0;
        String nom=lblusu.getText();
        String ps1=lblp1.getText();
        String ps2=lblp2.getText();
        String ps3=lblp3.getText();
        String ps4=lblp4.getText();
        pi1 = Integer.parseInt(ps1);
        pi2 = Integer.parseInt(ps2);
        pi3 = Integer.parseInt(ps3);
        pi4 = Integer.parseInt(ps4);
        tot1=pi1+pi2+pi3+pi4;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
        String sql="UPDATE algebra SET ejercicio5 = ? WHERE nombre = '"+nom+"'";
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

    private void txtr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtr1KeyTyped

    private void txts3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txts3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txts3KeyTyped

    private void txtr2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtr2KeyTyped

    private void txts4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txts4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txts4KeyTyped
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblr1;
    private javax.swing.JLabel lblr1n1;
    private javax.swing.JLabel lblr1n2;
    private javax.swing.JLabel lblr2;
    private javax.swing.JLabel lblr2n1;
    private javax.swing.JLabel lblr2n2;
    private javax.swing.JLabel lblr3;
    private javax.swing.JLabel lblr4;
    private javax.swing.JLabel lbls1n1;
    private javax.swing.JLabel lbls1n2;
    private javax.swing.JLabel lbls2n1;
    private javax.swing.JLabel lbls2n2;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtr1;
    private javax.swing.JTextField txtr2;
    private javax.swing.JTextField txts3;
    private javax.swing.JTextField txts4;
    // End of variables declaration//GEN-END:variables
}
