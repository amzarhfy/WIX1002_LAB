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

public class L3Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(6);
        switch (number){
            case 0:
                System.out.println(number + " is Zero");
                break;
            case 1:
                System.out.println(number + " is One");
                break;
            case 2:
                System.out.println(number + " is Two");
                break;
            case 3:
                System.out.println(number + " is Three");
                break;
            case 4:
                System.out.println(number + " is Four");
                break;
            case 5:
                System.out.println(number + " is Five");
                break;
            default:
                System.out.println("out of range");
        }     
    }
    
}
