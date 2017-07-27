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
public class ejercicioar1 extends javax.swing.JInternalFrame {
    public ejercicioar1() {
        initComponents();
        sumal1();
        sumal2();
        sumal3();
        sumal4();
        restl1();
        restl2();
        restl3();
        restl4();
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
        lblch7.setVisible(false);
        lbluch7.setVisible(false);
        lblch8.setVisible(false);
        lbluch8.setVisible(false);
        btnSiguiente.setVisible(false);
    }
    void sumal1(){
        int nsi1 = (int) (Math.random()*90+10);
        int nsi2 = (int) (Math.random()*90+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn1.setText(ns1);
        lblsn2.setText(ns2);
    }
    void sumal2(){
        int nsi1 = (int) (Math.random()*100+10);
        int nsi2 = (int) (Math.random()*100+10);
        int nsi3 = (int) (Math.random()*100+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        jLabel1.setText(ns1);
        jLabel5.setText(ns2);
        jLabel7.setText(ns3);
    }
    void sumal3(){
        int nsi1 = (int) (Math.random()*100+10);
        int nsi2 = (int) (Math.random()*100+10);
        int nsi3 = (int) (Math.random()*100+10);
        int nsi4 = (int) (Math.random()*100+10);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        jLabel17.setText(ns1);
        jLabel19.setText(ns2);
        jLabel21.setText(ns3);
        jLabel23.setText(ns4);
    }
    void sumal4(){
        int nsi1 = (int) (Math.random()*1000+100);
        int nsi2 = (int) (Math.random()*1000+100);
        int nsi3 = (int) (Math.random()*1000+100);
        int nsi4 = (int) (Math.random()*1000+100);
        int nsi5 = (int) (Math.random()*1000+100);
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        String ns5 = "";
        ns5 = String.valueOf(nsi5);
        ns5= Integer.toString(nsi5);
        jLabel25.setText(ns1);
        jLabel27.setText(ns2);
        jLabel29.setText(ns3);
        jLabel34.setText(ns4);
        jLabel31.setText(ns5);
    }
    void restl1(){
        int nsi1 = (int) (Math.random()*9+1);
        int nsi2 = (int) (Math.random()*9+1);
        int na=0,nb=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        lblsn5.setText(ns1);
        lblsn6.setText(ns2);
    }
    void restl2(){
        int nsi1 = (int) (Math.random()*100+1);
        int nsi2 = (int) (Math.random()*100+1);
        int nsi3 = (int) (Math.random()*100+1);
        int na=0,nb=0,nc=0,nd=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        if(nsi3>=nsi2){
            nc=nsi2;
            nd=nsi3;
            nsi2=nb;
            nsi3=na;        
        }
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        jLabel35.setText(ns1);
        jLabel42.setText(ns2);
        jLabel49.setText(ns3);
    }
    void restl3(){
        int nsi1 = (int) (Math.random()*1000+100);
        int nsi2 = (int) (Math.random()*1000+100);
        int na=0,nb=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        jLabel36.setText(ns1);
        jLabel43.setText(ns2);
    }
    void restl4(){
        int nsi1 = (int) (Math.random()*1000+1000);
        int nsi2 = (int) (Math.random()*1000+1000);
        int na=0,nb=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= Integer.toString(nsi1);
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= Integer.toString(nsi2);
        jLabel37.setText(ns1);
        jLabel44.setText(ns2);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtre2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtre3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtre4 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblsn5 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblsn6 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtre5 = new javax.swing.JTextField();
        txtre6 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtre7 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtre8 = new javax.swing.JTextField();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        lblch6 = new javax.swing.JLabel();
        lbluch6 = new javax.swing.JLabel();
        lbluch7 = new javax.swing.JLabel();
        lblch7 = new javax.swing.JLabel();
        lblch8 = new javax.swing.JLabel();
        lbluch8 = new javax.swing.JLabel();
        lblsum = new javax.swing.JLabel();
        lblres = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp5 = new javax.swing.JLabel();
        lblp6 = new javax.swing.JLabel();
        lblp7 = new javax.swing.JLabel();
        lblp8 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Suma y Resta");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("+");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 20));

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
        jPanel1.add(txtre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 20));

        btnverf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnverf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnverf.setText("Verificar");
        btnverf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverfActionPerformed(evt);
            }
        });
        jPanel1.add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        lblsn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn1.setForeground(new java.awt.Color(255, 255, 255));
        lblsn1.setText("n1");
        jPanel1.add(lblsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lblsn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn2.setForeground(new java.awt.Color(255, 255, 255));
        lblsn2.setText("n2");
        jPanel1.add(lblsn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("n1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("+");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("n2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("+");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("n3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("=");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtre2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre2.setText("0");
        txtre2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre2FocusGained(evt);
            }
        });
        txtre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre2KeyTyped(evt);
            }
        });
        jPanel1.add(txtre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("n1");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("+");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("n2");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("+");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("n3");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("=");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        txtre3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre3.setText("0");
        txtre3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre3FocusGained(evt);
            }
        });
        txtre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre3KeyTyped(evt);
            }
        });
        jPanel1.add(txtre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("n4");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("+");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("n1");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("+");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("n2");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("+");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("n3");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("+");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("n5");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("=");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        txtre4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre4.setText("0");
        txtre4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre4FocusGained(evt);
            }
        });
        txtre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre4KeyTyped(evt);
            }
        });
        jPanel1.add(txtre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 70, -1));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("+");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("n4");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        lblsn5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn5.setForeground(new java.awt.Color(255, 255, 255));
        lblsn5.setText("n1");
        jPanel1.add(lblsn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("n1");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("n1");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("n1");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("-");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("-");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        jLabel40.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("-");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        jLabel41.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("-");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 10, 20));

        lblsn6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn6.setForeground(new java.awt.Color(255, 255, 255));
        lblsn6.setText("n2");
        jPanel1.add(lblsn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("n2");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel43.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("n2");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel44.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("n2");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        jLabel47.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("-");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel48.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText(" = ");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 20));

        jLabel49.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("n3");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        jLabel54.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("=");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        txtre5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre5.setText("0");
        txtre5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre5FocusGained(evt);
            }
        });
        txtre5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre5KeyTyped(evt);
            }
        });
        jPanel1.add(txtre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 70, -1));

        txtre6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre6.setText("0");
        txtre6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre6FocusGained(evt);
            }
        });
        txtre6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre6KeyTyped(evt);
            }
        });
        jPanel1.add(txtre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 70, -1));

        jLabel58.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("=");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        txtre7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre7.setText("0");
        txtre7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre7FocusGained(evt);
            }
        });
        txtre7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre7KeyTyped(evt);
            }
        });
        jPanel1.add(txtre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 70, -1));

        jLabel60.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("=");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        txtre8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre8.setText("0");
        txtre8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre8FocusGained(evt);
            }
        });
        txtre8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre8KeyTyped(evt);
            }
        });
        jPanel1.add(txtre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 70, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        lblch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        lbluch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        lbluch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        lblch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        lblch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        lbluch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        lblsum.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblsum.setForeground(new java.awt.Color(255, 255, 255));
        lblsum.setText("Sumas");
        jPanel1.add(lblsum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lblres.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblres.setForeground(new java.awt.Color(255, 255, 255));
        lblres.setText("Restas");
        jPanel1.add(lblres, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        jPanel1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        jPanel1.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        jPanel1.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        jPanel1.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        jPanel1.add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        lblp6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp6.setForeground(new java.awt.Color(255, 255, 255));
        lblp6.setText("0");
        jPanel1.add(lblp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        lblp7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp7.setForeground(new java.awt.Color(255, 255, 255));
        lblp7.setText("0");
        jPanel1.add(lblp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        lblp8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp8.setForeground(new java.awt.Color(255, 255, 255));
        lblp8.setText("0");
        jPanel1.add(lblp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, -1, 30));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        lblusu.setText("jLabel9");
        jPanel1.add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
        //Suma1
        String ns11=lblsn1.getText();
        String ns12=lblsn2.getText();
        String re11=txtre1.getText();
        String rel11 =" ";
        int sn12 = 0,sn11=0,res11=0;
        sn11 = Integer.parseInt(ns11);
        sn12 = Integer.parseInt(ns12);
        res11 = sn11+sn12;
        rel11 = String.valueOf(res11);
        rel11= Integer.toString(res11);
        //Suma2
        String ns21=jLabel1.getText();
        String ns22=jLabel5.getText();
        String ns23=jLabel7.getText();
        String re21=txtre2.getText();
        String rel21 ="";
        int sn22 = 0,sn21=0,res21=0,sn23=0;
        sn21 = Integer.parseInt(ns21);
        sn22 = Integer.parseInt(ns22);
        sn23 = Integer.parseInt(ns23);
        res21 = sn21+sn22+sn23;
        rel21 = String.valueOf(res21);
        rel21= Integer.toString(res21);
        //Suma3
        String ns31=jLabel17.getText();
        String ns32=jLabel19.getText();
        String ns33=jLabel21.getText();
        String ns34=jLabel23.getText();
        String re31=txtre3.getText();
        String rel31 ="";
        int sn32=0,sn31=0,res31=0,sn33=0,sn34=0;
        sn31 = Integer.parseInt(ns31);
        sn32 = Integer.parseInt(ns32);
        sn33 = Integer.parseInt(ns33);
        sn34 = Integer.parseInt(ns34);
        res31 = sn31+sn32+sn33+sn34;
        rel31 = String.valueOf(res31);
        rel31= Integer.toString(res31);
        //Suma4
        String ns41=jLabel25.getText();
        String ns42=jLabel27.getText();
        String ns43=jLabel29.getText();
        String ns44=jLabel34.getText();
        String ns45=jLabel31.getText();
        String re41=txtre4.getText();
        String rel41 ="";
        int sn42=0,sn41=0,res41=0,sn43=0,sn44=0,sn45=0;
        sn41 = Integer.parseInt(ns41);
        sn42 = Integer.parseInt(ns42);
        sn43 = Integer.parseInt(ns43);
        sn44 = Integer.parseInt(ns44);
        sn45 = Integer.parseInt(ns45);
        res41 = sn41+sn42+sn43+sn44+sn45;
        rel41 = String.valueOf(res41);
        rel41= Integer.toString(res41);
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
            lblch2.setVisible(true);
            lbluch2.setVisible(false);
            txtre2.setEditable(false);
            lblp2.setVisible(true);
            lblp2.setText("5");
        }
        else{
            lbluch2.setVisible(true);
            lblch2.setVisible(false);
        }
        if(re31.equals(rel31)){
            lblch3.setVisible(true);
            lbluch3.setVisible(false);
            txtre3.setEditable(false);
            lblp4.setVisible(true);
            lblp4.setText("5");
        }
        else{
            lbluch3.setVisible(true);
            lblch3.setVisible(false);
        }
        if(re41.equals(rel41)){
            lblch4.setVisible(true);
            lbluch4.setVisible(false);
            txtre4.setEditable(false);
            lblp8.setVisible(true);
            lblp8.setText("5");
        }
        else{
            lbluch4.setVisible(true);
            lblch4.setVisible(false);
        }
        //Resta1
        String nr11=lblsn5.getText();
        String nr12=lblsn6.getText();
        String rer11=txtre5.getText();
        String rerl11 ="";
        int rn12=0,rn11=0,resr11=0;
        rn11 = Integer.parseInt(nr11);
        rn12 = Integer.parseInt(nr12);
        resr11 = rn11-rn12;
        rerl11 = String.valueOf(resr11);
        rerl11= Integer.toString(resr11);
        //Resta2
        String nr21=jLabel35.getText();
        String nr22=jLabel42.getText();
        String nr23=jLabel49.getText();
        String rer21=txtre6.getText();
        String rerl21 ="";
        int rn22=0,rn21=0,rn23=0,resr21=0;
        rn21 = Integer.parseInt(nr21);
        rn22 = Integer.parseInt(nr22);
        rn23 = Integer.parseInt(nr23);
        resr21 = rn21-rn22-rn23;
        rerl21 = String.valueOf(resr21);
        rerl21= Integer.toString(resr21);
        //Resta3
        String nr31=jLabel36.getText();
        String nr32=jLabel43.getText();
        String rer31=txtre7.getText();
        String rerl31 ="";
        int rn32=0,rn31=0,resr31=0;
        rn31 = Integer.parseInt(nr31);
        rn32 = Integer.parseInt(nr32);
        resr31 = rn31-rn32;
        rerl31 = String.valueOf(resr31);
        rerl31= Integer.toString(resr31);
        //Resta4
        String nr41=jLabel37.getText();
        String nr42=jLabel44.getText();
        String rer41=txtre8.getText();
        String rerl41 ="";
        int rn42=0,rn41=0,resr41=0;
        rn41 = Integer.parseInt(nr41);
        rn42 = Integer.parseInt(nr42);
        resr41 = rn41-rn42;
        rerl41 = String.valueOf(resr41);
        rerl41= Integer.toString(resr41);
        if(rer11.equals(rerl11)){
            lblch5.setVisible(true);
            lbluch5.setVisible(false);
            txtre5.setEditable(false);
            lblp5.setVisible(true);
            lblp5.setText("5");
        }
        else{
            lbluch5.setVisible(true);
            lblch5.setVisible(false);
        }
        if(rer21.equals(rerl21)){
            lblch6.setVisible(true);
            lbluch6.setVisible(false);
            txtre6.setEditable(false);
            lblp6.setVisible(true);
            lblp6.setText("5");
        }
        else{
            lbluch6.setVisible(true);
            lblch6.setVisible(false);
        }
        if(rer31.equals(rerl31)){
            lblch7.setVisible(true);
            lbluch7.setVisible(false);
            txtre7.setEditable(false);
            lblp7.setVisible(true);
            lblp7.setText("5");
        }
        else{
            lbluch7.setVisible(true);
            lblch7.setVisible(false);
        }
        if(rer41.equals(rerl41)){
            lblch8.setVisible(true);
            lbluch8.setVisible(false);
            txtre8.setEditable(false);
            lblp8.setVisible(true);
            lblp8.setText("5");
        }
        else{
            lbluch8.setVisible(true);
            lblch8.setVisible(false);
        }
        if(rer41.equals(rerl41) && rer31.equals(rerl31) && rer21.equals(rerl21) && rer11.equals(rerl11) && re41.equals(rel41) && re31.equals(rel31) && re21.equals(rel21) && re11.equals(rel11)){
            btnSiguiente.setVisible(true);
        }
    }//GEN-LAST:event_btnverfActionPerformed
    private void txtre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre1KeyTyped
         char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre1KeyTyped
    private void txtre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre2KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre2KeyTyped
    private void txtre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre3KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre3KeyTyped
    private void txtre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre4KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre4KeyTyped
    private void txtre5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre5KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre5KeyTyped
    private void txtre7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre7KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre7KeyTyped
    private void txtre6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre6KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre6KeyTyped
    private void txtre8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre8KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre8KeyTyped
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
        String sql="INSERT INTO aritmetica (`nombre`,`ejercicio1`) VALUES (?,?)";
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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioar2 ejar2 = new ejercicioar2();
        pescrit.add(ejar2);
        ejar2.setVisible(true);
        ejar2.pack();
        ejar2.lblusu.setText(usu); 
        try {
            ejar2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtre1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre1FocusGained
        txtre1.setText(null);
    }//GEN-LAST:event_txtre1FocusGained

    private void txtre2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre2FocusGained
        txtre2.setText(null);
    }//GEN-LAST:event_txtre2FocusGained

    private void txtre3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre3FocusGained
        txtre3.setText(null);
    }//GEN-LAST:event_txtre3FocusGained

    private void txtre4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre4FocusGained
        txtre4.setText(null);
    }//GEN-LAST:event_txtre4FocusGained

    private void txtre5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre5FocusGained
        txtre5.setText(null);
    }//GEN-LAST:event_txtre5FocusGained

    private void txtre6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre6FocusGained
        txtre6.setText(null);
    }//GEN-LAST:event_txtre6FocusGained

    private void txtre7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre7FocusGained
        txtre7.setText(null);
    }//GEN-LAST:event_txtre7FocusGained

    private void txtre8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre8FocusGained
        txtre8.setText(null);
    }//GEN-LAST:event_txtre8FocusGained
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnverf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblch5;
    private javax.swing.JLabel lblch6;
    private javax.swing.JLabel lblch7;
    private javax.swing.JLabel lblch8;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp6;
    private javax.swing.JLabel lblp7;
    private javax.swing.JLabel lblp8;
    private javax.swing.JLabel lblres;
    private javax.swing.JLabel lblsn1;
    private javax.swing.JLabel lblsn2;
    private javax.swing.JLabel lblsn5;
    private javax.swing.JLabel lblsn6;
    private javax.swing.JLabel lblsum;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    private javax.swing.JLabel lbluch5;
    private javax.swing.JLabel lbluch6;
    private javax.swing.JLabel lbluch7;
    private javax.swing.JLabel lbluch8;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtre1;
    private javax.swing.JTextField txtre2;
    private javax.swing.JTextField txtre3;
    private javax.swing.JTextField txtre4;
    private javax.swing.JTextField txtre5;
    private javax.swing.JTextField txtre6;
    private javax.swing.JTextField txtre7;
    private javax.swing.JTextField txtre8;
    // End of variables declaration//GEN-END:variables
}