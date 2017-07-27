package ejercicios_arit;
import EduMat.usur;
import static EduMat.usur.pescrit;
import clases.conectar;
import static ejercicios_arit.ejercicioar3.lblusu;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ejercicioar4 extends javax.swing.JInternalFrame {
    public ejercicioar4() {
        initComponents();
        btnSiguiente.setVisible(false);
        sumra();
        resta();
        mult();
        div();
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
    }
    void sumra(){
        DecimalFormat formateador = new DecimalFormat("##.##");
        String nsi1 = formateador.format((double)(Math.random()*90+10));
        String nsi2 = formateador.format((double)(Math.random()*90+10));
        String nsi3 = formateador.format((double)(Math.random()*90+10));
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= nsi1;
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= nsi2;
        String ns3 = "";
        ns3 = String.valueOf(nsi3);
        ns3= nsi3;
        lblsn1.setText(ns1);
        lblsn2.setText(ns2);
        lblsn3.setText(ns3);
    }
    void resta(){
        DecimalFormat formateador = new DecimalFormat("##.##");
        double nsi1 = (double) (Math.random()*90+10);
        double nsi2 = (double) (Math.random()*90+10);
        double na=0,nb=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        String ni1 = formateador.format(nsi1);
        String ns1 = "";
        ns1 = String.valueOf(ni1);
        String ni2 = formateador.format(nsi2);
        String ns2 = "";
        ns2 = String.valueOf(ni2);
        lblsn14.setText(ns1);
        lblsn13.setText(ns2);
    }
    void mult(){
        DecimalFormat formateador = new DecimalFormat("##.##");
        String nsi1 = formateador.format((double)(Math.random()*90+10));
        String nsi2 = formateador.format((double)(Math.random()*90+10));
        String ns1 = "";
        ns1 = String.valueOf(nsi1);
        ns1= nsi1;
        String ns2 = "";
        ns2 = String.valueOf(nsi2);
        ns2= nsi2;
        lblsn5.setText(ns1);
        lblsn6.setText(ns2);
    }
    void div(){
        DecimalFormat formateador = new DecimalFormat("##.##");
        double nsi1 = (double) (Math.random()*90+10);
        double nsi2 = (double) (Math.random()*90+10);
        double na=0,nb=0;
        if(nsi2>=nsi1){
            na=nsi1;
            nb=nsi2;
            nsi1=nb;
            nsi2=na;        
        }
        String ni1 = formateador.format(nsi1);
        String ns1 = "";
        ns1 = String.valueOf(ni1);
        String ni2 = formateador.format(nsi2);
        String ns2 = "";
        ns2 = String.valueOf(ni2);
        lbln1d.setText(ns1);
        lbln2d.setText(ns2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnverf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblsn1 = new javax.swing.JLabel();
        lblsn2 = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lblsn3 = new javax.swing.JLabel();
        txtre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblsn5 = new javax.swing.JLabel();
        lblsn6 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtre4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblsn13 = new javax.swing.JLabel();
        lblsn14 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        txtre5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lbln1d = new javax.swing.JLabel();
        lbln2d = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Operaciones ");
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
        jPanel1.add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("+");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 20));

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
        jPanel1.add(txtre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        lblsn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn1.setForeground(new java.awt.Color(255, 255, 255));
        lblsn1.setText("n1");
        jPanel1.add(lblsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblsn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn2.setForeground(new java.awt.Color(255, 255, 255));
        lblsn2.setText("n2");
        jPanel1.add(lblsn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        lblsn3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn3.setForeground(new java.awt.Color(255, 255, 255));
        lblsn3.setText("n3");
        jPanel1.add(lblsn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

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
        jPanel1.add(txtre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" = ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        lblsn5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn5.setForeground(new java.awt.Color(255, 255, 255));
        lblsn5.setText("n1");
        jPanel1.add(lblsn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        lblsn6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn6.setForeground(new java.awt.Color(255, 255, 255));
        lblsn6.setText("n2");
        jPanel1.add(lblsn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        txtre4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtre4.setText("0");
        txtre4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtre4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtre4FocusLost(evt);
            }
        });
        txtre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtre4KeyTyped(evt);
            }
        });
        jPanel1.add(txtre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" = ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 20));

        lblsn13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn13.setForeground(new java.awt.Color(255, 255, 255));
        lblsn13.setText("n1");
        jPanel1.add(lblsn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        lblsn14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn14.setForeground(new java.awt.Color(255, 255, 255));
        lblsn14.setText("n2");
        jPanel1.add(lblsn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

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
        jPanel1.add(txtre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" = ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, 20));

        lbln1d.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbln1d.setForeground(new java.awt.Color(255, 255, 255));
        lbln1d.setText("n1");
        jPanel1.add(lbln1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        lbln2d.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbln2d.setForeground(new java.awt.Color(255, 255, 255));
        lbln2d.setText("n2");
        jPanel1.add(lbln2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("+");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("-");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 10, 20));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("÷");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, 20));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        jPanel1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        jPanel1.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        jPanel1.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        jPanel1.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, 30));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        lblusu.setText("jLabel9");
        jPanel1.add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
        DecimalFormat df = new DecimalFormat("##.##");
        //Suma  
        String ns11=lblsn1.getText();
        String ns12=lblsn2.getText();
        String ns13=lblsn3.getText();
        String re11=txtre1.getText();
        String rel11 ="";
        double sn12,sn11,sn13,res11; 
        sn11 = Double.parseDouble(ns11);
        sn12 = Double.parseDouble(ns12);
        sn13 = Double.parseDouble(ns13);
        res11 = sn12+sn11+sn13;
        rel11 = String.valueOf(res11);
        rel11= Double.toString(res11);
        String result = df.format(res11);
        //Rest
        String ns21=lblsn13.getText();
        String ns22=lblsn14.getText();
        String re21=txtre4.getText();
        String rel21 ="";
        double sn22,sn21,res21;
        sn21 = Double.parseDouble(ns21);
        sn22 = Double.parseDouble(ns22);
        res21 = sn21-sn22;
        rel21 = String.valueOf(res21);
        rel21= Double.toString(res21);
        String result1 = df.format(res21);
        //Mult
        String ns31=lblsn5.getText();
        String ns32=lblsn6.getText();
        String re31=txtre2.getText();
        String rel31 ="";
        double sn32,sn31,res31;
        sn31 = Double.parseDouble(ns31);
        sn32 = Double.parseDouble(ns32);
        res31 = sn31*sn32;
        rel31 = String.valueOf(res31);
        rel31= Double.toString(res31);
        String result2 = df.format(res31);
        //Div
        String ns41=lbln1d.getText();
        String ns42=lbln2d.getText();
        String re41=txtre5.getText();
        String rel41 ="";
        double sn42,sn41,res41;
        sn41 = Double.parseDouble(ns41);
        sn42 = Double.parseDouble(ns42);
        res41 = sn42/sn41;
        rel41 = String.valueOf(res41);
        rel41= Double.toString(res41);
        String result3 = df.format(res41);
        if(re11.equals(result)){
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
        if(re21.equals(result1)){
            lblch4.setVisible(true);
            lbluch4.setVisible(false);
            txtre4.setEditable(false);
            lblp2.setVisible(true);
            lblp2.setText("5");
        }
        else{
            lbluch4.setVisible(true);
            lblch4.setVisible(false);
        }
        if(re31.equals(result2)){
            lblch2.setVisible(true);
            lbluch2.setVisible(false);
            txtre2.setEditable(false);
            lblp3.setVisible(true);
            lblp3.setText("5");
        }
        else{
            lbluch2.setVisible(true);
            lblch2.setVisible(false);
        }
        if(re41.equals(result3)){
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
        if(re41.equals(rel41) && re31.equals(rel31) && re21.equals(rel21) && re11.equals(rel11)){
            btnSiguiente.setVisible(true);
        }
    }//GEN-LAST:event_btnverfActionPerformed
    private void txtre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtre1.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtre1KeyTyped
    private void txtre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtre2.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtre2KeyTyped
    private void txtre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre4KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtre4.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtre4KeyTyped
    private void txtre5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre5KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtre5.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtre5KeyTyped

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
         String sql="UPDATE aritmetica SET ejercicio4 = ? WHERE nombre = '"+nom+"'";
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
        ejercicioar5 ejar5 = new ejercicioar5();
        pescrit.add(ejar5);
        ejar5.setVisible(true);
        ejar5.pack();
        ejar5.lblusu.setText(usu); 
        try {
            ejar5.setMaximum(true);
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

    private void txtre4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtre4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtre4FocusLost

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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblch1;
    private javax.swing.JLabel lblch2;
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblch5;
    private javax.swing.JLabel lbln1d;
    private javax.swing.JLabel lbln2d;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblsn1;
    private javax.swing.JLabel lblsn13;
    private javax.swing.JLabel lblsn14;
    private javax.swing.JLabel lblsn2;
    private javax.swing.JLabel lblsn3;
    private javax.swing.JLabel lblsn5;
    private javax.swing.JLabel lblsn6;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch4;
    private javax.swing.JLabel lbluch5;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JTextField txtre1;
    private javax.swing.JTextField txtre2;
    private javax.swing.JTextField txtre4;
    private javax.swing.JTextField txtre5;
    // End of variables declaration//GEN-END:variables
}