/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;
import java.util.ArrayList;
import OOP.Students;
import faculty.project.LoginFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohamed
 */
public class Student {
    
    // open connection with database

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");

    }
     // insert student in table
    public static void insertStudent(String id, String dept_Id, String fName, String lName, String gender, String mail, String password, String city, String street) throws SQLException {
        Connection con = connect();
        Statement s = con.createStatement();
        String query = "insert into students values('" + id + "','" + dept_Id + "','" + fName + "','" + lName + "','" + gender + "','" + mail + "','" + password + "','" + city + "','" + street + "')";
        s.execute(query);

    }
    
    //get all data of students

    public static ArrayList<Students> getStudentsData() throws SQLException {
        Connection c=null;
        Statement s=null;
        ResultSet r=null;
        ArrayList<Students> list = new ArrayList();
        try {
             c = connect();
             s = c.createStatement();
            String query = "select * from students";
            r = s.executeQuery(query);

            while (r.next()) {
                list.add(new Students(r.getString("STUDENT_ID"), r.getString("DEPT_ID"), r.getString("STUDENT_FIRST_NAME"), r.getString("STUDENT_LAST_NAME"), r.getString("GENDER"),
                        r.getString("STUDENT_EMAIL"), r.getString("STUDENT__PASSWORD"), r.getString("STUDENT_CITY"), r.getString("STUDENT_STREET")));
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        finally{
            r.close();
            s.close();
            c.close();
        }

        return list;

    }
    
    //check Student found in DB or not
    public static int checkStudent(String id, String pass) throws SQLException {
        ArrayList<Students> list = getStudentsData(); // caaling function get All Data
        int x = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getStudent_Id().equals(id)) {
                if (list.get(i).getStudent_Password().equals(pass)) {
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

    public static void updatePassword(String id, String pass) throws SQLException {
        ArrayList<Students> list = getStudentsData();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudent_Id().equals(id)) {
                try {
                    Connection con = connect();
                    Statement s = con.createStatement();
                    String query = "UPDATE students SET  STUDENT__PASSWORD='" + pass + "' WHERE students.STUDENT_ID='" + id + "'";
                    s.execute(query);
                } catch (SQLException ee) {
                    System.out.println(ee.getMessage());
                }
                
                   break;
            } 
            
            else {
                
            }

        }
    }
    
    //show grades of specific student for all courses
    public static void showGrades(JTable table) throws SQLException
    {
         Connection con=null;
         PreparedStatement s=null;
         ResultSet r=null;
        LoginFrame l = new LoginFrame();
        String id = l.ID;

        try {
            con=connect();
            String query = "select students.STUDENT_FIRST_NAME,courses.COURSE_NAME,grades.MID_TERM,grades.PRACTICAL,grades.ORAL,grades.FINAL\n"
                    + "from students\n"
                    + "inner join grades on (students.STUDENT_ID=grades.STUDENT_ID)inner join courses\n"
                    + "on(courses.COURSE_ID=grades.COURSE_ID)\n"
                    + "WHERE students.STUDENT_ID='"+id+"'";
                 s = con.prepareStatement(query);
                 r = s.executeQuery(query);

            while (r.next()) {
                String stuName = r.getString("STUDENT_FIRST_NAME");
                String cName = r.getString("COURSE_NAME");
                float m = r.getFloat("MID_TERM");
                float p = r.getFloat("PRACTICAL");
                float o = r.getFloat("ORAL");
                float f = r.getFloat("FINAL");
                float t=m+p+o+f;
                String mid=Float.toString(m);
                String practical=Float.toString(p);
                String oral=Float.toString(o);
                String finall=Float.toString(f);
                String total=Float.toString(t);

                

                
                
                String tb[] = {stuName, cName, mid,practical,oral,finall,total};  
                DefaultTableModel tbMode2 = (DefaultTableModel) table.getModel();
                tbMode2.addRow(tb);  // assign grades in table
            }

        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
        //closing connection with DB
        
        finally{
            r.close();
            s.close();
            con.close();
        }
        
    }
    
}
