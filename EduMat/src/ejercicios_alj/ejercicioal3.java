package ejercicios_alj;
import EduMat.usur;
import static EduMat.usur.lblusu;
import static EduMat.usur.pescrit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class ejercicioal3 extends javax.swing.JInternalFrame {
    public ejercicioal3() {
        initComponents();
        btnSiguiente.setVisible(false);
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        lblp7.setVisible(false);
        lblp5.setVisible(false);
        lblp8.setVisible(false);
        lblp6.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnguardar = new javax.swing.JButton();
        lblp6 = new javax.swing.JLabel();
        lblp7 = new javax.swing.JLabel();
        lblp5 = new javax.swing.JLabel();
        lblp8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CbSuma3 = new javax.swing.JComboBox<>();
        CbSuma1 = new javax.swing.JComboBox<>();
        CbSuma4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CbSuma2 = new javax.swing.JComboBox<>();
        lblch1 = new javax.swing.JLabel();
        lbluch1 = new javax.swing.JLabel();
        lbluch2 = new javax.swing.JLabel();
        lblch2 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        BtnEqui4 = new javax.swing.JButton();
        BtnEqui5 = new javax.swing.JButton();
        BtnEqui6 = new javax.swing.JButton();
        lblch3 = new javax.swing.JLabel();
        BtnVerificar = new javax.swing.JButton();
        BtnEqui9 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lbluch4 = new javax.swing.JLabel();
        BtnEqui2 = new javax.swing.JButton();
        BtnEqui3 = new javax.swing.JButton();
        BtnEqui1 = new javax.swing.JButton();
        lblch4 = new javax.swing.JLabel();
        BtnEqui10 = new javax.swing.JButton();
        BtnEqui11 = new javax.swing.JButton();
        BtnEqui12 = new javax.swing.JButton();
        BtnEqui20 = new javax.swing.JButton();
        BtnEqui13 = new javax.swing.JButton();
        BtnEqui19 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnEqui14 = new javax.swing.JButton();
        BtnEqui15 = new javax.swing.JButton();
        BtnEqui16 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BtnEqui17 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        BtnEqui18 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ley de signos de Multiplicacion");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, 30));

        lblp6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp6.setForeground(new java.awt.Color(255, 255, 255));
        lblp6.setText("0");
        getContentPane().add(lblp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        lblp7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp7.setForeground(new java.awt.Color(255, 255, 255));
        lblp7.setText("0");
        getContentPane().add(lblp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        lblp5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp5.setForeground(new java.awt.Color(255, 255, 255));
        lblp5.setText("0");
        getContentPane().add(lblp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        lblp8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp8.setForeground(new java.awt.Color(255, 255, 255));
        lblp8.setText("0");
        getContentPane().add(lblp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel1.setText("X");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 70, 116));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel2.setText("X");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 116));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 124, 116));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel4.setText("X");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 60, 116));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 80)); // NOI18N
        jLabel5.setText("X");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 60, 116));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 124, 116));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 124, 116));

        CbSuma3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbSuma3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Positivo", "Negativo" }));
        getContentPane().add(CbSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        CbSuma1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbSuma1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Positivo", "Negativo" }));
        getContentPane().add(CbSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        CbSuma4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbSuma4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Positivo", "Negativo" }));
        getContentPane().add(CbSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 124, 116));

        CbSuma2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbSuma2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Positivo", "Negativo" }));
        getContentPane().add(CbSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, -1));

        lblch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        lbluch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        lbluch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        lblch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, -1));

        lbluch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        BtnEqui4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui4.setBorder(null);
        BtnEqui4.setBorderPainted(false);
        BtnEqui4.setContentAreaFilled(false);
        BtnEqui4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui4.setIconTextGap(-3);
        BtnEqui4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui4ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, 120));

        BtnEqui5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui5.setBorder(null);
        BtnEqui5.setBorderPainted(false);
        BtnEqui5.setContentAreaFilled(false);
        BtnEqui5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui5.setIconTextGap(-3);
        BtnEqui5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui5ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 110, 120));

        BtnEqui6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui6.setBorder(null);
        BtnEqui6.setBorderPainted(false);
        BtnEqui6.setContentAreaFilled(false);
        BtnEqui6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui6.setIconTextGap(-3);
        BtnEqui6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui6ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 110, 120));

        lblch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, -1, -1));

        BtnVerificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        BtnVerificar.setText("Verificar");
        BtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 120, 30));

        BtnEqui9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui9.setBorder(null);
        BtnEqui9.setBorderPainted(false);
        BtnEqui9.setContentAreaFilled(false);
        BtnEqui9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui9.setIconTextGap(-3);
        BtnEqui9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui9ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 110, 120));

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente ");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, 30));

        lbluch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uncheck.png"))); // NOI18N
        getContentPane().add(lbluch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        BtnEqui2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui2.setBorder(null);
        BtnEqui2.setBorderPainted(false);
        BtnEqui2.setContentAreaFilled(false);
        BtnEqui2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui2.setIconTextGap(-3);
        BtnEqui2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand1.png"))); // NOI18N
        BtnEqui2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand2.png"))); // NOI18N
        BtnEqui2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 110, 120));

        BtnEqui3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui3.setBorder(null);
        BtnEqui3.setBorderPainted(false);
        BtnEqui3.setContentAreaFilled(false);
        BtnEqui3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui3.setIconTextGap(-3);
        BtnEqui3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 110, -1));

        BtnEqui1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui1.setBorder(null);
        BtnEqui1.setBorderPainted(false);
        BtnEqui1.setContentAreaFilled(false);
        BtnEqui1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui1.setIconTextGap(-3);
        BtnEqui1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        getContentPane().add(lblch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        BtnEqui10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui10.setBorder(null);
        BtnEqui10.setBorderPainted(false);
        BtnEqui10.setContentAreaFilled(false);
        BtnEqui10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui10.setIconTextGap(-3);
        BtnEqui10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui10ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        BtnEqui11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui11.setBorder(null);
        BtnEqui11.setBorderPainted(false);
        BtnEqui11.setContentAreaFilled(false);
        BtnEqui11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui11.setIconTextGap(-3);
        BtnEqui11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui11ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, 120));

        BtnEqui12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui12.setBorder(null);
        BtnEqui12.setBorderPainted(false);
        BtnEqui12.setContentAreaFilled(false);
        BtnEqui12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui12.setIconTextGap(-3);
        BtnEqui12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui12ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 110, 120));

        BtnEqui20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui20.setBorder(null);
        BtnEqui20.setBorderPainted(false);
        BtnEqui20.setContentAreaFilled(false);
        BtnEqui20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui20.setIconTextGap(-3);
        BtnEqui20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui20ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 110, 120));

        BtnEqui13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui13.setBorder(null);
        BtnEqui13.setBorderPainted(false);
        BtnEqui13.setContentAreaFilled(false);
        BtnEqui13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui13.setIconTextGap(-3);
        BtnEqui13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui13ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, -1));

        BtnEqui19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui19.setBorder(null);
        BtnEqui19.setBorderPainted(false);
        BtnEqui19.setContentAreaFilled(false);
        BtnEqui19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui19.setIconTextGap(-3);
        BtnEqui19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui19ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Utilizando la ley de signos de MULTIPLICACION resuelve los siguientes ejercicios: ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 124, 116));

        BtnEqui14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui14.setBorder(null);
        BtnEqui14.setBorderPainted(false);
        BtnEqui14.setContentAreaFilled(false);
        BtnEqui14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui14.setIconTextGap(-3);
        BtnEqui14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui14ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 110, 120));

        BtnEqui15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos_pequeño.png"))); // NOI18N
        BtnEqui15.setBorder(null);
        BtnEqui15.setBorderPainted(false);
        BtnEqui15.setContentAreaFilled(false);
        BtnEqui15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui15.setIconTextGap(-3);
        BtnEqui15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui15ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 110, 120));

        BtnEqui16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_peque.png"))); // NOI18N
        BtnEqui16.setBorder(null);
        BtnEqui16.setBorderPainted(false);
        BtnEqui16.setContentAreaFilled(false);
        BtnEqui16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui16.setIconTextGap(-3);
        BtnEqui16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand1.png"))); // NOI18N
        BtnEqui16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuand2.png"))); // NOI18N
        BtnEqui16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui16ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 110, 120));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1000, 510));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 124, 116));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 124, 116));

        BtnEqui17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos-grande.png"))); // NOI18N
        BtnEqui17.setBorder(null);
        BtnEqui17.setBorderPainted(false);
        BtnEqui17.setContentAreaFilled(false);
        BtnEqui17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui17.setIconTextGap(-3);
        BtnEqui17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui17ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 150, 150));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 124, 116));

        BtnEqui18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEqui18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas_grande.png"))); // NOI18N
        BtnEqui18.setBorder(null);
        BtnEqui18.setBorderPainted(false);
        BtnEqui18.setContentAreaFilled(false);
        BtnEqui18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEqui18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEqui18.setIconTextGap(-3);
        BtnEqui18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEqui18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEqui18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqui18ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEqui18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, 150));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1000, 510));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEqui4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui4ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Numeros con signos diferentes el resultado es negativo");
    }//GEN-LAST:event_BtnEqui4ActionPerformed

    private void BtnEqui5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui5ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Numeros con signos iguales el resultado es positivo");
    }//GEN-LAST:event_BtnEqui5ActionPerformed

    private void BtnEqui6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui6ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Numeros con signos diferentes el resultado es negativo");
    }//GEN-LAST:event_BtnEqui6ActionPerformed

    private void BtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerificarActionPerformed
        // TODO add your handling code here:
        String Positivo="Positivo",Negativo="Negativo";
        String r1 =this.CbSuma1.getSelectedItem().toString();
        String r2 =this.CbSuma2.getSelectedItem().toString();
        String r3 =this.CbSuma3.getSelectedItem().toString();
        String r4 =this.CbSuma4.getSelectedItem().toString();
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
        if(r1.equals(Positivo)&& r2.equals(Negativo)&& r3.equals(Positivo)&& r4.equals(Negativo)){
            JOptionPane.showMessageDialog(null,"La respuestas  son correctas");
            lblch1.setVisible(true);
            lblch2.setVisible(true);
            lblch3.setVisible(true);
            lblch4.setVisible(true);
            lblp7.setVisible(true);
            lblp7.setText("5");
            lblp5.setVisible(true);
            lblp5.setText("5");
            lblp8.setVisible(true);
            lblp8.setText("5");
            lblp6.setVisible(true);
            lblp6.setText("5");    
            btnSiguiente.setVisible(true);
        }else
        {
            JOptionPane.showMessageDialog(null,"La respuestas no son correctas");
            if(r1.equals(Positivo)==false){
                lbluch1.setVisible(true);
                btnSiguiente.setVisible(false);
            }
            else{
                lblch1.setVisible(true);
                lblp7.setVisible(true);
              lblp7.setText("5");
            }
            if(r2.equals(Negativo)==false){
                lbluch2.setVisible(true);
                btnSiguiente.setVisible(false);
            }else{
                lblch2.setVisible(true);
                lblp5.setVisible(true);
                lblp5.setText("5");
            }

            if(r3.equals(Negativo)==false){
                lbluch3.setVisible(true);
                btnSiguiente.setVisible(false);
            }
            else{
                lblch3.setVisible(true);
                lblp8.setVisible(true);
                lblp8.setText("5");
            }

            if(r4.equals(Positivo)==false){
                lbluch4.setVisible(true);
                btnSiguiente.setVisible(false);
            }
            else{
                lblch4.setVisible(true);
                lblp6.setVisible(true);
                lblp6.setText("5");
            }

        }
    }//GEN-LAST:event_BtnVerificarActionPerformed

    private void BtnEqui9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui9ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Numeros con signos direntes el resultado es negativo");
    }//GEN-LAST:event_BtnEqui9ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       String usu=lblusu.getText();
       this.dispose();
        ejercicioal4 ejal4 = new ejercicioal4();
        pescrit.add(ejal4);
        ejal4.setVisible(true);
        ejal4.pack();
        ejal4.lblusu.setText(usu);
        try {
            ejal4.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void BtnEqui2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui2ActionPerformed

    private void BtnEqui3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui3ActionPerformed
    JOptionPane.showMessageDialog(null,"Numeros con signos diferentes el resultado es negativo");
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui3ActionPerformed

    private void BtnEqui1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Numeros con signos iguales el resultado es positivo");
    }//GEN-LAST:event_BtnEqui1ActionPerformed

    private void BtnEqui10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui10ActionPerformed

    private void BtnEqui11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui11ActionPerformed

    private void BtnEqui12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui12ActionPerformed

    private void BtnEqui13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui13ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Numeros con signos iguales el resultado es positivo");
    }//GEN-LAST:event_BtnEqui13ActionPerformed

    private void BtnEqui14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui14ActionPerformed

    private void BtnEqui15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui15ActionPerformed

    private void BtnEqui16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui16ActionPerformed

    private void BtnEqui17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui17ActionPerformed

    private void BtnEqui18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui18ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int pi5=0,pi6=0,pi7=0,pi8=0,tot1=0;
        String nom=lblusu.getText();
        String ps5=lblp5.getText();
        String ps6=lblp6.getText();
        String ps7=lblp7.getText();
        String ps8=lblp8.getText();
        pi5 = Integer.parseInt(ps5);
        pi6 = Integer.parseInt(ps6);
        pi7 = Integer.parseInt(ps7);
        pi8 = Integer.parseInt(ps8);
        tot1=pi5+pi6+pi7+pi8;
        String tot1s="";
        tot1s = String.valueOf(tot1);
        tot1s= Integer.toString(tot1);
        String sql="UPDATE algebra SET ejercicio3 = ? WHERE nombre = '"+nom+"'";
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

    private void BtnEqui19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEqui19ActionPerformed

    private void BtnEqui20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqui20ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Numeros con signos iguales el resultado es positivo");
    }//GEN-LAST:event_BtnEqui20ActionPerformed
    conectar cc= new conectar();
    Connection cn = cc.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEqui1;
    private javax.swing.JButton BtnEqui10;
    private javax.swing.JButton BtnEqui11;
    private javax.swing.JButton BtnEqui12;
    private javax.swing.JButton BtnEqui13;
    private javax.swing.JButton BtnEqui14;
    private javax.swing.JButton BtnEqui15;
    private javax.swing.JButton BtnEqui16;
    private javax.swing.JButton BtnEqui17;
    private javax.swing.JButton BtnEqui18;
    private javax.swing.JButton BtnEqui19;
    private javax.swing.JButton BtnEqui2;
    private javax.swing.JButton BtnEqui20;
    private javax.swing.JButton BtnEqui3;
    private javax.swing.JButton BtnEqui4;
    private javax.swing.JButton BtnEqui5;
    private javax.swing.JButton BtnEqui6;
    private javax.swing.JButton BtnEqui9;
    private javax.swing.JButton BtnVerificar;
    private javax.swing.JComboBox<String> CbSuma1;
    private javax.swing.JComboBox<String> CbSuma2;
    private javax.swing.JComboBox<String> CbSuma3;
    private javax.swing.JComboBox<String> CbSuma4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel lblch4;
    private javax.swing.JLabel lblp5;
    private javax.swing.JLabel lblp6;
    private javax.swing.JLabel lblp7;
    private javax.swing.JLabel lblp8;
    private javax.swing.JLabel lbluch1;
    private javax.swing.JLabel lbluch2;
    private javax.swing.JLabel lbluch3;
    private javax.swing.JLabel lbluch4;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}
