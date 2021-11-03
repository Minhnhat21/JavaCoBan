/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan10.InterfaceEx;

import java.lang.Cloneable;
import java.lang.Comparable;
import java.io.Serializable;
/**
 *
 * @author nguye
 */
public class Student implements Cloneable, Comparable<Student>, Serializable{
    String fullname;
    String birthday;
    char gender;
    float gpa;
    float social_activities;

    public Student() {
    }

    
    public Student(String fullname, String birthday, char gender, float social, int social_activities) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 5) {
            this.gpa = gpa;
        } else this.gpa = 0;
    }

    public float getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(float social_activities) {
        if (social_activities >= 0 && social_activities  <= 5) {
            this.social_activities = social_activities;
        }
        
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Student o) {
        if (gpa == o.gpa && social_activities == o.social_activities) {
            return 0;
        } else if (gpa > o.gpa || social_activities > o.social_activities) {
            return 1;
        } else {
            return -1;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
