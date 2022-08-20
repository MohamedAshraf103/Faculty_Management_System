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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohamed
 */
public class Grade {
    
    // open connection with DB

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");

    }
    //insert Grades for Students

    public static void insertGrade( String courseId, String studentId, float midTerm, float practical, float oral, float Final)  {
        try {
            Connection con = connect();
            Statement s = con.createStatement();
            String query = "INSERT INTO grades( COURSE_ID, STUDENT_ID, MID_TERM, PRACTICAL, ORAL, FINAL) VALUES ('" + courseId + "','" + studentId + "','" + midTerm + "','" + practical + "','" + oral +"','" + Final + "')";
            s.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //update Grades

    public static void updateGrade(String courseId, String studentId, float midTerm, float practical, float oral, float Final)  {
        try {
            Connection con = connect();
            Statement s = con.createStatement();
            String query = "UPDATE grades SET MID_TERM='" + midTerm + "',PRACTICAL='" + practical + "',ORAL='" + oral + "',FINAL='" + Final + "'WHERE STUDENT_ID='" + studentId + "' and COURSE_ID='" + courseId + "' ";
            try {
                s.execute(query);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }

}
