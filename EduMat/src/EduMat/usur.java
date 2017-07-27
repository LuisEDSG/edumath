package EduMat;
import administrador.tbpuntajes;
import administrador.tbusr;
import clases.conectar;
import ejercicios_arit.ejercicioar1;
import ejercicios_alj.*;
import ejercicios_arit.*;
import ejercicios_geo.*;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import puntaje.puntaje;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class usur extends javax.swing.JFrame {
 Connection conect = null;
 private ResultSet rs;
 private PreparedStatement ps;
 private ResultSetMetaData rsm;
 DefaultTableModel dtm;
 private java.util.Date fecha = new java.util.Date(); 
    public usur() {
         try{
             initComponents();
             conectar f=new conectar();
             UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
             try{
                 Image img =ImageIO.read(new File("src/img/icono.png"));
                 this.setIconImage(img);
                 //usur.setDefaultLookAndFeelDecorated(true);
                 //JDialog.setDefaultLookAndFeelDecorated(true);
                 //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             }catch(Exception e){
                 System.out.println(e);
             }
             iniciar();
        }catch(ClassNotFoundException ex){
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null,ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void iniciar(){
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusu = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        btnminimi = new javax.swing.JButton();
        btncerr = new javax.swing.JButton();
        btncerrarc = new javax.swing.JButton();
        pescrit = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miejar1 = new javax.swing.JMenuItem();
        jmejar2 = new javax.swing.JMenuItem();
        jmejar3 = new javax.swing.JMenuItem();
        jmejar4 = new javax.swing.JMenuItem();
        jmejar5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmejge1 = new javax.swing.JMenuItem();
        jmejge2 = new javax.swing.JMenuItem();
        jmejge3 = new javax.swing.JMenuItem();
        jmejge4 = new javax.swing.JMenuItem();
        jmejge5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmejal1 = new javax.swing.JMenuItem();
        jmejal2 = new javax.swing.JMenuItem();
        jmejal3 = new javax.swing.JMenuItem();
        jmejal4 = new javax.swing.JMenuItem();
        jmejal5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblusu.setText("jLabel1");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        lbluser.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbluser.setText("Usuario:");
        getContentPane().add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnminimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        btnminimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimiActionPerformed(evt);
            }
        });
        getContentPane().add(btnminimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 20, 20));

        btncerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btncerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrActionPerformed(evt);
            }
        });
        getContentPane().add(btncerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 20, 20));

        btncerrarc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsec.png"))); // NOI18N
        btncerrarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarcActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 20, 20));

        pescrit.setBackground(new java.awt.Color(153, 0, 153));
        getContentPane().add(pescrit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 990, 550));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ejercicio1", "Ejercicio2", "Ejercicio3", "Ejercicio4", "Ejercicio5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 90));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ejercicio1", "Ejercicio2", "Ejercicio3", "Ejercicio4", "Ejercicio5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ejercicio1", "Ejercicio2", "Ejercicio3", "Ejercicio4", "Ejercicio5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 90));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aritm.png"))); // NOI18N
        jMenu1.setText("Aritmetica");

        miejar1.setText("Ejercicio1");
        miejar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miejar1ActionPerformed(evt);
            }
        });
        jMenu1.add(miejar1);

        jmejar2.setText("Ejercicio2");
        jmejar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejar2ActionPerformed(evt);
            }
        });
        jMenu1.add(jmejar2);

        jmejar3.setText("Ejercicio3");
        jmejar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejar3ActionPerformed(evt);
            }
        });
        jMenu1.add(jmejar3);

        jmejar4.setText("Ejercicio4");
        jmejar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejar4ActionPerformed(evt);
            }
        });
        jMenu1.add(jmejar4);

        jmejar5.setText("Ejercicio5");
        jmejar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejar5ActionPerformed(evt);
            }
        });
        jMenu1.add(jmejar5);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GEO.png"))); // NOI18N
        jMenu3.setText("Geometria");

        jmejge1.setText("Ejercicio1");
        jmejge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejge1ActionPerformed(evt);
            }
        });
        jMenu3.add(jmejge1);

        jmejge2.setText("Ejercicio2");
        jmejge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejge2ActionPerformed(evt);
            }
        });
        jMenu3.add(jmejge2);

        jmejge3.setText("Ejercicio3");
        jmejge3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejge3ActionPerformed(evt);
            }
        });
        jMenu3.add(jmejge3);

        jmejge4.setText("Ejercicio4");
        jmejge4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejge4ActionPerformed(evt);
            }
        });
        jMenu3.add(jmejge4);

        jmejge5.setText("Ejercicio5");
        jmejge5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejge5ActionPerformed(evt);
            }
        });
        jMenu3.add(jmejge5);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alg.png"))); // NOI18N
        jMenu2.setText("Algebra");

        jmejal1.setText("Ejercicio1");
        jmejal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejal1ActionPerformed(evt);
            }
        });
        jMenu2.add(jmejal1);

        jmejal2.setText("Ejercicio2");
        jmejal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejal2ActionPerformed(evt);
            }
        });
        jMenu2.add(jmejal2);

        jmejal3.setText("Ejercicio3");
        jmejal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejal3ActionPerformed(evt);
            }
        });
        jMenu2.add(jmejal3);

        jmejal4.setText("Ejercicio4");
        jmejal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejal4ActionPerformed(evt);
            }
        });
        jMenu2.add(jmejal4);

        jmejal5.setText("Ejercicio5");
        jmejal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmejal5ActionPerformed(evt);
            }
        });
        jMenu2.add(jmejal5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Puntajes");
        jMenu4.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu4MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnminimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimiActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimiActionPerformed

    private void btncerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir de la aplicacion?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
           }        
    }//GEN-LAST:event_btncerrActionPerformed

    private void btncerrarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarcActionPerformed
           if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente cerrar sesion?","Cerrar sesion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            login l = null;
               try {
                   l = new login();
               } catch (IOException ex) {
                   Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
               }
            l.setVisible(true);
            this.dispose();
           } 
    }//GEN-LAST:event_btncerrarcActionPerformed

    private void miejar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miejar1ActionPerformed
        String usu=lblusu.getText();
        ejercicioar1 ejar1 = new ejercicioar1();
        pescrit.add(ejar1);
        ejar1.setVisible(true);
        ejar1.pack();
        ejar1.lblusu.setText(usu); 
        try {
            ejar1.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miejar1ActionPerformed

    private void jmejar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejar2ActionPerformed
        String usu=lblusu.getText();
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
       
    }//GEN-LAST:event_jmejar2ActionPerformed

    private void jmejar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejar3ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejar3ActionPerformed

    private void jmejar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejar4ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejar4ActionPerformed

    private void jmejar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejar5ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejar5ActionPerformed

    private void jmejal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejal1ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejal1ActionPerformed

    private void jmejal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejal2ActionPerformed
        String usu=lblusu.getText();
        ejercicioal2 ejal2 = new ejercicioal2();
        pescrit.add(ejal2);
        ejal2.setVisible(true);
        ejal2.pack();
        ejal2.lblusu.setText(usu);
        try {
            ejal2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmejal2ActionPerformed

    private void jmejal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejal3ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejal3ActionPerformed

    private void jmejal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejal4ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejal4ActionPerformed

    private void jmejal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejal5ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejal5ActionPerformed

    private void jmejge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejge1ActionPerformed
        String usu=lblusu.getText();
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
    }//GEN-LAST:event_jmejge1ActionPerformed

    private void jmejge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejge2ActionPerformed
        String usu=lblusu.getText();
        ejercicioge2 ejge2 = new ejercicioge2();
        pescrit.add(ejge2);
        ejge2.pack();
        ejge2.lblusu.setText(usu);
        ejge2.setVisible(true); 
        try {
            ejge2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jmejge2ActionPerformed

    private void jmejge3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejge3ActionPerformed
        String usu=lblusu.getText();
        ejercicioge3 ejge3 = new ejercicioge3();
        pescrit.add(ejge3);
        ejge3.pack();
        ejge3.lblusu.setText(usu);
        ejge3.setVisible(true); 
        try {
            ejge3.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jmejge3ActionPerformed

    private void jmejge4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejge4ActionPerformed
        String usu=lblusu.getText();
        ejercicioge4 ejge4 = new ejercicioge4();
        pescrit.add(ejge4);
        ejge4.pack();
        ejge4.lblusu.setText(usu);
        ejge4.setVisible(true); 
        try {
            ejge4.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jmejge4ActionPerformed

    private void jmejge5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmejge5ActionPerformed
        String usu=lblusu.getText();
        ejercicioge5 ejge5 = new ejercicioge5();
        pescrit.add(ejge5);
        ejge5.pack();
        ejge5.lblusu.setText(usu);
        ejge5.setVisible(true); 
        try {
            ejge5.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(usur.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jmejge5ActionPerformed

    private void jMenu4MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu4MenuKeyPressed
        
    }//GEN-LAST:event_jMenu4MenuKeyPressed

    public void Crearpdf() throws FileNotFoundException, DocumentException{
        // Creacion del documento con los margenes
        Document document = new Document(PageSize.A4, 35, 30, 50, 50);
        // El archivo pdf que vamos a generar
        FileOutputStream fileOutputStream = new FileOutputStream("reportePDFDatoJava.pdf");
        // Obtener la instancia del PdfWriter
        PdfWriter.getInstance(document, fileOutputStream);
        // Abrir el documento
        document.open();
        Image image = null;
        // Crear las fuentes para el contenido y los titulos
        Font fontContenido = FontFactory.getFont(
        FontFactory.TIMES_ROMAN.toString(), 11, Font.NORMAL,
        BaseColor.DARK_GRAY);
        Font fontTitulos = FontFactory.getFont(
        FontFactory.TIMES_BOLDITALIC, 11, Font.UNDERLINE,
        BaseColor.RED);
    }
    
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        tbpuntajes punts = new tbpuntajes();
        pescrit.add(punts);
        punts.show(true);
    }//GEN-LAST:event_jMenu4MouseClicked
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/bdmat","edumat57","edumat43");
            //conect = DriverManager.getConnection("jdbc:mysql://localhost/bdmat","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return conect;
    }

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String usuario="";
            String usuuario=lblusu.getText();
            String nomArch="reporte_"+usuario;
            Document documento = new Document();
            FileOutputStream ficheroPdf;
            
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerr;
    private javax.swing.JButton btncerrarc;
    private javax.swing.JButton btnminimi;
    public static javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JMenuItem jmejal1;
    private javax.swing.JMenuItem jmejal2;
    private javax.swing.JMenuItem jmejal3;
    private javax.swing.JMenuItem jmejal4;
    private javax.swing.JMenuItem jmejal5;
    private javax.swing.JMenuItem jmejar2;
    private javax.swing.JMenuItem jmejar3;
    private javax.swing.JMenuItem jmejar4;
    private javax.swing.JMenuItem jmejar5;
    private javax.swing.JMenuItem jmejge1;
    private javax.swing.JMenuItem jmejge2;
    private javax.swing.JMenuItem jmejge3;
    private javax.swing.JMenuItem jmejge4;
    private javax.swing.JMenuItem jmejge5;
    private javax.swing.JLabel lbluser;
    public static javax.swing.JLabel lblusu;
    private javax.swing.JMenuItem miejar1;
    public static javax.swing.JDesktopPane pescrit;
    // End of variables declaration//GEN-END:variables
}
