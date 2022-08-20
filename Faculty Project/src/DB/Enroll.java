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
public class Enroll {
    //open connection with DB
    public static Connection connect()throws SQLException 
    {
        
        return DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
        
    }
    //enroll course for Student
    
     public static void insertCourse(String courseId,String studentId) throws SQLException
    {
        Connection con=connect();
        Statement s=con.createStatement();
        String query="insert into enroll_in_course values('"+courseId+"','"+studentId+"')";
        s.execute(query);
    }
    
    
}
