/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import static DB.Student.connect;
import OOP.Courses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohamed
 */
public class Course {
    //open connection With DB 

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");

    }
   // add course Data
    public static void insertCourse(String courseId, String courseName, String credit, String type, String desc) throws SQLException {
        Connection con = connect();
        Statement s = con.createStatement();
        String query = "insert into courses values('" + courseId + "','" + courseName + "','" + credit + "','" + type + "','" + desc + "')";
        s.execute(query);

    }
       // get Data for All Courses
    public static ArrayList<Courses> getCoursesData() {
        ArrayList<Courses> list = new ArrayList();
        try {
            Connection c = connect();
            Statement s = c.createStatement();
            String query = "select * from courses";
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                list.add(new Courses(r.getString("COURSE_ID"), r.getString("COURSE_NAME"), r.getString("CREDIT_HOURS"), r.getString("TYPE"), r.getString("DESCRIPTION_")));
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return list;

    }
    

    public static void showCourses(JTable table) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");
            Statement s = con.createStatement();
            String query = "select * from courses";
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                String id = r.getString("COURSE_ID");
                String name = r.getString("COURSE_NAME");
                String cr = r.getString("CREDIT_HOURS");
                String t = r.getString("TYPE");
                String desc = r.getString("DESCRIPTION_");
                String tb[] = {id, name, cr, t, desc};
                DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
                tbModel.addRow(tb);
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }
   // show courses in Combo Box
    public static void addCoursesName(JComboBox box) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");
            Statement s = con.createStatement();
            String query = "select COURSE_NAME from courses";
            ResultSet r = s.executeQuery(query);
            while (r.next()) {
                String name = r.getString("COURSE_NAME");
                box.addItem(name);
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }
        // return course ID by name
    public static String getCourseId(String name) {
        String courseId = "";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");
            Statement s = con.createStatement();
            String query = "select COURSE_ID from courses where COURSE_NAME='" + name + "' ";
            ResultSet r = s.executeQuery(query);
            while (r.next()) {
                courseId = r.getString("COURSE_ID");
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return courseId;
    }

}
