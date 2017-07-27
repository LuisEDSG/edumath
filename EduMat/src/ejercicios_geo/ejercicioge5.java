package ejercicios_geo;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import java.util.Random;
import javax.swing.JOptionPane;
import clases.conectar;
import ejercicios_alj.ejercicioal1;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ejercicioge5 extends javax.swing.JInternalFrame {
    public ejercicioge5() {
        initComponents();
        btnSiguiente.setVisible(false);
         Random num1 = new Random();
        Random num2 = new Random();
         Random num3 = new Random();
          Random num4 = new Random();
           Random num5 = new Random();
            Random num6 = new Random();
            LblPTrap1.setVisible(false);
            LblPRom2.setVisible(false);
            LblPPent3.setVisible(false);
            LblPHex4.setVisible(false);
            lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
        lblch7.setVisible(false);
        lbluch7.setVisible(false);
        lblch8.setVisible(false);
        lbluch8.setVisible(false);
          int lth1,ltbm1,ltbM1,lr2,lp3,lh4,atra,apent,ahex,arom,ptra,phex,prom,ppent;
           String slth1,sltbm1,sltbM1,slr2,slp3,slh4,satra,sapent,sahex,sarom,sptra,spahex,sprom,pt,pr,ph,pp;
          lth1=(num1.nextInt(40-20+1)+20);
          ltbm1=(num2.nextInt(30-20+1)+20);
          ltbM1=(num3.nextInt(60-30+1)+30);
          lr2=(num4.nextInt(59-20+1)+20);
          lp3=(num4.nextInt(59-20+1)+20);
          lh4=(num4.nextInt(59-20+1)+20);
         slth1=String.valueOf(lth1);
        sltbm1=String.valueOf(ltbm1);
        sltbM1=String.valueOf(ltbM1);
        slr2=String.valueOf(lr2);
       slp3=String.valueOf(lp3);
       slh4=String.valueOf(lp3);
       LblTh1.setText(slth1);
       LblTbm1.setText(sltbm1);
       LblTbM1.setText(sltbM1);
       LblPl3.setText(slp3);
       LblH4.setText(slh4);
       LblRl2.setText(slr2);
       prom=(Integer.parseInt(slr2)*4);
        phex=(Integer.parseInt(slh4)*6);
         ptra=((Integer.parseInt(slth1)*2) +(Integer.parseInt(sltbm1))+(Integer.parseInt(sltbM1)));
        ppent=(Integer.parseInt(slp3)*5);
         pt=String.valueOf(ptra);
          pr=String.valueOf(prom);
           pp=String.valueOf(ppent);
           ph=String.valueOf(phex);
           LblPTrap1.setText(pt);
            LblPRom2.setText(pr);
             LblPPent3.setText(pp);
              LblPHex4.setText(ph);
              lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnguardar = new javax.swing.JButton();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TxtrPHex4 = new javax.swing.JTextField();
        lblch7 = new javax.swing.JLabel();
        lbluch7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        LblPHex4 = new javax.swing.JLabel();
        LblPTrap1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TxtrAPent3 = new javax.swing.JTextField();
        lblch8 = new javax.swing.JLabel();
        lbluch8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        LblPPent3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        TxtrPRom2 = new javax.swing.JTextField();
        lblch6 = new javax.swing.JLabel();
        lbluch6 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LblPRom2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblH4 = new javax.swing.JLabel();
        LblPl3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblTbM1 = new javax.swing.JLabel();
        LblTh1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblRl2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LblTbm1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtrPtrap1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BtnEqui1 = new javax.swing.JButton();
        BtnEqui6 = new javax.swing.JButton();
        BtnEqui5 = new javax.swing.JButton();
        BtnEqui = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Perimetro 2");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, 30));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Encuentre el perimetro de las siguientes figuras:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 690, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("P=");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        TxtrPHex4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrPHex4KeyTyped(evt);
            }
        });
        getContentPane().add(TxtrPHex4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 80, -1));

        lblch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        lbluch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("cm");
        jLabel26.setToolTipText("");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 30, -1));

        LblPHex4.setForeground(new java.awt.Color(255, 255, 255));
        LblPHex4.setText("jLabel1");
        getContentPane().add(LblPHex4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        LblPTrap1.setForeground(new java.awt.Color(255, 255, 255));
        LblPTrap1.setText("jLabel1");
        getContentPane().add(LblPTrap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("P=");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        TxtrAPent3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrAPent3KeyTyped(evt);
            }
        });
        getContentPane().add(TxtrAPent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 80, -1));

        lblch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        lbluch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("cm");
        jLabel28.setToolTipText("");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 30, -1));

        LblPPent3.setForeground(new java.awt.Color(255, 255, 255));
        LblPPent3.setText("jLabel1");
        getContentPane().add(LblPPent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("P=");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 120, 30));

        TxtrPRom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrPRom2KeyTyped(evt);
            }
        });
        getContentPane().add(TxtrPRom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 80, -1));

        lblch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, -1));

        lbluch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        getContentPane().add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("cm");
        jLabel24.setToolTipText("");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 30, -1));

        LblPRom2.setForeground(new java.awt.Color(255, 255, 255));
        LblPRom2.setText("jLabel1");
        getContentPane().add(LblPRom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("L=");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 30, -1));

        LblH4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblH4.setForeground(new java.awt.Color(255, 255, 255));
        LblH4.setText("jLabel1");
        getContentPane().add(LblH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        LblPl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblPl3.setForeground(new java.awt.Color(255, 255, 255));
        LblPl3.setText("jLabel1");
        getContentPane().add(LblPl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("L=");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 30, -1));

        LblTbM1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTbM1.setForeground(new java.awt.Color(255, 255, 255));
        LblTbM1.setText("jLabel1");
        getContentPane().add(LblTbM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        LblTh1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTh1.setForeground(new java.awt.Color(255, 255, 255));
        LblTh1.setText("jLabel1");
        getContentPane().add(LblTh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("B=");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("L=");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, -1));

        LblRl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRl2.setForeground(new java.awt.Color(255, 255, 255));
        LblRl2.setText("jLabel2");
        getContentPane().add(LblRl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("b=");
        jLabel17.setToolTipText("");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 30, -1));

        LblTbm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTbm1.setForeground(new java.awt.Color(255, 255, 255));
        LblTbm1.setText("jLabel1");
        getContentPane().add(LblTbm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("P=");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        TxtrPtrap1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtrPtrap1KeyTyped(evt);
            }
        });
        getContentPane().add(TxtrPtrap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("cm");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 30, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("L=");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        BtnEqui1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trapesio3png.png"))); // NOI18N
        BtnEqui1.setBorder(null);
        BtnEqui1.setBorderPainted(false);
        BtnEqui1.setContentAreaFilled(false);
        BtnEqui1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui1.setIconTextGap(-3);
        BtnEqui1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trapesio1.png"))); // NOI18N
        BtnEqui1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trapesio2.png"))); // NOI18N
        BtnEqui1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 223, -1));

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
        getContentPane().add(BtnEqui6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 223, -1));

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
        getContentPane().add(BtnEqui5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 223, -1));

        BtnEqui.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hexa3.png"))); // NOI18N
        BtnEqui.setBorder(null);
        BtnEqui.setBorderPainted(false);
        BtnEqui.setContentAreaFilled(false);
        BtnEqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui.setIconTextGap(-3);
        BtnEqui.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hexa1.png"))); // NOI18N
        BtnEqui.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hexa2.png"))); // NOI18N
        BtnEqui.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEquiActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 223, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BtnEqui1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Perimetro = B + b + L x 2 \n Donde 2 son los lados iguales");
    }//GEN-LAST:event_BtnEqui1ActionPerformed

    private void BtnEqui6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Perimetro = L x 4\n Donde 4 son los lados iguales");
    }//GEN-LAST:event_BtnEqui6ActionPerformed

    private void BtnEqui5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Perimetro = L x 5 \n Donde 5 son los lados iguales");
    }//GEN-LAST:event_BtnEqui5ActionPerformed

    private void BtnEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEquiActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Perimetro = L x 6 \n Donde 6 son los lados iguales");
    }//GEN-LAST:event_BtnEquiActionPerformed

    private void TxtrPtrap1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrPtrap1KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrPtrap1KeyTyped

    private void TxtrPRom2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrPRom2KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrPRom2KeyTyped

    private void TxtrPHex4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrPHex4KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrPHex4KeyTyped

    private void TxtrAPent3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtrAPent3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TxtrAPent3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(TxtrPtrap1.getText().isEmpty()&&TxtrPRom2.getText().isEmpty()&&TxtrAPent3.getText().isEmpty()&&TxtrPHex4.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Error Campos vacios");
       }
       else{
           try{
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
        lblch7.setVisible(false);
        lbluch7.setVisible(false);
        lblch8.setVisible(false);
        lbluch8.setVisible(false);
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        int r1,r2,r3,r4;
        int a1,a2,a3,a4;
       // String sr1,sr2,sr3,psrec,pscuad,pstri;
        r1=Integer.parseInt(TxtrPtrap1.getText());
        r2=Integer.parseInt(TxtrPRom2.getText());
        r3=Integer.parseInt(TxtrAPent3.getText());
        r4=Integer.parseInt(TxtrPHex4.getText());
        a1=Integer.parseInt(LblPTrap1.getText());
        a2=Integer.parseInt(LblPRom2.getText());
        a3=Integer.parseInt(LblPPent3.getText());
        a4=Integer.parseInt(LblPHex4.getText());
        if (a1==r1 && a2==r2 && a3==r3 &&a4==r4){ 
         JOptionPane.showMessageDialog(null,"Las respuestas  son correctas");
          lblch5.setVisible(true);
           lblch6.setVisible(true);
            lblch8.setVisible(true);
             lblch7.setVisible(true);
             lblp1.setVisible(true);
        lblp2.setVisible(true);
        lblp3.setVisible(true);
        lblp4.setVisible(true);
        btnSiguiente.setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null,"Las respuestas  NO correctas");
           if((a1==r1)==false){
                lbluch5.setVisible(true);
           }else{
               lblch5.setVisible(true);
               lblp3.setVisible(true);
               lblp3.setText("5");
           }
           if((a2==r2)==false){
               lbluch6.setVisible(true);
           }else{
               lblch6.setVisible(true);
               lblp2.setVisible(true);
               lblp2.setText("5");
           }
           if((a3==r3)==false){
               lbluch8.setVisible(true);
           }else{
                lblch8.setVisible(true);
                lblp1.setVisible(true);
               lblp1.setText("5");
           }
            if((a4==r4)==false){
               lbluch7.setVisible(true);
           }else{
                lblch7.setVisible(true);
                lblp2.setVisible(true);
               lblp2.setText("5");
           }
       }
       }catch(Exception e){
               
               }
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
        String sql="UPDATE geometria SET ejercicio5 = ? WHERE nombre = '"+nom+"'";
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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioal1 ejal1 = new ejercicioal1();
        pescrit.add(ejal1);
        ejal1.setVisible(true);
        ejal1.pack();
        ejal1.lblusu.setText(usu);
        try {
            ejal1.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEqui;
    private javax.swing.JButton BtnEqui1;
    private javax.swing.JButton BtnEqui5;
    private javax.swing.JButton BtnEqui6;
    private javax.swing.JLabel LblH4;
    private javax.swing.JLabel LblPHex4;
    private javax.swing.JLabel LblPPent3;
    private javax.swing.JLabel LblPRom2;
    private javax.swing.JLabel LblPTrap1;
    private javax.swing.JLabel LblPl3;
    private javax.swing.JLabel LblRl2;
    private javax.swing.JLabel LblTbM1;
    private javax.swing.JLabel LblTbm1;
    private javax.swing.JLabel LblTh1;
    private javax.swing.JTextField TxtrAPent3;
    private javax.swing.JTextField TxtrPHex4;
    private javax.swing.JTextField TxtrPRom2;
    private javax.swing.JTextField TxtrPtrap1;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblch5;
    private javax.swing.JLabel lblch6;
    private javax.swing.JLabel lblch7;
    private javax.swing.JLabel lblch8;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lbluch5;
    private javax.swing.JLabel lbluch6;
    private javax.swing.JLabel lbluch7;
    private javax.swing.JLabel lbluch8;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}
