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
public abstract class Person {
    private Date birthday; 
    private boolean gender;
    private String blood_type;

    public Person() {
    }

    public Person(Date birthday, boolean gender, String blood_type) {
        this.birthday = birthday;
        this.gender = gender;
        this.blood_type = blood_type;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    
    
}
