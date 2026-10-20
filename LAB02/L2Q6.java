/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02;

import java.util.*;

// %+.6e
/**
 *
 * @author yifah
 */
public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water in gram: ");
        int waterGram = sc.nextInt();
        
        Double M = waterGram/1000.0;
        
        System.out.println("Enter the inital temperature in Fahrenheit: ");
        Double fahInt = sc.nextDouble();
        System.out.println("Enter the final temperature in Fahrenheit: ");
        Double fahFin = sc.nextDouble();
        
        Double tempChange = fahFin-fahInt;
        Double celsius = tempChange / 1.8;
        
        Double energy = M*celsius*4184.0;
        System.out.printf("The energy needed is: %+.6e" , energy);
        
    }
    
}
