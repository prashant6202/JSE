//Updating Move data into database using PreparedStatement.   it is vary fast.

package ProjectTopic.JDBC;

import java.sql.*;
import java.util.Scanner;
public class JDBCEx6 {
    public static void main(String[] args) {
      Connection conn=null;
      try{
      conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "prashant");
          System.out.println("Connected successfully with database.");
         Statement st=conn.createStatement();
         Scanner kb=new Scanner(System.in);
           System.out.println("Enter movie Name");
          String movieName= kb.nextLine();
          System.out.println("Enter movie Id");
           int movieId=kb.nextInt();
          PreparedStatement ps=conn.prepareStatement("update allMovies set movieName=? where movieId=?");
          ps.setString(1, movieName);
          ps.setInt(2, movieId);
          int ans=ps.executeUpdate();
          if(ans==1){
          System.out.println(movieName+"is updated.");
          }
          else{
              System.out.println(movieName+" is not found .");
          }
      }catch(SQLException ex){
          System.out.println("Database error: "+ex.getMessage());
      }
      finally{}
      try{
          
          if(conn!=null){
           conn.close();
              System.out.println("Disconnected successfully with database.");
          }
      }catch(SQLException ex){
                  System.out.println("Database close time error: "+ex.getMessage());
                  }
}
}
       

    

