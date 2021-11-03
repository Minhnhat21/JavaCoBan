/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan10.SerializableInterface;

import java.util.Date;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author nguye
 */
public class Car implements Serializable{
    private String name;
    private String engine;
    private int seats;
    private Date production_date;

    public Car() {
    }

    public Car(String name, String engine, int seats, Date production_date) {
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        this.production_date = production_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }
    
    public void Input() throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        
        System.out.println("Nhập tên hãng xe: ");
        String name_Car = sc.nextLine();
        setName(name_Car);
        System.out.println("Nhập loại dộng cơ: ");
        String engine_Car = sc.nextLine();
        setEngine(engine_Car);
        System.out.println("Nhập số ghế: ");
        int number = sc.nextInt();
        setSeats(number);
        System.out.println("Nhập ngày sản xuất: ");
        String input_date = sc.nextLine();
        Date production_date = df.parse(input_date);
        setProduction_date(production_date);
    }
    @Override
    public String toString() {
        String result = "\n-----------------------------------------------" +
                        "\nTên hãng xe: " + getName() +
                        "\nLoại động cơ:"  + getEngine() +
                         "\nSố ghế: " + getSeats() +
                         "\nNgày sản xuất: " + getProduction_date() +
                        "\n---------------------------------------------";
        return result;
    }
    
    
}
