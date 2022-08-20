/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import OOP.Doctors;
import faculty.project.DoctorScreen;
import faculty.project.LoginFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohamed
 */
public class Doctor {
    //open connection with DB

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");

    }
    //insert new Doctor

    public static void insertDoctor(String id, String dept_Id, String fName, String lName, String position, String mail, String password, String date) throws SQLException {
        Connection con = null;
        Statement s = null;
        try {
            con = connect();
            s = con.createStatement();
            String query = "insert into proff values('" + id + "','" + dept_Id + "','" + fName + "','" + lName + "','" + position + "','" + mail + "','" + password + "','" + date + "')";
            s.execute(query);
        } catch (SQLException e) {

        } finally {
            s.close();
            con.close();

        }

    }
    
    // get Data of all Doctors

    public static ArrayList<Doctors> getDoctorsData() throws SQLException {
        ArrayList<Doctors> list = new ArrayList();
        Connection c = connect();
        Statement s = null;
        ResultSet r = null;

        try {
            s = c.createStatement();
            String query = "select * from proff";
            r = s.executeQuery(query);

            while (r.next()) {
                list.add(new Doctors(r.getString("PROFF_ID"), r.getString("DEPT_ID"), r.getString("PROFF_FIRST_NAME"), r.getString("PROF_SECOND_NAME"), r.getString("Position"),
                        r.getString("PROFF_EMAIL"), r.getString("PROFF_PASSWORD"), r.getString("BirthDate")));

            }
            s.close();
            r.close();

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        } finally {
            c.close();
            s.close();
            r.close();
        }

        return list;

    }
     // check pass and id for  Doctors
    public static int checkDoctor(String id, String pass) throws SQLException {
        ArrayList<Doctors> list = getDoctorsData();
        int x = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getDocId().equals(id)) {
                if (list.get(i).getPassword().equals(pass)) {
                    x = 1; // user found
                    break;
                } else {
                    x = 2;  // password wrong
                    break;
                }
            } else {
                x = 3; //user not found
            }
        }
        return x;
    }
       // case Admin check position 
    public static int checkAdmin(String id, String pass) throws SQLException {
        ArrayList<Doctors> list = getDoctorsData();
        int x = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getDocId().equals(id)) {
                if (list.get(i).getPassword().equals(pass)) {

                    if (list.get(i).getPos().equals("Admin")) {
                        x = 1; // user found
                        break;
                    }

                } else {
                    x = 2;  // password wrong
                    break;
                }

            } else {
                x = 3; //user not found
            }
        }
        return x;
    }
  // update password
    public static void updatePassword(String id, String pass) throws SQLException {
        ArrayList<Doctors> list = getDoctorsData();
        Connection con = connect();
        Statement s = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDocId().equals(id)) {
                try {
                    s = con.createStatement();
                    String query = "UPDATE proff SET  PROFF_PASSWORD='" + pass + "' WHERE proff.PROFF_ID='" + id + "'";
                    s.execute(query);

                } catch (SQLException ee) {
                    System.out.println(ee.getMessage());
                } finally {
                    s.close();
                    con.close();
                }
                break;

            } else {
            }
        }

    }
   //  show courses for specific doctors and number of Studends have enrolled in these courses
    public static void showMyCourses(JTable table) throws SQLException {
        PreparedStatement s = null;
        Connection con = connect();
        ResultSet r = null;

        LoginFrame l = new LoginFrame();
        String id = l.ID;

        try {
            String query = "Select COURSE_NAME, count(STUDENT_ID)\n"
                    + "From (Select enroll_in_course.Course_ID, Courses.COURSE_NAME, enroll_in_course.STUDENT_ID\n"
                    + "      From Courses left join \n"
                    + "      enroll_in_course  on  Courses.Course_ID = enroll_in_course.Course_ID ) AS COURSE_STUDENT\n"
                    + "Where COURSE_ID in (Select  COURSE_ID \n"
                    + "                     from teach  \n"
                    + "                     Where PROFF_ID ='" + id + "')\n"
                    + "Group By  COURSE_NAME";
            String query1 = "SELECT PROFF.PROFF_FIRST_NAME, PROFF.PROF_SECOND_NAME, COURSES.COURSE_NAME\n"
                    + "FROM PROFF INNER JOIN\n"
                    + " TEACH ON PROFF.PROFF_ID = TEACH.PROFF_ID INNER JOIN\n"
                    + "COURSES ON TEACH.COURSE_ID = COURSES.COURSE_ID\n"
                    + " where PROFF.PROFF_ID= '" + id + "'";
            s = con.prepareStatement(query);
            r = s.executeQuery(query);

            while (r.next()) {
                String cName = r.getString("COURSE_NAME");
                String count = r.getString(2);
                String tb[] = {cName, count};
                DefaultTableModel tbMode2 = (DefaultTableModel) table.getModel();
                tbMode2.addRow(tb);
            }
            s.close();
            r.close();

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        } finally {
            s.close();
            r.close();
            con.close();

        }
    }

    //////////////////////////////////////////////
    // show Names of students for specific course
    public static void showStudentsNames(JTable table2,String cName) throws SQLException {
        PreparedStatement s = null;
        Connection con = null;
        ResultSet r = null;

        DoctorScreen d;
        d = new DoctorScreen();

        try {
            con = connect();
            String query = "SELECT students.STUDENT_ID,students.STUDENT_FIRST_NAME,students.STUDENT_LAST_NAME \n"
                    + "FROM students\n"
                    + "INNER join enroll_in_course \n"
                    + "on(students.STUDENT_ID=enroll_in_course.STUDENT_ID)\n"
                    + "INNER JOIN courses \n"
                    + "on (enroll_in_course.COURSE_ID=courses.COURSE_ID)\n"
                    + "WHERE courses.COURSE_NAME = '" + cName + "' ";
            s = con.prepareStatement(query);
            r = s.executeQuery(query);

            while (r.next()) {
                String ID = r.getString("STUDENT_ID");
                String fName = r.getString("STUDENT_FIRST_NAME");
                String lName = r.getString("STUDENT_LAST_NAME");
                String tb[] = {ID, fName, lName};
                DefaultTableModel tbMode3 = (DefaultTableModel) table2.getModel();
                tbMode3.addRow(tb);
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        } finally {
            s.close();
            r.close();
            con.close();
        }
    }

}

