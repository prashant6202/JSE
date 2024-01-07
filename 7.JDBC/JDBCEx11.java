/*BATCH UPDATE USING Statement steps
1.Create Statement object
2.SetAutoCommit(false)
3.st.addBatch(SQL Query)
4.conn.executeBatch()
5.finally either commit all the changes by calling the method Commit() of connection obj or rollback the changes by calling the method rollback() of connection object
*/
package ProjectTopic.JDBC;

import java.sql.*;
public class JDBCEx11 {
    public static void main(String[] args) {
        Connection conn=null;
        Boolean status=true;
        try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant");
            System.out.println("Connected successfully to the Database");
            Statement st=conn.createStatement();
            conn.setAutoCommit(false);
            //st.addBatch("insert into allMovies values(106,'Ramayan',5)");
           st.addBatch("update allMovies set movierating=3 where movieName='Pathan'  ");
       //     st.addBatch("delete from allMovies where movieid=106 ");
            int[] executeBatch = st.executeBatch();
            for(int i=0;i<executeBatch.length;i++){
                System.out.println("Query "+(i+1)+" affected "+executeBatch[i]+" row");
            }
        }catch(SQLException ex){
            System.out.println("Database error: "+ex.getMessage());
            status=false;
        }
        finally{
            try{
        if(conn!=null){
        if(status==true){
        conn.commit();
            System.out.println("All query executed and commited");
        }else{
        conn.rollback();
            System.out.println("Query rollback.");
        }
        conn.close();
        
        }
            }catch(SQLException ex){
                System.out.println("Disconnected to the database time error: "+ex.getMessage());
            }
        }
    }
}
