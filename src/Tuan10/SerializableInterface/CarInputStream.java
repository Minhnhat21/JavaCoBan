/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan10.SerializableInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author nguye
 */
public class CarInputStream {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
 
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\testout.txt"));
            // read student
            Car car = (Car) ois.readObject();
            // show student
            System.out.println(car.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
