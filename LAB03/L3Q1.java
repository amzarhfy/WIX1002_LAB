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
public class L3Q1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the first integer: ");
    int num1 = sc.nextInt();
    
    System.out.println("Etner the second integer: ");
    int num2 = sc.nextInt();
    
    System.out.println("Enter the operand: ");
    char op = sc.next().charAt(0);
    
    switch(op){
    
        case '+':
            System.out.println("Result: " + (num1+num2));
            break;
        case '-':
            System.out.println("Result: " + (num1-num2));
            break;
        case '/':
            if(num2!=0){
            System.out.println("Result: " + (num1/num2));
            }
            else{
            System.out.println("Can't devide by 0");
            }
            break;
        case '%':
            if(num2!=0){
            System.out.println("Result: " + (num1%num2));
            }
            else{
            System.out.println("Can't find reminder by 0");
            }
            break;
        default:
            System.out.println("Invalid choice");
    }
        
    }
}
