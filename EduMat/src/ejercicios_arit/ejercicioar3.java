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
public class ejercicioar3 extends javax.swing.JInternalFrame {
    public ejercicioar3() {
        
        initComponents();
        btnSiguiente.setVisible(false);
        divl1();
        divl2();
        divl3();
        divl4();
        divl5();
        divl6();
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
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        lblch5.setVisible(false);
        lbluch5.setVisible(false);
        lblch6.setVisible(false);
        lbluch6.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblsn1 = new javax.swing.JLabel();
        lblsn2 = new javax.swing.JLabel();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtre2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblsn3 = new javax.swing.JLabel();
        lblsn4 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtre3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblsn5 = new javax.swing.JLabel();
        lblsn6 = new javax.swing.JLabel();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtre4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblsn7 = new javax.swing.JLabel();
        lblsn8 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtre5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblsn9 = new javax.swing.JLabel();
        lblsn10 = new javax.swing.JLabel();
        lblch5 = new javax.swing.JLabel();
        lbluch5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtre6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblsn11 = new javax.swing.JLabel();
        lblsn12 = new javax.swing.JLabel();
        lblch6 = new javax.swing.JLabel();
        lbluch6 = new javax.swing.JLabel();
        btnverf = new javax.swing.JButton();
        lbldiv = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp6 = new javax.swing.JLabel();
        lblp5 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Divisiones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("÷");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 20));

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
        jPanel1.add(txtre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 70, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 20));

        lblsn1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn1.setForeground(new java.awt.Color(255, 255, 255));
        lblsn1.setText("n1");
        jPanel1.add(lblsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lblsn2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn2.setForeground(new java.awt.Color(255, 255, 255));
        lblsn2.setText("n2");
        jPanel1.add(lblsn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("÷");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

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
        jPanel1.add(txtre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 70, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" = ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 20));

        lblsn3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn3.setForeground(new java.awt.Color(255, 255, 255));
        lblsn3.setText("n1");
        jPanel1.add(lblsn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblsn4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn4.setForeground(new java.awt.Color(255, 255, 255));
        lblsn4.setText("n2");
        jPanel1.add(lblsn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("÷");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 20));

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
        jPanel1.add(txtre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 70, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" = ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        lblsn5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn5.setForeground(new java.awt.Color(255, 255, 255));
        lblsn5.setText("n1");
        jPanel1.add(lblsn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        lblsn6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn6.setForeground(new java.awt.Color(255, 255, 255));
        lblsn6.setText("n2");
        jPanel1.add(lblsn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("÷");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 20));

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
        jPanel1.add(txtre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 70, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" = ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, 20));

        lblsn7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn7.setForeground(new java.awt.Color(255, 255, 255));
        lblsn7.setText("n1");
        jPanel1.add(lblsn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        lblsn8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn8.setForeground(new java.awt.Color(255, 255, 255));
        lblsn8.setText("n2");
        jPanel1.add(lblsn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("÷");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 20));

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
        jPanel1.add(txtre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 70, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" = ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, 20));

        lblsn9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn9.setForeground(new java.awt.Color(255, 255, 255));
        lblsn9.setText("n1");
        jPanel1.add(lblsn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        lblsn10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn10.setForeground(new java.awt.Color(255, 255, 255));
        lblsn10.setText("n2");
        jPanel1.add(lblsn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        lblch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        lbluch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("÷");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, 20));

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
        jPanel1.add(txtre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 70, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" = ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, 20));

        lblsn11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn11.setForeground(new java.awt.Color(255, 255, 255));
        lblsn11.setText("n1");
        jPanel1.add(lblsn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        lblsn12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblsn12.setForeground(new java.awt.Color(255, 255, 255));
        lblsn12.setText("n2");
        jPanel1.add(lblsn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        lblch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jPanel1.add(lblch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        lbluch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        jPanel1.add(lbluch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        btnverf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnverf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        btnverf.setText("Verificar");
        btnverf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverfActionPerformed(evt);
            }
        });
        jPanel1.add(btnverf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        lbldiv.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lbldiv.setForeground(new java.awt.Color(255, 255, 255));
        lbldiv.setText("Divisiones");
        jPanel1.add(lbldiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        lblp1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp1.setForeground(new java.awt.Color(255, 255, 255));
        lblp1.setText("0");
        jPanel1.add(lblp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        lblp2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp2.setForeground(new java.awt.Color(255, 255, 255));
        lblp2.setText("0");
        jPanel1.add(lblp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        jPanel1.add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        lblp4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp4.setForeground(new java.awt.Color(255, 255, 255));
        lblp4.setText("0");
        jPanel1.add(lblp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, -1, -1));

        lblp6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp6.setForeground(new java.awt.Color(255, 255, 255));
        lblp6.setText("0");
        jPanel1.add(lblp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, -1, -1));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        jPanel1.add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, 30));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 590));

        lblusu.setText("jLabel9");
        jPanel1.add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnverfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverfActionPerformed
        //Div1
        String ns11=lblsn1.getText();
        String ns12=lblsn2.getText();
        String re11=txtre1.getText();
        String rel11 ="";
        int sn12 = 0,sn11=0,res11=0;
        sn11 = Integer.parseInt(ns11);
        sn12 = Integer.parseInt(ns12);
        res11 = sn12/sn11;
        rel11 = String.valueOf(res11);
        rel11= Integer.toString(res11);
        //Div2
        String ns21=lblsn3.getText();
        String ns22=lblsn4.getText();
        String re21=txtre2.getText();
        String rel21 ="";
        int sn22 = 0,sn21=0,res21=0;
        sn21 = Integer.parseInt(ns21);
        sn22 = Integer.parseInt(ns22);
        res21 = sn22/sn21;
        rel21 = String.valueOf(res21);
        rel21= Integer.toString(res21);
        //Div3
        String ns31=lblsn5.getText();
        String ns32=lblsn6.getText();
        String re31=txtre3.getText();
        String rel31 ="";
        int sn32 = 0,sn31=0,res31=0;
        sn31 = Integer.parseInt(ns31);
        sn32 = Integer.parseInt(ns32);
        res31 = sn32/sn31;
        rel31 = String.valueOf(res31);
        rel31= Integer.toString(res31);
        //Div4
        String ns41=lblsn7.getText();
        String ns42=lblsn8.getText();
        String re41=txtre4.getText();
        String rel41 ="";
        int sn42 = 0,sn41=0,res41=0;
        sn41 = Integer.parseInt(ns41);
        sn42 = Integer.parseInt(ns42);
        res41 = sn42/sn41;
        rel41 = String.valueOf(res41);
        rel41= Integer.toString(res41);
        //Div5
        String ns51=lblsn9.getText();
        String ns52=lblsn10.getText();
        String re51=txtre5.getText();
        String rel51 ="";
        int sn52 = 0,sn51=0,res51=0;
        sn51 = Integer.parseInt(ns51);
        sn52 = Integer.parseInt(ns52);
        res51 = sn52/sn51;
        rel51 = String.valueOf(res51);
        rel51= Integer.toString(res51);
        //Div6
        String ns61=lblsn11.getText();
        String ns62=lblsn12.getText();
        String re61=txtre6.getText();
        String rel61 ="";
        int sn62 = 0,sn61=0,res61=0;
        sn61 = Integer.parseInt(ns61);
        sn62 = Integer.parseInt(ns62);
        res61 = sn62/sn61;
        rel61 = String.valueOf(res61);
        rel61= Integer.toString(res61);
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
            lblp3.setVisible(true);
            lblp3.setText("5");
        }
        else{
            lbluch3.setVisible(true);
            lblch3.setVisible(false);
        }
        if(re41.equals(rel41)){
            lblch4.setVisible(true);
            lbluch4.setVisible(false);
            txtre4.setEditable(false);
            lblp4.setVisible(true);
            lblp4.setText("5");
        }
        else{
            lbluch4.setVisible(true);
            lblch4.setVisible(false);
        }
        if(re51.equals(rel51)){
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
        if(re61.equals(rel61)){
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
        if(re41.equals(rel41) && re31.equals(rel31) && re21.equals(rel21) && re11.equals(rel11) && re51.equals(rel51) && re61.equals(rel61) ){
            btnSiguiente.setVisible(true);
        }
    }//GEN-LAST:event_btnverfActionPerformed

    private void txtre6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre6KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre6KeyTyped

    private void txtre5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre5KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre5KeyTyped

    private void txtre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre4KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre4KeyTyped

    private void txtre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre3KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre3KeyTyped

    private void txtre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre2KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre2KeyTyped

    private void txtre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtre1KeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtre1KeyTyped

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
         String sql="UPDATE aritmetica SET ejercicio3 = ? WHERE nombre = '"+nom+"'";
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
        ejercicioar4 ejar4 = new ejercicioar4();
        pescrit.add(ejar4);
        ejar4.setVisible(true);
        ejar4.pack();
        ejar4.lblusu.setText(usu); 
        try {
            ejar4.setMaximum(true);
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
    void divl1(){
        int nsi1 = (int) (Math.random()*10+1);
        int nsi2 = (int) (Math.random()*100+10);
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
        lblsn1.setText(ns1);
        lblsn2.setText(ns2);
    }
    void divl2(){
        int nsi1 = (int) (Math.random()*100+10);
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
        lblsn3.setText(ns1);
        lblsn4.setText(ns2);
    }
    void divl3(){
        int nsi1 = (int) (Math.random()*10+1);
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
        lblsn5.setText(ns1);
        lblsn6.setText(ns2);
    }
    void divl4(){
        int nsi1 = (int) (Math.random()*100+9);
        int nsi2 = (int) (Math.random()*9000+900);
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
        lblsn7.setText(ns1);
        lblsn8.setText(ns2);
    }
    void divl5(){
        int nsi1 = (int) (Math.random()*999+10);
        int nsi2 = (int) (Math.random()*9999+999);
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
        lblsn9.setText(ns1);
        lblsn10.setText(ns2);
    }
    void divl6(){
        int nsi1 = (int) (Math.random()*1000+100);
        int nsi2 = (int) (Math.random()*10000+1000);
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
        lblsn11.setText(ns1);
        lblsn12.setText(ns2);
    }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel lbldiv;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    private javax.swing.JLabel lblp4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp6;
    private javax.swing.JLabel lblsn1;
    private javax.swing.JLabel lblsn10;
    private javax.swing.JLabel lblsn11;
    private javax.swing.JLabel lblsn12;
    private javax.swing.JLabel lblsn2;
    private javax.swing.JLabel lblsn3;
    private javax.swing.JLabel lblsn4;
    private javax.swing.JLabel lblsn5;
    private javax.swing.JLabel lblsn6;
    private javax.swing.JLabel lblsn7;
    private javax.swing.JLabel lblsn8;
    private javax.swing.JLabel lblsn9;
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