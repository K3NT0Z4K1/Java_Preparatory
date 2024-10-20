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
public class Basic_Calculator_Using_If_else {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter x");
        int x = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter operator (+,-,/,*)");
        String op = scan.nextLine();
        
        System.out.println("Enter y");
        int y = scan.nextInt();
        
        
        if(op.contains("+")){
            int sum = x + y;
            System.out.println(sum);
            
        }else if(op.contains("-")){
            int dif = x + y;
            System.out.println(dif);
            
        }else if(op.contains("/")){
            double qou = x + y;
            System.out.println(qou);
            
        }else if(op.contains("*")){
            int pro= x + y;
            System.out.println(pro);
            
        }else {
            System.out.println("Invalid Operator");
        }
    }
}
