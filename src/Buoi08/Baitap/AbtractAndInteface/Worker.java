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
public class Worker extends Person implements Tax{
    private String name;
    private String citizenID;
    private String phone;
    private String email;
    private double salary;
    private double other_income;

    public Worker() {
    }

    public Worker(String name, String citizenID, String phone, String email, double salary, double other_income, Date birthday, boolean gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.other_income = other_income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOther_income() {
        return other_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }
    public double sumofincome() {
        double sum = 0;
        sum = getSalary() + getOther_income();
        return sum;
    }
    @Override
    public double payTax(double income, int start_time, int end_time) {
        double tax = 0;
        if(income > 15000000) {
            tax = income * 0.1;
        }
        return tax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
