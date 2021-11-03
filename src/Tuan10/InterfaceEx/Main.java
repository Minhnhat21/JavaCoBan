/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan10.InterfaceEx;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        
        Student st1 = new Student(); 
        st1.setFullname("Nguyen Huu Minh Nhat");
        st1.setBirthday("21/01/2002");
        st1.setGender('1');
        st1.setGpa(4.5f);
        st1.setSocial_activities(4.3f);
        
        Student st2 = new Student(); 
        st2.setFullname("Nguyen Cuong");
        st2.setBirthday("21/02/2000");
        st2.setGender('1');
        st2.setGpa(4.6f);
        st2.setSocial_activities(4.2f);
        
        if (st1.compareTo(st2) == 0) {
            System.out.println("2 sinh vien bang nhau");
        } else if (st1.compareTo(st2) == 1) {
            System.out.println("Sinh vien 1 lon hon sv2");
        } else {
            System.out.println("Sinh vien 1 be hon sv2");
        }
    }
}
