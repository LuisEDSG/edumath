package ejercicios_arit;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import clases.conectar;
import ejercicios_geo.ejercicioge1;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ejercicioar5 extends javax.swing.JInternalFrame {
    public ejercicioar5() {
        initComponents();
        btnSiguiente.setVisible(false);
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblp5.setVisible(false);
        lblp6.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        Op1();
        Op2();
        Op3();
        Op4();
        Op5();
        Op6();
    }
    void Op1(){
        int nsi1 = (int)(Math.random()*900+10);
        int nsi2 = (int)(Math.random()*900+10);
        int nsi3 = (int)(Math.random()*900+10);
        int nsi4 = (int)(Math.random()*1000+900);
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
        lblop1.setText(ns1);
        lblop2.setText(ns2);
        lblop3.setText(ns3);
        lblop4.setText(ns4);
    }
    void Op2(){
        int nsi1 = (int)(Math.random()*900+100);
        int nsi2 = (int)(Math.random()*900+100);
        int nsi3 = (int)(Math.random()*900+100);
        int nsi4 = (int)(Math.random()*1000+900);
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
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        lblop5.setText(ns1);
        lblop6.setText(ns2);
        lblop7.setText(ns3);
        lblop8.setText(ns4);
    }
    void Op3(){
        int nsi1 = (int)(Math.random()*900+100);
        int nsi2 = (int)(Math.random()*900+100);
        int nsi3 = (int)(Math.random()*900+100);
        int nsi4 = (int)(Math.random()*900+100);
        int na=0,nb=0;
        if(nsi3>=nsi2){
            na=nsi2;
            nb=nsi3;
            nsi3=nb;
            nsi2=na;
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
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        lblop14.setText(ns1);
        lblop15.setText(ns2);
        lblop16.setText(ns3);
        lblop17.setText(ns4);
    }
    void Op4(){
        int nsi1 = (int)(Math.random()*900+100);
        int nsi2 = (int)(Math.random()*900+100);
        int nsi3 = (int)(Math.random()*1000+900);
        int nsi4 = (int)(Math.random()*900+100);
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
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= Integer.toString(nsi3);
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        lblop18.setText(ns1);
        lblop19.setText(ns2);
        lblop20.setText(ns3);
        lblop21.setText(ns4);
    }
    void Op5(){
        int nsi1 = (int)(Math.random()*900+100);
        int nsi2 = (int)(Math.random()*900+100);
        int nsi3 = (int)(Math.random()*900+100);
        int nsi4 = (int)(Math.random()*900+100);
        int nsi5 = (int)(Math.random()*1000+900);
        int na=0,nb=0;
        if(nsi4>=nsi3){
            na=nsi3;
            nb=nsi4;
            nsi3=nb;
            nsi4=na;
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
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        String ns5 = "";
        ns5 = String.valueOf(nsi5);
        ns5= Integer.toString(nsi5);
        lblop22.setText(ns1);
        lblop23.setText(ns2);
        lblop24.setText(ns3);
        lblop25.setText(ns4);
        lblop26.setText(ns5);
    }
    void Op6(){
        int nsi1 = (int)(Math.random()*900+100);
        int nsi2 = (int)(Math.random()*900+100);
        int nsi3 = (int)(Math.random()*900+100);
        int nsi4 = (int)(Math.random()*900+100);
        int nsi5 = (int)(Math.random()*1000+900);
        int na=0,nb=0;
        if(nsi4>=nsi3){
            na=nsi3;
            nb=nsi4;
            nsi3=nb;
            nsi4=na;
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
        String ns4 = "";
        ns4 = String.valueOf(nsi4);
        ns4= Integer.toString(nsi4);
        String ns5 = "";
        ns5 = String.valueOf(nsi5);
        ns5= Integer.toString(nsi5);
        lblop9.setText(ns1);
        lblop10.setText(ns2);
        lblop11.setText(ns3);
        lblop12.setText(ns4);
        lblop13.setText(ns5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnverf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblop1 = new javax.swing.JLabel();
        lblop2 = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblop3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblop4 = new javax.swing.JLabel();
        txtre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblop5 = new javax.swing.JLabel();
        lblop6 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblop7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblop8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtre3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblop9 = new javax.swing.JLabel();
        lblop10 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblop11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblop12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtre4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblop14 = new javax.swing.JLabel();
        lblop15 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblop16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblop17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtre5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblop18 = new javax.swing.JLabel();
        lblop19 = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblop20 = new javax.swing.JLabel();
        lblop21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtre6 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblop22 = new javax.swing.JLabel();
        lblop23 = new javax.swing.JLabel();
        lblch6 = new javax.swing.JLabel();
        lbluch6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblop24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblop25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblop26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblop13 = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblp5 = new javax.swing.JLabel();
        lblp6 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Operaciones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnverf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnverf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnverf.setText("Verificar");
        btnverf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverfActionPerformed(evt);
            }
        });
        jPanel1.add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("+");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 20));

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
        jPanel1.add(txtre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 70, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 20));

        lblop1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop1.setForeground(new java.awt.Color(255, 255, 255));
        lblop1.setText("n1");
        jPanel1.add(lblop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblop2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop2.setForeground(new java.awt.Color(255, 255, 255));
        lblop2.setText("n2");
        jPanel1.add(lblop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 20));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 20));

        lblop3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop3.setForeground(new java.awt.Color(255, 255, 255));
        lblop3.setText("n3");
        jPanel1.add(lblop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("x");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 20));

        lblop4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop4.setForeground(new java.awt.Color(255, 255, 255));
        lblop4.setText("n4");
        jPanel1.add(lblop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 30));

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
        jPanel1.add(txtre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 70, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" = ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 20));

        lblop5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop5.setForeground(new java.awt.Color(255, 255, 255));
        lblop5.setText("n1");
        jPanel1.add(lblop5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblop6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop6.setForeground(new java.awt.Color(255, 255, 255));
        lblop6.setText("n2");
        jPanel1.add(lblop6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        lblop7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop7.setForeground(new java.awt.Color(255, 255, 255));
        lblop7.setText("n3");
        jPanel1.add(lblop7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 20));

        lblop8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop8.setForeground(new java.awt.Color(255, 255, 255));
        lblop8.setText("n4");
        jPanel1.add(lblop8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("+");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, 20));

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
        jPanel1.add(txtre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 70, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" = ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, 20));

        lblop9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop9.setForeground(new java.awt.Color(255, 255, 255));
        lblop9.setText("n1");
        jPanel1.add(lblop9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        lblop10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop10.setForeground(new java.awt.Color(255, 255, 255));
        lblop10.setText("n2");
        jPanel1.add(lblop10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, 20));

        lblop11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop11.setForeground(new java.awt.Color(255, 255, 255));
        lblop11.setText("n3");
        jPanel1.add(lblop11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("x");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));

        lblop12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop12.setForeground(new java.awt.Color(255, 255, 255));
        lblop12.setText("n4");
        jPanel1.add(lblop12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("+");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 20));

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
        jPanel1.add(txtre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 70, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" = ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 20));

        lblop14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop14.setForeground(new java.awt.Color(255, 255, 255));
        lblop14.setText("n1");
        jPanel1.add(lblop14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        lblop15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop15.setForeground(new java.awt.Color(255, 255, 255));
        lblop15.setText("n2");
        jPanel1.add(lblop15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("-");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, 20));

        lblop16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop16.setForeground(new java.awt.Color(255, 255, 255));
        lblop16.setText("n3");
        jPanel1.add(lblop16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("x");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 20));

        lblop17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop17.setForeground(new java.awt.Color(255, 255, 255));
        lblop17.setText("n4");
        jPanel1.add(lblop17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("+");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 20));

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
        jPanel1.add(txtre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 70, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" = ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, 20));

        lblop18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop18.setForeground(new java.awt.Color(255, 255, 255));
        lblop18.setText("n1");
        jPanel1.add(lblop18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        lblop19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop19.setForeground(new java.awt.Color(255, 255, 255));
        lblop19.setText("n2");
        jPanel1.add(lblop19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 20));

        lblop20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop20.setForeground(new java.awt.Color(255, 255, 255));
        lblop20.setText("n3");
        jPanel1.add(lblop20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        lblop21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop21.setForeground(new java.awt.Color(255, 255, 255));
        lblop21.setText("n4");
        jPanel1.add(lblop21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("+");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 20));

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
        jPanel1.add(txtre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 70, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" = ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 20));

        lblop22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop22.setForeground(new java.awt.Color(255, 255, 255));
        lblop22.setText("n1");
        jPanel1.add(lblop22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblop23.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop23.setForeground(new java.awt.Color(255, 255, 255));
        lblop23.setText("n2");
        jPanel1.add(lblop23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        lblch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        lbluch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("-");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, 20));

        lblop24.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop24.setForeground(new java.awt.Color(255, 255, 255));
        lblop24.setText("n3");
        jPanel1.add(lblop24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("x");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        lblop25.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop25.setForeground(new java.awt.Color(255, 255, 255));
        lblop25.setText("n4");
        jPanel1.add(lblop25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("÷");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, 20));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("÷");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        lblop26.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop26.setForeground(new java.awt.Color(255, 255, 255));
        lblop26.setText("n5");
        jPanel1.add(lblop26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("÷");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, 20));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("÷");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 20));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("÷");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        lblop13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblop13.setForeground(new java.awt.Color(255, 255, 255));
        lblop13.setText("n5");
        jPanel1.add(lblop13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        jPanel1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        jPanel1.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        jPanel1.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        jPanel1.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, -1, 30));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        jPanel1.add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, -1, -1));

        lblp6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp6.setForeground(new java.awt.Color(255, 255, 255));
        lblp6.setText("0");
        jPanel1.add(lblp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, -1, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 530));

        lblusu.setText("jLabel9");
        jPanel1.add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
        //Op1
        String ns11=lblop1.getText();
        String ns12=lblop2.getText();
        String ns13=lblop3.getText();
        String ns14=lblop4.getText();
        String re11=txtre1.getText();
        String rel11 =" ";
        int sn12=0,sn11=0,sn13=0,sn14=0,res11=0;
        int op11=0,op12=0,op13=0;
        sn11 = Integer.parseInt(ns11);
        sn12 = Integer.parseInt(ns12);
        sn13 = Integer.parseInt(ns13);
        sn14 = Integer.parseInt(ns14);
        op11=sn11+sn12;
        op12=op11*sn13;
        op13=op12/sn14;
        res11 = op13;
        rel11 = String.valueOf(res11);
        rel11= Integer.toString(res11);
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
        //Op2
        String ns21=lblop5.getText();
        String ns22=lblop6.getText();
        String ns23=lblop7.getText();
        String ns24=lblop8.getText();
        String re21=txtre2.getText();
        String rel21 =" ";
        int sn22=0,sn21=0,sn23=0,sn24=0,res21=0;
        int op21=0,op22=0,op23=0;
        sn21 = Integer.parseInt(ns21);
        sn22 = Integer.parseInt(ns22);
        sn23 = Integer.parseInt(ns23);
        sn24 = Integer.parseInt(ns24);
        op21=sn21-sn22;
        op22=op21*sn23;
        op23=op22/sn24;
        res21 = op23;
        rel21 = String.valueOf(res21);
        rel21= Integer.toString(res21);
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
        //Op3
        String ns31=lblop14.getText();
        String ns32=lblop15.getText();
        String ns33=lblop16.getText();
        String ns34=lblop17.getText();
        String re31=txtre4.getText();
        String rel31 =" ";
        int sn32=0,sn31=0,sn33=0,sn34=0,res31=0;
        int op31=0,op32=0,op33=0;
        sn31 = Integer.parseInt(ns31);
        sn32 = Integer.parseInt(ns32);
        sn33 = Integer.parseInt(ns33);
        sn34 = Integer.parseInt(ns34);
        op31=sn31+sn32;
        op32=op31-sn33;
        op33=op32*sn34;
        res31 = op33;
        rel31 = String.valueOf(res31);
        rel31= Integer.toString(res31);
        if(re31.equals(rel31)){
            lblch4.setVisible(true);
            lbluch4.setVisible(false);
            txtre4.setEditable(false);
            lblp3.setVisible(true);
            lblp3.setText("5");
        }
        else{
            lbluch4.setVisible(true);
            lblch4.setVisible(false);
        }
        //Op4
        String ns41=lblop18.getText();
        String ns42=lblop19.getText();
        String ns43=lblop20.getText();
        String ns44=lblop21.getText();
        String re41=txtre5.getText();
        String rel41 =" ";
        int sn42=0,sn41=0,sn43=0,sn44=0,res41=0;
        int op41=0,op42=0,op43=0;
        sn41 = Integer.parseInt(ns41);
        sn42 = Integer.parseInt(ns42);
        sn43 = Integer.parseInt(ns43);
        sn44 = Integer.parseInt(ns44);
        op41=sn41-sn42;
        op42=op41/sn43;
        op43=op42+sn44;
        res41 = op43;
        rel41 = String.valueOf(res41);
        rel41= Integer.toString(res41);
        if(re41.equals(rel41)){
            lblch5.setVisible(true);
            lbluch5.setVisible(false);
            txtre5.setEditable(false);
            lblp4.setVisible(true);
            lblp4.setText("5");
        }
        else{
            lbluch5.setVisible(true);
            lblch5.setVisible(false);
        }
        //Op5
        String ns51=lblop22.getText();
        String ns52=lblop23.getText();
        String ns53=lblop24.getText();
        String ns54=lblop25.getText();
        String ns55=lblop26.getText();
        String re51=txtre6.getText();
        String rel51 =" ";
        int sn52=0,sn51=0,sn53=0,sn54=0,sn55=0,res51=0;
        int op51=0,op52=0,op53=0,op54=0;
        sn51 = Integer.parseInt(ns51);
        sn52 = Integer.parseInt(ns52);
        sn53 = Integer.parseInt(ns53);
        sn54 = Integer.parseInt(ns54);
        sn55 = Integer.parseInt(ns55);
        op51=sn51*sn52;
        op52=op51+sn53;
        op53=op52-sn54;
        op54=op53/sn55;
        res51 = op54;
        rel51 = String.valueOf(res51);
        rel51= Integer.toString(res51);
        if(re51.equals(rel51)){
            lblch6.setVisible(true);
            lbluch6.setVisible(false);
            txtre6.setEditable(false);
            lblp5.setVisible(true);
            lblp5.setText("5");
        }
        else{
            lbluch6.setVisible(true);
            lblch6.setVisible(false);
        }
        //Op6
        String ns61=lblop9.getText();
        String ns62=lblop10.getText();
        String ns63=lblop11.getText();
        String ns64=lblop12.getText();
        String ns65=lblop13.getText();
        String re61=txtre3.getText();
        String rel61 =" ";
        int sn62=0,sn61=0,sn63=0,sn64=0,sn65=0,res61=0;
        int op61=0,op62=0,op63=0,op64=0;
        sn61 = Integer.parseInt(ns61);
        sn62 = Integer.parseInt(ns62);
        sn63 = Integer.parseInt(ns63);
        sn64 = Integer.parseInt(ns64);
        sn65 = Integer.parseInt(ns65);
        op61=sn61*sn62;
        op62=op61+sn63;
        op63=op62-sn64;
        op64=op63/sn65;
        res61 = op64;
        rel61 = String.valueOf(res61);
        rel61= Integer.toString(res61);
        if(re61.equals(rel61)){
            lblch3.setVisible(true);
            lbluch3.setVisible(false);
            txtre3.setEditable(false);
            lblp6.setVisible(true);
            lblp6.setText("5");
        }
        else{
            lbluch3.setVisible(true);
            lblch3.setVisible(false);
        }
        if(re41.equals(rel41) && re31.equals(rel31) && re21.equals(rel21) && re11.equals(rel11) && re51.equals(rel51) && re61.equals(rel61) ){
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

    private void txtre6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre6KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre6KeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi1=0,pi2=0,pi3=0,pi4=0,pi5=0,pi6=0,tot1=0;
        String nom=lblusu.getText();
        String ps1=lblp1.getText();
        String ps2=lblp2.getText();
        String ps3=lblp3.getText();
        String ps4=lblp4.getText();
        String ps5=lblp5.getText();
        String ps6=lblp6.getText();
        pi1 = Integer.parseInt(ps1);
        pi2 = Integer.parseInt(ps2);
        pi3 = Integer.parseInt(ps3);
        pi4 = Integer.parseInt(ps4);
        pi5 = Integer.parseInt(ps5);
        pi6 = Integer.parseInt(ps6);
        tot1=pi1+pi2+pi3+pi4+pi5+pi6;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
         String sql="UPDATE aritmetica SET ejercicio5 = ? WHERE nombre = '"+nom+"'";
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
        ejercicioge1 ejge1 = new ejercicioge1();
        pescrit.add(ejge1);
        ejge1.pack();
        ejge1.lblusu.setText(usu);
        ejge1.setVisible(true); 
        try {
            ejge1.setMaximum(true);
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

    private void txtre6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre6FocusGained
        txtre3.setText(null);
    }//GEN-LAST:event_txtre6FocusGained

    private void txtre3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre3FocusGained
        txtre2.setText(null);
    }//GEN-LAST:event_txtre3FocusGained

    private void txtre4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre4FocusGained
        txtre4.setText(null);
    }//GEN-LAST:event_txtre4FocusGained

    private void txtre5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre5FocusGained
        txtre5.setText(null);
    }//GEN-LAST:event_txtre5FocusGained
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch3;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblch5;
    private javax.swing.JLabel lblch6;
    private javax.swing.JLabel lblop1;
    private javax.swing.JLabel lblop10;
    private javax.swing.JLabel lblop11;
    private javax.swing.JLabel lblop12;
    private javax.swing.JLabel lblop13;
    private javax.swing.JLabel lblop14;
    private javax.swing.JLabel lblop15;
    private javax.swing.JLabel lblop16;
    private javax.swing.JLabel lblop17;
    private javax.swing.JLabel lblop18;
    private javax.swing.JLabel lblop19;
    private javax.swing.JLabel lblop2;
    private javax.swing.JLabel lblop20;
    private javax.swing.JLabel lblop21;
    private javax.swing.JLabel lblop22;
    private javax.swing.JLabel lblop23;
    private javax.swing.JLabel lblop24;
    private javax.swing.JLabel lblop25;
    private javax.swing.JLabel lblop26;
    private javax.swing.JLabel lblop3;
    private javax.swing.JLabel lblop4;
    private javax.swing.JLabel lblop5;
    private javax.swing.JLabel lblop6;
    private javax.swing.JLabel lblop7;
    private javax.swing.JLabel lblop8;
    private javax.swing.JLabel lblop9;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp6;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    private javax.swing.JLabel lbluch5;
    private javax.swing.JLabel lbluch6;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtre1;
    private javax.swing.JTextField txtre2;
    private javax.swing.JTextField txtre3;
    private javax.swing.JTextField txtre4;
    private javax.swing.JTextField txtre5;
    private javax.swing.JTextField txtre6;
    // End of variables declaration//GEN-END:variables
}