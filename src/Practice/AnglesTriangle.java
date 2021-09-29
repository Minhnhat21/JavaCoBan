/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class AnglesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the xA and yA coordinates of A conner point: ");
        float xA = sc.nextInt();
        float yA = sc.nextInt();
        System.out.print("\nEnter the xB and yB coordinates of B conner point: ");
        float xB = sc.nextInt();
        float yB = sc.nextInt();
        System.out.print("\nEnter the xC and yC coordinates of C conner point: ");
        float xC = sc.nextInt();
        float yC = sc.nextInt();
        
        double distanceAB = Math.sqrt((xB -xA)*(xB -xA) + (yB -yA)*(yB -yA));
        double distanceBC = Math.sqrt((xC -xB)*(xC -xB) + (yC -yB)*(yC -yB));
        double distanceAC = Math.sqrt((xC -xA)*(xC -xA) + (yC -yA)*(yC -yA));
        
        double A = Math.acos((distanceBC*distanceBC - distanceAB*distanceAB - distanceAC*distanceAC) 
                               / (-2*distanceAB*distanceAC));
        double B = Math.acos((distanceAC*distanceAC - distanceBC*distanceBC - distanceAB*distanceAB) 
                               / (-2*distanceBC*distanceAB));
        double C = Math.acos((distanceAB*distanceAB - distanceAC*distanceAC- distanceBC*distanceBC ) 
                               / (-2*distanceAC*distanceBC));
        System.out.println("A angles: " + Math.round(A*1000.0)/1000.0 + " radian");
        System.out.println("B angles: " + Math.round(B*1000.0)/1000.0 + " radian");
        System.out.println("C angles: " + Math.round(C*1000.0)/1000.0+ " radian");

        
    }
}
