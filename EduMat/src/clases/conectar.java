package clases;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class conectar {
 Connection conect = null;
 private ResultSet rs;
 private PreparedStatement ps;
 private ResultSetMetaData rsm;
 DefaultTableModel dtm;
 private java.util.Date fecha = new java.util.Date(); 
 public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             //conect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/bdmat","edumat57","edumat43");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/bdmat","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return conect;
    }
 public void llenarTablaAdministrador(JTable tabla)throws Exception{
        ps= conexion().prepareStatement("SELECT id,lvl,usu,contra FROM usuarios");
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);  
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
    }
 public void llenarTablaPuntajes1(JTable tabla)throws Exception{
        ps= conexion().prepareStatement("SELECT nombre,ejercicio1,ejercicio2,ejercicio3,ejercicio4,ejercicio5 FROM aritmetica");
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);  
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
    }
 public void llenarTablaPuntajes2(JTable tabla)throws Exception{
        ps= conexion().prepareStatement("SELECT nombre,ejercicio1,ejercicio2,ejercicio3,ejercicio4,ejercicio5 FROM geometria");
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);  
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
    }
 public void llenarTablaPuntajes3(JTable tabla)throws Exception{
        ps= conexion().prepareStatement("SELECT nombre,ejercicio1,ejercicio2,ejercicio3,ejercicio4,ejercicio5 FROM algebra");
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);  
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
    }
}
