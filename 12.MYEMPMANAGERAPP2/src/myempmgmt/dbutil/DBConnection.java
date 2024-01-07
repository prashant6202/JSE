
package myempmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DBConnection {
    private static Connection conn;
    static{
    try{
    conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "myproject","mystudent");
     JOptionPane.showMessageDialog(null,"Connection open");
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Can not open the Database");
        ex.printStackTrace();
    }
    }
    
    public static Connection getConnection(){
    return conn;
}
   
    public static void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Can not open the Database");
            ex.printStackTrace();
        }
    }
}
