package ejercicios_arit;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import clases.conectar;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ejercicioar2 extends javax.swing.JInternalFrame {
    public ejercicioar2() {
        initComponents();
        btnSiguiente.setVisible(false);
        multl1();
        multl2();
        multl3();
        multl4();
        multl5();
        multl6();
        multl7();
        multl8();
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblp5.setVisible(false);
        lblp6.setVisible(false);
        lblp7.setVisible(false);
        lblp8.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch9.setVisible(false);
        lbluch9.setVisible(false);
        lblch12.setVisible(false);
        lbluch12.setVisible(false);
        lblch11.setVisible(false);
        lbluch11.setVisible(false);
        lblch14.setVisible(false);
        lbluch14.setVisible(false);
        lblch10.setVisible(false);
        lbluch10.setVisible(false);
        lblch13.setVisible(false);
        lbluch13.setVisible(false);
        lblch15.setVisible(false);
        lbluch15.setVisible(false);
    }
    void multl1(){
        int nsi1 = (int) (Math.random()*10+1);
        int nsi2 = (int) (Math.random()*10+1);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn1.setText(ns1);
        lblsn2.setText(ns2);
    }
    void multl2(){
        int nsi1 = (int) (Math.random()*50+1);
        int nsi2 = (int) (Math.random()*10+1);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn3.setText(ns1);
        lblsn4.setText(ns2);
    }
    void multl3(){
        int nsi1 = (int) (Math.random()*100+10);
        int nsi2 = (int) (Math.random()*50+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn7.setText(ns1);
        lblsn8.setText(ns2);
    }
    void multl4(){
        int nsi1 = (int) (Math.random()*100+10);
        int nsi2 = (int) (Math.random()*100+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn9.setText(ns1);
        lblsn10.setText(ns2);
    }
    void multl5(){
        int nsi1 = (int) (Math.random()*100+10);
        int nsi2 = (int) (Math.random()*1000+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn5.setText(ns1);
        lblsn6.setText(ns2);
    }
    void multl6(){
        int nsi1 = (int) (Math.random()*1000+100);
        int nsi2 = (int) (Math.random()*100+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn13.setText(ns1);
        lblsn14.setText(ns2);
    }
    void multl7(){
        int nsi1 = (int) (Math.random()*1000+100);
        int nsi2 = (int) (Math.random()*1000+100);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn11.setText(ns1);
        lblsn12.setText(ns2);
    }
    void multl8(){
        int nsi1 = (int) (Math.random()*10000+1000);
        int nsi2 = (int) (Math.random()*1000+100);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn15.setText(ns1);
        lblsn16.setText(ns2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnverf = new javax.swing.JButton();
        lblsn1 = new javax.swing.JLabel();
        lblsn2 = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtre9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblsn3 = new javax.swing.JLabel();
        lblsn4 = new javax.swing.JLabel();
        lblch9 = new javax.swing.JLabel();
        lbluch9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtre10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblsn7 = new javax.swing.JLabel();
        lblsn8 = new javax.swing.JLabel();
        lblch10 = new javax.swing.JLabel();
        lbluch10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtre11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblsn9 = new javax.swing.JLabel();
        lblsn10 = new javax.swing.JLabel();
        lblch11 = new javax.swing.JLabel();
        lbluch11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtre12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lblsn5 = new javax.swing.JLabel();
        lblsn6 = new javax.swing.JLabel();
        lblch12 = new javax.swing.JLabel();
        lbluch12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtre13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblsn11 = new javax.swing.JLabel();
        lblsn12 = new javax.swing.JLabel();
        lblch13 = new javax.swing.JLabel();
        lbluch13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtre14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblsn13 = new javax.swing.JLabel();
        lblsn14 = new javax.swing.JLabel();
        lblch14 = new javax.swing.JLabel();
        lbluch14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtre15 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lblsn15 = new javax.swing.JLabel();
        lblsn16 = new javax.swing.JLabel();
        lblch15 = new javax.swing.JLabel();
        lbluch15 = new javax.swing.JLabel();
        lblmult = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp8 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp6 = new javax.swing.JLabel();
        lblp7 = new javax.swing.JLabel();
        lblp5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Multiplicacion");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 20));

        txtre1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre1.setText("0");
        txtre1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre1FocusGained(evt);
            }
        });
        txtre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre1KeyTyped(evt);
            }
        });
        jPanel1.add(txtre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 20));

        btnverf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnverf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnverf.setText("Verificar");
        btnverf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverfActionPerformed(evt);
            }
        });
        jPanel1.add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        lblsn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn1.setForeground(new java.awt.Color(255, 255, 255));
        lblsn1.setText("n1");
        jPanel1.add(lblsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        lblsn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn2.setForeground(new java.awt.Color(255, 255, 255));
        lblsn2.setText("n2");
        jPanel1.add(lblsn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 20));

        txtre9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre9.setText("0");
        txtre9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre9FocusGained(evt);
            }
        });
        txtre9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre9KeyTyped(evt);
            }
        });
        jPanel1.add(txtre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 70, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" = ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 20));

        lblsn3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn3.setForeground(new java.awt.Color(255, 255, 255));
        lblsn3.setText("n1");
        jPanel1.add(lblsn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        lblsn4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn4.setForeground(new java.awt.Color(255, 255, 255));
        lblsn4.setText("n2");
        jPanel1.add(lblsn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        lblch9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        lbluch9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("x");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 20));

        txtre10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre10.setText("0");
        txtre10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre10FocusGained(evt);
            }
        });
        txtre10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre10KeyTyped(evt);
            }
        });
        jPanel1.add(txtre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 70, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" = ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 20));

        lblsn7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn7.setForeground(new java.awt.Color(255, 255, 255));
        lblsn7.setText("n1");
        jPanel1.add(lblsn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        lblsn8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn8.setForeground(new java.awt.Color(255, 255, 255));
        lblsn8.setText("n2");
        jPanel1.add(lblsn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        lblch10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        lbluch10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("x");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 20));

        txtre11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre11.setText("0");
        txtre11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre11FocusGained(evt);
            }
        });
        txtre11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre11KeyTyped(evt);
            }
        });
        jPanel1.add(txtre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 70, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" = ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 20));

        lblsn9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn9.setForeground(new java.awt.Color(255, 255, 255));
        lblsn9.setText("n1");
        jPanel1.add(lblsn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblsn10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn10.setForeground(new java.awt.Color(255, 255, 255));
        lblsn10.setText("n2");
        jPanel1.add(lblsn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        lblch11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        lbluch11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("x");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 20));

        txtre12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre12.setText("0");
        txtre12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre12FocusGained(evt);
            }
        });
        txtre12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre12KeyTyped(evt);
            }
        });
        jPanel1.add(txtre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 70, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" = ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 20));

        lblsn5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn5.setForeground(new java.awt.Color(255, 255, 255));
        lblsn5.setText("n1");
        jPanel1.add(lblsn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        lblsn6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn6.setForeground(new java.awt.Color(255, 255, 255));
        lblsn6.setText("n2");
        jPanel1.add(lblsn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        lblch12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        lbluch12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("x");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 20));

        txtre13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre13.setText("0");
        txtre13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre13FocusGained(evt);
            }
        });
        txtre13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre13KeyTyped(evt);
            }
        });
        jPanel1.add(txtre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 70, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" = ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, 20));

        lblsn11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn11.setForeground(new java.awt.Color(255, 255, 255));
        lblsn11.setText("n1");
        jPanel1.add(lblsn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        lblsn12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn12.setForeground(new java.awt.Color(255, 255, 255));
        lblsn12.setText("n2");
        jPanel1.add(lblsn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        lblch13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        lbluch13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("x");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, 20));

        txtre14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre14.setText("0");
        txtre14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre14FocusGained(evt);
            }
        });
        txtre14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre14KeyTyped(evt);
            }
        });
        jPanel1.add(txtre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 70, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" = ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, 20));

        lblsn13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn13.setForeground(new java.awt.Color(255, 255, 255));
        lblsn13.setText("n1");
        jPanel1.add(lblsn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        lblsn14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn14.setForeground(new java.awt.Color(255, 255, 255));
        lblsn14.setText("n2");
        jPanel1.add(lblsn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        lblch14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        lbluch14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("x");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 20));

        txtre15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre15.setText("0");
        txtre15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre15FocusGained(evt);
            }
        });
        txtre15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre15KeyTyped(evt);
            }
        });
        jPanel1.add(txtre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 70, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" = ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 20));

        lblsn15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn15.setForeground(new java.awt.Color(255, 255, 255));
        lblsn15.setText("n1");
        jPanel1.add(lblsn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        lblsn16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn16.setForeground(new java.awt.Color(255, 255, 255));
        lblsn16.setText("n2");
        jPanel1.add(lblsn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        lblch15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        lbluch15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        lblmult.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblmult.setForeground(new java.awt.Color(255, 255, 255));
        lblmult.setText("Multiplicaciones");
        lblmult.setName(""); // NOI18N
        jPanel1.add(lblmult, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        jPanel1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        jPanel1.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        lblp8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp8.setForeground(new java.awt.Color(255, 255, 255));
        lblp8.setText("0");
        jPanel1.add(lblp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        jPanel1.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        jPanel1.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        lblp6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp6.setForeground(new java.awt.Color(255, 255, 255));
        lblp6.setText("0");
        jPanel1.add(lblp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        lblp7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp7.setForeground(new java.awt.Color(255, 255, 255));
        lblp7.setText("0");
        jPanel1.add(lblp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        jPanel1.add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 500));

        lblusu.setText("jLabel9");
        jPanel1.add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
        //Mult1
        String ns11=lblsn1.getText();
        String ns12=lblsn2.getText();
        String re11=txtre1.getText();
        String rel11 ="";
        int sn12 = 0,sn11=0,res11=0;
        sn11 = Integer.parseInt(ns11);
        sn12 = Integer.parseInt(ns12);
        res11 = sn11*sn12;
        rel11 = String.valueOf(res11);
        rel11= Integer.toString(res11);
        //Mult2
        String ns21=lblsn3.getText();
        String ns22=lblsn4.getText();
        String re21=txtre9.getText();
        String rel21 ="";
        int sn22 = 0,sn21=0,res21=0;
        sn21 = Integer.parseInt(ns21);
        sn22 = Integer.parseInt(ns22);
        res21 = sn21*sn22;
        rel21 = String.valueOf(res21);
        rel21= Integer.toString(res21);
        //Mult3
        String ns31=lblsn5.getText();
        String ns32=lblsn6.getText();
        String re31=txtre12.getText();
        String rel31 ="";
        int sn32 = 0,sn31=0,res31=0;
        sn31 = Integer.parseInt(ns31);
        sn32 = Integer.parseInt(ns32);
        res31 = sn31*sn32;
        rel31 = String.valueOf(res31);
        rel31= Integer.toString(res31);
        //Mult4
        String ns41=lblsn13.getText();
        String ns42=lblsn14.getText();
        String re41=txtre14.getText();
        String rel41 ="";
        int sn42 = 0,sn41=0,res41=0;
        sn41 = Integer.parseInt(ns41);
        sn42 = Integer.parseInt(ns42);
        res41 = sn41*sn42;
        rel41 = String.valueOf(res41);
        rel41= Integer.toString(res41);
        //Mult5
        String ns51=lblsn7.getText();
        String ns52=lblsn8.getText();
        String re51=txtre10.getText();
        String rel51 ="";
        int sn52 = 0,sn51=0,res51=0;
        sn51 = Integer.parseInt(ns51);
        sn52 = Integer.parseInt(ns52);
        res51 = sn51*sn52;
        rel51 = String.valueOf(res51);
        rel51= Integer.toString(res51);
        //Mult6
        String ns61=lblsn9.getText();
        String ns62=lblsn10.getText();
        String re61=txtre11.getText();
        String rel61 ="";
        int sn62 = 0,sn61=0,res61=0;
        sn61 = Integer.parseInt(ns61);
        sn62 = Integer.parseInt(ns62);
        res61 = sn61*sn62;
        rel61 = String.valueOf(res61);
        rel61= Integer.toString(res61);
        //Mult7
        String ns71=lblsn11.getText();
        String ns72=lblsn12.getText();
        String re71=txtre13.getText();
        String rel71 ="";
        int sn72 = 0,sn71=0,res71=0;
        sn71 = Integer.parseInt(ns71);
        sn72 = Integer.parseInt(ns72);
        res71 = sn71*sn72;
        rel71 = String.valueOf(res71);
        rel71= Integer.toString(res71);
        //Mult8
        String ns81=lblsn15.getText();
        String ns82=lblsn16.getText();
        String re81=txtre15.getText();
        String rel81 ="";
        int sn82 = 0,sn81=0,res81=0;
        sn81 = Integer.parseInt(ns81);
        sn82 = Integer.parseInt(ns82);
        res81 = sn81*sn82;
        rel81 = String.valueOf(res81);
        rel81= Integer.toString(res81);
        if(re11.equals(rel11)){
            lblch1.setVisible(true);
            lbluch1.setVisible(false);
            txtre1.setEditable(false);
            lblp1.setVisible(true);
            lblp1.setText("5");
        }
        else{
            lbluch1.setVisible(true);
            lblch1.setVisible(false);
        }
        if(re21.equals(rel21)){
            lblch9.setVisible(true);
            lbluch9.setVisible(false);
            txtre9.setEditable(false);
            lblp2.setVisible(true);
            lblp2.setText("5");
        }
        else{
            lbluch9.setVisible(true);
            lblch9.setVisible(false);
        }
        if(re31.equals(rel31)){
            lblch12.setVisible(true);
            lbluch12.setVisible(false);
            txtre12.setEditable(false);
            lblp3.setVisible(true);
            lblp3.setText("5");
        }
        else{
            lbluch12.setVisible(true);
            lblch12.setVisible(false);
        }
        if(re41.equals(rel41)){
            lblch14.setVisible(true);
            lbluch14.setVisible(false);
            txtre14.setEditable(false);
            lblp4.setVisible(true);
            lblp4.setText("5");
        }
        else{
            lbluch14.setVisible(true);
            lblch14.setVisible(false);
        }
        if(re51.equals(rel51)){
            lblch10.setVisible(true);
            lbluch10.setVisible(false);
            txtre10.setEditable(false);
            lblp5.setVisible(true);
            lblp5.setText("5");
        }
        else{
            lbluch10.setVisible(true);
            lblch10.setVisible(false);
        }
        if(re61.equals(rel61)){
            lblch11.setVisible(true);
            lbluch11.setVisible(false);
            txtre11.setEditable(false);
            lblp6.setVisible(true);
            lblp6.setText("5");
        }
        else{
            lbluch11.setVisible(true);
            lblch11.setVisible(false);
        }
        if(re71.equals(rel71)){
            lblch13.setVisible(true);
            lbluch13.setVisible(false);
            txtre13.setEditable(false);
            lblp7.setVisible(true);
            lblp7.setText("5");
        }
        else{
            lbluch13.setVisible(true);
            lblch13.setVisible(false);
        }
        if(re81.equals(rel81)){
            lblch15.setVisible(true);
            lbluch15.setVisible(false);
            txtre15.setEditable(false);
            lblp8.setVisible(true);
            lblp8.setText("5");
        }
        else{
            lbluch15.setVisible(true);
            lblch15.setVisible(false);
        }
        if(re81.equals(rel81) && re71.equals(rel71) && re61.equals(rel61) && re51.equals(rel51) && re41.equals(rel41) && re31.equals(rel31) && re21.equals(rel21) && re11.equals(rel11)){
            btnSiguiente.setVisible(true);
        }
    }//GEN-LAST:event_btnverfActionPerformed

    private void txtre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre1KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre1KeyTyped

    private void txtre9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre9KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre9KeyTyped

    private void txtre12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre12KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre12KeyTyped

    private void txtre14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre14KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre14KeyTyped

    private void txtre10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre10KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre10KeyTyped

    private void txtre11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre11KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre11KeyTyped

    private void txtre13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre13KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre13KeyTyped

    private void txtre15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre15KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre15KeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi1=0,pi2=0,pi3=0,pi4=0,pi5=0,pi6=0,pi7=0,pi8=0,tot1=0;
        String nom=lblusu.getText();
        String ps1=lblp1.getText();
        String ps2=lblp2.getText();
        String ps3=lblp3.getText();
        String ps4=lblp4.getText();
        String ps5=lblp5.getText();
        String ps6=lblp6.getText();
        String ps7=lblp7.getText();
        String ps8=lblp8.getText();
        pi1 = Integer.parseInt(ps1);
        pi2 = Integer.parseInt(ps2);
        pi3 = Integer.parseInt(ps3);
        pi4 = Integer.parseInt(ps4);
        pi5 = Integer.parseInt(ps5);
        pi6 = Integer.parseInt(ps6);
        pi7 = Integer.parseInt(ps7);
        pi8 = Integer.parseInt(ps8);
        tot1=pi1+pi2+pi3+pi4+pi5+pi6+pi7+pi8;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
        String sql="UPDATE aritmetica SET ejercicio2 = ? WHERE nombre = '"+nom+"'";
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
        ejercicioar3 ejar3 = new ejercicioar3();
        pescrit.add(ejar3);
        ejar3.setVisible(true);
        ejar3.pack();
        ejar3.lblusu.setText(usu); 
        try {
            ejar3.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtre1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre1FocusGained
        txtre1.setText(null);
    }//GEN-LAST:event_txtre1FocusGained

    private void txtre9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre9FocusGained
        txtre9.setText(null);
    }//GEN-LAST:event_txtre9FocusGained

    private void txtre12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre12FocusGained
        txtre12.setText(null);
    }//GEN-LAST:event_txtre12FocusGained

    private void txtre14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre14FocusGained
        txtre14.setText(null);
    }//GEN-LAST:event_txtre14FocusGained

    private void txtre11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre11FocusGained
       txtre11.setText(null);
    }//GEN-LAST:event_txtre11FocusGained

    private void txtre10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre10FocusGained
        txtre10.setText(null);
    }//GEN-LAST:event_txtre10FocusGained

    private void txtre13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre13FocusGained
        txtre13.setText(null);
    }//GEN-LAST:event_txtre13FocusGained

    private void txtre15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre15FocusGained
        txtre15.setText(null);
    }//GEN-LAST:event_txtre15FocusGained
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnverf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch10;
    private javax.swing.JLabel lblch11;
    private javax.swing.JLabel lblch12;
    private javax.swing.JLabel lblch13;
    private javax.swing.JLabel lblch14;
    private javax.swing.JLabel lblch15;
    private javax.swing.JLabel lblch9;
    private javax.swing.JLabel lblmult;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp6;
    private javax.swing.JLabel lblp7;
    private javax.swing.JLabel lblp8;
    private javax.swing.JLabel lblsn1;
    private javax.swing.JLabel lblsn10;
    private javax.swing.JLabel lblsn11;
    private javax.swing.JLabel lblsn12;
    private javax.swing.JLabel lblsn13;
    private javax.swing.JLabel lblsn14;
    private javax.swing.JLabel lblsn15;
    private javax.swing.JLabel lblsn16;
    private javax.swing.JLabel lblsn2;
    private javax.swing.JLabel lblsn3;
    private javax.swing.JLabel lblsn4;
    private javax.swing.JLabel lblsn5;
    private javax.swing.JLabel lblsn6;
    private javax.swing.JLabel lblsn7;
    private javax.swing.JLabel lblsn8;
    private javax.swing.JLabel lblsn9;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch10;
    private javax.swing.JLabel lbluch11;
    private javax.swing.JLabel lbluch12;
    private javax.swing.JLabel lbluch13;
    private javax.swing.JLabel lbluch14;
    private javax.swing.JLabel lbluch15;
    private javax.swing.JLabel lbluch9;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtre1;
    private javax.swing.JTextField txtre10;
    private javax.swing.JTextField txtre11;
    private javax.swing.JTextField txtre12;
    private javax.swing.JTextField txtre13;
    private javax.swing.JTextField txtre14;
    private javax.swing.JTextField txtre15;
    private javax.swing.JTextField txtre9;
    // End of variables declaration//GEN-END:variables
}