/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02;

/**
 *
 * @author yifah
 */
import java.util.Scanner;

public class L2Q1 {
    //M = (P – D) * (1 + R*Y/100) / (Y *12) 
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the price of the car: ");
    
    
    double fah = sc.nextDouble();
    double cel = (fah-32)/1.8;
    System.out.printf("Temperature in Celsius : %.2f%n" , cel);
    }
}
