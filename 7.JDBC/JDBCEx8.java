/*Inset date into database.  1->string ke form me date(FORMAT APNE HISAB SE SET KRNA ) lenge user se.
2->Parse method se string ko java.util.Date ke date me convert krenge or parse() SimpleDateFormat ka method hai.
3->java ke date ko millisecond me convert krene using getTime() or milisecond ko conver krenge java.sql.Date me .
4->fir ps.getDate() se database me bhej denge
*/
package ProjectTopic.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class JDBCEx8 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
         conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system", "prashant");
          System.out.println("Connected successfully to the database...");
         PreparedStatement ps=conn.prepareStatement("insert into employees values(?,?,?)");
         Scanner kb=new Scanner(System.in);
            System.out.println("Enter employee id");
              int eId=kb.nextInt();
              System.out.println("Enter employee name");
              kb.nextLine();
              String eName=kb.nextLine();
              System.out.println("Enter hiredate(dd/mm/yyyy) ");
              String hdate=kb.next();
              SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
              java.util.Date d1=sdf.parse(hdate);
             long milliSecond= d1.getTime();
         java.sql.Date d2=new java.sql.Date(milliSecond);
         ps.setInt(1, eId);
         ps.setString(2, eName);
         ps.setDate(3, d2);
        int Result=ps.executeUpdate();
            System.out.println(Result+" Employee data updated ");
    }catch(SQLException ex){
            System.out.println("Database error: "+ex.getMessage());
    }
    catch(ParseException ex){
        System.out.println("Date conversion error "+ex.getMessage());
    }
        finally{
           try{
               if(conn!=null){
                    conn.close();
               System.out.println("Database close successfully..");
           }
           }catch(SQLException ex){
               System.out.println("Database closing time error: "+ex.getMessage());
           }
                   
               }
           
        
        }
        
    }
    

