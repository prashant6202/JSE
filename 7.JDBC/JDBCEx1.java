//without using finally{}

package ProjectTopic.JDBC;

import java.sql.*;



public class JDBCEx1 {
    public static void main(String[] args) {
      try{
       Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant");
          System.out.println("Connected SUCCESSFULLY to the Databse ....");
             Statement st=conn.createStatement();
            ResultSet rt=st.executeQuery("select * from allMovies");
              while(rt.next()==true){
                  int movieId=rt.getInt("movieId");
                  String movieName=rt.getString("movieName");
                  int rating=rt.getInt("movieRating");
                  System.out.println(movieId+"\t"+movieName+"\t"+rating);
               }
              conn.close();
              System.out.println("DISCONNECTED with the Database...");
      }
      catch(SQLException ex){
          System.out.println("Database Error"+ex.getMessage());
        }
    }
    
}
//problem in this code, it is possible that it is not connected to the datbase  that time we must colse the connection..
//so we must use finally block .