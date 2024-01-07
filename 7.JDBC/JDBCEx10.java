
package ProjectTopic.JDBC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx10 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant");
            System.out.println("Connection successfully to the database..");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from movies");
            File f=new File("D:/jdbcimages");
            f.mkdir();
            while(rs.next()){
            String movieName=rs.getString(1);
                Blob imageMovie= rs.getBlob(2);
                byte[]arr=imageMovie.getBytes(1, (int) imageMovie.length());
                FileOutputStream fout=new FileOutputStream(f.getAbsoluteFile()+"/"+movieName+".png");
                fout.write(arr);
            }
        
        
        }catch(SQLException ex){
            System.out.println("Database error: "+ex.getMessage());
        }
        catch(FileNotFoundException ex){
            System.out.println("File error: "+ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("file saving time error: "+ex.getMessage());
        }
         finally{
             try{if(conn!=null){
             conn.close();
                 System.out.println("Database close successfully.");
             }
             }catch(SQLException ex){
                 System.out.println("closing time error:"+ex.getMessage());
             }
        }
     
    }
}
