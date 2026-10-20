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
public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Seconds: ");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        
        int minute = remainingSeconds/60;
        int seconds = minute % 60;
        
        System.out.println(totalSeconds + " seconds is " + hours + " hours, " + minute + " minutes and " + seconds + " seconds");
        
    }
    
}
