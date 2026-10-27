/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB03;

/**
 *
 * @author yifah
 */
import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        double rad = sc.nextDouble();
        
        System.out.println("Enter the x coordinate: ");
        double x = sc.nextDouble();
        
        System.out.println("Enter the y coordinate: ");
        double y = sc.nextDouble();
        
        if(rad<0){
            System.out.println("The radius cannot be negative");
        }
        else { 
            double radSquared = rad*rad;
            double disSquared = x*x + y*y;
                    if (radSquared<disSquared){
                        System.out.println("The point is outside of the circle");
                    } else if(disSquared<radSquared){
                        System.out.println("The point is inside of the circle");
                    } else {
                        System.out.println("The point is on the circle");
                    }
        }
        
    }
    
}
