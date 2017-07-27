package EduMat;
import clases.conectar;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
    public login() throws IOException {
        initComponents();
        ImageIcon imagen = new ImageIcon("src/img/fondo1.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblfondo1.getWidth(),lblfondo1.getHeight(),Image.SCALE_DEFAULT));
        lblfondo1.setIcon(icono);
        lblfondo2.setIcon(icono);
        this.repaint();
        iniciar();
        try{
        Image img =ImageIO.read(new File("src/img/icono.png"));
        this.setIconImage(img);
        }catch(Exception e){
        System.out.println(e);
        }
    } 
    public void iniciar(){
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pinicio = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lblcontr = new javax.swing.JLabel();
        lblcontr2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcontr = new javax.swing.JPasswordField();
        txtcontr2 = new javax.swing.JPasswordField();
        btnregistrar = new javax.swing.JButton();
        btncancela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblfondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btninicio = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblfondo2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        macerc = new javax.swing.JMenu();
        msalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("login"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinicio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("Nombre:");
        jPanel1.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblcontr.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblcontr.setForeground(new java.awt.Color(255, 255, 255));
        lblcontr.setText("Contraseña:");
        jPanel1.add(lblcontr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        lblcontr2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblcontr2.setForeground(new java.awt.Color(255, 255, 255));
        lblcontr2.setText("Contraseña:");
        jPanel1.add(lblcontr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtnombre.setText("Nombre");
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 190, -1));

        txtcontr.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtcontr.setText("String no=\"***************\";");
        txtcontr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontrFocusGained(evt);
            }
        });
        txtcontr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrActionPerformed(evt);
            }
        });
        jPanel1.add(txtcontr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 190, -1));

        txtcontr2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtcontr2.setText("jPasswordField2");
        txtcontr2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontr2FocusGained(evt);
            }
        });
        jPanel1.add(txtcontr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 190, -1));

        btnregistrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.gif"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        btncancela.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btncancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsec.png"))); // NOI18N
        btncancela.setText("Cancelar");
        btncancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelaActionPerformed(evt);
            }
        });
        jPanel1.add(btncancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        lblfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel1.add(lblfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 372));

        pinicio.addTab("Registro", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btninicio.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.gif"))); // NOI18N
        btninicio.setText("Iniciar");
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });
        jPanel2.add(btninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        btncancel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsec.png"))); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        lblusuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Usuario:");
        jPanel2.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        lblcontra.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblcontra.setForeground(new java.awt.Color(255, 255, 255));
        lblcontra.setText("Contraseña:");
        jPanel2.add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        txtusuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtusuario.setText("Usuario");
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 190, -1));

        txtcontra.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtcontra.setText("jPasswordField1");
        txtcontra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontraFocusGained(evt);
            }
        });
        jPanel2.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicia Sesión");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lblfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.png"))); // NOI18N
        jPanel2.add(lblfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 372));

        pinicio.addTab("Iniciar sesion", jPanel2);

        getContentPane().add(pinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        macerc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i.png"))); // NOI18N
        macerc.setText("Acerca de..");
        macerc.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        macerc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                macercMouseClicked(evt);
            }
        });
        jMenuBar1.add(macerc);

        msalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.gif"))); // NOI18N
        msalir.setText("Salir");
        msalir.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        msalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(msalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msalirMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir de la aplicacion?","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        } 
    }//GEN-LAST:event_msalirMouseClicked

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
       txtusuario.setText(null);
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtcontraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraFocusGained
       txtcontra.setText(null);
    }//GEN-LAST:event_txtcontraFocusGained

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtusuario.setText("Usuario");
        txtcontra.setText("***************");
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        txtnombre.setText(null);
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtcontrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontrFocusGained
        txtcontr.setText(null);
    }//GEN-LAST:event_txtcontrFocusGained

    private void txtcontr2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontr2FocusGained
        txtcontr2.setText(null);
    }//GEN-LAST:event_txtcontr2FocusGained

    private void btncancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelaActionPerformed
        txtnombre.setText("Nombre");
        txtcontr.setText("***************");
        txtcontr2.setText("***************");
    }//GEN-LAST:event_btncancelaActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        if((txtcontra.getText().isEmpty()) || txtusuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
        String usu=txtusuario.getText();
        char[] pas= txtcontra.getPassword();
        String pass = new String(pas);
        try {
            acceder(usu, pass);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btninicioActionPerformed

    private void macercMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_macercMouseClicked
        acercade acerca = new acercade();
        acerca.setVisible(true);
    }//GEN-LAST:event_macercMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if((txtcontr.getText().isEmpty()) || txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campos vacios");
        }
        else{
        String nom=txtnombre.getText();
        char[] co= txtcontr.getPassword();
        char[] co1=txtcontr2.getPassword();
        String no="***************";
        String no2="***************";
        String no3="Nombre";
        String cont= new String(co);
        String cont1= new String(co1);
        String sql="INSERT INTO usuarios (`usu`,`contra`,`lvl`) VALUES (?,?,2)";
         if(cont.equals(cont1)){
            try{
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, nom);
                pst.setString(2, cont);
                int num=pst.executeUpdate();
                if(num>0){
            JOptionPane.showMessageDialog(null,"Los datos fueron registrados");            
        }
            }catch(Exception e){
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
        }
        else{
             JOptionPane.showMessageDialog(this, "La contraseña no concuerda");
        }
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();   
        if ((c<'a'|| c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        char c = evt.getKeyChar();     
        if ((c<'a'|| c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtcontrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontrActionPerformed
    void acceder(String usu, String pass) throws SQLException{
        int cap =0;
        String sql="SELECT * FROM usuarios WHERE usu='"+usu+"' && contra='"+pass+"'";
        try{
        Statement st = cn.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while(rs.next()){
            cap=rs.getInt("lvl");
        }
        if(cap==1){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Bienvenido");
            adm admin = new adm();
            admin.setVisible(true);
            admin.pack();
            admin.lblusu.setText(usu);            
        }
        if(cap==2){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Bienvenido");
            usur usura = new usur();
            usura.setVisible(true);
            usura.pack();
            usura.lblusu.setText(usu);  
        }
        if(cap != 1 && cap != 2){
            JOptionPane.showMessageDialog(this, "No esta registrado");
        }
        }catch(SQLException ex){
        Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancela;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcontr;
    private javax.swing.JLabel lblcontr2;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblfondo1;
    private javax.swing.JLabel lblfondo2;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JMenu macerc;
    private javax.swing.JMenu msalir;
    private javax.swing.JTabbedPane pinicio;
    private javax.swing.JPasswordField txtcontr;
    private javax.swing.JPasswordField txtcontr2;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}