/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mohamed
 */
public class Teach {
    // open connection with DB
    
    public static Connection connect()throws SQLException 
    {
        
        return DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
        
    }
     // assign course  for Doctors
     public static void teachCourse(String courseId,String doctorId) throws SQLException
    {
        Connection con=null;
        Statement s=null;
        try{
             con=connect();
        s=con.createStatement();
         String query="insert into teach values('"+courseId+"','"+doctorId+"')";
        s.execute(query);
        } catch(Exception ee)
        {
            System.out.println(ee.getMessage());
        }
        finally{
            s.close();
            con.close();
        }
       
       
    }
}
