package EduMat;
import administrador.*;
import EduMat.login;
import EduMat.usur;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class adm extends javax.swing.JFrame {
    public adm() {
        initComponents();
        try{
        Image img =ImageIO.read(new File("src/img/icono.png"));
        this.setIconImage(img);
        }catch(Exception e){
        System.out.println(e);
        }
        iniciar();
    }
public void iniciar(){
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbladmi = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();
        lblcerr = new javax.swing.JButton();
        lblminimi = new javax.swing.JButton();
        btncerrarc = new javax.swing.JButton();
        admescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbladmi.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbladmi.setText("Administrador:");
        getContentPane().add(lbladmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblusu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblusu.setText("jLabel1");
        getContentPane().add(lblusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        lblcerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        lblcerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblcerrActionPerformed(evt);
            }
        });
        getContentPane().add(lblcerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 20));

        lblminimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        lblminimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblminimiActionPerformed(evt);
            }
        });
        getContentPane().add(lblminimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, 20));

        btncerrarc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsec.png"))); // NOI18N
        btncerrarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarcActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 20, 20));

        admescritorio.setBackground(new java.awt.Color(153, 0, 153));
        getContentPane().add(admescritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 660, 550));

        jMenu1.setText("Tablas");

        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Puntuaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblminimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblminimiActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblminimiActionPerformed

    private void lblcerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblcerrActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir de la aplicacion?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        } 
    }//GEN-LAST:event_lblcerrActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

         tbusr user = new tbusr();
        admescritorio.add(user);
        user.show(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tbpuntajes punts = new tbpuntajes();
        admescritorio.add(punts);
        punts.show(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane admescritorio;
    public javax.swing.JButton btncerrarc;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JLabel lbladmi;
    public javax.swing.JButton lblcerr;
    public javax.swing.JButton lblminimi;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}
