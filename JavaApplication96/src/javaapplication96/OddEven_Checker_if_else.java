/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication96;

import java.util.Scanner;

/**
 *
 * @author kentr
 */
public class OddEven_Checker_if_else {
    
    public static void main(String[] args) {
        
        
        
      Scanner scan = new Scanner(System.in);
      
        System.out.println("Enter the number");
        int num = scan.nextInt();
        
        if(num % 2 ==0){
            
            System.out.println("The number " + num + " in an EVEN number ");
        }else{
            System.out.println("The number " + num + " is an ODD number ");
        }
    }
}
