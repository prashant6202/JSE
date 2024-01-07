/* image inset into database.
*/

package ProjectTopic.JDBC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
public class JDBCEX9 {
    public static void main(String[] args) {
         Connection conn=null;
        try{
         conn =DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system","prashant");
        System.out.println("Database connected successfully..");
        PreparedStatement ps=conn.prepareStatement("insert into movies values(?,?)");
        Scanner kb=new Scanner(System.in);
            System.out.println("Enter path to the movie image ");
            String imagePath=kb.nextLine();
            System.out.println(imagePath);
            int lastForwardSlashPosition=imagePath.lastIndexOf("/");
            int lastDotPosition=imagePath.lastIndexOf(".");
            String movieName=imagePath.substring(lastForwardSlashPosition+1, lastDotPosition);
            ps.setString(1, movieName);
            File f=new File(imagePath);
            FileInputStream fis=new FileInputStream(imagePath);
            ps.setBinaryStream(2, fis, (int)f.length());            //this method insert the image to the database.
            int result=ps.executeUpdate();
            System.out.println(result+" row inserted.");
        }catch(SQLException ex){
            System.out.println("Database error: "+ex.getMessage());
        }
        catch(FileNotFoundException ex){
            System.out.println("File error: "+ex.getMessage());
        }
        finally{
             try{
                 if(conn!=null){
             conn.close();
                 System.out.println("Database close successfully.");
                 }
             }catch(SQLException ex){
                 System.out.println("closing time error:"+ex.getMessage());
             }
        }
        
    }
}
