/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB03;

/**
 *
 * @author yifah
 */
import java.util.*;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value for b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the value for c: ");
        double c = sc.nextDouble();
        System.out.println("Enter the value for d:");
        double d = sc.nextDouble();
        System.out.println("Enter the value for e: ");
        double e = sc.nextDouble();
        System.out.println("Enter the value for f: ");
        double f = sc.nextDouble();
        
        double deno = ((a*d) - (b*c));
        
        if(deno==0){
            System.out.println("The equation has no solution");
        } else{ 
            double x = ((e*d)-(b*f))/(deno);
            double y = ((a*f)-(e*c))/(deno);
           
            System.out.println("Result of x is " + x);
            System.out.println("Result of y is " + y);
            
        }
        
    }
    
}
