/**
 *
 * @author L.I. René Alejandro Mercado Martínez
 * 
 */
package sistema.clases;
import java.io.*;
import java.net.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class funcionesCaptura {
/*#######################################################
 *###         Declaracion de variables globales del   ###
 *###         sistema para el proyecto final          ###
 *####################################################### 
*/
    private java.util.Date fecha = new java.util.Date();   
    public String rutaLog = "C:\\Program Files\\Sistema\\historial.log" ;
    File dir = new File("C:\\Program Files\\Sistema");
    private String ip = null;
    private ResultSet resultado;
    private Statement sentencia;
    private Connection conexion;
    protected String servidor = "jdbc:mysql://localhost/proyecto";
    protected String usuariobd = "root";
    protected String passbd = "";

  
/*######################################################
 *###        Declaracion de métodos globales del     ###
 *###        sistema para el proyecto final          ###
 *###################################################### 
*/
    
/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$      -- Metodo para datos al log--                 $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public void grabarLogDentro(String cad){
        try{
            BufferedWriter bw = 
                   new BufferedWriter(new FileWriter(rutaLog,true));
            bw.write(cad+" : "+fecha); // Guardamos en el archivo
            bw.newLine(); // Generamos una nueva linea
            bw.flush(); // Limpiamos el buffer del sistema
            bw.close(); // Cerramos el archivo
        }catch(IOException e){}
    }

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$ Metodo para ingrear al sistema con usuario logueado$$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean ingresarSistema(String usuario, String password){
    boolean flag = false;
    try
        {
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(servidor, usuariobd, passbd);
        sentencia=conexion.createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM usuarios where usuario = '"+usuario+"' and contrasenia = PASSWORD('"+password+"')");
        String titulo ="";  
        while (resultado.next()) 
            {
                        titulo= resultado.getString(4)+" : "+resultado.getString(5);
                        grabarLog("Login del usuario : "+resultado.getString(2)+" : "+ fecha);
                        new interfaz(resultado.getString(4),resultado.getInt(1),titulo,resultado.getString(5)).setVisible(true);
                        flag = true;
            }
			sentencia.close();//Cerramos la sentencia
			conexion.close();

        }catch(ClassNotFoundException cnfe){
            System.out.println("Hay error en la clase");
        }
        catch(SQLException sqle){
            System.out.println("Hay error en la consulta");
        }
    return flag;
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$ Metodo para capturar nuevos usuarios en el sistema $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean capturaUsuario(String usuario,String contrasenia,String nombre,String privilegio){
    boolean flag = false;
    try
        {
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(servidor, usuariobd, passbd);
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("INSERT into usuarios(usuario, contrasenia, nombre, tipo) values ('"+usuario+"',PASSWORD('"+contrasenia+"'),'"+nombre+"','"+privilegio+"');");
	flag = true;
        sentencia.close();//Cerramos la sentencia
	conexion.close();           
        }catch(ClassNotFoundException cnfe){}
        catch(SQLException sqle){}
    return flag;
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$   Metodo para grabar el login inicial al sistema   $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public void grabarLog(String cad){
        try{
            ip = InetAddress.getLocalHost().getHostAddress()
                    .toString();
            if(dir.exists()){
            BufferedWriter bw = new BufferedWriter(new 
                    FileWriter(rutaLog,true));
            bw.write(cad+" : "+ip); 
            bw.newLine(); 
            bw.flush(); 
            bw.close(); 
            }else{
                if(dir.mkdir()){
                   BufferedWriter bw = new BufferedWriter(new FileWriter(rutaLog,true));
                    bw.write(cad+" : "+ip); 
                    bw.newLine(); 
                    bw.flush(); 
                    bw.close(); 
                } else {
                    System.out.println("No se pudo crear el directorio");
                }
            }
        
        }catch(IOException e){}
        
    }

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$  Metodo para agregar un nuevo registro al sistema  $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean capturaNuevo(String nombre, String contrasenia, String domicilio){
    boolean flag = false;
    
    return flag;
}

public boolean capturaNuevo(String contrasenia, String domicilio){
    boolean flag = false;
    
    return flag;
}
/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$     Metodo para buscar registros en el sistema     $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public JTable buscarSistema(JTable tabla,String nombre,String marca,String modelo,String serie){
    int x=0;
    DefaultTableModel dtm = new DefaultTableModel();
    try
        {
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(servidor, usuariobd, passbd);
        sentencia=conexion.createStatement();
        if(!nombre.equals("")){
            resultado = sentencia.executeQuery("SELECT * FROM autos WHERE nombre LIKE '"+nombre+"'");
        }else if(!marca.equals("")){
            resultado = sentencia.executeQuery("SELECT * FROM autos WHERE marca LIKE '"+marca+"'");
  
        }
        else if(!modelo.equals("")||modelo!=null){
            resultado = sentencia.executeQuery("SELECT * FROM autos WHERE modelo LIKE '"+modelo+"'");
  
        }
        else if(!serie.equals("")||serie!=null)
            resultado = sentencia.executeQuery("SELECT * FROM autos WHERE serie LIKE '"+serie+"'");  
        while (resultado.next()) 
            { 
                if(x==0){
                    Object row[][]={{resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5)}};
                    String[] titulos ={"Id","Nombre","Marca","Modelo","Serie"};
                    dtm = new DefaultTableModel(row, titulos);
                    tabla = new JTable(dtm);
                    x=1;
                } else {
              Object nRow[] = {resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5)};
              dtm.addRow(nRow);
                }
            }
        tabla.setModel(dtm);
			sentencia.close();//Cerramos la sentencia
			conexion.close();
                      
        
        }catch(ClassNotFoundException cnfe){
            System.out.println("Hay error en la clase");
        }
        catch(SQLException sqle){
            System.out.println("Hay error en la consulta");
        }
    return tabla;
} 

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$    Metodo para eliminar un registro del sistema    $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean eliminaSistema(int id){
    boolean flag = false;
    try
        {
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(servidor, usuariobd, passbd);
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("DELETE FROM autos WHERE id="+id);
	flag = true;
        sentencia.close();//Cerramos la sentencia
	conexion.close();           
        }catch(ClassNotFoundException cnfe){}
        catch(SQLException sqle){}
    return flag;
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$         Metodo para modificar registro             $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean modificaSistema(int id, String nombre, String marca, String serie, String modelo){
    boolean flag = false;
    try
        {
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(servidor, usuariobd, passbd);
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("UPDATE autos SET modelo='"+modelo+"', nombre ='"+nombre+"', serie='"+serie+"', marca='"+marca+"' WHERE id="+id);
	flag = true;
        sentencia.close();//Cerramos la sentencia
	conexion.close();           
        }catch(ClassNotFoundException cnfe){}
        catch(SQLException sqle){}
        return flag;
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$         Método para exportar los datos a pdf       $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public boolean exportarPDF(String nomArch, String usuario ){
    boolean flag = false;
    try {
            Document documento = new Document();
            Paragraph parrafo = new Paragraph("creado el "+fecha);
            Image gif = Image.getInstance("src/iconos_original/logo.jpg");              
            PdfWriter.getInstance(documento, new FileOutputStream(nomArch+".pdf"));
            documento.open();
            documento.addTitle("------- Reporte de Sistema -------");//Agregamos el titulo al documento
            documento.addAuthor(usuario); // Agregamos el autor del documento
            documento.addCreator(usuario); // Agregamos el nombre del usuario que lo cree
            gif.scalePercent(50);
            gif.setAlignment(Image.LEFT);
            documento.add(gif);
            parrafo.setAlignment(Element.ALIGN_LEFT);
            documento.add(parrafo);
            consultaPDF(documento);
            flag = true;
            documento.close();
	} catch (Exception e) {
	e.printStackTrace();
        flag = false;
	}
    return true;
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$     Método para ingresar los datos de la consulta  $$$
 *$$$     a pdf                                          $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/
public void consultaPDF(Document documento){
    
}

/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 *$$$     Método para enviar correo a un destinatario    $$$
 *$$$     poniendo direccion de remitente y de envio     $$$
 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/

public boolean enviarCorreo(String origen, String password, String destino, String titulo, String mensaje){
    boolean flag = false;
    try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", origen);
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesión
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("noresponder@yahoo.com.mx"));//asignar remitente alternativo
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));//Asignar destinatario
            message.setSubject(titulo);//Asignar titulo al correo
            message.setText(mensaje);

            
            // Lo enviamos al correo dado
            Transport t = session.getTransport("smtp");
            t.connect(origen, password); // asignamos la cuenta y contraseña de nuestra cuenta de correo
            t.sendMessage(message, message.getAllRecipients());
            // Cierre.
            flag = true;
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
    return flag;
}
//Puertos asignados para el manejo de red: Salida 1001 y entrada 1002
}// Fin de la clase funcionesCaptura