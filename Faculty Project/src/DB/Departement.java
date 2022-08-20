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
public class Departement {
    //open connection with DB

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "");

    }
    // add values for Departements

    public static void insertDepartement(String dept_Id, String depName, String officeNum) throws SQLException {

        Connection con = null;
        Statement s = null;
        try {
            con = connect();
            s = con.createStatement();
            String query = "insert into department values('" + dept_Id + "','" + depName + "','" + officeNum + "')";
            s.execute(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
            con.close();

        }

    }

}
