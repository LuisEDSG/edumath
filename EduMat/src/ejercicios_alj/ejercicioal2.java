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
public class ejercicioal2 extends javax.swing.JInternalFrame {
    public ejercicioal2() {
        initComponents();
        lblp1.setVisible(false);
        lblp2.setVisible(false);
        lblp3.setVisible(false);
        lblp4.setVisible(false);
        btnSiguiente.setVisible(false);
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
          int n1s1,n2s1,n1s2,n2s2,n1r3,n2r3,n1r4,n2r4,rs1,rs2,rr3,rr4;
          String sn1s1,sn2s1,sn1s2,sn2s2,sn1r3,sn2r3,sn1r4,sn2r4,s1,s2,r3,r4;
          n1s1=(num1.nextInt(49)+1);
          n2s1=(num2.nextInt(49)+1);
          n1s2=(num3.nextInt(49)+1);
          n2s2=(num4.nextInt(49)+1);
          n1r3=(num5.nextInt(99-40+1)+40);//(24)+1);
          n2r3=(num6.nextInt(24)+1);
          n1r4=(num7.nextInt(9)+1);
          n2r4=(num8.nextInt(99-40+1)+40);
          sn1s1=String.valueOf(n1s1);
          sn2s1=String.valueOf(n2s1);
          sn1s2=String.valueOf(n1s2);
          sn2s2=String.valueOf(n2s2);
          sn1r3 =String.valueOf(n1r3);   
           sn2r3 =String.valueOf(n2r3); 
            sn1r4 =String.valueOf(n1r4); 
            sn2r4 =String.valueOf(n2r4); 
             lbln1s1.setText(sn1s1);
             lbln2s1.setText(sn2s1);
             lbln1s2.setText(sn1s2);
             lbln2s2.setText(sn2s2);
             lbln1r3.setText(sn1r3);
              lbln2r3.setText(sn2r3);
               lbln1r4.setText(sn1r4);
                lbln2r4.setText(sn2r4);
                 rs1=(Integer.parseInt(sn1s1)) +(Integer.parseInt(sn2s1));
                 rs2=(Integer.parseInt(sn1s2)) +(Integer.parseInt(sn2s2));
                 rr3=(Integer.parseInt(sn1r3)) -(Integer.parseInt(sn2r3));
                 rr4=(Integer.parseInt(sn1r4)) +(Integer.parseInt(sn2r4));
                 s1=String.valueOf(rs1);
                 s2=String.valueOf(rs2);
                 r3=String.valueOf(rr3);
                 r4=String.valueOf(rr4);
                 lblr1.setText(s1);
                 lblr2.setText(s2);
                 lblr3.setText(r3);
                 lblr4.setText(r4);
              
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbln2s1 = new javax.swing.JLabel();
        lbln1s1 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
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
        cbr1 = new javax.swing.JComboBox<>();
        cbr2 = new javax.swing.JComboBox<>();
        cbr3 = new javax.swing.JComboBox<>();
        cbr4 = new javax.swing.JComboBox<>();
        lblch3 = new javax.swing.JLabel();
        lbluch3 = new javax.swing.JLabel();
        lblch4 = new javax.swing.JLabel();
        lbluch4 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        lblr1 = new javax.swing.JLabel();
        lblr2 = new javax.swing.JLabel();
        lblr3 = new javax.swing.JLabel();
        lblr4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        lblp4 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ejercicios con Ley de signos Suma y Resta");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo1.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbln2s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2s1.setForeground(new java.awt.Color(255, 255, 255));
        lbln2s1.setText("N2");
        getContentPane().add(lbln2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        lbln1s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1s1.setForeground(new java.awt.Color(255, 255, 255));
        lbln1s1.setText("N1");
        getContentPane().add(lbln1s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        btnguardar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

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
        jLabel6.setText("(-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("+");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(-");
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
        jLabel13.setText("+");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("(+");
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
        jLabel22.setText("(-");
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
        jLabel26.setText("(-");
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
        jLabel29.setText("+");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("(-");
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
        jLabel37.setText("+");
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
        getContentPane().add(txtr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 90, -1));

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

        cbr1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        getContentPane().add(cbr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 40, -1));

        cbr2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        getContentPane().add(cbr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 50, -1));

        cbr3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        getContentPane().add(cbr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 50, -1));

        cbr4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        getContentPane().add(cbr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 50, -1));

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

        lblr1.setForeground(new java.awt.Color(255, 255, 255));
        lblr1.setText("jLabel1");
        getContentPane().add(lblr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        lblr2.setText("jLabel2");
        getContentPane().add(lblr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        lblr3.setText("jLabel3");
        getContentPane().add(lblr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        lblr4.setText("jLabel11");
        getContentPane().add(lblr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Utilizando la ley de signos resuelve las siguientes operaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblp3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblp3.setForeground(new java.awt.Color(255, 255, 255));
        lblp3.setText("0");
        getContentPane().add(lblp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 540));

        lblusu.setText("jLabel9");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        
        int r1,r2,r3,r4;
        int a1,a2,a3,a4,s1,s2,s3,s4,s5;
        String Positivo="+",Negativo="-";
        String g1 =this.cbr1.getSelectedItem().toString();
        String g2 =this.cbr2.getSelectedItem().toString();
        String g3 =this.cbr3.getSelectedItem().toString();
        String g4 =this.cbr4.getSelectedItem().toString();
        a1=Integer.parseInt(lblr1.getText());
        a2=Integer.parseInt(lblr2.getText());
        a3=Integer.parseInt(lblr3.getText());
          a4=Integer.parseInt(lblr4.getText());
           r1=Integer.parseInt(txtr1.getText());
        r2=Integer.parseInt(txtr2.getText());
        r3=Integer.parseInt(txtr3.getText());
         r4=Integer.parseInt(txtr4.getText());
        if(txtr1.getText().isEmpty()&&txtr2.getText().isEmpty()&&txtr3.getText().isEmpty()&&txtr4.getText().isEmpty()){//&&txtr4.getText().isEmpty()
           JOptionPane.showMessageDialog(null,"Error Campos vacios");
       }else{
           try{
        lblch1.setVisible(false);
        lbluch1.setVisible(false);
        lblch2.setVisible(false);
        lbluch2.setVisible(false);
        lblch3.setVisible(false);
        lbluch3.setVisible(false);
        lblch4.setVisible(false);
        lbluch4.setVisible(false);
          if (((a1==r1 && g1.equals(Negativo))&& ((a2==r2 )&& g2.equals(Positivo)) && ((a3==r3)&& g3.equals(Positivo))&&(a4==r4)&& g4.equals(Negativo))){ //&& (a4==r4&& g4.equals(Positivo))
         JOptionPane.showMessageDialog(null,"Las respuestas  son correctas");
           btnSiguiente.setVisible(true);
          lblch1.setVisible(true);
           lblch2.setVisible(true);
            lblch3.setVisible(true);
            lblch4.setVisible(true);
            lblp1.setVisible(true);
               lblp1.setText("5");
               lblp2.setVisible(true);
               lblp2.setText("5");
               lblp3.setVisible(true);
                lblp3.setText("5");
                lblp4.setVisible(true);
                lblp4.setText("5");
       }else{
           JOptionPane.showMessageDialog(null,"Las respuestas  NO son correctas");
          btnSiguiente.setVisible(false);
           if((a1==r1)==false || g1.equals(Negativo)==false){
                lbluch1.setVisible(true);
           }else{
               lblch1.setVisible(true);
               lblp1.setVisible(true);
               lblp1.setText("5");
           }
           if((a2==r2)==false || g2.equals(Positivo)==false){
               lbluch2.setVisible(true);
           }else{
               lblch2.setVisible(true);
               lblp2.setVisible(true);
               lblp2.setText("5");
           }
           if((a3==r3)==false || g3.equals(Positivo)==false){
               lbluch3.setVisible(true);
           }else{
                lblch3.setVisible(true);
                lblp3.setVisible(true);
                lblp3.setText("5");
           }if((a4==r4)==false || g4.equals(Negativo)==false){
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
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String usu=lblusu.getText();
        this.dispose();
        ejercicioal3 ejal3 = new ejercicioal3();
        pescrit.add(ejal3);
        ejal3.setVisible(true);
        ejal3.pack();
        ejal3.lblusu.setText(usu);
        try {
            ejal3.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtr1KeyTyped

    private void txtr2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr2KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtr2KeyTyped

    private void txtr3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtr3KeyTyped

    private void txtr4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtr4KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtr4KeyTyped

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
        String sql="UPDATE algebra SET ejercicio2 = ? WHERE nombre = '"+nom+"'";
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
    private javax.swing.JComboBox<String> cbr1;
    private javax.swing.JComboBox<String> cbr2;
    private javax.swing.JComboBox<String> cbr3;
    private javax.swing.JComboBox<String> cbr4;
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
    private javax.swing.JLabel lblr1;
    private javax.swing.JLabel lblr2;
    private javax.swing.JLabel lblr3;
    private javax.swing.JLabel lblr4;
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
