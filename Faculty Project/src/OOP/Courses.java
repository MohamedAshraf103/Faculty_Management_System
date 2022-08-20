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
public class Courses {
    
    //Attributes
    
    String courseId;
    String courseName;
    String courseCredit;
    String courseType;
    String courseDesc;
    
    //constructor

    public Courses(String courseId, String courseName, String courseCredit, String courseType, String courseDesc) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseType = courseType;
        this.courseDesc = courseDesc;
    }
    
    // setter and getter

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
    
    
}
