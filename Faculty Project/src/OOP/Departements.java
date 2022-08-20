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
public class Departements {
       
    
   //Attributes
    String deptId;
    String deptName;
    String officeNum;
    
    //constructor

    public Departements(String deptId, String deptName, String officeNum) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.officeNum = officeNum;
    }
     // setter and getter
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }
    

}
