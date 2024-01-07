//Inserting data into database using PreparedStatement.   it is vary fast.

package ProjectTopic.JDBC;

import java.sql.*;
import java.util.Scanner;
public class JDBCEx5 {
    public static void main(String[] args) {
      Connection conn=null;
      try{
      conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "prashant");
          System.out.println("Connected successfully with database.");
         Statement st=conn.createStatement();
         Scanner kb=new Scanner(System.in);
          System.out.println("Enter movie Id");
           int movieId=kb.nextInt();
           System.out.println("Enter movie Name");
           kb.nextLine();
        String movieName=kb.nextLine();
          System.out.println("Enter movie Rating");
          int movieRating=kb.nextInt();
          PreparedStatement ps=conn.prepareStatement("insert into allMovies values(?,?,?)");
          ps.setInt(1, movieId);
          ps.setString(2, movieName);
          ps.setInt(3, movieRating);
          int ans=ps.executeUpdate();
          System.out.println(ans+" Row is effected");
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
       

    

