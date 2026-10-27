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

public class L3Q4 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int die1 = rd.nextInt(6)+1;
        int die2 = rd.nextInt(6)+1;
        int die3 = rd.nextInt(6)+1;
        int die4 = rd.nextInt(6)+1;

        int P1 = die1 + die2;
        int P2 = die3 + die4;
    
        System.out.println("Player 1 rolled " + die1 + " and " + die2);
        System.out.println("Player 1 scored a total of: " + P1);
        System.out.println();
        System.out.println("Player 2 rolled " + die3 + " and " + die4);
        System.out.println("Player 2 scored a total of: " + P2);
        System.out.println();
        if(P1>P2){
            System.out.println("Player 1 scored higher. Player 1 wins");
        } 
        else if(P2>P1){
            System.out.println("Player 2 scored higher. Player 2 wins");
        }
        else{
            System.out.println("It's a draw");
        }
    }
}
