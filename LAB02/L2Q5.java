/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02;

import java.util.Random;

/**
 *
 * @author yifah
 */
public class L2Q5 {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int rand = randomGen.nextInt(10001);
        int sum =0;
        
        System.out.println("The random number is : " + rand);
        
        for (; rand > 0; rand /= 10) {
            sum += rand % 10;
    }
        System.out.println("The sum of each random number is : " + sum);
        
    }
    
}
