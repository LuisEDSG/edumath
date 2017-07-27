package EduMat;
import clases.transparencia;
import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
public class acercade extends javax.swing.JFrame {
    public acercade() {
        new transparencia().TransCompFrame(this);
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("EduMat®\nAplicacion de escritorio.\nDiseñada por Eunice Espinosa & Luis Sánchez\nCentro de Enseñanza Tecnica Industrial\n");
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 110));

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/splash.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acercade().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
