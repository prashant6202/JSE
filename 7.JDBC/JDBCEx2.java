
package ProjectTopic.JDBC;

//using finally data show 

import java.sql.*;
public class JDBCEx2 {
    public static void main(String[] args) {
        Connection conn=null;
         try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant" );
        System.out.println("Connected successfully to the database...");
        Statement st=conn.createStatement();
        ResultSet rt=st.executeQuery("select * from allMovies");
        while(rt.next()==true){
        int movieId=rt.getInt(1);
        String movieName=rt.getString(2);
        int movieRating=rt.getInt(3);
            System.out.println(movieId+"\t"+movieName+"\t"+movieRating);
        }    
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