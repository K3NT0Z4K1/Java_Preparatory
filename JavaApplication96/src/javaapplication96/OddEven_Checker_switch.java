/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication96;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author kentr
 */
public class OddEven_Checker_switch {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter the number");
        int num = scan.nextInt();
        
        switch(num % 2){
            
            case 0:
                System.out.println("The number " + num + " is an EVEN number");
           break;
           
            case 1:
                 System.out.println("The number " + num + " is an ODD number");
            break;
            
            
            
            default:
                System.out.println("Invalid");
        }
    }
    
}
