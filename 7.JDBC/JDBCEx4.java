//Inserting data into database  using CONCATINATION

package ProjectTopic.JDBC;

import java.sql.*;
import java.util.Scanner;
public class JDBCEx4 {
    public static void main(String[] args) {
        Connection conn=null;
         try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant" );
        System.out.println("Connected successfully to the database...");
        Statement st=conn.createStatement();
        Scanner kb=new Scanner(System.in);
             System.out.println("Enter movie ID");
             int movieId=kb.nextInt();
             System.out.println("Enter movie NAME");
             kb.nextLine();
             String movieName=kb.nextLine();
             System.out.println("Enter movie RATING");
             int movieRating=kb.nextInt();
             int ans=st.executeUpdate("insert into allMovies values("+movieId+",'"+movieName+"',"+movieRating+")");
                     
             System.out.println("Row affected :"+ans);
         }catch(SQLException ex){
             System.out.println("Database error: "+ex.getMessage());
         }
         finally{
             try{
             if(conn!=null){
                conn.close();
                   System.out.println("Disconnected successfully from the database");
               }
             }catch(SQLException ex){
                 System.out.println("Clossing time error: "+ex.getMessage());
             }
               
         
         }
    }
}
       

    

