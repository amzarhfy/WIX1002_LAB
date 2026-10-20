/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02;

import java.util.*;

/**
 *
 * @author yifah
 */
public class L2Q2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the price of the car: ");
        double P = sc.nextDouble();
        
        System.out.println("Enter down payment: ");
        double D = sc.nextDouble();
        
        System.out.println("Enter interest rate in %: ");
        double R = sc.nextDouble();
        
        System.out.println("Enter loan duration in year: ");
        double Y = sc.nextDouble();
        
        
        if (P<=0 || D<0 || D>P || R<0 || Y<=0) {
            System.out.println("Invalid number");
    }
        else{
            double M = (P-D)*(1.0-R*Y/100.0)/(Y*12.0);
            System.out.printf("Monthly payment is: %.2f%n" , M);
        }
        
    }
}
