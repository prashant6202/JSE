//Inserting data into database

package ProjectTopic.JDBC;

import java.sql.*;
public class JDBCEx3 {
    public static void main(String[] args) {
        Connection conn=null;
         try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant" );
        System.out.println("Connected successfully to the database...");
        Statement st=conn.createStatement();
        int ans=st.executeUpdate("insert into allMovies values(105,'Adipursh',3)");
             System.out.println("Row affected : "+ans);    
       }catch(SQLException ex){
            System.out.println("Connection error"+ex.getMessage());
       }
         finally{
             try{
               if(conn!=null){                  //-->agr connect krte time koi problem ho gya ho to conn me null hi reh jayega or null se kisi method ko call krenge to nullPointerException aa jata hai es liye ye kiye hai
                      conn.close();
                 System.out.println("Disconnected with database....");
               }
             
             
             }
             catch(SQLException ex){
                 System.out.println("closing time error:"+ex.getMessage());
             }
         
         
         
         }
        
    }
}

