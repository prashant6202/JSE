
package ProjectTopic.JDBC;
import java.sql.*;
import java.util.Scanner;
public class JDBCEx12 {
    public static void main(String[] args) {
        Connection conn=null;
        boolean status=true;
        try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant");
            System.out.println("Connected successfully to the database");
            PreparedStatement ps=conn.prepareCall("insert into allMovies values(?,?,?)");
            conn.setAutoCommit(false);
            Scanner kb=new Scanner(System.in);
            
            String choice="";
            do{
            System.out.println("Enter movie id ");
            int movieId=kb.nextInt();
            System.out.println("Enter movie name ");
            kb.nextLine();                //buffer clear
            String movieName=kb.nextLine();
            System.out.println("Enter movie ratting");
            int movieRating=kb.nextInt();
            ps.setInt(1, movieId);          //inset data into PreparedStatement
            ps.setString(2, movieName);     //inset data into PreparedStatement
            ps.setInt(3, movieRating);      //inset data into PreparedStatement
            ps.addBatch();           //all data add in the batch
                System.out.println("do you want to more movie inserted to the database ? (yes/no)");
                choice=kb.next();
            }while(choice.equalsIgnoreCase("yes"));
            
            int[] executeBatch = ps.executeBatch();     //all query inset into database
            System.out.println("Total queries executed are : "+executeBatch.length);
            for(int i=0;i<executeBatch.length;i++){
                System.out.println("Query "+(i+1)+" affected "+executeBatch[i]+" row");
            }
            
        
        }catch(BatchUpdateException ex){
            int[]result=ex.getUpdateCounts();
            System.out.println("Query no "+(result.length+1)+" generated exception");
            status=false;
        }
        
        
        catch(SQLException ex){
            System.out.println("Database error: "+ex.getMessage());
            status=false;
        }
        finally{
            try{
                if(conn!=null){
                  if(status==true){
                  conn.commit();      // agr sara query insert ho jayega to commit kr dena
                      System.out.println("All query executed and commited");
                  } else{
                      conn.rollback();    // koi 1 query bhi insert nhi huwa to rollback kr do pura query ko
                      System.out.println("query roll back");
                  } 
                 
            conn.close();
                    System.out.println("Connection close successfully to the database");
            
                }
            }catch(SQLException ex){
                System.out.println("closing time error: "+ex.getMessage());
        }
        }
    }
}
