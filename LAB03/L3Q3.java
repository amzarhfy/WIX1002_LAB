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
public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Sales Volume: ");
        double sales = sc.nextDouble();
        double coms = 0.0;
        
        if(sales < 0){
            System.out.println("Sales cannot be negative");
        } else{
            if(sales <= 100.0){
                coms = sales*0.05;
            }
            else if(sales <= 500){
                coms = sales*0.075;
            }
            else if(sales <= 1000){
                coms = sales*0.1;
            }
            else{
                coms = sales*0.125;
            }
            System.out.printf("The commission is: %.2f%n" , coms);
        }
    }
    
}
