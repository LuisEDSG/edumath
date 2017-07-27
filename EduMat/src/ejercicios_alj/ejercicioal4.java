package ejercicios_alj;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import java.beans.PropertyVetoException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class ejercicioal4 extends javax.swing.JInternalFrame {
    public ejercicioal4() {
        initComponents();
        btnSiguiente.setVisible(false);
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        sumal1();
        sumal2();
        sumal3();
        sumal4();
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
    }
    void sumal1(){
        int nsi1 = (int) (Math.random()*-90-10);
        int nsi2 = (int) (Math.random()*-90-10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lbln1s1.setText(ns1);
        lbln2s1.setText(ns2);
    }
    void sumal2(){
        int nsi1 = (int) (Math.random()*-90-10);
        int nsi2 = (int) (Math.random()*-90-10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lbln1r4.setText(ns1);
        lbln2r4.setText(ns2);
    }
    void sumal3(){
        int nsi1 = (int) (Math.random()*90+10);
        int nsi2 = (int) (Math.random()*-90-10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lbln1r3.setText(ns1);
        lbln2r3.setText(ns2);
    }
    void sumal4(){
        int nsi1 = (int) (Math.random()*90+10);
        int nsi2 = (int) (Math.random()*-90-10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lbln1s2.setText(ns1);
        lbln2s2.setText(ns2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnguardar = new javax.swing.JButton();
        lbln2s1 = new javax.swing.JLabel();
        lbln1s1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbln1s2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbln2s2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbln1r3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbln2r3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbln1r4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbln2r4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtr4 = new javax.swing.JTextField();
        txtr3 = new javax.swing.JTextField();
        txtr1 = new javax.swing.JTextField();
        txtr2 = new javax.swing.JTextField();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        lblp1 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ejercicios con Ley de signos Multiplicacion");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        lbln2s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2s1.setForeground(new java.awt.Color(255, 255, 255));
        lbln2s1.setText("N2");
        getContentPane().add(lbln2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        lbln1s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1s1.setForeground(new java.awt.Color(255, 255, 255));
        lbln1s1.setText("N1");
        getContentPane().add(lbln1s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(")");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("x");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(")");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(+");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lbln1s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1s2.setForeground(new java.awt.Color(255, 255, 255));
        lbln1s2.setText("N1");
        getContentPane().add(lbln1s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(")");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("x");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("(");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        lbln2s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2s2.setForeground(new java.awt.Color(255, 255, 255));
        lbln2s2.setText("N2");
        getContentPane().add(lbln2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(")");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("=");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("(+");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        lbln1r3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1r3.setForeground(new java.awt.Color(255, 255, 255));
        lbln1r3.setText("N1");
        getContentPane().add(lbln1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(")");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("(");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        lbln2r3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2r3.setForeground(new java.awt.Color(255, 255, 255));
        lbln2r3.setText("N2");
        getContentPane().add(lbln2r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(")");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("=");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("(");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        lbln1r4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1r4.setForeground(new java.awt.Color(255, 255, 255));
        lbln1r4.setText("N1");
        getContentPane().add(lbln1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(")");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("x");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("(");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        lbln2r4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2r4.setForeground(new java.awt.Color(255, 255, 255));
        lbln2r4.setText("N2");
        getContentPane().add(lbln2r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText(")");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("=");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 120, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("x");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        txtr4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtr4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr4KeyTyped(evt);
            }
        });
        getContentPane().add(txtr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 70, -1));

        txtr3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtr3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr3KeyTyped(evt);
            }
        });
        getContentPane().add(txtr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 70, -1));

        txtr1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr1KeyTyped(evt);
            }
        });
        getContentPane().add(txtr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 70, -1));

        txtr2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtr2KeyTyped(evt);
            }
        });
        getContentPane().add(txtr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 70, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 100, 30));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        getContentPane().add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        getContentPane().add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        getContentPane().add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Utilizando la ley de signos resuelve las siguientes operaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String ns11=lbln1s1.getText();
        String ns12=lbln2s1.getText();
        String re11=txtr1.getText();
        String rel11 =" ";
        int sn12 = 0,sn11=0,res11=0;
        sn11 = Integer.parseInt(ns11);
        sn12 = Integer.parseInt(ns12);
        res11 = sn11*sn12;
        rel11 = String.valueOf(res11);
        rel11= Integer.toString(res11);
        if(re11.equals(rel11)){
            lblch1.setVisible(true);
            lbluch1.setVisible(false);
            txtr1.setEditable(false);
            lblp1.setVisible(true);
            lblp1.setText("5");
        }
        else{
            lbluch1.setVisible(true);
            lblch1.setVisible(false);
        }
        String ns21=lbln1r3.getText();
        String ns22=lbln2r3.getText();
        String re21=txtr3.getText();
        String rel21 =" ";
        int sn22 = 0,sn21=0,res21=0;
        sn21 = Integer.parseInt(ns21);
        sn22 = Integer.parseInt(ns22);
        res21 = sn21*sn22;
        rel21 = String.valueOf(res21);
        rel21= Integer.toString(res21);
        if(re21.equals(rel21)){
            lblch3.setVisible(true);
            lbluch3.setVisible(false);
            txtr3.setEditable(false);
            lblp2.setVisible(true);
            lblp2.setText("5");
        }
        else{
            lbluch3.setVisible(true);
            lblch3.setVisible(false);
        }
        String ns31=lbln1s2.getText();
        String ns32=lbln2s2.getText();
        String re31=txtr2.getText();
        String rel31 =" ";
        int sn32 = 0,sn31=0,res31=0;
        sn31 = Integer.parseInt(ns31);
        sn32 = Integer.parseInt(ns32);
        res31 = sn31*sn32;
        rel31 = String.valueOf(res31);
        rel31= Integer.toString(res31);
        if(re31.equals(rel31)){
            lblch2.setVisible(true);
            lbluch2.setVisible(false);
            txtr2.setEditable(false);
            lblp3.setVisible(true);
            lblp3.setText("5");
        }
        else{
            lbluch2.setVisible(true);
            lblch2.setVisible(false);
        }
        String ns41=lbln1r4.getText();
        String ns42=lbln2r4.getText();
        String re41=txtr4.getText();
        String rel41 =" ";
        int sn42 = 0,sn41=0,res41=0;
        sn41 = Integer.parseInt(ns41);
        sn42 = Integer.parseInt(ns42);
        res41 = sn41*sn42;
        rel41 = String.valueOf(res41);
        rel41= Integer.toString(res41);
        if(re41.equals(rel41)){
            lblch4.setVisible(true);
            lbluch4.setVisible(false);
            txtr4.setEditable(false);
            lblp4.setVisible(true);
            lblp4.setText("5");
        }
        else{
            lbluch4.setVisible(true);
            lblch4.setVisible(false);
        }
        if(re11.equals(rel11) && re21.equals(rel21) && re31.equals(rel31) && re41.equals(rel41)){
            btnSiguiente.setVisible(true);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed
    private void txtr4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr4KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='-' && txtr4.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtr4KeyTyped
    private void txtr3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr3KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='-' && txtr3.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtr3KeyTyped
    private void txtr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='-' && txtr1.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtr1KeyTyped
    private void txtr2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='-' && txtr2.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtr2KeyTyped
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioal5 ejal5 = new ejercicioal5();
        pescrit.add(ejal5);
        ejal5.setVisible(true);
        ejal5.pack();
        ejal5.lblusu.setText(usu);
        try {
            ejal5.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
        String sql="UPDATE algebra SET ejercicio4 = ? WHERE nombre = '"+nom+"'";
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
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lbln1r3;
    private javax.swing.JLabel lbln1r4;
    private javax.swing.JLabel lbln1s1;
    private javax.swing.JLabel lbln1s2;
    private javax.swing.JLabel lbln2r3;
    private javax.swing.JLabel lbln2r4;
    private javax.swing.JLabel lbln2s1;
    private javax.swing.JLabel lbln2s2;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtr1;
    private javax.swing.JTextField txtr2;
    private javax.swing.JTextField txtr3;
    private javax.swing.JTextField txtr4;
    // End of variables declaration//GEN-END:variables
}
