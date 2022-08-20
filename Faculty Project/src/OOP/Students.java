/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author mohamed
 */
public class Students {
    //Attributes

    String student_Id;
    String dept_Id;
    String student_FirstName;
    String student_LastName;
    String gender;
    String student_Mail;
    String student_Password;
    String student_City;
    String student_Street;
    
    //setter and getters

    public String getStudent_Id() {
        return student_Id;
    }
    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }

    public String getDept_Id() {
        return dept_Id;
    }

    public void setDept_Id(String dept_Id) {
        this.dept_Id = dept_Id;
    }

    public String getStudent_FirstName() {
        return student_FirstName;
    }

    public void setStudent_FirstName(String student_FirstName) {
        this.student_FirstName = student_FirstName;
    }

    public String getStudent_LastName() {
        return student_LastName;
    }

    public void setStudent_LastName(String student_LastName) {
        this.student_LastName = student_LastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudent_Mail() {
        return student_Mail;
    }

    public void setStudent_Mail(String student_Mail) {
        this.student_Mail = student_Mail;
    }

    public String getStudent_Password() {
        return student_Password;
    }

    public void setStudent_Password(String student_Password) {
        this.student_Password = student_Password;
    }

    public String getStudent_City() {
        return student_City;
    }

    public void setStudent_City(String student_City) {
        this.student_City = student_City;
    }

    public String getStudent_Street() {
        return student_Street;
    }

    public void setStudent_Street(String student_Street) {
        this.student_Street = student_Street;
    }
    //constructor

    public Students(String student_Id, String dept_Id, String student_FirstName, String student_LastName, String gender, String student_Mail, String student_Password, String student_City, String student_Street) {
        this.student_Id = student_Id;
        this.dept_Id = dept_Id;
        this.student_FirstName = student_FirstName;
        this.student_LastName = student_LastName;
        this.gender = gender;
        this.student_Mail = student_Mail;
        this.student_Password = student_Password;
        this.student_City = student_City;
        this.student_Street = student_Street;
    }
}
