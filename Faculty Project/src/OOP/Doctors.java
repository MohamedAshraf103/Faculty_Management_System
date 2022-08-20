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
public class Doctors {
    //Attributes
    String docId;
    String depId;
    String firstName;
    String lastName;
    String pos;
    String mail ;
    String password;
    String date;
    //constructor

    public Doctors(String docId, String depId, String firstName, String lastName, String pos, String mail, String password, String date) {
        this.docId = docId;
        this.depId = depId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pos = pos;
        this.mail = mail;
        this.password = password;
        this.date = date;
    }
    
    ///// setter and getter

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
