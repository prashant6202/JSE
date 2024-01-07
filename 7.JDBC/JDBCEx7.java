//Date retriving from the data base....we have to use SimpleDateFormat  interface because date is not user friendlly.
package ProjectTopic.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class JDBCEx7 {
    public static void main(String[] args) {
        Connection conn=null;
         try{
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","prashant" );
        System.out.println("Connected successfully to the database...");
        Statement st=conn.createStatement();
       SimpleDateFormat  sdf=new SimpleDateFormat("dd/MMM/YYYY"); //--------->Apne hisab se date print krane ke liye use kiye hai
        ResultSet rs=st.executeQuery("select ename,hiredate from employees");
        while(rs.next()==true){
        String eName=rs.getString(1);
        Date hireDate=rs.getDate(2);     //---->date java apne hisab se print krayega.programmer apne hisab se print krane ke liye format() name ka method call krenge.
        String date=sdf.format(hireDate);
            System.out.println(eName+"\t"+date);
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
             
             
             }catch(SQLException ex){
                 System.out.println("closing time error:"+ex.getMessage());
             }
         
         
         
         }
        
    }
}