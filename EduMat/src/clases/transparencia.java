package clases;
import com.sun.awt.AWTUtilities;
import javax.swing.JFrame;
public class transparencia {
    public void TransCompFrame(JFrame frm){
    frm.setUndecorated(true);
    AWTUtilities.setWindowOpaque(frm,false);
    }
}
