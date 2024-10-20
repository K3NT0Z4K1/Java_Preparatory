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
public class Basic_Calculator_Using_switch {
    
    public static void main(String[] args) {
        
        
        Scanner calcu = new Scanner(System.in);
        
        
        
        System.out.println("Enter the first number");
        int num1 = calcu.nextInt();
        calcu.nextLine();
        
        System.out.println("Enter the chosen operator (+,-,/,*)");
        String op = calcu.nextLine();
        
        System.out.println("Enter the second number");
        int num2 = calcu.nextInt();
        
        
        switch(op){
            
            case "+":
                int sum = num1 + num2;
                System.out.println(sum);
                
           break;     
            case "-":
                int dif = num1 - num2;
                System.out.println(dif);
                
           break;     
            case "/":
                double qou = num1 / num2;
                System.out.println(qou);
                
           break;     
            case "*":
                int pro = num1 * num2;
                System.out.println(pro);
                
           break;     
           
            default:
                System.out.println("Invalid Operator");
        }
        
    }
    
}
