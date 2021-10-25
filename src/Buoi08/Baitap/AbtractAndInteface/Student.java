/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi08.Baitap.AbtractAndInteface;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Student extends Person implements Tax{
    private String name;
    private String studentID;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(String name, String studentID, String phone, String email, Date birthday, boolean gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public double payTax(double income, int start_time, int end_time) {
        double tax = 0;
        if(income > 11000000) {
            tax = income * 0.05;
        }
        return tax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
